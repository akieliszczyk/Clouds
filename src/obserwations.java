import java.util.Random;

public class obserwations {

    Random rand = new Random();
    private String obserwationTab[][] = new String[2][10];
    private String cloudColors[] = {"W", "G", "DG", "NB"};
    void generateCoverData() {
        for (int i = 0; i<10; i++) {
            int cover = rand.nextInt(9);
            String textCover = Integer.toString(cover);
            System.out.println(textCover);
            obserwationTab[1][i] = textCover;
        }
    }

    void genrateCloudColorData() {
        for (int i = 0; i < 10; i++) {
            int color = rand.nextInt(4);
            obserwationTab[1][i] = cloudColors[color];
            System.out.println(obserwationTab[1][i]);
        }
    }
}
