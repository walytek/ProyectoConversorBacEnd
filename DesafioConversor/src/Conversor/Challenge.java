package Conversor;

import javax.swing.JOptionPane;


public class Challenge {

	public static void main(String[] args) {
		
		
	     JOptionPane.showMessageDialog(null, "Bienvenidos al Desafio Alura !","Alura- Latam -Oracle", 2);
         
         
	        
	        
	       
     	
 		String nombre = JOptionPane.showInputDialog("Ingresa tu nombre por favor :");
 		JOptionPane.showMessageDialog(null, "Hola  " + nombre + ", estás listo para la aventura? ¡Vamos!","Programa Conversor . Version 1.0", 1); 
 		
 		 String[] Converter = { "Calcular el Tipo de Cambio Monetario","Calcular tu edad en otros planetas","Salir"};
   	      String option = (String) JOptionPane.showInputDialog(null, "Elija la operación a realizar : ", "Programa Conversor . Version 1.0",
   	         JOptionPane.PLAIN_MESSAGE, null, Converter, Converter[0]);

   	      
while(option != "Salir"     ) {      
   	      
 if (option == "Calcular el Tipo de Cambio Monetario") {
 	
	 
	 
 	   convertir();
 	  
 	  int resp=JOptionPane.showConfirmDialog(null,"Deseas abandonar el Programa?");
      if (JOptionPane.OK_OPTION == resp){
    	  JOptionPane.showMessageDialog(null, "Hasta Pronto  " + nombre + " Programa Finalizado","Programa Conversor . Version 1.0", 1);   
      
      break;
      
      }
    	 
    	  
    	  
    	  
    
 
      
     
      
 }
 else {
 	 edades();
 	int resp=JOptionPane.showConfirmDialog(null,"Deseas abandonar el Programa?");
    if (JOptionPane.OK_OPTION == resp){
  	  JOptionPane.showMessageDialog(null, "Hasta Pronto  " + nombre + " Programa Finalizado","Programa Conversor . Version 1.0", 1); 
  
    
    break;
    }
  	 
  	
  	
  	
  	
  	
 
}
}

		
		
		
		
		
	}

	
	
	
	
	
	
	private static void edades() {

 	   String[] EdadSideral = { "Edad en Marte","Edad en Venus" ,"Edad en Saturno", "Edad en Mercurio", "Edad en Júpiter", "Edad en Urano","Edad en Neptuno"};
	      String edad = (String) JOptionPane.showInputDialog(null, "Elija el Planeta: ", "Edad aproximada calculada en Años",
	         JOptionPane.PLAIN_MESSAGE, null, EdadSideral, EdadSideral[0]);
	      
	      switch (edad) {
 	
	      case "Edad en Marte" :
      
        
       	 String name = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num = Double.parseDouble(name);
       	 double result= num/1.88;
       			 
    		JOptionPane.showMessageDialog(null, "Usted tendría en Marte " + (String.format("%.2f", result) + " años"));
    		break;
	    
	      case  "Edad en Venus":
       	 
       	 String name2 = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num2 = Double.parseDouble(name2);
       	 double result2= num2/0.61;
       			 
       	JOptionPane.showMessageDialog(null, "Usted tendría en Venus " + (String.format("%.2f", result2) + " años"));
        break;
		
	    case"Edad en Saturno":
       	 
       	 String name3 = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num3 = Double.parseDouble(name3);
       	 double result3= num3/29.5;
       			 
       	JOptionPane.showMessageDialog(null, "Usted tendría en Saturno " + (String.format("%.2f", result3) + " años"));
        break;
        
	    case "Edad en Mercurio":
       	 
       	 String name4 = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num4 = Double.parseDouble(name4);
       	 double result4= num4/0.24;
       			 
       	JOptionPane.showMessageDialog(null, "Usted tendría en Mercurio "+ (String.format("%.2f", result4) + " años"));
        break;
        
	    case "Edad en Júpiter":
       	 
       	 String name5 = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num5 = Double.parseDouble(name5);
       	 double result5= num5/11.8;
       			 
       	JOptionPane.showMessageDialog(null, "Usted tendría en Júpiter " + (String.format("%.2f", result5) + " años"));
        break;
        
   	
	    case "Edad en Urano":
       	 
       	 String name6 = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num6 = Double.parseDouble(name6);
       	 double result6= num6/84;
       			 
       	JOptionPane.showMessageDialog(null, "Usted tendría en Urano " + (String.format("%.2f", result6) + " años"));
        break;
        
	    case "Edad en Neptuno":
       	 
       	 String name7 = JOptionPane.showInputDialog("Ingrese su edad en años!");
       	 double num7 = Double.parseDouble(name7);
       	 double result7= num7/165;
       			 
       	JOptionPane.showMessageDialog(null, "Usted tendría en Neptuno "+ (String.format("%.2f", result7) + " años"));
        break;
   	
        
	    
	    	
	    
      
        
	    
	      }	     
	}	 
	 
		


