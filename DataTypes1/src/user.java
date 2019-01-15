import java.util.Scanner;
public class user {
    public static void main(String[] args) {

        Scanner clavier = new Scanner(System.in);
        System.out.println("Entrez un nombre");
        int a = clavier.nextInt();
        System.out.println("Entrez un deuxième nombre");
        int b = clavier.nextInt();

        float division = (float)a/b;

        System.out.println("Vos nombres sont "+a+" et "+b);
        System.out.println("addition ="+(a+b));
        System.out.println("division ="+division);
        System.out.println("soustraction ="+(a-b));
        System.out.println("multiplication ="+a*b);
        clavier.close();
    }
}