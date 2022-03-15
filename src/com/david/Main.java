package com.david;

public class Main {

    public static void main(String[] args) {

        BuilderPizzas miBuilder=new BuilderPizzas();
        BuilderPizzas miBuilder2=new BuilderPizzas();
        Pizzas miPizza=miBuilder.setMasa("fina").setRelleno(false).setSalsa(true).setTipo_Salsa("Barbacoa").build();
        System.out.println(miPizza.toString());
        Pizzas miPizza2=miBuilder2.setMasa("pan").setRelleno(false).setSalsa(false).setTipo_Salsa(null).build();
        System.out.println((miPizza2.toString()));
    }
}
