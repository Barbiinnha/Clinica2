
package com;

import dao.Dao;
import java.util.Calendar;
import java.util.GregorianCalendar;
import modelo.Usuario;


public class DaoTest {
    public void testInserirUsuario(){
        Dao<Usuario> dao = new Dao(Usuario.class);
        Usuario u =  new Usuario("Astolfo", "Rua das Antas, 1- Bandeirantes- PR", "(43) 99887755",
        new GregorianCalendar(2004, Calendar.FEBRUARY, 11).getTime(), "Astolfo", "123" );
        dao.inserir(u);
    }
    }
        
    

