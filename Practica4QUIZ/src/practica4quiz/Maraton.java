/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica4quiz;

/**
 *
 * @author compr
 */
public class Maraton {

    
    static class Participante {
        private String nombreCompleto;
        private int edad;
        private int numeroCorredor;
        private int tiempoEstimado; // En minutos
        private String categoria;

        // Constructor
        public Participante(String nombreCompleto, int edad, int numeroCorredor, int tiempoEstimado) {
            this.nombreCompleto = nombreCompleto;
            this.edad = edad;
            this.numeroCorredor = numeroCorredor;
            this.tiempoEstimado = tiempoEstimado;
            this.categoria = asignarCategoria(edad);
        }

  // Método para asignar categoría según la edad
        private String asignarCategoria(int edad) {
            if (edad < 18) {
                return "Juvenil";
            } else if (edad <= 40) {
                return "Adulto";
            } else {
                return "Master";
            }
        }

        @Override
        public String toString() {
            return "Nombre: " + nombreCompleto + ", Edad: " + edad + ", Número de Corredor: " + numeroCorredor +
                   ", Tiempo Estimado: " + tiempoEstimado + " minutos, Categoría: " + categoria;
        }

        public int getNumeroCorredor() {
            return numeroCorredor;
        }

  public String getCategoria() {
            return categoria;
        }
    }

    
}
