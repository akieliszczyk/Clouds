import java.util.Random;

public class Obserwations {

    private Random rand = new Random();
    private int row = 100;
    String obserwationTab[][] = new String[3][row];
    private String cloudColors[] = {"W", "G", "DG"};

    private String textCover;
    private String textHeight;

    String [][] generateRandomObserwationData(int row) {
        generateCoverData(row);
        generateCloudColorData(row);
        generateCloudHeighData(row);

        return obserwationTab;
    }


    private void generateCoverData(int row) {
        for (int i = 0; i<row; i++) {
            int cover = rand.nextInt(9);
            textCover = Integer.toString(cover);
            obserwationTab[0][i] = textCover;
        }
    }
    private void generateCloudColorData(int row) {
        for (int i = 0; i < row; i++) {
            int color = rand.nextInt(3);
            obserwationTab[1][i] = cloudColors[color];
        }
    }
    private void generateCloudHeighData(int row) {
        for(int i=0; i < row; i++) {
            int height = rand.nextInt(13);
            textHeight = Integer.toString(height);
            obserwationTab[2][i] = textHeight;
        }
    }
    void printTable(int row) {
        for (int i = 0; i<row; i++) {
            System.out.println(obserwationTab[0][i] + " " + obserwationTab[1][i] + " " + obserwationTab[2][i]);

        }
    }
}
