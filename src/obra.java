/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author albeddy 
 */
public class obra {
    private String titulo;
    private artista autor;
    private int añoEdicion;

    public obra() {
        
    }
    
    public obra(String titulo, artista autor, int añoEdicion) {
        this.titulo = titulo;
        this.autor = autor;
        this.añoEdicion = añoEdicion;
    }      
    
     void ImprimirListadoDeObras(libro[] libros, int posl, disco[] discos,int posd)
     {
        int i =0;
        System.out.print("Obras (Libros y Discos)");
        while(posl>i){
            System.out.print(libros[i].getnPaginas()+" "+libros[i].getEditorial()+" "+libros[i].getTitulo()+" "+libros[i].getAutor().getNombre() +" "+libros[i].getAñoEdicion());            
            i ++;
        }  
       i=0;
        while(posd>i){
            System.out.print(discos[i].getDiscografia() +" "+discos[i].getnCanciones()+" "+discos[i].getTitulo()+" "+discos[i].getAutor().getNombre() +" "+discos[i].getAñoEdicion());            
            i ++;
        }
    }
    
      void ImprimirObrasdeAutor(String autor, libro[] libros, int posl, disco[] discos,int posd, pelicula[] peliculas, int posp)
     {
        int i =0;
        System.out.print("Obras de "+autor+"");
        //buscando en libros
        while(posl>i){
            if(libros[i].getAutor().getNombre().equals(autor)) {
                System.out.print(libros[i].getnPaginas()+" "+libros[i].getEditorial()+" "+libros[i].getTitulo()+" "+libros[i].getAutor().getNombre() +" "+libros[i].getAñoEdicion());
            }            
            i ++;
        }  
        
        //buscando en discos
       i=0;
        while(posd>i){
          if(discos[i].getAutor().getNombre().equals(autor)) {
                System.out.print(discos[i].getDiscografia() +" "+discos[i].getnCanciones()+" "+discos[i].getTitulo()+" "+discos[i].getAutor().getNombre() +" "+discos[i].getAñoEdicion());
            }            
            i ++;
        }
        //buscando en peliculas
        i=0;
         while(posp>i){
         if(peliculas[i].getAutor().getNombre().equals(autor)) {
            System.out.print(peliculas[i].getAutor().getNombre() +" - "+peliculas[i].getAñoEdicion()+" - "+  peliculas[i].getTitulo()+" - "+  peliculas[i].getProductora()+" - Cantidad de interpretes:"+  peliculas[i].getInterpretes().length);            
           } 
         i ++;         
       }
    }
     
      
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public artista getAutor() {
        return autor;
    }

    public void setAutor(artista autor) {
        this.autor = autor;
    }

    public int getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(int añoEdicion) {
        this.añoEdicion = añoEdicion;
    }
    
    
}
