/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maquinadecafe;



/**
 *
 * @author Alumno
 */
public class MaquinadeCafe {

    
    public static void main(String[] args) {
           
    ModuloLeche n = new ModuloLeche();
    ModuloAgua m = new ModuloAgua();
    Estado l = new Estado();

    PrepararCafe pri = new PrepararCafe(n,TiposDeCafe.LATTE,m,l);
    
    }
    
}
