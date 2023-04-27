/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinadecafe;


import static maquinadecafe.TipoDeLeche.LIQUIDA;
import static maquinadecafe.TipoDeLeche.ESPUMA;

/**
 *
 * @author Alumno
 */

public enum TiposDeCafe {
    EXPRESO(null,0),
    LATTE(ESPUMA,2),
    LAGRIMA(LIQUIDA,3);
    private TipoDeLeche tipoLeche;
    private int cantleche;

    private TiposDeCafe(TipoDeLeche tipoLeche, int cantleche) {
        this.tipoLeche = tipoLeche;
        this.cantleche = cantleche;
    }
   
    
}


