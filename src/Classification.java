public class Classification {

    void cloudsClassification(String inputTab [][], String outputTab [][], int row) {

        for(int i = 0; i <row; i++) {
            if (Integer.parseInt(inputTab[0][i]) < 5 
                    & inputTab[1][i].equals("W") 
                    & Integer.parseInt(inputTab[2][i]) > 7) {
                outputTab[3][i] = "Ci";
                
            } else if ((Integer.parseInt(inputTab[0][i]) >=3 & Integer.parseInt(inputTab[0][i]) < 5)
                    & inputTab[1][i].equals("W") 
                    & Integer.parseInt(inputTab[2][i]) >= 6 & Integer.parseInt(inputTab[2][i]) < 7) {
                outputTab[3][i] = "Cc";
                
            } else if ((Integer.parseInt(inputTab[0][i]) >=6 & Integer.parseInt(inputTab[0][i]) < 8)
                    & inputTab[1][i].equals("W")
                    & Integer.parseInt(inputTab[2][i]) >= 6) {
                outputTab[3][i] = "Cs";
                
            } else if ((Integer.parseInt(inputTab[0][i]) == 8
                    & inputTab[1][i].equals("G")
                    & Integer.parseInt(inputTab[2][i]) >= 2 & Integer.parseInt(inputTab[2][i]) < 5)) {
                outputTab[3][i] = "As";

            }   else if ((Integer.parseInt(inputTab[0][i]) >=3 & Integer.parseInt(inputTab[0][i]) < 7
                    & (inputTab[1][i].equals("G") || inputTab[1][i].equals("W"))
                    & Integer.parseInt(inputTab[2][i]) >= 2 & Integer.parseInt(inputTab[2][i]) < 6)) {
                outputTab[3][i] = "Ac";

            }   else if ((Integer.parseInt(inputTab[0][i]) == 8
                    & (inputTab[1][i].equals("DG"))
                    & Integer.parseInt(inputTab[2][i]) == 1)) {
                outputTab[3][i] = "Ns";

            }   else if ((Integer.parseInt(inputTab[0][i]) >=6 & Integer.parseInt(inputTab[0][i]) <= 8
                    & (inputTab[1][i].equals("G"))
                    & Integer.parseInt(inputTab[2][i]) <= 2)) {
                outputTab[3][i] = "Sc";

            }   else if ((Integer.parseInt(inputTab[0][i]) == 8
                    & (inputTab[1][i].equals("G") || inputTab[1][i].equals("W"))
                    & Integer.parseInt(inputTab[2][i]) ==1)) {
                outputTab[3][i] = "St";

            }   else if ((Integer.parseInt(inputTab[0][i]) >=1 & Integer.parseInt(inputTab[0][i]) <= 4
                    & (inputTab[1][i].equals("G") || inputTab[1][i].equals("W")))) {
                outputTab[3][i] = "Cu";

            }   else if ((Integer.parseInt(inputTab[0][i]) >=3 & Integer.parseInt(inputTab[0][i]) <= 4
                    & Integer.parseInt(inputTab[2][i]) < 3)) {
                outputTab[3][i] = "Cb";

            }   else {
                outputTab[3][i] = "Unclassified";
            }
        }
    }
}
