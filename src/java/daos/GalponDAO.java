/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daos;


import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import modelo.Galpon;




@Stateless 
@LocalBean
public class GalponDAO extends AbstractDAO <Galpon>{

    public GalponDAO() {
        super(Galpon.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
                return em;
    }
    

  
    
    
}
