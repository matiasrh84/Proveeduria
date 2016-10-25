package Modelo;
// Generated 23-ago-2016 20:56:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Deposito generated by hbm2java
 */
public class Deposito  implements java.io.Serializable {


     private int idDepositos;
     private String nombre;
     private Set stocks = new HashSet(0);

    public Deposito() {
    }

	
    public Deposito(int idDepositos) {
        this.idDepositos = idDepositos;
    }
    public Deposito(int idDepositos, String nombre, Set stocks) {
       this.idDepositos = idDepositos;
       this.nombre = nombre;
       this.stocks = stocks;
    }
   
    public int getIdDepositos() {
        return this.idDepositos;
    }
    
    public void setIdDepositos(int idDepositos) {
        this.idDepositos = idDepositos;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set getStocks() {
        return this.stocks;
    }
    
    public void setStocks(Set stocks) {
        this.stocks = stocks;
    }




}

