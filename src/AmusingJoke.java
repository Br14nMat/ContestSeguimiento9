import java.util.*;

public class AmusingJoke {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        String pile = sc.nextLine();

        String joined = input1 + input2;


        ArrayList<String> joinedA = new ArrayList<>(Arrays.asList(joined.split("")));
        ArrayList<String> pileA = new ArrayList<>(Arrays.asList(pile.split("")));

        for (int i = 0; i < joinedA.size(); i++) {
            for (int j = 1; j  < joinedA.size()-i; j++) {
                if(joinedA.get(j).compareTo(joinedA.get(j-1))<0){
                    String anterior = joinedA.get(j-1);
                    String actual = joinedA.get(j);
                    joinedA.set(j,anterior);
                    joinedA.set(j-1,actual);
                }
            }

        }

        for (int i = 0; i < pileA.size(); i++) {
            for (int j = 1; j  < pileA.size()-i; j++) {
                if(pileA.get(j).compareTo(pileA.get(j-1))<0){
                    String anterior = pileA.get(j-1);
                    String actual = pileA.get(j);
                    pileA.set(j,anterior);
                    pileA.set(j-1,actual);
                }
            }

        }

        if(Objects.equals(joinedA, pileA)){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }

    }

}
