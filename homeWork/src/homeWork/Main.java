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
		
	
		//1.kurs icin
		System.out.println("Kursun Ismi: "+course1.name + "\nIlerleme: "+ course1.progress+ "\nEgitmenin ismi: "+ course1.instructorName+"\n"+course1.progressBar);
		courseManager.purchase(course1);
		courseManager.write(course1);
		System.out.print("\n");
		courseManager.loop();
		System.out.println("\n");
		
		//2.kurs icin
		System.out.println("Kursun Ismi: "+course2.name + "\nIlerleme: "+ course2.progress+ "\nEgitmenin ismi: "+ course2.instructorName+"\n"+course2.progressBar);
		courseManager.purchase(course2);
		courseManager.write(course2);
		System.out.print("\n");
		courseManager.loop();
		System.out.println("\n");
		
	//3.kurs icin
		System.out.println("Kursun Ismi: "+course3.name + "\nIlerleme: "+ course3.progress+ "\nEgitmenin ismi: "+ course3.instructorName+"\n"+course3.progressBar);
		courseManager.purchase(course3);
		courseManager.write(course3);
	}

}
