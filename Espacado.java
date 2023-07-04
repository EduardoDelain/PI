import java.util.Scanner;
public class Espacado {
    public static void main(String[] args){
        String palavra;

        Scanner scan = new Scanner(System.in);

        while(scan.hasNext()){
            palavra = scan.next();
            printEspacado(palavra);
        }
    
    }

    public static void printEspacado(String str){
        int i;
        for(i = 0; i < str.length(); i++){
            if(i == (str.length() - 1) ){
                System.out.println(str.charAt(i));
            } else{
                System.out.print(str.charAt(i) + " ");
            }
            
        }
    }
}
