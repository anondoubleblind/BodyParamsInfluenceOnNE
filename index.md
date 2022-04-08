# Abstract
Artificial agents required to perform non-trivial tasks are commonly controlled with Artificial Neural Networks (ANNs), which need to be carefully fine-tuned.
This is where ANN optimization comes into play, often in the form of Neuroevolution (NE).
Among artificial agents, the _embodied_ ones, are characterized by a strong body-brain entanglement, i.e., a strong interdependence between the physical properties of the body and the controller.
In this work, we aim at characterizing said interconnection, experimentally evaluating the impact body material properties have on NE for embodied agents.
We consider the case of Voxel-based Soft Robots (VSRs), a class of simulated modular soft robots which achieve movement through the rhythmical contraction and expansion of their modules.
We experiment varying several physical properties of VSRs and assess the effectiveness of the evolved controllers for the task of locomotion, together with their robustness and adaptability.
Our results confirm the existence of a deep body-brain interrelationship for embodied agents, and highlight how NE fruitfully exploits the physical properties of the agents to give rise to a wide gamut of effective and adaptable behaviors.


# Highlight videos
We display three couple of bipeds for which there is a clear behavioral difference induced by the different body material properties.

The first couple has opposed active range values, namely ρ<sub>a</sub>=0.1 (little power) and ρ<sub>a</sub>=0.3 (higher power). We can observe that the first robot jumps less than the second one.
<iframe width="560" height="315" src="https://www.youtube.com/embed/jC8GNf3C9rg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

The second couple has opposed spring frequency values, namely _f_=0.3 (softer material) and _f_=10 (stiffer material). We can note the greater softness of the first robot w.r.t. to second, as it slower and tends to collapse more.
<iframe width="560" height="315" src="https://www.youtube.com/embed/IphhLzvUpNQ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

The last couple has opposed friction values, namely μ<sub>k</sub>=0.05 (little friction, very slippery) and μ<sub>25</sub> (higher friction). We can notice that the first robot seems to slip when it touches the ground.
<iframe width="560" height="315" src="https://www.youtube.com/embed/8u1WRPByheU" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
