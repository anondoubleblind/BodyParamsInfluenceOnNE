/*
 * Copyright (c) "Eric Medvet" 2022.
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package it.units.erallab.hmsrobots;

import it.units.erallab.hmsrobots.core.controllers.CentralizedSensing;
import it.units.erallab.hmsrobots.core.controllers.MultiLayerPerceptron;
import it.units.erallab.hmsrobots.core.objects.Robot;
import it.units.erallab.hmsrobots.core.objects.Voxel;
import it.units.erallab.hmsrobots.tasks.locomotion.Locomotion;
import it.units.erallab.hmsrobots.util.Grid;
import it.units.erallab.hmsrobots.util.RobotUtils;
import it.units.erallab.hmsrobots.util.SerializationUtils;
import it.units.erallab.hmsrobots.viewers.GridOnlineViewer;
import it.units.erallab.hmsrobots.viewers.NamedValue;
import it.units.erallab.hmsrobots.viewers.drawers.Drawers;
import org.dyn4j.dynamics.Settings;

import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class Example {

  public static void main(String[] args) {
    RandomGenerator random = new Random();
    Grid<Voxel> bipedBody = RobotUtils.buildSensorizingFunction("spinedTouch-f-f-0.01").apply(RobotUtils.buildShape("biped-4x3"));

    CentralizedSensing centralizedSensing = new CentralizedSensing(bipedBody);
    MultiLayerPerceptron mlp = new MultiLayerPerceptron(
        MultiLayerPerceptron.ActivationFunction.TANH,
        centralizedSensing.nOfInputs(),
        new int[0],
        centralizedSensing.nOfOutputs()
    );
    double[] ws = mlp.getParams();
    IntStream.range(0, ws.length).forEach(i -> ws[i] = random.nextGaussian());
    mlp.setParams(ws);
    centralizedSensing.setFunction(mlp);
    Robot robot = new Robot(centralizedSensing, SerializationUtils.clone(bipedBody));

    Locomotion locomotion = new Locomotion(13, Locomotion.createTerrain("downhill-30"), new Settings());

    GridOnlineViewer.run(locomotion, Grid.create(1, 1, new NamedValue<>("", robot)), Drawers::basicWithMiniWorld);

  }

}
