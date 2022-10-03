import java.util.Scanner;

class RacingHorses {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while(T > 0){

            int N = sc.nextInt();
            int S[] = new int[N];

            for(int i = 0; i < N; i++){
                S[i] = sc.nextInt();
            }

            for(int rojo = 0 ; rojo < S.length-1 ; rojo++) {
                for (int azul = rojo + 1; azul < S.length; azul++) {
                    if(S[rojo] < S[azul]){
                        int valorRojo = S[rojo];
                        int valorAzul = S[azul];
                        S[rojo] = valorAzul;
                        S[azul] = valorRojo;
                    }
                }
            }

            int menorDif = 0;

            for (int i = 1; i < S.length; i++){

                int dif = S[i - 1] - S[i];
                if(i == 1 || dif < menorDif){
                    menorDif = dif;
                }

            }

            System.out.println(menorDif);

            T--;
        }


    }

}
