package com.poo.herenciapolimorfismo;

import com.poo.herenciapolimorfismo.modelo.Animal;
import com.poo.herenciapolimorfismo.modelo.Gato;
import com.poo.herenciapolimorfismo.modelo.Pajaro;
import com.poo.herenciapolimorfismo.modelo.Perro;
import com.poo.herenciapolimorfismo.modelo.PerroGrande;
import com.poo.herenciapolimorfismo.modelo.Pez;

/**
 *
 * @author taidy
 */
public class HerenciaPolimorfismo {

    public static void main(String[] args) {

        System.out.println("=== 1. Variable padre, objeto hijo ===");
        // Variable de tipo Animal (padre), objeto real de tipo hijo
        Animal mascota1 = new Perro();
        Animal mascota2 = new Gato();
        // El método ejecutado depende del tipo REAL del objeto
        mascota1.hacerSonido();   // Pongo hace Guau guau!
        mascota2.hacerSonido();   // Garfield hace Miau miau!

        System.out.println("\n=== 2. Polimorfismo con arreglo ===");
        Animal[] animales = {
            new Perro("Rex"),
            new Gato("Silvestre"),
            new Pajaro("Piolín"),
            new Pez("DORY"),
            new PerroGrande("Zeus", 5, "Gran Danés", 70),
            new Animal("Genérico")
        };
        for (Animal animal : animales) {
            animal.hacerSonido(); // Mismo mensaje, DIFERENTES resultados
        }

        System.out.println("\n=== 3. Métodos propios (instanceof + casting) ===");
        for (Animal animal : animales) {
            if (animal instanceof Pajaro) {
                Pajaro pajaro = (Pajaro) animal; // downcasting
                pajaro.volar();
                pajaro.volar();
            } else if (animal instanceof Pez) {
                Pez pez = (Pez) animal;          // downcasting
                pez.nadar();
                pez.nadar();
            }
        }

        System.out.println("\n=== 4. Sobrecarga de comer() en Pez ===");
        Pez dory = new Pez("Dory");
        dory.comer();               // heredado de Animal
        dory.comer("plancton");     // heredado de Animal
        dory.comer("larvas", 3);    // heredado de Animal
        dory.comer(5);              // sobrecarga propia de Pez

        System.out.println("\n=== 5. Herencia multinivel: PerroGrande -> Perro -> Animal ===");
        PerroGrande zeus = new PerroGrande("Zeus", 5, "Gran Danés", 70);
        System.out.println("Nombre: " + zeus.getNombre()); // de Animal
        System.out.println("Raza:   " + zeus.getRaza());   // de Perro
        System.out.println("Edad:   " + zeus.getEdad());   // de Perro
        System.out.println("Peso:   " + zeus.getPesoKg() + " kg"); // propio
        zeus.hacerSonido();         // ¡¡GUAU!! (sobrescrito en PerroGrande)
        zeus.comer("croquetas", 4); // heredado de Animal
    }
}