/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.interfacestarea;

/**
 *
 * @author andre
 */
public class InterfacesTarea {
    // Interfaz Animal
    interface Animal {
        void hacerSonido();
        void mover();
    }

    class Perro implements Animal {
        public void hacerSonido() {
            System.out.println("El perro ladra");
        }
        public void mover() {
            System.out.println("El perro corre");
        }
    }

    class Gato implements Animal {
        public void hacerSonido() {
            System.out.println("El gato maulla");
        }
        public void mover() {
            System.out.println("El gato salta");
        }
    }
}
