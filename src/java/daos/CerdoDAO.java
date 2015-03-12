/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;

/**
 *
 * @author HP1140LA
 */
import modelo.Cerdo;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;

@Stateless
@LocalBean
public class CerdoDAO extends AbstractDAO <Cerdo>{

    
     public CerdoDAO() {
        super(Cerdo.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
                return em;
    }
    

   
    
    
    
}
    

