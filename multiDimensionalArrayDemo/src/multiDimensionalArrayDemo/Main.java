package multiDimensionalArrayDemo;

public class Main {

	public static void main(String[] args) {
		
		String[][] sehirler=new String[3][3];
		sehirler[0][0]="İzmir";
		sehirler[0][1]="Manisa";
		sehirler[0][2]="Uşak";
		sehirler[1][0]="İstanbul";
		sehirler[1][1]="Bursa";
		sehirler[1][2]="Kocaeli";
		sehirler[2][0]="Ankara";
		sehirler[2][1]="Konya";
		sehirler[2][2]="Kayseri";
		
		for(int i=0;i<=2;i++)
		{
			for(int j=0;j<=2;j++) {
				System.out.println(sehirler[i][j]);
			}
		}
		
	

	}

}
