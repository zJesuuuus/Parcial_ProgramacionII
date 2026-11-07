/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialtaller;

/**
 *
 * @author ACER
 */
public abstract class Servicio {

    private String codigo;
    private String descripcion;
    private int horas;
    private String mecanico;

    public Servicio(String codigo, String descripcion, int horas, String mecanico) {
        if (horas <= 0) {
            throw new IllegalArgumentException("Las horas deben ser mayores a cero");
        }

        this.codigo = codigo;
        this.descripcion = descripcion;
        this.horas = horas;
        this.mecanico = mecanico;
    }

    public Servicio(String codigo, String descripcion, int horas) {
        this(codigo, descripcion, horas, "No asignado");
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getHoras() {
        return horas;
    }

    public String getMecanico() {
        return mecanico;
    }

    public abstract double calcularCosto();

    public void mostrarInformacion() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Horas: " + horas);
        System.out.println("Mecanico: " + mecanico);
        System.out.println("Costo: $" + calcularCosto());
    }
}