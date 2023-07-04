import java.util.Scanner;
public class Inverso {
    public static void main(String[] args){
        String palavra;

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            palavra = scan.next();
            printInverso(palavra);
        }
    
    }

    public static void printInverso(String str){
        int i;
        for(i = str.length()-1; i >= 0; i--){
            System.out.println(str.charAt(i));
        }
    }
}
