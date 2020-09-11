//v3
import java.util.Scanner;
public class inlupp2 {
	
	static String sten = "sten"; 
	static String sax = "sax"; 
	static String paper = "paper";
	
	static String namnInput1;
	static String namnInput2;
	
	static String input1;
	static String input2;
	
	//if spelare 1 sten metod
    static void sten1() {
	          	
       	if (input2.equals(sten) | input2.equals("1") ) { oavgjort();}
       	if (input2.equals(sax) | input2.equals("2") ) { 
       		System.out.println(namnInput1);  stenvinnar();	}   
        if (input2.equals(paper) | input2.equals("3") ) { 
	        System.out.println(namnInput2); papervinnar();  }
    }
    
  //if spelare 1 sax metod
    static void sax2() {
    	
    if (input2.equals(sax) | input2.equals("2")) { oavgjort();}
    
    if (input2.equals(sten) | input2.equals("1") ) { 
        System.out.println(namnInput2); stenvinnar();}
    
    if (input2.equals(paper) | input2.equals("3") ) {
    	System.out.println(namnInput1 );saxvinnar();  }
        
    }
    
    static void paper3() {
    if (input2.equals(paper)| input2.equals("3") ) { oavgjort();}
    
    if (input2.equals(sax)| input2.equals("2") ) {
        System.out.println(namnInput2 ); saxvinnar();}
    
    if (input2.equals(sten)| input2.equals("1") ) { 
        System.out.println(namnInput1);  papervinnar();}
    } 
    
    
	
	static void oavgjort() { System.out.println(" oavgjort"); }	
	static void stenvinnar() {System.out.println("sten [1] vinnar"); }	
	static void papervinnar() { System.out.println("papper [3] vinnar");}	
	static void saxvinnar() { System.out.println("sax [2] vinnar"); }


	
	public static void main(String[] args) { 
			   	
	    	//namn spelare	    	    
	        Scanner sc1 = new Scanner(System.in);
	        System.out.println("skriv ditt namn: ");
	        namnInput1 = sc1.next();	
	        
	        Scanner sc2 = new Scanner(System.in);
	        System.out.println("skriv ditt namn: ");
	        namnInput2 = sc2.next();	
	         
	     	// spelare 1  
	    	Scanner spelare1Input = new Scanner(System.in);
	        System.out.println(namnInput1 + " ---> sten(1)? sax(2)? paper(3)?: ");
	         input1 = spelare1Input.next();
	        
	        // spelare 2 
	        Scanner spelare2Input = new Scanner(System.in);
	        System.out.println(namnInput2 +" ---> sten 1? sax 2? paper 3?: ");
	         input2 = spelare2Input.next();
	        
	        // sp1 sten / 1
	        if (input1.equals(sten) | input1.equals("1") ) {
	        	sten1();
	        }
	        
	       
	        //sp1 sax / 2
	         if (input1.equals(sax) | input1.equals("2") ) {
	        	sax2();
	            }
	            	            
	        
	        //sp1 paper eller 3
	         if (input1.equals(paper)| input1.equals("3") ) {
	        	paper3();
	             
	            }
	            
	}		        
	           
}