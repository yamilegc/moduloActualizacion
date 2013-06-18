/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author ernay
 */
public class pelicula extends obra{
    private String productora;
    private artista[] interpretes;
    

    public pelicula(String productora, artista[] interpretes, String titulo, artista autor, int añoEdicion) {
        super(titulo, autor, añoEdicion);
        this.productora = productora;
        this.interpretes = interpretes;
    }

    public int BuscarPelicula(String titulo, obra[] obra, int cant){
      
       int pos=0;
       while(cant>pos){
           if(obra[pos].getTitulo().equals(titulo)) {
               
               return pos;
           }
         pos++;  
       }
       return -1;        
    }    

     public void ImprimirListadoDePeliculas(pelicula[] peli, int pos, boolean tipo, String autor){
        int i =0;
        if(tipo)
            {
            // listado de peliculas
                System.out.print("Titulo -  Autor - AñoEdicion - productora - interpretes");
                while(pos>i){
                    System.out.print(peli[i].getAutor().getNombre() +" - "+peli[i].getAñoEdicion()+" - "+  peli[i].getTitulo()+" - "+  peli[i].getProductora()+" - Cantidad de interpretes:"+  peli[i].getInterpretes().length);            
                    
                } 
                i++;   
            }
        else {
            // listado de peliculas de un autor
                System.out.print("Titulo -  Autor - AñoEdicion - productora - interpretes");
                while(pos>i){
                 if(peli[i].getAutor().getNombre().equals(autor)) {
                    System.out.print(peli[i].getAutor().getNombre() +" - "+peli[i].getAñoEdicion()+" - "+  peli[i].getTitulo()+" - "+  peli[i].getProductora()+" - Cantidad de interpretes:"+  peli[i].getInterpretes().length); 
                } 
                 i ++;
             }  
        }
    }
    
    public String getProductora() {
        return productora;
    }

    public void setProductora(String productora) {
        this.productora = productora;
    }

    public artista[] getInterpretes() {
        return interpretes;
    }

    public void setInterpretes(artista[] interpretes) {
        this.interpretes = interpretes;
    }
    
   void imprimir() {
       
   }
    
}
