package homeWork;

public class Main {

	public static void main(String[] args) {
		// Cagirilmasi gereken class'lar
		Courses course1=new Courses(1,"Yazilim Gelistirmeci Yetistirme Kampi (C# + Angular)",+8,"Engin Demirog","----%8----");
		Courses course2=new Courses(2,"Yazilim Gelistirmeci Yetistirme Kampi (Java + React)",12,"Engin Demirog","------%12------");
		Courses course3=new Courses(3,"Programlamaya Giris icin Temel Kurs",4,"Engin Demirog","--%4--");
		CourseManager courseManager= new CourseManager();
		Categories category1= new Categories() ;
			category1.id=1;
			category1.name="All";
		
	Courses[] courses= {course1,course2,course3};
			for(Courses course:courses) {
				System.out.println("Kursun Ismi: "+course.name + "\nIlerleme: "+ course.progress+ "\nEgitmenin ismi: "+ course.instructorName+"\n"+course.progressBar);
				courseManager.purchase(course1);
				courseManager.write(course1);
				System.out.print("\n");
				if(course==course3) {
					break;
				}
				courseManager.loop();
				System.out.println("\n");
				
			};	
			
	}

}