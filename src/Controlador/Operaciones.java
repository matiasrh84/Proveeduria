/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Clientes;
import Modelo.Contacto;
import Modelo.Deposito;
import Modelo.Facturacion;
import Modelo.Formasdepago;
import Modelo.Lotes;
import javax.swing.JOptionPane;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

/**
 *
 * @author MATIAS
 */
public class Operaciones {
    
     public void altaClientes(Clientes cliente){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(cliente);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           } 
     
     ///////////////////////////////////////////////////////////////
     
     
     public void altaContacto(Contacto contacto){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(contacto);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           }
     
     ///////////////////////////////////////////////////////////////////
     
     
     public void altaDeposito(Deposito deposito){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(deposito);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           }
     
     ////////////////////////////////////////////////////////////////////
     
     
      public void altaFacturacion(Facturacion facturacion){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(facturacion);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           }
     
     ////////////////////////////////////////////////////////////////////
      
      
     public void altaFormasDePago(Formasdepago formasdepago){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(formasdepago);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           }
     
     /////////////////////////////////////////////////////////////////////
     
      public void altaLotes(Lotes lote){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(lote);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           }
      
      public void altaFacturaElectronica(Facturacion factura){
    
        SessionFactory sesion = NewHibernateUtil.getSessionFactory();
        Session session;
        session = sesion.openSession();
        Transaction tx = session.beginTransaction();
        session.save(factura);
        tx.commit();
        session.close();
        JOptionPane.showMessageDialog(null, "sucess!!");
                           }
      
}
