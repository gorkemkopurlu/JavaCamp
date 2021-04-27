package homeWork;

public class CourseManager {

	public void purchase(Courses course) {
		String txt="Ucretsiz Kayit Ol "+course.name;
	for(int i=0 ; i<=txt.length();i++) {
		System.out.print("-");
}
	System.out.println("");
	System.out.print("|");
		System.out.print(txt);
		System.out.print("|");
		System.out.println("");
		
		for(int i=0 ; i<=txt.length();i++) {
			System.out.print("-");
}
		
		
	}

	public void write(Courses course) {
	 System.out.println("\n"+"Sepete eklendi: "+course.name);
	}
	
	public void loop() {
		for(int i=0; i<50;i++) {
			System.out.print("#");
		}}
}
