/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;

/**
 *
 * @author Alumno
 */
public class ModuloLeche {
   private TipoDeLeche tipoDeLeche ;
   private int medidorDeLeche;

    public ModuloLeche() {
        this.tipoDeLeche = TipoDeLeche.LIQUIDA;
        this.medidorDeLeche = 5;
    }
    public void lecheSuficiente(int CanLeche){
    if (CanLeche>medidorDeLeche){
        System.out.println("Leche insuficiente por favor espere");
        medidorDeLeche= 5;
        System.out.println("Leche restituida");
    } 
    }
    
   public void estadoDeLeche(TipoDeLeche TipoLeche){
     if(TipoLeche != tipoDeLeche) {
         System.out.println("Cambiando consistencia de leche");
         tipoDeLeche=TipoLeche;
         System.out.println("Leche a punto");
     } 
   }
   
}
