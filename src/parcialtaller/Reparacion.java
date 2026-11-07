/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialtaller;

/**
 *
 * @author ACER
 */
public class Reparacion extends Servicio {

    private static final double COSTO_BASE = 120000;
    private static final double COSTO_HORA = 40000;

    public Reparacion(String codigo, String descripcion, int horas, String mecanico) {
        super(codigo, descripcion, horas, mecanico);
    }

    public Reparacion(String codigo, String descripcion, int horas) {
        super(codigo, descripcion, horas);
    }

    @Override
    public double calcularCosto() {
        return COSTO_BASE + (getHoras() * COSTO_HORA);
    }
}