package BaseDatosAcademia;

import java.util.ArrayList;

public class BaseDades {

    ArrayList<cd> cds;
    ArrayList<dvd> dvds;
    
    public BaseDades(){
        cds = new ArrayList<cd>();
        dvds = new ArrayList<dvd>();
        
    }
    
    
    public void añadir_cd( cd x){
        
        cds.add(x);
    }
    
    public void añadir_dvd(dvd x){
        
       dvds.add(x);
    }
    
    public int numcds(){
                
        return cds.size();
    }
    
    public int numdvds(){
        return dvds.size();
                
    }
    
}
