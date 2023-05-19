import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Prvek hlava = null;

        for(;;) {
            int vstup = sc.nextInt();
            if(vstup == 0) {
                break;
            }
            //pridam prvky do seznamu
            Prvek novy = new Prvek(vstup, null);
            novy.dalsiPrvek = hlava;
            hlava = novy;
        }
        //vypisu cely seznam
        while(hlava != null) {
            System.out.println(hlava.hodnota);
            hlava = hlava.dalsiPrvek;
        }
        
    }
}