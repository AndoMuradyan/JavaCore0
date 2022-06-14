package experience;

public class Valuation {
    double ando = 32;

   void valuation(double[] array) {

        double mean = 0;
        for (int i=0;i<array.length;i++) {

            mean = mean + i;
        }

        mean = mean / array.length;
        if (ando > mean) {
            System.out.println("Անդո ի գնահատականը բարձր է միջին գնահատականից  " );
        } else
            System.out.println("Անդո ի գնահատականը ցածր  է միջին գնահատականից ");



    }

}
