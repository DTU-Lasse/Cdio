import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

class Terningspil {

    public static int getSum(int n1, int n2){ // metoden til at få summen af terningerne.
        int sum = n1+n2;
        return sum;
    }

    public static int roll(){
        int T2 = ThreadLocalRandom.current().nextInt(1,6+1);  // genererer et tilfældigt tal mellem 1 og 6
        return T2;
    }
    public static int slå (){

        int d2 = ThreadLocalRandom.current().nextInt(1,6+1); // det samme.
        return d2;
    }

    public static int roll2(){

        int T2 =ThreadLocalRandom.current().nextInt(1,6+1); // det samme.
        return T2;
    }
    public static int slå2 (){

        int d2 = ThreadLocalRandom.current().nextInt(1,6+1); // det samme.
        return d2;
    }

        public static void main (String[]args) { // Her begynder vores spil.

           Scanner in = new Scanner(System.in);

            System.out.println("Velkommen til terningspillet! Præsenteret af gruppe 23");
            System.out.println("Regler er som følger:");
            System.out.println("Man er to spillere. Spiller 1 og spiller 2 og man skiftes til at slå.");
            System.out.println("Den der når mest over 40 point vinder!");
            System.out.println("Hvis man slår to ens, så får man lov til at slå igen");
            System.out.println("Men hvis begge er etter så starter man forfra!");
            System.out.println("Hvem er spiller 1? (skriv navn)");
            in.nextLine();
            System.out.println("Hvem er spiller 2? (skriv navn)");
            in.nextLine();
            System.out.println("Er i klar? For så kører vi!");
            in.nextLine();



            int spiller1 = 0; // Her ses de to startværdier.
            int spiller2 = 0;



             while (spiller1<40 && spiller2<40){  // Her sætter vi grænsen for programmet.
                 int a = roll();
                 int b = slå();
                 int c = getSum(a,b);
                 int d = roll2();
                 int e = slå2();
                 int f = getSum(d,e);

                 spiller1 = getSum(a,b + spiller1); // Her slås der for spiller 1.


                 while (a == b){  // Her har vi lavet et loop, sådan så hvis man får to ens, får man lov til at slå igen.
                     if (a == 1 && b == 1){ // Hvis man slår to ener, så restarter ens score og man slår igen.
                         spiller1 = 0;

                     }

                     System.out.println("spiller 1: slag " +a+ " " + b +" Point: "+ spiller1);

                   a = roll();
                   b = slå();

                     spiller1 = getSum(a, b + spiller1);  // slaget igen.
                 }

                 System.out.println("spiller 1:  Point: " +spiller1 ); // Spiller 1 point

                 spiller2 = getSum(d,e + spiller2); // slaget for spiller to.


                 while (d == e){  // samme fremgangsmåde som for spiller 1.
                     if (d== 1 && e ==1){
                         spiller2= 0;
                     }


                     System.out.println("spiller 2: slag " +d+ " " + e +" Point: "+ spiller2);

                     d=roll2();
                     e=slå2();

                     spiller2 = getSum(d, e + spiller2);



                 }



                 System.out.println( "spiller 2:  Point: " + spiller2); // Spiller to point.



                }
                if (spiller1>=40){

                    System.out.println("spiller 1 vandt!"); //winning condition.



                }
                else if (spiller2>=40){
                    System.out.println("spiller 2 vandt!"); //winning condition.
                }


            }

        }
// Set og godkendt af Jonas
