	private static void convertir() {
		
		
		
		
		 String[] Divisa = {"Pesos Argentinos a Dólares","Pesos Argentinos a Eúros" ,"Pesos Argentinos a Libras Esterlinas", "Pesos Argentinos a Yen Japonés", "Pesos Argentinos a Won-Sul Coreano", "Dólares a Pesos Argentinos","Eúros a Pesos Argentinos","Yen Japonés a Pesos Argentinos","Won-Sul Coreanos a Pesos Argentinos"};
	      String money = (String) JOptionPane.showInputDialog(null, "Elija el tipo de cambio: ", "Divisas según ultima cotización Oficial",
	         JOptionPane.PLAIN_MESSAGE, null, Divisa, Divisa[0]);
	   
	
	      


	             switch (money) {
	  
	      
		case "Pesos Argentinos a Dólares":
		String name = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
		double num = Double.parseDouble(name);
		double result= num/195.31;
		
		JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result) + " Dolares"));
		break;
		case "Pesos Argentinos a Eúros":

			String name2 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
			double num2 = Double.parseDouble(name2);
			double result2= num2/207.11;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result2) + " Euros"));
break;
case "Pesos Argentinos a Libras Esterlinas":

String name3 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS ");
double num3 = Double.parseDouble(name3);
double result3= num3/234.77;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result3) + " Libras Esterlinas"));
break;
case "Pesos Argentinos a Yen Japonés":

String name4 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
double num4 = Double.parseDouble(name4);
double result4= num4/1.45;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result4) + " Yenes"));
break;
case "Pesos Argentinos a Won-Sul Coreano":

String name5 = JOptionPane.showInputDialog("Ingrese la cantidad de ARS");
double num5 = Double.parseDouble(name5);
double result5= num5/6.65;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result5) + " Wones Coreanos"));
break;
case "Dólares a Pesos Argentinos":

String name6 = JOptionPane.showInputDialog("Ingrese la cantidad de USD ");
double num6 = Double.parseDouble(name6);
double result6= num6*195.31;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result6) + " Pesos Argentinos"));
break;
case "Eúros a Pesos Argentinos":

String name7 = JOptionPane.showInputDialog("Ingrese la cantidad de EUR");
double num7 = Double.parseDouble(name7);
double result7= num7*207.11;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result7) + " Pesos Argentinos"));
break;
case "Libras Esterlinas a Pesos Argentinos":

String name8 = JOptionPane.showInputDialog("Ingrese la cantidad de GBP");
double num8 = Double.parseDouble(name8);
double result8= num8*234.77;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result8) + " Pesos Argentinos"));
break;

case "Yen Japonés a Pesos Argentinos":

String name9 = JOptionPane.showInputDialog("Ingrese la cantidad de JPY");
double num9 = Double.parseDouble(name9);
double result9= num9*1.45;

JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result9) + " Pesos Argentinos"));
break;
case "Won-Sul Coreanos a Pesos Argentinos":

String name10 = JOptionPane.showInputDialog("Ingrese la cantidad de KRW");
double num10 = Double.parseDouble(name10);
double result10= num10*6.65;
	 
JOptionPane.showMessageDialog(null, "Usted recibirá: $ "+ (String.format("%.2f", result10) + " Pesos Argentinos"));
break;


	   }
	}
		
	

	
	
	
	
	}

	
	
	
	
	
	

