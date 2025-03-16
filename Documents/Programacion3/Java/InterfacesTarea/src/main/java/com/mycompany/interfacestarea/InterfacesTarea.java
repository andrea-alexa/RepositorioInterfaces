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
    
    // Interfaz Vehiculo
    interface Vehiculo {
        void arrancar();
        void detener();
    }

    class Coche implements Vehiculo {
        public void arrancar() {
            System.out.println("El coche arranca");
        }
        public void detener() {
            System.out.println("El coche se detiene");
        }
    }

    class Bicicleta implements Vehiculo {
        public void arrancar() {
            System.out.println("La bicicleta comienza a moverse");
        }
        public void detener() {
            System.out.println("La bicicleta se detiene");
        }
    }
    
    // Interfaz Pago
    interface Pago {
        void procesarPago(double cantidad);
    }

    class PagoConTarjeta implements Pago {
        public void procesarPago(double cantidad) {
            System.out.println("Pago con tarjeta de: " + cantidad + " USD");
        }
    }

    class PagoConEfectivo implements Pago {
        public void procesarPago(double cantidad) {
            System.out.println("Pago en efectivo de: " + cantidad + " USD");
        }
    }
}
