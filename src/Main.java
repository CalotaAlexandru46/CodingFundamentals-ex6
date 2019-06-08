import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Introduceti suma initiala: ");
        int sumaInitiala= input.nextInt();
        System.out.println("Introduceti numarul de ani: ");
        int numarAni=input.nextInt();
        System.out.println("Introduceti rata dobanzii: ");
        double rataDobanzii=input.nextDouble();
        double dobandaSimpla;
        double dobandaCompusa=sumaInitiala;

        dobandaSimpla=(sumaInitiala*rataDobanzii*numarAni);

        for(int i=1;i<=numarAni; i++) {
            dobandaCompusa = dobandaCompusa * (1 + rataDobanzii);
        }

        System.out.printf("Dobanda simpla este: %.2f ",dobandaSimpla);
        System.out.println();
        System.out.printf("Dobanda compusa este: %.2f ",dobandaCompusa);
        System.out.println();
        double diff=dobandaCompusa-dobandaSimpla;
        System.out.printf("Diferenta dintre dobanda compusa si dobanda simpla este: %.2f ", diff);
    }

}
