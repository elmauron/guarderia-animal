import java.util.Scanner;

public class Guarderia {
    public static void main(String[] args) {
            //Creo variable de opción

        Scanner scanner = new Scanner(System.in);
        System.out.println("---------------------------------------------------");
        System.out.println("    > Bienvenido a la guardería de animales <" + "\n" );
        System.out.println("---------------------------------------------------");
        System.out.println(" Opciones disponibles: " + "\n");
        System.out.println("    1. Ingresar un nuevo animal." + "\n");
        System.out.println("    2. Retirar animal de la guardería." + "\n");
        System.out.println("    3. Ver cantidad de animales actualmente en la guardería." + "\n");
        System.out.println("    4. Ver listado de animales en la guardería." + "\n");
        System.out.println("    5. Hacer saludar a todos los animales." + "\n");
        System.out.println("    0. Salir." + "\n");
        System.out.println("---------------------------------------------------" + "\n");
        System.out.println("Ingrese una opción: "); int opcion = scanner.nextInt();
        System.out.println("\n" + "---------------------------------------------------" + "\n");


            //Creo menu de opciones con case switch
        switch (opcion) {
            case 1:
                

        }
    }
}