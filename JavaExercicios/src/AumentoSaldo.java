
import java.util.Scanner;

public class AumentoSaldo {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Saldo: R$");
        float saldo = scanner.nextFloat();

        float aumento = saldo * 1 / 100;
        saldo += aumento;

        System.out.println("Saldo com reajuste de 1%: R$" + saldo);
    }
    
}
