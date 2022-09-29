package reviewclass5;

public class ArrayDemo1 {

	public static void main(String[] args) {
	//When we have to store a lot of data, arrays come in handy
		
	String name="Huma";
	String name1="Janel";
	String name2="Anna";//this way will take too long if multiple data
		
		
		
		
		
	String[]names=new String[]{"Huma","Janel","Anna"};
	//this way of creating array 
	//not used in real life most of time
	
	
	System.out.println(name1);
	System.out.println(names);//will give us address for the data
	System.out.println(names[0]);//using index to retrieve data in that particular spot
	System.out.println(names[5]);//will give error that index out of bound/only 3 spots in this array
	}

}
