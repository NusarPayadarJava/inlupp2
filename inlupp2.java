import java.util.Scanner;
public class inlupp2 {

	public static void main(String[] args) { 
			   	
	    	//namn spelare	    	    
	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("skriv ditt namn: ");
	        String namnInput1 = sc1.next();	
	        
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("skriv ditt namn: ");
	        String namnInput2 = sc2.next();	
	            
	      	String sten = "sten"; 
	    	String sax = "sax"; 
	    	String paper = "paper";
	    	
	     	// spelare 1  
	    	Scanner spelare1Input = new Scanner(System.in);
	        System.out.println(namnInput1 + " ---> sten(1)? sax(2)? paper(3)?: ");
	        String input1 = spelare1Input.next();
	                     
	        // spelare 2 
	        Scanner spelare2Input = new Scanner(System.in);
	        System.out.println(namnInput2 +" ---> sten 1? sax 2? paper 3?: ");
	        String input2 = spelare2Input.next();
	        
	        //sp1 sten eller 1       
	        if (input1.equals(sten) | input1.equals("1") ) {
	        	if (input2.equals(sten) | input2.equals("1") )  
	        	    System.out.println("oavgjort" );
	            if (input2.equals(sax) | input2.equals("2") )  
		            System.out.println(namnInput1 + "(sten [1]) vinnare" );
	            if (input2.equals(paper) | input1.equals("3") )  
			        System.out.println(namnInput2+ "(paper[3]) vinnare" );
	            }
	             
	          
	        //sp1 sax eller 2
	        if (input1.equals(sax) | input1.equals("2") ) {
	        	if (input2.equals(sax) | input2.equals("2"))  
	        	    System.out.println("oavgjort" );
	            if (input2.equals(sten) | input2.equals("1") )  
		            System.out.println(namnInput2 + "(sten[1]) vinnare" );
	            if (input2.equals(paper) | input2.equals("3") )  
			        System.out.println(namnInput1 + "(sax[2]) vinnare" );
	            }
	            	            
	        
	        //sp1 paper eller 3
	        if (input1.equals(paper)| input1.equals("3") ) {
	        	if (input2.equals(paper)| input2.equals("3") )  
	        	    System.out.println("oavgjort" );
	            if (input2.equals(sax)| input2.equals("2") )  
		            System.out.println(namnInput2 + "(sax[2]) vinnare" );
	            if (input2.equals(sten)| input2.equals("1") )  
			        System.out.println(namnInput1+"(paper[3]) vinnare" ); 
	             
	            }
	            
	}		        
	           
}