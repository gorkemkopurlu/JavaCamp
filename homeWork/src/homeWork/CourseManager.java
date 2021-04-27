package homeWork;

public class CourseManager {

	public void purchase(Courses courses) {
		String txt="Ucretsiz Kayit Ol "+courses.name;
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

	public void write(Courses courses) {
	 System.out.println("\n"+"Sepete eklendi: "+courses.name);
	}
	
	public void loop() {
		for(int i=0; i<50;i++) {
			System.out.print("#");
		}}
}
