package switchDemo;

public class Main {

	public static void main(String[] args) {
		char grade='F';
		
		switch (grade) {
		case 'A': 			
			System.out.println("Mükemmel : Geçtiniz");
			break;
		case 'B':
			System.out.println("Çok Güzel : Geçtiniz");
			break;
				
		case 'C':
			System.out.println("İyi : Geçtiniz");
			break;
		
		case 'D':
			System.out.println("Fena Değil : Geçtiniz");
			break;

		case 'E':
			System.out.println("Malesef : Kaldınız");
			break;

		default: System.out.println("Geçersiz Not");
				
		}
		

	}

}
