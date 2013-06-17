/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;

/**
 *
 * @author albeddy
 */
public class artista {

    
   
    private String nombre;
    private int añoNacimiento;    
    
    public artista(String nombre, int añoNacimiento) {
        this.nombre = nombre;
        this.añoNacimiento = añoNacimiento;        
    }

    public artista() {
    }
    
    
    public int posArtista(String nombre, artista [] art){
       int pos=0;
        
       while(art.length > pos){
          
           if((art[pos].getNombre()).equals(nombre)) {
               return pos;
           }      
           pos++; 
       }       
       return -1;
    }

    
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAñoNacimiento() {
        return añoNacimiento;
    }

    public void setAñoNacimiento(int añoNacimiento) {
        this.añoNacimiento = añoNacimiento;
    }
    
    
    
}
