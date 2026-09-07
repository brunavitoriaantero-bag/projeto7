package Prototype;

import java.util.ArrayList;
import java.util.List;

public class Personagem implements Cloneable {

    private String nome;
    private int vida;
    private int mana;
    private int forca;
    private int defesa;
    private int velocidade;
    private int inteligencia;
    private int agilidade;
    private int resistencia;
    private int nivel;
    private int experiencia;
    private String classe;
    private String raca;
    private List<String> habilidades;
    private List<String> equipamentos;
    private List<String> armas;
    private String armadura;
    private double dinheiro;
    private List<String> inventario;

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Personagem() {
        habilidades = new ArrayList<>();
        equipamentos = new ArrayList<>();
        armas = new ArrayList<>();
        inventario = new ArrayList<>();
    }

    @Override
    public Personagem clone() {
        try {
            Personagem copia = (Personagem) super.clone();

            copia.habilidades = new ArrayList<>(this.habilidades);
            copia.equipamentos = new ArrayList<>(this.equipamentos);
            copia.armas = new ArrayList<>(this.armas);
            copia.inventario = new ArrayList<>(this.inventario);

            return copia;

        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}