/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialtaller;

/**
 *
 * @author ACER
 */
import java.util.ArrayList;

public class Taller {

    private ArrayList<Servicio> servicios;

    public Taller() {
        servicios = new ArrayList<>();

        servicios.add(new Mantenimiento("M001", "Cambio de aceite y filtros", 2, "Andres Ruiz"));
        servicios.add(new Reparacion("R001", "Revision del sistema de frenos", 3, "Carlos Mendez"));
        servicios.add(new Mantenimiento("M002", "Alineacion y balanceo", 1, "Laura Gomez"));
        servicios.add(new Reparacion("R002", "Reparacion del sistema electrico", 4, "Julian Perez"));
        servicios.add(new Mantenimiento("M003", "Revision general del vehiculo", 3));
        servicios.add(new Reparacion("R003", "Cambio de componentes de suspension", 2, "Maria Torres"));
    }

    public void agregarServicio(Servicio servicio) {
        servicios.add(servicio);
    }

    public void mostrarTodos() {
        double total = 0;

        System.out.println("===== TODOS LOS SERVICIOS =====");

        for (Servicio servicio : servicios) {
            System.out.println("-----------------------------");
            servicio.mostrarInformacion();
            total += servicio.calcularCosto();
        }

        System.out.println("Costo total de todos los servicios: $" + total);
    }

    public void mostrarMantenimientos() {
        System.out.println("===== MANTENIMIENTOS =====");

        for (Servicio servicio : servicios) {
            if (servicio instanceof Mantenimiento) {
                servicio.mostrarInformacion();
                System.out.println("-----------------------------");
            }
        }
    }

    public void mostrarReparaciones() {
        System.out.println("===== REPARACIONES =====");

        for (Servicio servicio : servicios) {
            if (servicio instanceof Reparacion) {
                servicio.mostrarInformacion();
                System.out.println("-----------------------------");
            }
        }
    }

    public void mostrarGarantias() {
        System.out.println("===== SERVICIOS CON GARANTIA =====");

        boolean encontrado = false;

        for (Servicio servicio : servicios) {
            if (servicio instanceof Garantia) {
                Garantia garantia = (Garantia) servicio;

                servicio.mostrarInformacion();
                System.out.println("Dias de garantia: " + garantia.getDiasGarantia());
                System.out.println("-----------------------------");

                encontrado = true;
            }
        }

        if (!encontrado) {
            System.out.println("No hay servicios con garantia registrados");
        }
    }
}