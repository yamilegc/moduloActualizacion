/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practicagithub;
import java.io.*;
import java.util.Random;

/**
 *
 * @author albeddy y ernay
 */
public class Practicagithub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {

        Random r = new Random();
        
        artista [] artistas = new artista[10];
        artista art = new artista();
        int nroArt=0;
        
        libro [] libros = new libro[10];        
        libro libr = new libro("", 0, null, art, 0);
        int nroLib=0;        
        
                
        disco [] discos = new disco[10]; 
        disco disc = new disco("", 0, "", null, 0);
        int nroDis=0;
        
        pelicula [] peliculas = new pelicula[10];
        pelicula peli = new pelicula("", null, "", null, 0);
        int nroPel=0;
        
        obra [] obras = new obra[10];
        obra obr = new obra();
        int nroObr=0;
        
        int pos = 0;
        String op;
        op = "0";
        
        
        String nombre="";
        int anioNacimiento=0;
        
        String productora;
        
        artista [] interpretes = new artista[10];
        String editorial;
        String titulo;
        String discografia;
        int nPaginas;
        int añoEdicion;
        int nCanciones;
        String autor;
        
        BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));

        while (!op.equals("5")) {
            System.out.println("*MENU DE OPCIONES*" + "\n");
            System.out.println(".................\n"
                    + ".  1 Artista  \n"
                    + ".  2 Obra  \n"
                    + ".  3 Pelicula  \n"
                    + ".  4 Reportes     \n"
                    + ".  5 Salir     \n"
                    + ".................");

            op = leer.readLine();

            switch (Integer.parseInt(op)) {
                case 1:// ARTISTA                                 
                    while (!op.equals("2")) {

                        System.out.println("....................\n"
                                + ".  1 Crear Artista   \n"
                                + ".  2 Volver   \n"
                                + "....................");
                        op = leer.readLine();
                        switch (Integer.parseInt(op)) {
                            case 1:
                                System.out.print("Ingrese el nombre del artista: ");
                                nombre= leer.readLine();
                                System.out.print("Ingrese el año de Nacimiento: ");
                                anioNacimiento= Integer.parseInt(leer.readLine());
                                
                                artistas[nroArt]=new artista(nombre, anioNacimiento);
                                nroArt++;
                                break;
                            case 2:                               
                                break;

                            default:
                                System.out.println("Has elegido una opción incorrecta");
                                break;
                        }
                    }
                    break;

                case 2:// OBRA                    
                    System.out.println("O B R A");
                    while (!op.equals("3")) {
                        System.out.println("...............\n"
                                + ".  1 Libro   \n"
                                + ".  2 Disco   \n"
                                + ".  3 Volver   \n"
                                + "...............");
                        op = leer.readLine();
                        switch (Integer.parseInt(op)) {
                          
                            case 1: // L I B R O 
                                while (!op.equals("4")) {
                                    System.out.println("...............\n"
                                            + ".  1 Crear Libro   \n"
                                            + ".  2 Buscar Libro   \n"
                                            + ".  3 Consultar editorial y Numero de páginas   \n"
                                            + ".  4 Volver   \n"
                                            + "...............");
                                    op = leer.readLine();
                                    switch (Integer.parseInt(op)) {

                                        case 1:
                                            System.out.println("Crear Libro");    
                                            
                                            System.out.print("Ingrese Editorial: ");
                                            editorial= leer.readLine();
                                            
                                            System.out.print("Ingrese nroPaginas: ");
                                            nPaginas= Integer.parseInt(leer.readLine());
                                            
                                             System.out.print("Ingrese titulo: ");
                                             titulo= leer.readLine();
                                      
                                             System.out.print("Ingrese AñoEdicion: ");
                                             añoEdicion= Integer.parseInt(leer.readLine());
                                             
                                            
                                             libros[nroLib]=new libro(editorial, nPaginas, titulo, artistas[r.nextInt(nroArt)], añoEdicion);
                                             obras[nroObr]= libros[nroLib];
                                             nroObr++; nroLib++;
                                            break;
                                        case 2:
                                            System.out.println("Buscar Libro");
                                            
                                            System.out.print("Ingrese el titulo del libro a buscar: ");
                                            titulo = leer.readLine();
                                            
                                            pos = libr.BuscarLibro(titulo, libros, nroLib);
                                            if(pos==-1){
                                                System.out.println("No se encontro el libro");
                                            }else{
                                                System.out.print("El libro es: Titulo:"+libros[pos].getTitulo()+", Editorial: "+libros[pos].getEditorial()+" Autor: "+libros[pos].getAutor().getNombre()+" Año de Edicion: "+libros[pos].getAñoEdicion()+"  Número de Páginas: "+libros[pos].getnPaginas());
                                            }
                                            break;
                                        case 3:
                                            System.out.println("Consultar editorial y Numero de páginas");
                                            System.out.print("Ingrese el titulo del libro: ");
                                            titulo = leer.readLine();
                                            pos = libr.BuscarLibro(titulo, libros, nroLib);
                                            if(pos==-1){
                                                System.out.println("No se encontro el libro");
                                            }else{
                                                System.out.print("La editorial es: "+libros[pos].getEditorial()+" y el número de páginas es: "+libros[pos].getnPaginas());
                                            }
                                            break;
                                        case 4:
                                            break;

                                        default:
                                            System.out.println("Has elegido una opción incorrecta");
                                            break;
                                    }
                                }
                                break;
                            case 2: // d i s c o
                                while (!op.equals("4")) {
                                  System.out.println("...............\n"
                                            + ".  1 Crear Disco   \n"
                                            + ".  2 Buscar Disco   \n"
                                            + ".  3 Consultar Discografias y Canciones  \n"
                                            + ".  4 Volver   \n"
                                            + "...............");
                                  op = leer.readLine();
                                  
                                switch (Integer.parseInt(op)) {

                                    case 1:
                                        System.out.println("Crear Disco");
                                        System.out.print("Ingrese Discografia: ");
                                        discografia= leer.readLine();                                           
                                        System.out.print("Ingrese nCanciones: ");
                                        nCanciones= Integer.parseInt(leer.readLine());
                                        System.out.print("Ingrese titulo: ");
                                        titulo= leer.readLine();                                         

                                        System.out.print("Ingrese AñoEdicion: ");
                                        añoEdicion= Integer.parseInt(leer.readLine());                                      
                                        discos[nroDis]=new disco(discografia, nCanciones, titulo, artistas[r.nextInt(nroArt)], añoEdicion);
                                        obras[nroObr]= discos[nroDis];
                                        nroDis ++;nroObr++;
                                        break;
                                    case 2:
                                         System.out.println("Buscar Disco");                                        
                                         System.out.print("Ingrese el titulo del disco: ");
                                            titulo = leer.readLine();
                                            pos = disc.BuscarDisco(titulo, obras, nroDis);
                                            if(pos==-1){
                                                System.out.println("No se encontro el Disco");
                                            }else{
                                                System.out.print("El Disco es: Titulo:"+discos[pos].getTitulo()+", Editorial: "+discos[pos].getAñoEdicion() +" Autor: "+discos[pos].getAutor().getNombre()+" Discografía: "+discos[pos].getDiscografia() +"  Nro de Canciones: "+discos[pos].getnCanciones());
                                            }                                           
                                        break;
                                    case 3:
                                        System.out.println("Consultar Discografía y Canciones");
                                        
                                            System.out.print("Ingrese el titulo del disco: ");
                                            titulo = leer.readLine();                                            
                                            pos = disc.BuscarDisco(titulo, obras, nroDis);
                                            if(pos==-1){
                                                System.out.println("No se encontro el disco");
                                            }else{
                                                System.out.print("La Discografia es: "+discos[pos].getDiscografia()+" y el número de canciones es: "+discos[pos].getnCanciones());
                                            }
                                        break;
                                    case 4:                                        
                                            break;
                                    default:
                                        System.out.println("Has elegido una opción incorrecta");
                                        break;
                                    }
                                }
                                break;                            
                            case 3:                               
                                break;
                            default:
                                System.out.println("Has elegido una opción incorrecta");
                                break;
                        }
                    }
                    break;

                case 3:// PELICULA
                    System.out.println("Pelicula");
                    while (!op.equals("4")) {
                        System.out.println("...............\n"
                                + ".  1 Crear Pelicula   \n"
                                + ".  2 Buscando Pelicula  \n"
                                + ".  3 Consultar Productora  \n"
                                + ".  4 Volver   \n"
                                + "...............");
                        op = leer.readLine();

                        switch (Integer.parseInt(op)) {

                            case 1:
                                System.out.println("Crear Pelicula");
                                System.out.print("Ingrese productora: ");
                                productora= leer.readLine();                                           

                                interpretes=artistas;
                                System.out.print("Ingrese titulo: ");
                                titulo= leer.readLine();                                         
                                System.out.print("Ingrese autor: ");
                                autor=leer.readLine();
                                System.out.print("Ingrese AñoEdicion: ");
                                añoEdicion= Integer.parseInt(leer.readLine()); 
                                
                                peliculas[nroPel]= new pelicula(productora, interpretes, titulo, artistas[r.nextInt(nroArt)], añoEdicion);
                                break;
                            case 2:
                                System.out.println("Buscar Pelicula");                                
                                System.out.print("Ingrese el titulo de la pelicula a buscar: ");
                                titulo = leer.readLine();
                                pos=peli.BuscarPelicula(titulo, obras, nroPel);
                                 if(pos==-1){
                                   System.out.println("No se encontro la pelicula");
                                      }else{
                                        System.out.print("La pelicula es: Titulo:"+peliculas[pos].getTitulo()+", Editorial: "+peliculas[pos].getAñoEdicion() +" Autor: "+peliculas[pos].getAutor().getNombre()+" Productora: "+peliculas[pos].getProductora() +"  Cantidad de Interpretes: "+peliculas[pos].getInterpretes().length);
                                      }
                                break;
                            case 3:
                                System.out.println("Consultar Productora");
                                System.out.print("Ingrese el titulo de la pelicula para consultar productora: ");
                                titulo = leer.readLine();
                                pos=peli.BuscarPelicula(titulo, obras, pos);
                                if(pos==-1){
                                   System.out.println("No se encontro la pelicula");
                                      }else{
                                        System.out.print("La pelicula tiene como Productora: "+peliculas[pos].getProductora() );
                                      }
                                break;
                            case 4:                                
                                break;

                            default:
                                System.out.println("Has elegido una opción incorrecta");
                                break;
                        }                        
                    }
                    break;

                case 4://REPORTES
                    String opr="0";
                    System.out.println("Reportes");
                    while (!opr.equals("5")) {
                        System.out.println("...............\n"
                                + ".  1 Listado de Obras  \n"
                                + ".  2 Listado de Peliculas  \n"
                                + ".  3 Buscar todas las obras de un autor  \n"
                                + ".  4 Buscar todas las peliculas de un autor  \n"
                                + ".  5 Volver   \n"
                                + "...............");
                        opr = leer.readLine();
                        
                        switch (Integer.parseInt(opr)) {

                            case 1:
                                System.out.println("Listar Obras    ");
                                obr.ImprimirListadoDeObras(libros, nroLib, discos, nroDis);
                                break;
                            case 2:
                                System.out.println("Listado Pelicula    ");
                                peli.ImprimirListadoDePeliculas(peliculas, pos,true,"");
                                break;
                            case 3:
                                 System.out.println("Buscar todas las obras de un autor ");
                                 System.out.print("Ingrese autor: ");
                                 autor=leer.readLine();
                                 obr.ImprimirObrasdeAutor(autor, libros, nroLib, discos, nroDis, peliculas, nroPel);
                                break;
                            case 4:  System.out.println(" Buscar todas las peliculas de un autor"); 
                                     System.out.print("Ingrese autor: ");
                                     autor=leer.readLine();
                                     peli.ImprimirListadoDePeliculas(peliculas, pos, false, autor);
                                break;
                            case 5: break;
                            default:
                                System.out.println("Has elegido una opción incorrecta");
                                break;
                        }
                    }
                    break;
                case 5: System.exit(0);    
                default:
                    System.out.println("Has elegido una opción incorrecta");
                    break;

            } //end sw

        }//while

    }
}
