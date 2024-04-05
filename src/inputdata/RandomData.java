package inputdata;

import java.util.Random;

public class RandomData {

    ProgramData programData = new ProgramData();
    private String [][] randomObservationTab = programData.getRandomObservationData();
    private String cloudColors[] = programData.getCloudColors();
    private Random rand = new Random();

    public String [][] generateRandomObserwationData(int row) {
        generateCoverData(row);
        generateCloudColorData(row);
        generateCloudHeighData(row);

        return randomObservationTab;
    }


    private void generateCoverData(int row) {
        for (int i = 0; i<row; i++) {
            int cover = rand.nextInt(9);
            String textCover = Integer.toString(cover);
            programData.setRandomObservationData(0,i, textCover);
        }
    }
    private void generateCloudColorData(int row) {
        for (int i = 0; i < row; i++) {
            if (randomObservationTab[0][i].equals("0")) {
                programData.setRandomObservationData(1,i,"---");
            } else {
                int color = rand.nextInt(3);
                randomObservationTab[1][i] = cloudColors[color];
            }
        }
    }
    private void generateCloudHeighData(int row) {
        String textHeight;
        for(int i=0; i < row; i++) {
            if (randomObservationTab[0][i].equals("0")) {
                programData.setRandomObservationData(2,i,"---");
            } else {
                if (randomObservationTab[1][i] == "DG" || randomObservationTab[1][i] == "G") {
                    int height = rand.nextInt(6);
                    textHeight = Integer.toString(height);
                    programData.setRandomObservationData(2,i,textHeight);
                } else {
                    int height = rand.nextInt(13);
                    textHeight = Integer.toString(height);
                    programData.setRandomObservationData(2,i,textHeight);
                }
            }
        }
    }

    public void printTable(int row) {
        for (int i = 0; i<row; i++) {
            System.out.println(randomObservationTab[0][i] + " " + randomObservationTab[1][i] + " " + randomObservationTab[2][i]);

        }
    }
}
