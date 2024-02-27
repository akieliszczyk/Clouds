import java.util.Random;

public class obserwations {

    private Random rand = new Random();
    private String obserwationTab[][] = new String[2][100];
    private String cloudColors[] = {"W", "G", "DG", "NB"};

    void generateRandomObserwationData(int row) {
        generateCoverData(row);
        generateCloudColorData(row);
    }

    private void generateCoverData(int row) {
        for (int i = 0; i<row; i++) {
            int cover = rand.nextInt(9);
            String textCover = Integer.toString(cover);
            obserwationTab[0][i] = textCover;
        }
    }
    private void generateCloudColorData(int row) {
        for (int i = 0; i < row; i++) {
            int color = rand.nextInt(4);
            obserwationTab[1][i] = cloudColors[color];
        }
    }

    void printTable(int row) {

        for (int i = 0; i<row; i++) {
            System.out.println(obserwationTab[0][i] + " " + obserwationTab[1][i]);

        }
    }
}
