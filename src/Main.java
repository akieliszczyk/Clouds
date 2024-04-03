
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    public static void main(String[] args) {
        Obserwations obserwations = new Obserwations();
        CloudsParameters cloudsParameters = new CloudsParameters();
        Classification classification = new Classification();

        obserwations.generateRandomObserwationData(100);
//        obserwations.printTable(100);


        cloudsParameters.ClassifyObservations(obserwations.obserwationTab);
//       cloudsParameters.printClasificationTable(100);


//        obserwations.printTable(100);

//        cloudsParameters.printClasificationTable(100);


        classification.cloudsClassification(obserwations.obserwationTab, cloudsParameters.clasificationTab, 100);
        cloudsParameters.printClasificationTable(100);



    }
}



