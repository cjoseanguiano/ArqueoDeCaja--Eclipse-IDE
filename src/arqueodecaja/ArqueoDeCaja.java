package arqueodecaja;
import java.util.Scanner;

/*Arqueo de caja ejemplo 
 * 1000 = 2 de 500
 * 500 = de de 250*/
public class ArqueoDeCaja {

	public static int billeteMil;
	public static int billeteQuinientos;
	public static int billeteDoscientos;
	public static int billeteCien;
	public static int billeteCincuenta;
	
	public static int billeteMilx = 0;
	public static int billeteQuinix = 0;
	public static int billeteDosx = 0;
	public static int billeteCienx = 0;
	public static int billeteCincx = 0;

	public static void main(String[] args) {

		String dinero;
		// TODO Auto-generated method stub
	



		do {

			Scanner entrada = new Scanner(System.in);
			System.out.println("Ingresa que billete tienes");
			dinero = entrada.nextLine();

			switch (dinero) {

			case "A":
				Scanner entradaMil = new Scanner(System.in);
				System.out.println("Cuantos billetes de 1000 tienes :");
				billeteMil = entradaMil.nextInt();
				System.out.println(pedirBilleteMil(billeteMil));
				billeteMilx = pedirBilleteMil(billeteMil);
				break;

			case "B":
				Scanner entradaQui = new Scanner(System.in);
				System.out.println("Cuantos billetes de 500 tiene :");
				billeteQuinientos = entradaQui.nextInt();
				System.out.println(pedirBillerQuinientos(billeteQuinientos));
				billeteQuinix = pedirBillerQuinientos(billeteQuinientos);

				break;

			case "C":
				Scanner entradaDos = new Scanner(System.in);
				System.out.println("Cuantos billetes de 200 tienes :");
				billeteDoscientos = entradaDos.nextInt();
				System.out.println(pedirBilleteDoscientos(billeteDoscientos));
				billeteDosx = pedirBilleteDoscientos(billeteDoscientos);

				break;

			case "D":
				Scanner entradaCien = new Scanner(System.in);
				System.out.println("Cuantos billetes de 100 tienes :");
				billeteCien = entradaCien.nextInt();
				System.out.println(pedirBilleteCien(billeteCien));
				billeteCienx = pedirBilleteCien(billeteCien);
				break;
				
			case "E":
				Scanner entradaCincuenta = new Scanner(System.in);
				System.out.println("Cuantos billetes de 50 tienes :");
				billeteCincuenta = entradaCincuenta.nextInt();
				System.out.println(pedirBilleteCincuenta(billeteCincuenta));
				billeteCincx = pedirBilleteCincuenta(billeteCincuenta);

				break;
				
			case "F":
					sumarBilletes();
				break;
			default:
				break;
				

			}

		} while (!dinero.equalsIgnoreCase("X"));
		
		sumarBilletes();
	}

	public static int pedirBilleteMil(int cuantosMil) {
		int billeteMil = 1000;
		return billeteMil * cuantosMil;
	}

	public static int pedirBillerQuinientos(int cuantosQuinientos) {
		int billeteQuinientos = 500;
		return billeteQuinientos * cuantosQuinientos;
	}

	public static int pedirBilleteDoscientos(int cuantosDoscientos) {
		int billeteDoscientos = 200;
		return billeteDoscientos * cuantosDoscientos;
	}

	public static int pedirBilleteCien(int cuantosCien) {
		int billeteCien = 100;
		return billeteCien * cuantosCien;
	}

	public static int pedirBilleteCincuenta(int cuantosCincuenta) {
		int billeteCincuenta = 50;
		return billeteCincuenta * cuantosCincuenta;
	}

	public static void sumarBilletes() {
		int valor = billeteMilx + billeteQuinix + billeteDosx + billeteCienx + billeteCincx;
		System.out.println("TODO " + valor);
	}
}
