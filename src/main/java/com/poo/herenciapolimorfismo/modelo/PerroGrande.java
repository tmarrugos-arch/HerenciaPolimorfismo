package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class PerroGrande extends Perro {

    private int pesoKg;

    public PerroGrande(String nombre,
                       int edad, String raza,
                       int pesoKg) {
        super(nombre, edad, raza);
        this.pesoKg = pesoKg;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    @Override
    public void hacerSonido() {
        System.out.println("¡¡GUAU!!");
    }
}