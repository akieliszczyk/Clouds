package inputdata;

public class ProgramData {
    private final String randomObservationData[][] = new String[3][100];

    private final String cloudColors[] = {"W", "G", "DG"};

    public String [][] getRandomObservationData() {
        return randomObservationData;
    }

    public void setRandomObservationData(int column, int i, String randomObservationData) {
        this.randomObservationData[column][i] = randomObservationData;
    }

    public String[] getCloudColors() {
        return cloudColors;
    }

}
