import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int notas = 0;
        double suma = 0;

        for (int i = 0; i <= 4; i++) {
            System.out.println("Dime tu nota: ");
            notas = sc.nextInt();
            notas++;
            suma = notas;
        }

        System.out.println(notas);
        double resultado = suma / notas;

        System.out.println(resultado);

        if (resultado >= 5) {
            System.out.println("Has aprovado!");
        } else {
            System.out.println("Has suspendido");
        }
    }
}