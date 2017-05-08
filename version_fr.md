# The Kebab Kata’s Facilitator’s guide

https://github.com/malk/the-kebab-kata/

## Un jeux pour identifier et combattre les problèmes systémique d'équipe créant du legacy

Because we tend to believe this is only on the devs shoulders but everyone has a part creating that legacy!
Your interactions with your teammates and managers are as much of a burden to your code as you are.

### By [Romeu Moura](https://twitter.com/malk_zameth)

I have created this kata for [NewCrafts](https://twitter.com/ncraftsconf), done it at [DDDEurope](https://twitter.com/ddd_eu/status/781054838109069313) & [SoCraTes](https://twitter.com/socrates_fr).
The concept of using these patterns to do a Kebab I have taken from Matthias Felleisen & Dan Friedman.


### Pitching it as a facilitator

> Essayez de créer un code que vous ne considéreriez pas comme "legacy".
>
> Je vais jouer le rôle de votre client et utiliser 20 techniques pour vous faire échouer.
>
> Vous allez échouer.
>
> Nous discuterons des techniques que j'ai utilisées, comment elles arrives dans la vie réelle, comment les combattre dans votre projet.
>
> Tous les langages sont les bienvenues. Amenez votre propre ordinateur avec votre environnement. Vous allez vous diviser en petites équipes.


### De 4 à ∞ participants

* Un facilitateur (vous, *vrai?* si non *arrêtez de lire* maintenant et passez cela au facilitateur)
  * Vous êtes aussi de gardien du temps et le "client"
* Au moins 2 paires de développeurs (chaque groupe a besoin d'au moins 2 développeurs et vous avez besoin d'au moins deux groupes)

### Cela prends environ 2 heures

* Le corps du kata prends environ 75 minutes, puis le debrief.
* Vous pouvez faire une version plus courte de 90 minutes dans l'urgence.
* Le debrief peut être très long, J'ai vu des groupes qui avaient besoin de parler après pendant des heures.

## Playing the game

* 4 itérations où ils codent avec un budget de temps que vous définissez.
  * Ils peuvent négocier pour plus, soyez ouvert à la *négociation* mais jamais ouvert pour *accepter* de donner plus.
  * Vous devrez toujours vous comporter comme si c'était trop et demander s'ils ne peuvent pas le faire en moins.
  * Oui, même si *vous* avez décidé d'un budget arbitraire de temps
* À la fin de chaque itération chaque équipe a 45 secondes pour faire une "démonstration client"
  * Pendant les démos client, d'autres équipes peuvent tricher et continuer à développer
  * L'équipe ne montre pas de code pendant la démo du client; Juste des tests (automatiques ou manuels) du code fonctionnant
  * L'équipe peut vendre vaporware à la démo du client
* Après les démonstrations client, nous faisons des examens de code
  * La moitié des équipes examinent la moitié des autres puis inversement
    * Chaque examen dure 1,5 à 2 minutes
    * Encourager les équipes à être honnêtes avec les examinateurs
      * Et demander aux examinateurs d'essayer de donner des suggestions positives sur les améliorations
* Après quatre itérations (chacune avec sa propre ronde de codes, demo et des critiques de code): faire un compte rendu final

### Tips :

* Choisissez si vous leur dites ou non combien d'itérations il y a
  * Mais ne donnez pas le contenu et le budget de temps de toute l'itération avant qu'elle ne commence.
* Vous pouvez choisir d'annoncer une des 4 itérations comme cinq minutes de plus que cela est indiqué. Ensuite, *pendant* l'itération, annoncer une réduction budgétaire et utiliser le temps total indiqué.


### Itération 1: "Kebabs & végétarisme" (10 minutes)

#### Dites aux développeurs :

* Vous êtes le propriétaire d'un kebab
* Vous avez besoin d'un objet `Kebab` que vous pouvez créer avec n'importe quel ingrédient que vous voulez (salade, tomates, oignons, viande, etc)
* Vous avez déjà une interface utilisateur, vous voulez seulement l'objet
* Il devrait avoir une méthode `isVegeterian`
  * Ne prend aucun argument, renvoie un booléen
  * Vrai si tous les ingrédients sur le kebab sont végétarien (légumes + fromage + oeufs)
* Vous serez généreux et leur donnerez suffisamment de temps pour faire une tâche si *simple*: 10 minutes.

##### Tips :

* Soyez vague!
  * Ne leur donnez pas votre liste d'ingrédients
  * Se comporter comme si elle devrait être évidente
* *Être inconsistant!*
  * Quand ils demandent spécifiquement pour la liste des ingrédients, oublier et se rappeler les ingrédients
* Dévaluer leur travail
  * Traiter la tâche comme étant trivial et 10 minutes comme étant plus du double du temps dont ils ont besoin pour le faire
  * Interrompez-les pour demander des avis et des estimations inférieures
  * Toute personne qui accepte de le faire en moins a un rappel à la fin de leur estimation qu'ils devraient avoir terminé
* Insistez sur le fait que vous pensez qu'ils ne devraient pas investir trop de leur temps dans la qualité et les tests


### Itération 2 : "Finissez votre travail et nettoyez !" (7 minutes)

#### Dites aux développeurs :

* Vous comprenez que peut-être qu'ils n'ont pas complètement terminé et besoin d'un budget supplémentaire
* Ils ont aussi besoin de temps pour refactoriser, tester et nettoyer
* Vous serez généreux et donnez-leur le temps de le faire maintenant
* AUSSI, par ailleurs, vous voulez que Kebab ait *juste* une autre méthode `isPesceterian`
  * Tout ce qui est `isVegeterian` est aussi `isPesceterian` *plus* les poissons et les crevettes
    * Oui, c'est la première fois que vous parlez de crevettes
    * Nier qu'il soit la première fois
* Insistez sur le fait que ce n'est qu'un "sprint de nettoyage" que vous donnez en cadeau, la demande `isPesceterian` est, évidemment, un tout petit détail

> Le pescétarisme, ou pesco-végétarisme, est un néologisme désignant le régime alimentaire d'une personne omnivore qui s'abstient de consommer de la chair animale à l'exception de celle issue des poissons, des crustacés et mollusques aquatiques.

##### Tips :

* Leur dire que vous voulez également soumettre un rapport de bogue concernant qu'ils ne manipulent pas la crevette jusqu'à maintenant
* Garder le flou, les incohérences et les demandes d'estimation
* Insister sur le fait que *le meilleur est l'ennemi du bien*
* Aller d'équipe en équipe et demander à chaque équipe si elles ne produiraient pas plus si elles divisent l'équipe en plusieurs équipes d'une personne, chacun travaillant ensemble en divisant les taches


### Itération 3 : "Une seule User Story urgente pour ce sprint !" (15 minutes)

#### Dites aux développeurs :

* Vous voulez soumettre un rapport de bogue : ils ne manipulent pas les sauces
  * Leur dire qu'il est évident que vous avez des sauces, c'est évidement !
* Mais de toute façon ce n'est pas la question principale avec le sprint : vous avez une User Story vraiment urgente !
* Insister pour qu'ils répondent à *votre* problème, *pas* une version générale de celui-ci
* Vous voulez que `Kebab` fasse les deux demandes les plus courantes de vos clients : `removeOnions` & `doubleCheese`
* Les 2 retournent un `Kebab`, ce peut être un nouveau ou le même changé, mais l'appelant va juste utiliser le `Kebab` retourné
* `removeOnions` renvoie un kebab, sans oignons
  * `bread + cheese + onion + onion + cheese + onion` retourne `bread + cheese + cheese`
* `doubleCheese` retourne un kebab, avec les fromages doublés en place
  * `bread + cheese + onion + cheese + onion` retourne `bread + cheese + cheese + onion + cheese + cheese + onion`


##### Tips :

* Garder le flou, les incohérences et les demandes d'estimation
* Insister pour que vos deux exigences soient une seule
* Refuser de prioriser entre eux
* Aller autour de l'équipe en leur demandant s'ils ne peuvent pas finir plus tôt, comme 10 minutes au total


### Entracte : "un nouveau vous"

#### Dites aux développeurs :

* Merci pour votre bon travail !
* S'il vous plaît high-five tout le monde dans votre équipe !
* Vous êtes tous virés !
* Vous êtes une nouvelle version de vous-mêmes, sans rapport avec le précédent
* Je vous engage à hériter de la base de code de vos identités précédentes
* La dernière équipe a vraiment fait un travail horrible ! Ils sont horribles !
* Mais votre nouveau vous est vraiment bon, je peux le voir !
* Veuillez faire une vérification d'une minute du code
  * Pas de modification du code pendant la vérification
  * Chaque équipe devrait donner un rapport de ce qu'ils souhaiteraient changer dans cette base de code héritée qu'ils viennent d'auditer


### Itération 4: "Nettoyer votre base de code Legacy" (20 minutes)

#### Dites aux développeurs :

* Si le code ne fonctionne pas, commencez par le faire fonctionner
* Si le code n'a pas de tests, vous devez les ajouter
* Ensuite, vous pouvez refactoriser comme bon vous semble
* J'ai embauché un *Architecte* pour vous aider avec une idée de la façon de faire ce refactoring

#### Changer de tonalité de voix, dites aux développeurs :

* Vous êtes *l'Architecte*
* Vous essaierez de parler avec eux en termes qu'ils peuvent comprendre
* Vous proposez qu'ils créent un `DishKebab` qui est un pattern **NullObject**
* Chacun des autres types de `Kebab` devrait suivre un pattern **Composite**
  * Ils prendront un autre, à l'intérieur, `Kebab` dans leur constructeur et le déléguer
    * Un `Kebab` de boeuf n'est pas végétarien: son `isVegeterian` retourne `false`
    * Une Salade `Kebab` est végétarien: son `isVegeterian` appelle `isVegeterian` de son Kebab intérieur
* Balayez toute critique de l'idée en faisant appel à votre propre autorité


### **Le Debrief**

#### Dites aux développeurs :

* Ont-ils créé dans leur propre définition personnelle d'une base de code Legacy ?
* Quelle est leur définition ?
* Vous avez utilisé au moins 10 techniques pour les pousser à créer du code de merde (Note: ceux dans les Tips)
* Vous leur offrez un gratuitement: Vous avez instillé un sentiment artificiel et arbitraire d'urgence
   * Avec vos délais
   * Et vous leur avez mis la pression pour terminer avant ces délais arbitraires
* Qu'avez-vous fait d'autre ?
   * Faire les énumérer
* Est-ce qu'ils voient cela dans leur vie quotidienne ?
* Comment pouvons-nous combattre chacun de ceux-là ?
   * Cela devient un débat
