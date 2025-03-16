
import java.util.Scanner;

public class TotalDias {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Anos: ");
        int anos = scanner.nextInt();

        System.out.print("Meses: ");
        int meses = scanner.nextInt();

        System.out.print("Dias: ");
        int dias = scanner.nextInt();

        int totalDias = (anos * 365) + (meses * 30) + dias;

        System.out.println(anos + " anos, " + meses + " meses, " + dias + " dias = " + totalDias + " dias");
    }
    
}
