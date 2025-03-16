
import java.util.Scanner;

public class VendaProdutos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        String codigo;
        float valor;
        float qtdPeca;
        

        String cod1;
        float valor1 = 0;
        float qtdPeca1 = 0;

        String cod2;
        float valor2 = 0;
        float qtdPeca2 = 0;

        System.out.print("Porcentagem de IPI a ser acrescido na compra: ");
        float ipi = scanner.nextFloat();

        for(int i = 1; i <= 2; i++) {
            System.out.print("Código da peça " + i + ": ");
            codigo = scanner.next();

            System.out.print("Valor unitário da peça " + i + ": R$");
            valor = scanner.nextFloat();

            System.out.print("Quantidade da peça " + i + ": ");
            qtdPeca = scanner.nextFloat();

            if(i == 1) {
                cod1 = codigo;
                valor1 = valor;
                qtdPeca1 = qtdPeca;
            
            } else {
                cod2 = codigo;
                valor2 = valor;
                qtdPeca2 = qtdPeca;
            
            }

            float valorTotal = (valor1 * qtdPeca1 + valor2 * qtdPeca2) * (ipi / 100 + 1);

            System.out.println("Valor total a ser pago: R$" + valorTotal);
        }
    }
    
}
