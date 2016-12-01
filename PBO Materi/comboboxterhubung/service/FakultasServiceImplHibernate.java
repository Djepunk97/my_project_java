/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxterhubung.service;

import comboboxterhubung.entity.Fakultas;
import comboboxterhubung.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Naufal
 */
public class FakultasServiceImplHibernate implements FakultasService{

@Override
public List<Fakultas> getAllFakultas(){
    Session session=HibernateUtil.getSessionFactory().openSession();
    return session.createQuery("select f from fakultas f").list();
}
}
