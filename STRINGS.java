package com;

public class STRINGS {

	public static void main(String[] args) {
		// INEFFICIENCE
		String info="";
		info+="MY NAME IS";
	    info+=" ";
	    info+="Ntokozo";
	    
	   // System.out.println(info.toString());
	    //More Efficiency
	    StringBuilder sb=new StringBuilder();
	    sb.append("MY NAME IS");
	    sb.append(" ");
	    sb.append("Mfundo");
	    
	   // System.out.println(sb.toString());
	    
	    StringBuilder s=new StringBuilder();
	    s.append("My Surname ")
	    .append("Is ")
	    .append("Zenzile");
	    
	   // System.out.println(s.toString());
	    
	    //formating//
		/* System.out.printf("Ntokozo %d",2004); */
	    //formating int
	    for(int i=0;i<20;i++)
	    {
	    	System.out.printf("%-2d: %s\n",i,"Print some text");
	    }
	    //formating floating numbers
	    
	    System.out.printf("Total Value: %.2f\n",3.12578);
	    System.out.printf("Total Value:%-6.1f",343.23423);
	}

}
