package BaseDatosAcademia;

public class pruebas {

    public static void main(String[] args) {
          
        BaseDades b1 = new BaseDades();
        cd cd1= new cd("A", "Juan", 10, 50, true, "muy bueno");
        cd cd2= new cd("B", "Luia", 10, 50, true, "muy malo");
        dvd dvd1= new dvd("A", "Pepe", 60, true, "bueno");
                 
        b1.añadir_cd(cd1);
        b1.añadir_cd(cd2);
        b1.añadir_dvd(dvd1);
        
        
        System.out.println(b1.numcds() + b1.numdvds());
                  
    
    
    }
}
