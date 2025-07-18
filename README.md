## Sprint 1 - Tasca 3

**Versió de Java: 21**

### Nivell 1

#### Exercici 1

1. Crea una classe anomenada `Month` amb un atribut "name" (que emmagatzemarà el nom del mes de l'any). Afegeix 11 objectes `Month` (cadascun amb el seu atribut diferent) en un `ArrayList`, a excepció de l'objecte amb atribut "Agost". Després, efectua la inserció en el lloc que correspon a aquest mes i demostra que l’`ArrayList` manté l'ordre correcte.

2. Converteix l’`ArrayList` de l’exercici anterior en un `HashSet` i assegura’t que no permet duplicats.

3. Recorre la llista amb un `for` i amb un iterador.

#### Exercici 2

1. Crea i emplena un `List<Integer>`.

2. Crea un segon `List<Integer>` i insereix a la segona llista els elements de la primera en ordre invers.

3. Empra els objectes `ListIterator` per a llegir els elements de la primera llista i inserir-los en la segona.

#### Exercici 3

1. Donat el fitxer `countries.txt` (revisa l'apartat recursos) que conté països i capitals. El programa ha de llegir el fitxer i guardar les dades en un `HashMap<String, String>`. El programa demana el nom de l’usuari/ària, i després ha de mostrar un país de forma aleatòria, guardat en el `HashMap`. Es tracta que l’usuari/ària ha d’escriure el nom de la capital del país en qüestió. Si l’encerta se li suma un punt. Aquesta acció es repeteix 10 vegades. Un cop demanades les capitals de 10 països de forma aleatòria, llavors s’ha de guardar en un fitxer anomenat `classificacio.txt`, el nom de l’usuari/ària i la seva puntuació.

### Nivell 2

#### Exercici 1

1. Crea una classe anomenada `Restaurant` amb dos atributs: `nom` (**String**) i `puntuació` (**int**). Implementa els mètodes necessaris perquè no es puguin introduir objectes `Restaurant` amb el mateix nom i la mateixa puntuació en un `HashSet` creat en el `main()` de l’aplicació.

   - Pot haver-hi restaurants amb el mateix nom amb diferent puntuació, però no pot haver-hi restaurants amb el mateix nom i la mateixa puntuació.

#### Exercici 2

1. Utilitzant la classe del programa anterior, crea la implementació necessària perquè els objectes de la classe `Restaurant` estiguin ordenats per nom i per puntuació en ordre descendent.

   - Exemple:
     ```
     nom: restaurant1, puntuació: 8
     nom: restaurant1, puntuació: 7
     ```
