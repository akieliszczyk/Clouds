import java.util.Random;

public class CloudsParameters {
    Random rand = new Random();
    int skyCover[] = new int[10];


    void SkyCover() {
        for (int i = 0; i < 10; i++) {
            int a = rand.nextInt(9);
            skyCover[i] = a;
        }

        for (int obs : skyCover) {
            if (obs < 1) {
                System.out.println(obs + ": Cloudless");

            } else if (obs >= 1 & obs < 3) {
                System.out.println(obs + ": Slightly cloudy");

            } else if (obs >= 3 & obs < 6) {
                System.out.println(obs + ": Moderately cloudy");

            } else if (obs >= 6 & obs < 8) {
                System.out.println(obs + ": Heavily cloudy");

            } else {
                System.out.println(obs + ": Completely cloudy");
            }

        }
    }
    void SkyLevel(){
        int level[] = new int[3];

        for (int obs: level) {
            if(obs < 2) {
                System.out.println(obs + "km : Low level");
            }
            else if (obs >= 2 & obs < 7) {
                System.out.println(obs + "km : Mid level");
            }
            else {
                System.out.println(obs + "km : High level");
            }
        }
    }
}
