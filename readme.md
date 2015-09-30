# Kebab Kata

Kata créé par [Romeu Moura](https://github.com/malk) [@malk_zameth](https://twitter.com/malk_zameth).

Transcription faite lors de SoCraTes FR 2015.

## Présentation

Bonjour, je suis un vendeur de Kebab.

J'ai besoin de fabriquer des kebabs de toutes sortes.

Les ingrédients sont variés : Laitue, roquette, tomate, oignons, agneau, bœuf, cheddar, etc.


## Itération 1 (15 min)

Faire des kebabs, chaque kebab doit pouvoir dire s'il est végétarien.


## Itération 2 (7 min)

Un kebab doit pouvoir dire s'il est pescétarien.

> Le pescétarisme, ou pesco-végétarisme, est un néologisme désignant le régime alimentaire d'une personne omnivore qui s'abstient de consommer de la chair animale à l'exception de celle issue des poissons, des crustacés et mollusques aquatiques.

__Définition [Wikipedia](https://fr.wikipedia.org/wiki/Pesc%C3%A9tarisme)__


## Itération 3 (15 min)

Ajouter les possibilités suivantes :
- système de doublage du fromage (double cheese)
- système pour enlever les oignons

Dans tout les cas, l'ordre des couches ne doit pas être modifié (ordre constant).

Pour le double cheese :
- si le kebab n'a pas de fromage, ne rien faire
- s'il y a du fromage alors le doubler au même endroit de le fromage existant.

ex :

```
S|T|C -> S|T|C|C
C|S|C|T -> C|C|S|C|C|T
```

- C : Cheese
- S : Salade
- T : Tomate


## Itération 4 (20 min)

Refactorer avec des composites.


## Itération 5 (20 min)

Refactorer avec des visiteurs


## Retro

- Limite du composite ?
- Limite des visiteurs ?
- Aller plus loin ? (programmation fonctionnelle ?)

