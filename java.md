1. Home:Este es un codigo de introduccion, el cual nos enseña a escribir entre comillas lo que queremos que aparezca en nuestro navegador
public class Main {
    public static void main(String[] args) {
        System.out.println("¡Hola, Mundo!");
    }
}

2. Intro:Este código sirve como ejemplo en Java para demostrar cómo declarar variables de texto, realizar concatenación y mostrar resultados por la consola. Al ejecutarse, asigna el nombre "John" a una variable y lo combina con un saludo, imprimiendo finalmente el mensaje "Hello John" en pantalla para verificar que el programa funciona correctamente.
public class Main {
  public static void main(String[] args) {
    String name = "John";
    System.out.println("Hello " + name);
  }
}

3. Get Started:Este código es un codgio basico el cual normalmente se usa para dar un saludo a la gente que ejecute este codigo desde su navegador. Al ejecutarse aparece "hello World", lo cual indica que el programa funciona bien.
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

4. Syntax: Cada línea de código que se ejecuta en Java debe estar dentro de una clase. El nombre de la clase siempre debe comenzar con una letra mayúscula. En nuestro ejemplo, hemos llamado a la clase Main.
public class Main {
  public static void main(String[] args) {
    System.out.println("Hello World");
  }
}

5. statement: En este codigo tenemos un statement, el cual «indica» al compilador que muestre el texto «Java is fun!» en la pantalla
System.out.println("Java is fun!");

6. Print text: En esta seccion nos indica que podemos añadir los metodos println() que querramos:
System.out.println("Hello World!");
System.out.println("Me gusta java.");
System.out.println("Esto es muy divertido!");

7. Print numbers: En esta seccion nos indica que podemos añadir numeros dentro del metodo println() y tambien realizar operaciones matematicas dentro de el:
System.out.println(3 + 3);

8. Java comments: Esta seccion nos indica como poner un comentario sin que el programa lo ejecute y despues pueda salir error, para esto usamos doble barra:
// This is a comment
System.out.println("Hello World");

9. Variables: Aqui nos indica las distintas tipos de variables que usamos en el lenguaje de java:
String: almacena texto, como "Hello". Los valores de tipo String van entre comillas dobles. ejemplo: String firstName = "John ";
int: almacena números enteros (sin decimales), como 123 o -123. ejemplo: int x = 5;
float: almacena números de punto flotante (con decimales), como 19.99 o -19.99. ejemplo: float temperatura = 23.5f;
char: almacena caracteres individuales, como 'a' o 'B'. Los valores de tipo char van entre comillas simples. ejemplo: char letra = "A";
boolean: almacena valores con dos estados posibles: true (verdadero) o false (falso). ejemplo: boolean tieneDescuento = false;

10. Data Types: Aqui nos indica los tipos de datos que tenemos los cuales son primitivos o no primitivos:
Tipos de datos primitivos: incluyen byte, short, int, long, float, double, boolean y char.
Tipos de datos no primitivos: como String, arrays y clases (aprenderás más sobre ellos en un capítulo posterior).

int myNum = 5;       // myNum is an int
// myNum = "Hello";  // Error: cannot assign a String to an int

String myText = "Hi"; // myText is a String
// myText = 123;      // Error: cannot assign a number to a String