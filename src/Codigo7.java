import java.util.HashMap; //se importo hashmap
import java.util.Scanner; // se importo scanner

public class Codigo7 {
	 Scanner s = new Scanner(System.in); //Se agregó system in

	    HashMap<String, String> capitales = new HashMap<>(); //Se cambio byte y double x string
// Se cambio ca x capitales 
	    
	   { //se agregó llave faltante 
		   capitales.put("Canadá", "Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador"); //Se agregó la capital
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	    
	   
	    String c = ""; //Se agregó la r faltante
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: "); // se cambio el in por el out
	      c = s.nextLine(); // se cambio el double x un line
	      
	      if (!c.equals("salir")) { //Se agregó una s a equals
	        if (capitales.containsValue(c)) { // se cambio ca a capitales
	          System.out.print("La capital de " + c); //Se agregó el out
	          System.out.println(" es " + capitales.put(c, c)); //Se agregó c, c para poder aplicarlo
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          capitales.put(c, ca); //se completo ca.put x capitales
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir")); //Se puso una h a while y se agrego parentesis faltante
	    s.close(); // se cierra el scanner
	  }

}// class Código7
