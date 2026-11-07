/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialtaller;

/**
 *
 * @author ACER
 */
public class Mantenimiento extends Servicio implements Garantia {

    private static final double COSTO_BASE = 80000;
    private static final double COSTO_HORA = 25000;
    private static final int DIAS_GARANTIA = 30;

    public Mantenimiento(String codigo, String descripcion, int horas, String mecanico) {
        super(codigo, descripcion, horas, mecanico);
    }

    public Mantenimiento(String codigo, String descripcion, int horas) {
        super(codigo, descripcion, horas);
    }

    @Override
    public double calcularCosto() {
        return COSTO_BASE + (getHoras() * COSTO_HORA);
    }

    @Override
    public int getDiasGarantia() {
        return DIAS_GARANTIA;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Garantia: " + getDiasGarantia() + " dias");
    }
}