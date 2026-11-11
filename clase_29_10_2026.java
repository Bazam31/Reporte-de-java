import java.util.Scanner;

public class clase_29_10_2026 {
    // contador: variable que aumenta en una cantidad fija.
    // cuenta cuantas veces ocurre algo. Se inicaliza en 0
    // contador++ = contador+contador
    
    //ACUMULADOR: variable que suma valores variables:
    // suma +=nota = suma = suma + nota. Inicializa en 0

    //Centinena: valor especial que indica el fin de los datos.
    // no debe procesar como dato

    // Bnadera: variable boolean que recuerda si algo paso = true

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double suma = 0; // acumulador
        int contador = 0; // contador
        double division = 0;

        System.out.println("INGRESE LA NOTA (-1 PARA SALIR):" );
        double nota = scanner.nextDouble();

        while (nota != -1){
            suma+=nota;
            contador++;

            System.out.println("INGRESE UNA NOTA O -1 PARA SALIR: ");
            nota = scanner.nextDouble();

            double capital = 1000.0 , tasa = 0.08;

            
        }
             
    }
}
