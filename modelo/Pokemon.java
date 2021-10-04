package modelo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Objects;

public class Pokemon {

    private String nombre;
    private int vida;
    private int ataque;
    private int defensa;
    private int ataqueEspecial;
    private int defensaEspecial;
    private int velosidad;

    public Pokemon(String nombre, int vida, int ataque, int defensa, int ataqueEspecial, int defensaEspecial, int velosidad) {
        this.nombre = nombre;
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
        this.ataqueEspecial = ataqueEspecial;
        this.defensaEspecial = defensaEspecial;
        this.velosidad = velosidad;
    }

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

    public boolean existe(String ruta ) {
        boolean ex= false;
        try {
            BufferedReader brPoke = new BufferedReader(new FileReader(ruta));
            String linea;
            while ((linea = brPoke.readLine()) != null) {
                if(this.getNombre().equals(linea.split(";")[0])) {
                    ex=true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ex;
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
        return Objects.equals(nombre, pokemon.nombre);
    }

}
