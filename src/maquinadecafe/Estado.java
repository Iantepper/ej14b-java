/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;

/**
 *
 * @author Alumno
 */
public class Estado {
    private boolean estado = false;

    public void encender() {
        if(!estado){
            estado = true;
            System.out.println("La maquina esta encendida");
        }
    }

    // Otros métodos y atributos de la clase Estado
}
