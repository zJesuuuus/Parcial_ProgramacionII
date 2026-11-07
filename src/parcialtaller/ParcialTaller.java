/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parcialtaller;

/**
 *
 * @author ACER
 */
import java.util.Scanner;

public class ParcialTaller {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Taller taller = new Taller();

        int opcion = 0;

        do {
            System.out.println("========== TALLER AUTOMOTRIZ ==========");
            System.out.println("1. Mostrar todos los servicios");
            System.out.println("2. Mostrar mantenimientos");
            System.out.println("3. Mostrar reparaciones");
            System.out.println("4. Consultar servicios con garantia");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opcion: ");

            try {
                opcion = input.nextInt();

                switch (opcion) {

                    case 1:
                        taller.mostrarTodos();
                        break;

                    case 2:
                        taller.mostrarMantenimientos();
                        break;

                    case 3:
                        taller.mostrarReparaciones();
                        break;

                    case 4:
                        taller.mostrarGarantias();
                        break;

                    case 5:
                        System.out.println("Programa finalizado");
                        break;

                    default:
                        System.out.println("Opcion incorrecta, Intente nuevamente");
                }

            } catch (java.util.InputMismatchException e) {
                System.out.println("Error: debe ingresar un numero");
                input.nextLine();
            }

        } while (opcion != 5);

        input.close();
    }
}