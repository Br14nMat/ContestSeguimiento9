import java.util.Scanner;

public class HelpfulMaths {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        String [] splited = input.split("\\+");


        for(int i=0; i < splited.length; i++){
            for(int j=1; j < (splited.length-i); j++){
                if(splited[j-1].compareTo(splited[j]) > 0){
                    //swap elements
                    String temp = splited[j-1];
                    splited[j-1] = splited[j];
                    splited[j] = temp;
                }

            }

        }

        String output = "";

        for(int i = 0; i < splited.length; i++){
            output+= splited[i] + "+";
        }

        System.out.println(output.substring(0, output.length() - 1));

    }

}
