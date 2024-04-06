import inputdata.ProgramData;

public class CloudsParameters {

    ProgramData programData = new ProgramData();
    private int row = 100;
    String [][] table = programData.getRandomObservationData();
    String clasificationTab[][] = new String[4][row];

    void classifyObservations(String [][] tab) {

        System.out.println(table[0][1]);
        classifySkyCover(tab);
        classifyCloudColor(tab);
        classifySkyLevel(tab);
    }
    void classifySkyCover(String [][] tab) {
        for (int i = 0; i < row; i++) {
            if (tab[0][i].equals("0")) {
                clasificationTab[0][i] = "Cloudless";
            } else {
                int skyCover = Integer.parseInt(tab[0][i]);
                if (skyCover >= 1 & skyCover < 3) {
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
    }
    void classifyCloudColor(String [][] tab) {
        for (int i = 0; i < row; i++) {
            if (tab[0][i].equals("0")) {
                clasificationTab[1][i] = "---";
            } else {
                String cloudColor = tab[1][i];
                if (cloudColor.equals("W")) {
                    clasificationTab[1][i] = "White";
                } else if (cloudColor.equals("G")) {
                    clasificationTab[1][i] = "Grey";
                } else if (cloudColor.equals("DG")) {
                    clasificationTab[1][i] = "Dark Grey";
                } else {
                    clasificationTab[1][i] = "UNKNOW";
                }
            }
        }
    }
    void classifySkyLevel(String [][] tab) {
        for (int i = 0; i < row; i++) {
            if (tab[0][i].equals("0")) {
                clasificationTab[2][i] = "---";
            } else {
                int skyLevel = Integer.parseInt(tab[2][i]);
                if (skyLevel < 3) {
                    clasificationTab[2][i] = "Low level";
                } else if (skyLevel >= 3 & skyLevel < 7) {
                    clasificationTab[2][i] = "Mid level";
                } else {
                    clasificationTab[2][i] = "High level";
                }
            }
        }
    }
    void printClasificationTable(int row) {
        for (int i = 0; i < row; i++) {
            System.out.println(clasificationTab[0][i] + " " + clasificationTab[1][i] + " " + clasificationTab[2][i] + " " + clasificationTab[3][i]);
        }
    }
}
