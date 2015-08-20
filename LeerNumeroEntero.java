import java.util.Scanner;
import java.util.InputMismatchException;
public class LeerNumeroEntero {
	
	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        int num;
	       try{
	        System.out.println("Introduzca un numero entero: ");
	        num = scan.nextInt();
	        System.out.println("su numero es:" + num);
	       }catch(InputMismatchException e){
	    	   scan.nextLine();
	    	  
	    	   System.out.println("Introduzca un numero entero: "+ e.toString()); 
	       }
	    } 
	}
	    
	    

