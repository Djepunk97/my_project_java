/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comboboxterhubung.service;

import comboboxterhubung.util.HibernateUtil;
import comboboxterhubung.entity.Jurusan;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author Naufal
 */
public class JurusanServiceImplHibernate implements JurusanSevice{
    @Override
    public List<Jurusan> getJurusanByFakultas(String kodefakultas){
        Session session=HibernateUtil.getSessionFactory().openSession();
        return session.createQuery("select j from jurusan j where j.fakultas.idFakultas=:kodefakultas ").setParameter("kodefakultas", kodefakultas).list();
    }
    
}
