import java.util.Scanner;

public class Taschenrechner {

	public static void main(String[] args) {
		
		Scanner eingabe =new Scanner(System.in);
		
		 double zahl = 0.0;
		 double zahl2 = 0.0;
		
		 
		 char operator;
		 
		 
		 System.out.println("Geben sie ihre Zahl ein");
		 zahl = eingabe.nextDouble();
		 
		 System.out.println("Geben sie bitte Ihren RechenOperator ein");
		 operator = eingabe.next().charAt(0);
		 
		 System.out.println("Geben sie ihre Zweite Zahl ein");
		 zahl2 = eingabe.nextDouble();
		 
		 if(operator == '*') {
			 
			 double ErgebnisMal = zahl*zahl2;
			 System.out.println("Ihr Ergebnis ist "+ ErgebnisMal );
			 
		 }else if(operator == '+') {
			 double ErgebnisPlus = zahl + zahl2;
			 System.out.println("Ihr Ergebnis ist "+ ErgebnisPlus);
		 
	
	    }else if (operator == '-') {
			 double ErgebnisMinus = zahl - zahl2;
			 System.out.println("Ihr Ergebnis ist "+ ErgebnisMinus);
			 
	    }else if (operator == '/') {
	    	double ErgebnisGeteilt = zahl / zahl2;
	    	System.out.println("Ihr Ergebnis ist "+ ErgebnisGeteilt);
	       }
		
		 {
		 Scanner eingabe2 =new Scanner(System.in);
		 while(1<2) {
		 
		 char Buchstabe = ' ';
		 
      		 System.out.println("M�chten sie weiter Rechnen J/N ?");
      		 Buchstabe =  eingabe.next().charAt(0);
		     
		     double zahl3 = 0.0;
		     double zahl4 = 0.0;
		     
		     char operator2; {
		    	 
		    	 
		     if(Buchstabe == 'N') {
			   	 System.out.println("Sie sind andscheinend fertig");
			   	 break;
		 
		     }else if( Buchstabe == 'J') {    
		     
		    System.out.println("Geben sie ihre Zahl ein");
			 zahl3 = eingabe.nextDouble();
		     
		     System.out.println("Geben sie bitte Ihren RechenOperator ein");
		     
			 operator2 = eingabe.next().charAt(0);
			 
			 System.out.println("Geben sie ihre Zweite Zahl ein");
			 zahl4 = eingabe.nextDouble();
	    	 
	    	 if(operator2 == '*') {
	    	 double ErgebnisMalNeu = zahl3*zahl4;
	    	 System.out.println("Ihr Ergebnis ist "+ ErgebnisMalNeu);
	
	    }else if (operator2 == '+') {
	    	 double ErgebnisPlusNeu = zahl3 + zahl4;
	    	 System.out.println("Ihr Ergebnis ist "+ ErgebnisPlusNeu);
	    
	    }else if (operator2 == '-') {
	    	double ErgebnisMinusNeu = zahl3 - zahl4;
	    	System.out.println("Ihr Ergebnis ist " + ErgebnisMinusNeu);
	    	
	    }else  if (operator2 == '/') {
	    	double ErgebnisGeteiltNeu = zahl3 / zahl4;
	    	System.out.println("Ihr Ergebnis  ist "+ ErgebnisGeteiltNeu);}
	    	
	    
		   	 
		   	 
		   	 
		   	 
		   	 
					 
		 }
		 
	       	}
		  
		     }
    	     }
   		 }
		}
	



				 
		    	 
		     
		     
		     
		     
		     
		     
	     
  
           
             
		  
