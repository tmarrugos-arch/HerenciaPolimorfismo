package com.poo.herenciapolimorfismo.modelo;

/**
 *
 * @author taidy
 */
public class Perro extends Animal {

    private int edad;
    private String raza;

    // Constructor completo: lo necesita PerroGrande (super(nombre, edad, raza))
    public Perro(String nombre, int edad, String raza) {
        super(nombre);
        this.edad = edad;
        this.raza = raza;
    }

    public Perro(String nombre) {
        this(nombre, 0, "Mestiza");
    }

    public Perro() {
        this("Pongo", 3, "Dálmata");
    }

    public int getEdad() {
        return edad;
    }

    public String getRaza() {
        return raza;
    }

    @Override
    public void hacerSonido() {
        System.out.println(super.getNombre() + " hace Guau guau!");
    }
}