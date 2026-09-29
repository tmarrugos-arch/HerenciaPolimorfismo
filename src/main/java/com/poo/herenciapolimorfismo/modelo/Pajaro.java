package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Pajaro extends Animal {

    private int altura; // metros a los que está volando

    public Pajaro(String nombre) {
        super(nombre);
        this.altura = 0;
    }

    // Método propio de Pajaro (Animal no lo tiene)
    public void volar() {
        altura += 10;
        System.out.println(getNombre() + " vuela a " + altura + " metros de altura");
    }

    @Override
    public void hacerSonido() {
        System.out.println(getNombre() + " hace Pío pío!");
    }
}