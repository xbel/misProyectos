package BaseDatosAcademia;

public class dvd {
    private String titulo;
    private String director;
    private int duracion;
    private boolean lotengo;
    private String comentario;
    
    public dvd(String ti, String dir, int dur, boolean lotengo, String coment){
        this.titulo= ti;
        this.director=dir;
        this.duracion=dur;
        this.lotengo= lotengo;
        this.comentario=coment;
        
    }
    
    public dvd(){
        this.titulo="";
        this.director="";
        this.duracion=0;
        this.lotengo= false;
        this.comentario="";
        
    }
    
    public String getcomentario(){
        return this.comentario;
}
    public void setcomentario(String coment){
        this.comentario = coment;
    }
    public boolean getlotengo(){
        return this.lotengo;
    }
    
    public void setlotengo(boolean lote){
        this.lotengo= lote;
    }
    
      public void imprimir(){
        System.out.println(titulo);
        System.out.println(director);
        System.out.println(duracion);
        System.out.println(lotengo);
        System.out.println(comentario);
    }
}
