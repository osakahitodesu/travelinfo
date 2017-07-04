package getinfo;

public class Hotels {
	
	String value; 
	public void setvalue(String value){ 
		this.value = value;
	}
	public void getreply(){
		
		//String checkvalue = new String("cheap");
		 if (value.equals("cheap"))  
		 {
			 System.out.println("we have a few only");
		 }
		 else {
			 System.out.println("we have many");
		 }
	}
}
