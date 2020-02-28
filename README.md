# -pglp_3.1
Illustration du principe de responsabilité unique (SRP)

1-Non cette classe ne respecte pas le principe SRP  car elle implémente une méthode d'une librairie externe pour l'affichage


2-si la méthode du calcul de salaire change, cela va impacter toutes les classes qui herite de la classe mère


3-si l'affichage est remplacé par le stockage dans un fichier CSV cela n'aura pas d'impact sur le SRP car on peut bien dedier
la manipulation des fichiers à une classe tierce


4-une solution serait de supprimer la méthode afficheCoordonnee et garder uniquement calcul
