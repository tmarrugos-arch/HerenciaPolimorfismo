package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Pez extends Animal {

    private int profundidad; // metros bajo el agua

    public Pez(String nombre) {
        super(nombre);
        this.profundidad = 0;
    }

    // Método propio de Pez (Animal no lo tiene)
    public void nadar() {
        profundidad += 5;
        System.out.println(getNombre() + " nada a " + profundidad + " metros de profundidad");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace Blub blub...");
    }

    // Sobrecarga de comer(): firma nueva (int) que Animal no tiene.
    // Convive con comer(), comer(String) y comer(String, int) heredados.
    public void comer(int hojuelas) {
        System.out.println(getNombre() + " come " + hojuelas + " hojuelas de alimento");
    }
}