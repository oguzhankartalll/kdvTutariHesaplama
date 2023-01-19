import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
		Scanner kb = new Scanner(System.in);

		double tutar , kdvTutar,kdvliTutar,kdv = 0.18;
		System.out.print("Lütfen Hesaplanmak istenen Tutarı Giriniz:");
		tutar = kb.nextDouble();

		kdvTutar = tutar * kdv;

		kdvliTutar = tutar + kdvTutar;


		System.out.println("Kdv'siz Fiyat:" + tutar);
		System.out.println("Kdv'li Fiyat:"+ kdvliTutar);
		System.out.println("Kdv Oranı:" + kdv);
		System.out.println("Kdv Tutarı:" + kdvTutar);
	}
}