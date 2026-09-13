/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author CELESTE
 */
public class Medicamento {
    private String nombre;
    private String tipo;
    private int cantidad;
    private String distribuidor;
    private boolean esPrincipal;
    private boolean esSecundaria;

    public Medicamento(String nombre, String tipo, int cantidad, String distribuidor, boolean esPrincipal, boolean esSecundaria) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.distribuidor = distribuidor;
        this.esPrincipal = esPrincipal;
        this.esSecundaria = esSecundaria;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public boolean isEsPrincipal() {
        return esPrincipal;
    }

    public boolean isEsSecundaria() {
        return esSecundaria;
    }

    public String getDistribuidor() {
        return distribuidor;
    }
    public String getTextoDetalle() {
        return cantidad + "\n unidades del " + tipo + "\n nombre:" + nombre;
    }
    
    public String getTextoDireccion() {
        if (esPrincipal && esSecundaria) {
            return "Para la farmacia situada en Calle de la Rosa n. 28 y \n para la situada en Calle Alcazabilla n. 3";
        } else if (esPrincipal) {
            return "Para la farmacia situada en Calle de la Rosa n. 28";
        } else {
            return "Para la farmacia situada en Calle Alcazabilla n. 3";
        }
    }
    
}
