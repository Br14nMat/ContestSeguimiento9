import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class SpykeTalks {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String n = sc.nextLine();

        String input = sc.nextLine();

        String[] splited = input.split(" ");

        ArrayList<Integer> ids = new ArrayList<>();


        for(int i = 0; i < splited.length; i++){

            ids.add(Integer.valueOf(splited[i]));
        }

        for(int i = 0 ; i < ids.size() ; i++) {
            for (int j = 1; j < ids.size()-i; j++) {
                if(ids.get(j) > ids.get(j-1)){
                    int anterior = ids.get(j-1);
                    int actual = ids.get(j);
                    ids.set(j,anterior);
                    ids.set(j-1,actual);
                }
            }
        }

        int pairs = 0;

        for(int i = 1; i < ids.size(); i++){

            if(ids.get(i) != 0){
                if( i != ids.size() - 1  && Objects.equals(ids.get(i), ids.get(i - 1)) && Objects.equals(ids.get(i), ids.get(i + 1))){
                    pairs = -1;
                    break;
                }else if(Objects.equals(ids.get(i - 1), ids.get(i))){
                    pairs++;
                }

            }

        }

        System.out.println(pairs);

    }

}
