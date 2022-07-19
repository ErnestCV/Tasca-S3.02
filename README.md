# Tasca-S3.02
Patterns 2

## Nivell 1

La primera implementació s'ha fet simplement aplicant el patró Observer a la situació. La segona (v2) s'ha fet emprant referències a la instància PropertyChangeListener, que ens proporciona una altra manera d'implementar aquest patró.

https://www.baeldung.com/java-observer-pattern

## Nivell 2

En primer lloc se selecciona el tipus de pagament, es crea un objecte corresponent a aquest tipus, i se li passa a la passarel·la de pagaments. Es podria haver cridat a la pasarel·la des del main però s'ha fet des de la classe Botiga per no tenir els mètodes tan a la vista. La sel·lecció del mètode de pagament es fa mitjançant un mètode estàtic d'una classe creada ad hoc. El callback es fa una vegada processat el pagament, per part del mètode `postPagament` de la classe Botiga.

## Nivell 3

Veure readme a n3ex1 i comentaris al codi.
