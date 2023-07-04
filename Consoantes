import java.util.Scanner;
public class Consoantes {
    public static void main(String[] args){
        char letra;
        int count = 0;

        Scanner scan = new Scanner (System.in);

        letra = scan.next().charAt(0);

        while(letra != '*'){

            if(ehConsoante(letra)){
                count = count + 1;
            }

            letra = scan.next().charAt(0);

        }

        System.out.println(count);

    }

    public static boolean ehConsoante(char letra){
        return !ehVogal(letra);
    }

    public static boolean ehVogal(char letra){
        if(Character.toLowerCase(letra) == 'a' || Character.toLowerCase(letra) == 'e' || Character.toLowerCase(letra) == 'i' || Character.toLowerCase(letra) == 'o' || Character.toLowerCase(letra) == 'u'){
            return true;
        } else {
            return false;
        }
    }
}
