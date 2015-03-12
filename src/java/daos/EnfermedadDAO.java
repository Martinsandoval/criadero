/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

import modelo.Enfermedad;
import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Ger!
 */

@Stateless 
@LocalBean


public class EnfermedadDAO extends AbstractDAO <Enfermedad> {
  
    public EnfermedadDAO() {
         super(Enfermedad.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    
       
}

