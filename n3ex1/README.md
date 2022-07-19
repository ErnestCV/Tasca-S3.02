## Nivell 3

S'ha creat el projecte seguint una arquitectura d'injector - client - servei, per desacoblar les dependències i fer el codi més flexible i més fàcil de testejar (així podem fer mock de les classes d'injecció o de servei per separat, per exemple).

- La classe Main conté la llista de productes i la moneda a la qual es vol convertir el seu preu.
- Amb la llista i la moneda concreta s'instancia una ConverterApp.
- La ConverterApp fa un switch de la moneda i escull quin injector emprarà.
- L'injector crea les classes de servei, així l'app principal ConverterApp s'encarrega només d'usar serveis, no de crear-los.
- L'injector injecta el servei concret de conversió de divisa al client (CurrencyConverter).
- El client usa el servei que ha sigut injectat (encara que el client no l'ha creat).

Referències:

https://www.journaldev.com/2394/java-dependency-injection-design-pattern-example-tutorial

https://stackify.com/dependency-injection/
