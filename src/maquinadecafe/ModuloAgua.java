/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;


public class ModuloAgua
{
    
private int medidorTemperatura;
private boolean indMant;

    public ModuloAgua() {
        this.indMant = false;
        this.medidorTemperatura = 70;
    }

    
    
    public void mant()
    {
        if (indMant){
            System.out.println("La maquina necesita mantenimeinto");
            indMant = false;
            System.out.println("La maquina ah sido reparada");
        }
    }
    
    public void temp(){
        if(medidorTemperatura<70){
            System.out.println("El agua se encuentra fria por favor espere");
            medidorTemperatura=70;
            System.out.println("El agua se encuentra a temperatura correcta");
        }
    }

}
