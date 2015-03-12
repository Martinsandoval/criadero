/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import modelo.Vacuna;




@Stateless 
@LocalBean
public class VacunaDAO extends AbstractDAO <Vacuna>{

    public VacunaDAO() {
        super(Vacuna.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
                return em;
    }
    

  
    
    
}
