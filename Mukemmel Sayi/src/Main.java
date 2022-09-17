
public class Main {

	public static void main(String[] args) {
		
		int sayi=5;
		int toplam =0;
		for(int i=1;i<6;i++) {
			if(sayi%i==0) {
				toplam =toplam +i;
			}
			
		}
		if(toplam ==sayi)
		{
			System.out.println(sayi+" Mükemmel Sayı");
		}
		else
		System.out.println("Mükemmel değil");

	}

}
