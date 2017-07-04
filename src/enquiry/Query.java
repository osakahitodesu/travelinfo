package enquiry;

//import getinfo.Attraction;
//import getinfo.Transport; 
//import getinfo.Hotels; 

import getinfo.*; 

// right click, source, organise imports
// ctrl space to autocomplete

public class Query {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Transport japan = new Transport(); 
		japan.gettransport();
		
		Attraction japan2 = new Attraction();
		int japan_attractions=japan2.attractions(10);
		System.out.println(japan_attractions);
		
		Hotels japan3 = new Hotels();
		
		// type cheap or ex
		japan3.setvalue("ex");
		japan3.getreply(); 
	}

}
