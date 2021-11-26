/*
 *este es otro ejemplo que se realizó en clases.
 */
package javaapplication7;

import java.io.EOFException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/*import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Jhonathan Sn
 */
public class JavaApplication7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
       ObjectOutputStream datosPaciente = null;
       ObjectInputStream lecturaDatosPaciente = null;
       Paciente paciente;
      char respuesta = 's';
       
       try {
          if(Files.exists(Paths.get("pacientes.txt"))){
              datosPaciente = new AppendingObjectOutputStream(Files.newOutputStream(Paths.get("pacientes.txt"), StandardOpenOption.APPEND));
          }
          else{
         datosPaciente = new ObjectOutputStream(Files.newOutputStream(Paths.get("pacientes.txt")));
          }
       
       
       do {
       paciente = new Paciente();
       
         System.out.println("Ingrese su edad"); 
         paciente.setEdad(Integer.valueOf(scan.nextLine()));
         System.out.println("Ingrese su sexo"); 
         paciente.setSexo(scan.nextLine().charAt(0));
          System.out.println("Ingrese su ciudiad");  
          paciente.setCiudad(scan.nextLine());
          
          
        datosPaciente.writeObject(paciente);  
          
        System.out.println("desea ingresar mas datos (s/n)");
        respuesta = scan.nextLine().toLowerCase().charAt(0);
        
       } while(respuesta == 's');
       
       datosPaciente.close();
       
        } catch (IOException ioException) {
        
        System.err.println("error al escribir el archivo"  + ioException.toString());
        }
       try{
      lecturaDatosPaciente = new ObjectInputStream(Files.newInputStream(Paths.get("pacientes.txt"))); 
       while (true) {
          paciente = (Paciente) lecturaDatosPaciente.readObject();
        System.out.printf("%20d %40s %60s\n", paciente.getEdad(), paciente.getSexo(), paciente.getCiudad());
       }
       
      }
       catch (EOFException endOfFileException){
       System.out.printf("%s%n", "no hay mas registros");
       }
       catch (ClassNotFoundException classNotFoundException){
       System.err.println("tipo de objeto invalido");
       }
           catch (IOException ioException) {
          System.err.println("error al leer acchv " + ioException.getMessage());
      } finally {
       lecturaDatosPaciente.close();
       
       }
       
       
       
       
       
        // TODO code application logic here
        //Instanciar una clase es crear  un nuevo objeto 
      /*  Paciente paciente1 = new Paciente();
        Paciente paciente2 = new Paciente();
        Paciente paciente3 = new Paciente();
        
        paciente1.setCiudad("Guatemala");
        paciente2.setCiudad("Mixo");
        paciente3.setCiudad("san juan");
        
        paciente1.setEdad(23);
        paciente2.setEdad(3);
        paciente3.setEdad(43); 
        
        System.out.println(paciente1.getEdad());
       ObjectOutputStream datosPaciente = null;
       
       try {
       //traducciion linea 2
       datosPaciente = new ObjectOutputStream(Files.newOutputStream(Paths.get("paciente.txt")));
    } catch (IOException ioException){
    System.err.println("error al escriir en el archibovo. " + ioException.toString());
    }*/
    }
}
