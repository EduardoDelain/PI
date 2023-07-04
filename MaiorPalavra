import java.util.Scanner;
public class MaiorPalavra {
    public static void main(String[] args){
        String palavra, maior = "";
        boolean primeiro = true;

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            palavra = scan.next();

            if(primeiro || palavra.length() > maior.length()){
                maior = palavra;
                primeiro = false;
            }
        }
        if(primeiro){
            System.out.println("Nenhuma palavra foi informada");
        } else {
            System.out.println("A maior palavra informada foi " + maior);
        }
    
    }
}
