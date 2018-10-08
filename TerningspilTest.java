import static org.junit.Assert.*;

public class TerningspilTest {

Terningspil TestTerningspil = new Terningspil();

    @org.junit.Test
    public void getSum() {
    }

    @org.junit.Test
    public void roll() {

        int slag = TestTerningspil.roll();
        assertTrue(7 > slag && slag > 0);

        int []array = new int [6];
        for(int i = 0; i < 1000; i++){
            int mangeslag = TestTerningspil.roll();
            array[mangeslag-1]++;

        }
        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);
        System.out.println(array[5]);
        System.out.println(array[0]+array[1]+array[2]+array[3]+ array[4] + array[5]);

// vi tester kun denne her, fordi resten er ens.

    }

    @org.junit.Test
    public void slå() {
        int slag = TestTerningspil.slå();
    }

    @org.junit.Test
    public void roll2() {
        int slag = TestTerningspil.roll2();
    }

    @org.junit.Test
    public void slå2() {
        int slag = TestTerningspil.slå2();
    }

    @org.junit.Test
    public void main() {
    }
}