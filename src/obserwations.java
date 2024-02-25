import java.util.Random;

public class obserwations {

    Random rand = new Random();
    private String obserwationTab[][] = new String[2][10];
    void generateCoverData() {
        for (int i = 0; i<10; i++) {
            int cover = rand.nextInt(9);
            String textCover = Integer.toString(cover);
            System.out.println(textCover);
            obserwationTab[1][i] = textCover;
        }
    }
}
