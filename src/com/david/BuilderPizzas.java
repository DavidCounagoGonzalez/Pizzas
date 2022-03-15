package com.david;


public class BuilderPizzas {
      private  Pizzas _pizza;
      public Pizzas build(){
          return this._pizza;
      }

      public BuilderPizzas setMasa(String masa){
          _pizza.setMasa(masa);
          return this;
      }

      public BuilderPizzas setRelleno(Boolean relleno){
          _pizza.setRelleno(relleno);
          return this;
      }

      public BuilderPizzas setTipo(int tipo){
          _pizza.setTipo(tipo);
          return this;
      }

      public BuilderPizzas setSalsa(Boolean salsa){
          _pizza.setSalsa(salsa);
          return this;
      }
      public  BuilderPizzas setTipo_Salsa(String tipoSalsa){
          _pizza.setTipo_salsa(tipoSalsa);
          return this;
      }

      public BuilderPizzas setCebolla (Boolean cebolla){
          _pizza.setCebolla(cebolla);
          return this;
      }

      public BuilderPizzas setSinGluten (Boolean sinGluten){
          _pizza.setSinGluten(sinGluten);
          return this;
      }

      public  BuilderPizzas setExtraQueso (Boolean extraQueso){
          _pizza.setExtraQueso(extraQueso);
          return this;
      }
}
