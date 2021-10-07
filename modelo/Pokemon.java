package modelo;

import java.beans.JavaBean;
import java.io.Serializable;
import java.util.Objects;

public class Pokemon implements Serializable {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velosidad;
    private static final long serialVersionUID = 1L;


    public Pokemon() {}

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getAtaqueEspecial() {
        return ataqueEspecial;
    }

    public int getDefensaEspecial() {
        return defensaEspecial;
    }

    public int getVelosidad() {
        return velosidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    public void setAtaqueEspecial(int ataqueEspecial) {
        this.ataqueEspecial = ataqueEspecial;
    }

    public void setDefensaEspecial(int defensaEspecial) {
        this.defensaEspecial = defensaEspecial;
    }

    public void setVelosidad(int velosidad) {
        this.velosidad = velosidad;
    }

    @Override
    public String toString() {
        return
                nombre + ';' +
                        vida + ';' +
                        ataque + ';' +
                        defensa + ';' +
                        ataqueEspecial + ';' +
                        defensaEspecial + ';' +
                        velosidad
                ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return vida == pokemon.vida && ataque == pokemon.ataque && defensa == pokemon.defensa && ataqueEspecial == pokemon.ataqueEspecial && defensaEspecial == pokemon.defensaEspecial && velosidad == pokemon.velosidad && Objects.equals(nombre, pokemon.nombre);
    }

}
