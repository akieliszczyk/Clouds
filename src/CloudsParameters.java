
public class CloudsParameters {
    String clasificationTab[][] = new String[4][100];

    void ClassifyObservations(String [][] tab) {
        classifySkyCover(tab);
        classifyCloudColor(tab);
        classifySkyLevel(tab);
    }
    void classifySkyCover(String [][] tab) {
        for (int i = 0; i<100; i++) {
            int skyCover = Integer.parseInt(tab[0][i]);
            if (skyCover < 1) {
                clasificationTab[0][i] = "Cloudless";

            } else if (skyCover >= 1 & skyCover < 3) {
                clasificationTab[0][i] = "Slightly cloudy";

            } else if (skyCover >= 3 & skyCover < 6) {
                clasificationTab[0][i] = "Moderately cloudy";

            } else if (skyCover >= 6 & skyCover < 8) {
                clasificationTab[0][i] = "Heavily cloudy";

            } else {
                clasificationTab[0][i] = "Completely cloudy";
            }
        }
    }
    void classifyCloudColor(String [][] tab) {
        for (int i = 0; i<100; i++) {
            String cloudColor = tab[1][i];
            if (cloudColor == "W") {
                clasificationTab[1][i] = "White";
            } else if (cloudColor == "G") {
                clasificationTab[1][i] = "Grey";
            } else if (cloudColor == "DG") {
                clasificationTab[1][i] = "Dark Grey";
            }  else {
                clasificationTab[1][i] = "UNKNOW";
            }
        }
    }
    void classifySkyLevel(String [][] tab) {
        for (int i = 0; i < 100; i++) {
            int skyLevel = Integer.parseInt(tab[2][i]);

            if (skyLevel < 2) {
                clasificationTab[2][i] = "Low level";
            } else if (skyLevel >= 2 & skyLevel < 7) {
                clasificationTab[2][i] = "Mid level";
            } else {
                clasificationTab[2][i] = "High level";
            }
        }
    }
    void printClasificationTable(int row) {
        for (int i = 0; i<row; i++) {
            System.out.println(clasificationTab[0][i] + " " + clasificationTab[1][i] + " " + clasificationTab[2][i] + " " + clasificationTab[3][i]);
        }
    }
}
