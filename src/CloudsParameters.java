import java.util.Random;

public class CloudsParameters {
    String clasificationTab[][] = new String[4][100];

    void classifySkyCover(Obserwations obserwations) {
        obserwations.printTable(100);

        for (int i = 0; i<100; i++) {
            int skyCover = Integer.parseInt(obserwations.obserwationTab[0][i]);
            if (skyCover < 1) {
                clasificationTab[0][i] = "| Cloudless |";

            } else if (skyCover >= 1 & skyCover < 3) {
                clasificationTab[0][i] = "| Slightly cloudy |";

            } else if (skyCover >= 3 & skyCover < 6) {
                clasificationTab[0][i] = "| Moderately cloudy |";

            } else if (skyCover >= 6 & skyCover < 8) {
                clasificationTab[0][i] = "| Heavily cloudy |";

            } else {
                clasificationTab[0][i] = "| Completely cloudy |";
            }
        }
    }

    void printClasificationTable(int row) {
        for (int i = 0; i<row; i++) {
            System.out.println(clasificationTab[0][i] + " " + clasificationTab[1][i] + " " + clasificationTab[2][i] + " " + clasificationTab[3][i]);
        }
    }
}
