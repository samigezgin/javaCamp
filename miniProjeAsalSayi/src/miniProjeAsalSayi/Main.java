package miniProjeAsalSayi;

public class Main {

	public static void main(String[] args) {
	int number =15;
	boolean asalMi=true;
	
	for(int i=2;i<number;i++) {
		if (number%i==0) {
			asalMi=false;
		}
	}
	if(asalMi) {
		System.out.println("Sayı Asal");
	}else
		System.out.println("Sayı Asal Değil");
	
	
	}

}
