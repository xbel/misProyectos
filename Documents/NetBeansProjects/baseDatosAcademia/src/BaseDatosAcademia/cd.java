
package BaseDatosAcademia;


public class cd {
    private String titulo;
    private String interprete;
    private int numeroTemas;
    private int duracion;
    private boolean lotengo;
    private String comentario;
    
    public cd(String ti, String inter, int num, int dur, boolean lotengo, String comentario){
        this.titulo=ti;
        this.interprete= inter;
        this.numeroTemas= num;
        this.duracion=dur;
        this.comentario=comentario;
    
    
    }
    
    public cd() {
        this.titulo="";
        this.interprete="";
        this.numeroTemas= 0;
        this.duracion=0;
        this.lotengo=false;
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
        System.out.println(interprete);
        System.out.println(numeroTemas);
        System.out.println(duracion);
        System.out.println(lotengo);
        System.out.println(comentario);
    }
}
