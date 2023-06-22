import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        int n1;
        int n2;
        System.out.printf("Informe o primeiro valor: ");
        n1 = ler.nextInt();
        System.out.printf("Informe o segundo valor: ");
        n2 = ler.nextInt();
        System.out.println("A soma dos dois valores é: " + (n1 + n2));
    }
}
