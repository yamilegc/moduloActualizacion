/*
 *

 To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

import java.io.IOException;

/**
 *
 * @author albeddy
 */
public class libro extends obra {
    
    private String editorial;
    int nPaginas;    
    
   
    public libro(String editorial, int nPaginas, String titulo, artista autor, int añoEdicion) {
        super(titulo, autor, añoEdicion);
        this.editorial = editorial;
        this.nPaginas = nPaginas;
    }   
    
    public int BuscarLibro(String titulo, obra[] obra, int cant){
      
       int pos=0;
       while(cant>pos){
           if(obra[pos].getTitulo().equals(titulo)) {
               return pos;
           }
         pos++;  
       }
       return -1;        
    }
    
     public int BuscarEditorial(String titulo, obra[] obra, int cant){
      
       int pos=0;
       while(cant>pos){
           if(obra[pos].getTitulo().equals(titulo)) {
               return pos;
           }
         pos++;  
       }
       return -1;        
    }
     
     
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    void imprimir() {
       
   }
    
    
}
