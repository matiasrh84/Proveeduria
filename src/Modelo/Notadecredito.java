package Modelo;
// Generated 23-ago-2016 20:56:16 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Notadecredito generated by hbm2java
 */
public class Notadecredito  implements java.io.Serializable {


     private Integer idNotaDeCredito;
     private Set facturacions = new HashSet(0);

    public Notadecredito() {
    }

    public Notadecredito(Set facturacions) {
       this.facturacions = facturacions;
    }
   
    public Integer getIdNotaDeCredito() {
        return this.idNotaDeCredito;
    }
    
    public void setIdNotaDeCredito(Integer idNotaDeCredito) {
        this.idNotaDeCredito = idNotaDeCredito;
    }
    public Set getFacturacions() {
        return this.facturacions;
    }
    
    public void setFacturacions(Set facturacions) {
        this.facturacions = facturacions;
    }




}


