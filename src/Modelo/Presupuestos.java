package Modelo;
// Generated 23-ago-2016 20:56:16 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Presupuestos generated by hbm2java
 */
public class Presupuestos  implements java.io.Serializable {


     private PresupuestosId id;
     private Clientes clientes;
     private Double total;
     private Date fechaHora;
     private Integer interes;
     private Integer descuento;
     private Set detallepresupuestoses = new HashSet(0);
     private Set presupuestosTienenFormasdepagos = new HashSet(0);

    public Presupuestos() {
    }

	
    public Presupuestos(PresupuestosId id, Clientes clientes) {
        this.id = id;
        this.clientes = clientes;
    }
    public Presupuestos(PresupuestosId id, Clientes clientes, Double total, Date fechaHora, Integer interes, Integer descuento, Set detallepresupuestoses, Set presupuestosTienenFormasdepagos) {
       this.id = id;
       this.clientes = clientes;
       this.total = total;
       this.fechaHora = fechaHora;
       this.interes = interes;
       this.descuento = descuento;
       this.detallepresupuestoses = detallepresupuestoses;
       this.presupuestosTienenFormasdepagos = presupuestosTienenFormasdepagos;
    }
   
    public PresupuestosId getId() {
        return this.id;
    }
    
    public void setId(PresupuestosId id) {
        this.id = id;
    }
    public Clientes getClientes() {
        return this.clientes;
    }
    
    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }
    public Double getTotal() {
        return this.total;
    }
    
    public void setTotal(Double total) {
        this.total = total;
    }
    public Date getFechaHora() {
        return this.fechaHora;
    }
    
    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }
    public Integer getInteres() {
        return this.interes;
    }
    
    public void setInteres(Integer interes) {
        this.interes = interes;
    }
    public Integer getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(Integer descuento) {
        this.descuento = descuento;
    }
    public Set getDetallepresupuestoses() {
        return this.detallepresupuestoses;
    }
    
    public void setDetallepresupuestoses(Set detallepresupuestoses) {
        this.detallepresupuestoses = detallepresupuestoses;
    }
    public Set getPresupuestosTienenFormasdepagos() {
        return this.presupuestosTienenFormasdepagos;
    }
    
    public void setPresupuestosTienenFormasdepagos(Set presupuestosTienenFormasdepagos) {
        this.presupuestosTienenFormasdepagos = presupuestosTienenFormasdepagos;
    }




}


