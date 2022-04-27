# Abstract
Artificial agents required to perform non-trivial tasks are commonly controlled with Artificial Neural Networks (ANNs), which need to be carefully fine-tuned.
This is where ANN optimization comes into play, often in the form of Neuroevolution (NE).
Among artificial agents, the _embodied_ ones are characterized by a strong body-brain entanglement, i.e., a strong interdependence between the physical properties of the body and the controller.
In this work, we aim at characterizing said interconnection, experimentally evaluating the impact body material properties have on NE for embodied agents.
We consider the case of Voxel-based Soft Robots (VSRs), a class of simulated modular soft robots which achieve movement through the rhythmical contraction and expansion of their modules.
We experiment varying several physical properties of VSRs and assess the effectiveness of the evolved controllers for the task of locomotion, together with their robustness and adaptability.
Our results confirm the existence of a deep body-brain interrelationship for embodied agents, and highlight how NE fruitfully exploits the physical properties of the agents to give rise to a wide gamut of effective and adaptable behaviors.


# Highlight videos
We display three couple of bipeds for which there is a clear behavioral difference induced by the different body material properties.

The first couple has opposed active range values, namely ρₐ=0.1 (little power) and ρₐ=0.3 (higher power). We can observe that the first robot jumps less than the second one.
<iframe width="560" height="210" src="https://www.youtube.com/embed/jC8GNf3C9rg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<video width="560" height="210" controls src="video/active.mov"></video>

The second couple has opposed spring _f_ values, namely _f_=0.3 (softer material) and _f_=10 (stiffer material). We can note the greater softness of the first robot w.r.t. to second, as it is slower and tends to collapse more.
<iframe width="560" height="210" src="https://www.youtube.com/embed/IphhLzvUpNQ" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<video width="560" height="210" controls src="video/springf.mov"></video>

The last couple has opposed friction values, namely μₖ=0.05 (little friction, very slippery) and μₖ=25 (higher friction). We can notice that the first robot seems to slip when it touches the ground.
<iframe width="560" height="210" src="https://www.youtube.com/embed/8u1WRPByheU" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>

<video width="560" height="210" controls src="video/friction.mov"></video>

# Hall of fame videos
Here we show, for each shape, the 10 best robots found by evolution for two opposed values for each material property.

## Active range ρₐ
The first row displays robots with ρₐ=0.3, the second row displays robots with ρₐ=0.1.

<video width="560" height="85" controls src="video/biped-active.mkv"></video>

<video width="560" height="85" controls src="video/comb-active.mkv"></video>

<video width="560" height="85" controls src="video/worm-active.mkv"></video>


## Spring _f_
The first row displays robots with _f_=10, the second row displays robots with _f_=0.3.

<video width="560" height="85" controls src="video/biped-springf.mkv"></video>

<video width="560" height="85" controls src="video/comb-springf.mkv"></video>

<video width="560" height="85" controls src="video/worm-springf.mkv"></video>


## Spring _d_
The first row displays robots with _d_=0.99, the second row displays robots with _d_=0.1.

<video width="560" height="85" controls src="video/biped-springd.mkv"></video>

<video width="560" height="85" controls src="video/comb-springd.mkv"></video>

<video width="560" height="85" controls src="video/worm-springd.mkv"></video>


## Friction μₖ
The first row displays robots with μₖ=25, the second row displays robots with μₖ=0.05.

<video width="560" height="85" controls src="video/biped-friction.mkv"></video>

<video width="560" height="85" controls src="video/comb-friction.mkv"></video>

<video width="560" height="85" controls src="video/worm-friction.mkv"></video>
