/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tareainterfaz;

import java.util.*;

/**
 *
 * @author andre
 */
public class TareaInterfaz {
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
            System.out.println("El gato camina");
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
    
    // Interfaz FiguraGeometrica
    interface FiguraGeometrica {
        double area();
        double perimetro();
    }

    class Circulo implements FiguraGeometrica {
        private double radio;
        public Circulo(double radio) { this.radio = radio; }
        public double area() { return Math.PI * radio * radio; }
        public double perimetro() { return 2 * Math.PI * radio; }
    }

    class Rectangulo implements FiguraGeometrica {
        private double ancho, alto;
        public Rectangulo(double ancho, double alto) { this.ancho = ancho; this.alto = alto; }
        public double area() { return ancho * alto; }
        public double perimetro() { return 2 * (ancho + alto); }
    }
    
    // Interfaz Trabajador
    interface Trabajador {
        void trabajar();
    }

    class Desarrollador implements Trabajador {
        public void trabajar() {
            System.out.println("El desarrollador programa en Java");
        }
    }

    class Diseñador implements Trabajador {
        public void trabajar() {
            System.out.println("El diseñador crea interfaces");
        }
    }
    
    // Interfaz Ordenable
    interface Ordenable {
        void ordenar();
    }

    class ListaNumeros implements Ordenable {
        private List<Integer> numeros;
        public ListaNumeros(List<Integer> numeros) { this.numeros = numeros; }
        public void ordenar() { Collections.sort(numeros); }
        public void mostrar() { System.out.println(numeros); }
    }
    
    // Interfaz Alimentación
    interface Alimentacion {
        void comer();
    }

    class Persona implements Alimentacion {
        public void comer() {
            System.out.println("La persona come con cubiertos");
        }
    }

    class Animalito implements Alimentacion {
        public void comer() {
            System.out.println("El animal come con su hocico");
        }
    }
    
    // Interfaz Notificable
    interface Notificable {
        void enviarNotificacion();
    }

    class CorreoElectronico implements Notificable {
        public void enviarNotificacion() {
            System.out.println("Enviando correo electrónico...");
        }
    }

    class SMS implements Notificable {
        public void enviarNotificacion() {
            System.out.println("Enviando mensaje SMS...");
        }
    }
    
    // Interfaz ComparableObjeto
    interface ComparableObjeto {
        int comparar(Object o);
    }

    class Producto implements ComparableObjeto {
        private double precio;
        public Producto(double precio) { this.precio = precio; }
        public int comparar(Object o) {
            if (!(o instanceof Producto)) return -1;
            Producto otro = (Producto) o;
            return Double.compare(this.precio, otro.precio);
        }
    }
    
    // Interfaz Descontable
    interface Descontable {
        double calcularDescuento(double precio);
    }

    class DescuentoPorcentaje implements Descontable {
        private double porcentaje;
        public DescuentoPorcentaje(double porcentaje) { this.porcentaje = porcentaje; }
        public double calcularDescuento(double precio) {
            return precio - (precio * porcentaje / 100);
        }
    }

    class DescuentoFijo implements Descontable {
        private double cantidad;
        public DescuentoFijo(double cantidad) { this.cantidad = cantidad; }
        public double calcularDescuento(double precio) {
            return precio - cantidad;
        }
    }
}
