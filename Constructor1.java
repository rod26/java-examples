public class Constructor1{
	
	public static void main(String []args){

		Person john = new Person("John", 25, "Male");

		john.setPangalan("Francis");   

		System.out.println(john.getPangalan());    
		System.out.println(john.getEdad());    
		System.out.println(john.getKasarian()); 
	}
}