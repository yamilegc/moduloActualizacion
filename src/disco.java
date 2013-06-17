/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author ernay
 */
public class disco extends obra{
    
    private String discografia;
    private int nCanciones;

    public disco(String discografia, int nCanciones, String titulo, artista autor, int añoEdicion) {
        super(titulo, autor, añoEdicion);
        this.discografia = discografia;
        this.nCanciones = nCanciones;
    }

    
     public int BuscarDisco(String titulo, obra[] obra, int cant){
        
       
       int pos=0;
       while(cant>pos){
           if(obra[pos].getTitulo().equals(titulo)) {
               return pos;
           }
         pos++;  
       }       
       return -1;        
    }
    
    public String getDiscografia() {
        return discografia;
    }

    public void setDiscografia(String discografia) {
        this.discografia = discografia;
    }

    public int getnCanciones() {
        return nCanciones;
    }

    public void setnCanciones(int nCanciones) {
        this.nCanciones = nCanciones;
    }
    
   void imprimir() {
       
   }
    
}
