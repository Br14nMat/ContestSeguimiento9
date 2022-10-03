import java.util.*;

public class Barrels {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0){

            int N = sc.nextInt();
            int K = sc.nextInt();
            Long B[] = new Long[N];

            for(int i = 0; i < N; i++){
                B[i] = sc.nextLong();
            }

            List<Long> BA = new ArrayList<>();
            BA = Arrays.asList(B);
            Collections.sort(BA);

            Long last = BA.get(BA.size() - 1);

            for(int i = 0; i < K; i++){
                last += BA.get(BA.size() - (i + 2));
            }

            if(K > 0){
                System.out.println(last);
            }else {
                System.out.println(0);
            }
            T--;
        }

    }

}
