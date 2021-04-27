package intro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String internetSubeButonu ="Internet Subesi";
	    double dolarDun=8.15;
	    double dolarBugun=8.15;
	    int vade=36;
	    boolean dustuMU=false;

	    System.out.println(internetSubeButonu);

	  if(dolarBugun<dolarDun){
	System.out.println("Dolar dustu resmi");
	  }
	  else if (dolarBugun==dolarDun) {
	System.out.println("Dolar sabit kaldi");
	  }
	else {
	  System.out.println("Dolar yukseldi resmi");
	}
	String kredi1="Hizli Kredi";
	String kredi2="Emekli Kredi";
	String kredi3="Konut Kredi";
	String kredi4="Ciftci Kredi";
	String kredi5="MSB Kredi";

	System.out.println(kredi1);
	System.out.println(kredi2);
	System.out.println(kredi3);
	System.out.println(kredi4);
	System.out.println(kredi5);

	String[] krediler = {
	  "Hizli Kredi",
	  "Emekli Kredi",
	  "Konut Kredi",
	  "Ciftci Kredi",
	  "MSB Kredi",
	  "Kultur Kredi"
	  };

	for(String kredi : krediler){
	System.out.println(kredi);
	}

	for(int i=0;i<krediler.length;i++){
	System.out.println(krediler[i]);
	}
	int sayi1=10;
	int sayi2=20;

	}

}
