import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Dairenin yarıçap uzunluğu: ");
		
		int r = scanner.nextInt();
		
		System.out.print("Daire diliminin merkez açısı: ");
		int aci = scanner.nextInt();
		
		double dilimAlani = ((pi * (r * r) * aci)/360);
		
		System.out.println(aci + " derecelik daire diliminin alani: " + dilimAlani);
		
	}

}
