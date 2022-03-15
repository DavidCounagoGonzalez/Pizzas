package com.david;

import javax.swing.*;

public class Pizzas {
    String masa;
    boolean relleno;
    int tipo;
    boolean salsa;
    String tipo_salsa;
    boolean cebolla;
    boolean sinGluten;
    boolean extraQueso;

    public Pizzas() {
    }

    public Pizzas(String masa, boolean relleno, int tipo, boolean salsa, String tipo_salsa, boolean cebolla, boolean sinGluten, boolean extraQueso) {
        this.masa = masa;
        this.relleno = relleno;
        this.tipo = tipo;
        this.salsa = salsa;
        this.tipo_salsa = tipo_salsa;
        this.cebolla = cebolla;
        this.sinGluten = sinGluten;
        this.extraQueso = extraQueso;
    }

    public String getMasa() {
        return masa;
    }

    public void setMasa(String masa) {
        this.masa = masa;
    }

    public boolean isRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isSalsa() {
        return salsa;
    }

    public void setSalsa(boolean salsa) {
        this.salsa = salsa;
    }

    public String getTipo_salsa() {
        return tipo_salsa;
    }

    public void setTipo_salsa(String tipo_salsa) {
        this.tipo_salsa = tipo_salsa;
    }

    public boolean isCebolla() {
        return cebolla;
    }

    public void setCebolla(boolean cebolla) {
        this.cebolla = cebolla;
    }

    public boolean isSinGluten() {
        return sinGluten;
    }

    public void setSinGluten(boolean sinGluten) {
        this.sinGluten = sinGluten;
    }

    public boolean isExtraQueso() {
        return extraQueso;
    }

    public void setExtraQueso(boolean extraQueso) {
        this.extraQueso = extraQueso;
    }

    @Override
    public String toString() {
        return "Pizzas{" +
                "masa='" + masa + '\'' +
                ", relleno=" + relleno +
                ", tipo=" + tipo +
                ", salsa=" + salsa +
                ", tipo_salsa='" + tipo_salsa + '\'' +
                ", cebolla=" + cebolla +
                ", sinGluten=" + sinGluten +
                ", extraQueso=" + extraQueso +
                '}';
    }
}
