import java.util.Scanner;

class FrogSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T > 0){

            int N = sc.nextInt();

            int W[] = new int[N];
            int L[] = new int[N];
            int [] pos = new int[N];

            int jumps = 0;

            for(int i = 0; i < N; i++){
                W[i] = sc.nextInt();
                pos[W[i] - 1] = i;
            }
            for(int i = 0; i < N; i++) L[W[i] - 1] = sc.nextInt();

            for(int i = 1; i < N; i++){

                while (pos[i] <= pos[i - 1]){
                    pos[i]+= L[i];
                    jumps++;
                }

            }

            System.out.println(jumps);

            T--;
        }


    }

}
