# Practica-3-AIS

Nombre de los alumnos: Raul Sanchez Benitez y Andres Muñoz Muñoz

## Ejemplo 1

**INPUT y OUTPUT**: "1" -> "1"

**EJ1. Código de test**
```java
@Test
public void testParse() {
    CalculatorParser parser = new CalculatorParser();
    assertTrue(parser.parse("1") == 1);
}
```

**EJ1. Mensaje del test añadido que NO PASA**

```log
java.lang.UnsupportedOperationException: Not implemented yet
```

**EJ1. Código mínimo para que el test pase**

Hemos hecho que devuelva 1 para que pase el test.

```java
public int parse(String expression) {
    return 1;
}
```

**EJ1. Captura de que TODOS los test PASAN**

![Pasa](Capturas/test1_PASA.png "Pasa")

**EJ1. Refactorización**
> No es necesaria.



<br>

## Ejemplo 2

**INPUT y OUTPUT**: "2" -> "2"

**EJ2. Código de test**
```java
@Test
public void testParse2(){
    CalculatorParser parser = new CalculatorParser();
    assertEquals(parser.parse("2"), 2);
}
```

**EJ2. Mensaje del test añadido que NO PASA**

```log
org.opentest4j.AssertionFailedError: expected: [1] but was: [2]
```

**EJ2. Código mínimo para que el test pase**

Ahora tenemos que cambiar el código y hacerlo más genérico para que pase los dos tests.

```java
public int parse(String expression) {
    return Integer.parseInt(expression);
}
```

**EJ2. Captura de que TODOS los test PASAN**

![Pasa](Capturas/test2_PASA.png "Pasa")

**EJ2. Refactorización**
> No es necesaria.


<br>

## Ejemplo 3

**INPUT y OUTPUT**: "3" -> "3"

**EJ3. Código de test**
```java
@Test
public void testParse3(){
    CalculatorParser parser = new CalculatorParser();
    assertEquals(parser.parse("3"), 3);
}
```

**EJ3. Mensaje del test añadido que NO PASA**

Al haber hecho el código más generico para que los dos primeros test pasen, el tercero también pasa con la implementación que ya teníamos.

**EJ3. Código mínimo para que el test pase**

Es el mismo código que en el test anterior.

```java
public int parse(String expression) {
    return Integer.parseInt(expression);
}
```

**EJ3. Captura de que TODOS los test PASAN**

![Pasa](Capturas/test3_PASA.png "Pasa")

**EJ3. Refactorización**
> Para finalizar bien estos tres primeros ejemplos, vamos a unificarlos en un mismo test que se asegure de que estos tres test funcionen. Todo esto con el objetivo de simplificar el código.


```java
@Test
public void testPrimeros3Ej(){
    CalculatorParser parser = new CalculatorParser();
    assertEquals(parser.parse("1"), 1);
    assertEquals(parser.parse("2"), 2);
    assertEquals(parser.parse("3"), 3);
}
```
**EJ3. Captura de que TODOS los tests PASAN tras la refactorización**

![Pasa](Capturas/testPrimeros3Ej_PASA.png "Pasa")



<br>

## Ejemplo 4

**INPUT y OUTPUT**: "1+1" -> "2"

**EJ4. Código de test**
```java
@Test
public void test4(){
    CalculatorParser parser = new CalculatorParser();
    assertEquals(parser.parse("1+1"), 2);
}
```

**EJ4. Mensaje del test añadido que NO PASA**

```log
java.lang.NumberFormatException: For input string: "1+1"
```

**EJ4. Código mínimo para que el test pase**

Hemos cambaido el método para que si la cadena de entrada contenga un "+", se sumen los números.

```java
public int parse(String expression) {
    if (expression.contains("+")) {
        String[] parts = expression.split("\\+");
        return Integer.parseInt(parts[0].trim()) + Integer.parseInt(parts[1].trim());
    }
    return Integer.parseInt(expression);
}
```

**EJ4. Captura de que TODOS los test PASAN**

![Pasa](Capturas/test4_PASA.png "Pasa")

**EJ4. Refactorización**
> Podríamos usar recursividad para simplificar el código.

```java
public int parse(String expression) {
    if (expression.contains("+")) {
        String[] parts = expression.split("\\+");
        return parse(parts[0]) + parse(parts[1]);
    }
    return Integer.parseInt(expression);
}
```
**EJ1. Captura de que TODOS los tests PASAN tras la refactorización**

![Pasa](Capturas/test4Refactorizado_PASA.png "Pasa")





<br>

## Ejemplo 4

**INPUT y OUTPUT**: "1+1" -> "2"

**EJ4. Código de test**
```java
@Test
public void test4(){
    CalculatorParser parser = new CalculatorParser();
    assertEquals(parser.parse("1+1"), 2);
}
```

**EJ4. Mensaje del test añadido que NO PASA**

```log
java.lang.NumberFormatException: For input string: "1+1"
```

**EJ4. Código mínimo para que el test pase**

Hemos cambaido el método para que si la cadena de entrada contenga un "+", se sumen los números.

```java
public int parse(String expression) {
    if (expression.contains("+")) {
        String[] parts = expression.split("\\+");
        return Integer.parseInt(parts[0].trim()) + Integer.parseInt(parts[1].trim());
    }
    return Integer.parseInt(expression);
}
```

**EJ1. Captura de que TODOS los test PASAN**

![Pasa](Capturas/test4_PASA.png "Pasa")

**EJ1. Refactorización**
> No es necesaria.

Justificar vuestra refactorización aquí.

```java
public String convert(int number){
    return "I"; // Imaginemos que hemos refactorizado aquí
}
```
**EJ1. Captura de que TODOS los tests PASAN tras la refactorización**
> [BORRAR]  Solo si se ha realizado una refactorización

![Pasa](capturas/Ejemplo_1_PASA.png "Pasa")