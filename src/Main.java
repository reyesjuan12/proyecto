import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("juan");

        System.out.print("hola este programa te dira cual quier numero que ingreses sera par o imprar,  ingrese su numero ");

        int n = leer.nextInt();

        if (n % 2 ==0 ) {

            System.out.printf("si entonces el numero %d es PAR\n" , n);
        } else {

            System.out.printf("si no entonces el numero %d es IMPAR\n" , n);


        }
    }


}