import java.util.Scanner;

class MaxDiff {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        for(int i = 0; i < T; i++){

            int N = sc.nextInt();
            int K = sc.nextInt();

            int W[] = new int[N];

            for(int j = 0; j < N; j++) {
                W[j] = sc.nextInt();
            }

            for(int rojo = 0 ; rojo < W.length-1 ; rojo++) {
                for (int azul = rojo + 1; azul < W.length; azul++) {
                    if(W[rojo] < W[azul]){
                        int valorRojo = W[rojo];
                        int valorAzul = W[azul];
                        W[rojo] = valorAzul;
                        W[azul] = valorRojo;
                    }
                }
            }

            int Kpadre = 0;
            if(N - K > K){
                Kpadre = N - K;
            }else {
                Kpadre = K;
            }

            int sumPadre = 0;
            int sumHijo = 0;

            for(int h = 0; h < W.length; h++){

                if(h < Kpadre){
                    sumPadre += W[h];
                }else{
                    sumHijo += W[h];
                }
            }

            System.out.println(sumPadre - sumHijo);

        }

    }

}
