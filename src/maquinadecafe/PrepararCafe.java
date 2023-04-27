/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;

/**
 *
 * @author Tango
 */
public class PrepararCafe {
    private ModuloLeche moduloLeche;
    private TiposDeCafe tipoDeCafe;
    private ModuloAgua moduloAgua;
    private Estado estado;

    public PrepararCafe(ModuloLeche moduloLeche, TiposDeCafe tipoDeCafe, ModuloAgua moduloAgua, Estado estado) {
        this.moduloLeche = moduloLeche;
        this.tipoDeCafe = tipoDeCafe;
        this.moduloAgua = moduloAgua;
        this.estado = estado;
    }
}