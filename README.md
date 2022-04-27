# On the Impact of Body Material Properties on Neuroevolution for Embodied Agents: the Case of Voxel-based Soft Robots

This repository hosts the code and the supplementary materials for the paper "On the Impact of Body Material Properties
on Neuroevolution for Embodied Agents: the Case of Voxel-based Soft Robots", accepted at the
["ACM Workshop on NeuroEvolution@Work"](https://www.newk2022.icar.cnr.it/) at GECCO 2022.

## Abstract

Artificial agents required to perform non-trivial tasks are commonly controlled with Artificial Neural Networks (ANNs),
which need to be carefully fine-tuned. This is where ANN optimization comes into play, often in the form of
Neuroevolution (NE). Among artificial agents, the _embodied_ ones are characterized by a strong body-brain entanglement,
i.e., a strong interdependence between the physical properties of the body and the controller. In this work, we aim at
characterizing said interconnection, experimentally evaluating the impact body material properties have on NE for
embodied agents. We consider the case of Voxel-based Soft Robots (VSRs), a class of simulated modular soft robots which
achieve movement through the rhythmical contraction and expansion of their modules. We experiment varying several
physical properties of VSRs and assess the effectiveness of the evolved controllers for the task of locomotion, together
with their robustness and adaptability. Our results confirm the existence of a deep body-brain interrelationship for
embodied agents, and highlight how NE fruitfully exploits the physical properties of the agents to give rise to a wide
gamut of effective and adaptable behaviors.

## Content

The content of this repository is organized into two main packages:

- `hmsrobots`, taken from [2D highly modular soft robots](https://github.com/ericmedvet/2dhmsr), where all the elements
  required to perform the simulation of VSRs are included; and
- `evolution`, which contains all the components used to perform the evolutionary optimization, i.e., the *evolution*,
  of VSRs. This also includes a dependency to [JGEA](https://github.com/ericmedvet/jgea), a general evolutionary
  algorithm (EA) framework written in Java, used for actually performing the optimization part. The jar for JGEA is
  already included in the `lib` folder.

## Suggested usage

### Visualizing a VSR

To visualize a VSR performing locomotion you need to run the `Example` class, which is included in the `hmsrobots`
package. This will start a simulation and will display a video of a VSR - a biped - moving downhill. Note that in this
case we are using a non-optimized VSR, hence most of its successful movement is caused by the inclination of the
terrain.

### Performing an optimization

Evolutionary optimizations are performed by running the `Starter` class contained in `evolution.locomotion`. This will
start the evolution of an MLP-based centralized controller for VSRs with the default parameters (listed at the beginning
of the method `run()`). One can freely play with the parameters, which are mostly self-explanatory, either changing the
source code or by using the corresponding keywords from command line.

### Assessing adaptability

To evaluate VSRs adaptability it is possible to perform a _validation_, i.e., a reassessment of the VSR ability to
locomote in different circumstances than those of the optimization. To this extent, there are 3 classes in
the `evolution.validation` package, which can be used to validate VSRs saved on a CSV file changing physical parameters
or environmental conditions.

## Bibliography

Medvet, Nadizar, Pigozzi. "On the Impact of Body Material Properties on Neuroevolution for Embodied Agents: the Case of Voxel-based Soft Robots", Workshop on Neuroevolution@Work at the ACM Genetic and Evolutionary Computation Conference (GECCO), 2022
```
@inproceedings{medvet2022impact,
  title={On the Impact of Body Material Properties on Neuroevolution for Embodied Agents: the Case of Voxel-based Soft Robots},
  author={Medvet, Eric and Nadizar, Giorgia and Pigozzi, Federico},
  booktitle={Proceedings of the Genetic and Evolutionary Computation Conference Companion},
  year={2022}
}
```
