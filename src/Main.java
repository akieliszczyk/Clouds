import inputdata.ProgramData;
import inputdata.RandomData;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    
    public static void main(String[] args) {
        RandomData randomData = new RandomData();
        ProgramData programData = new ProgramData();
        CloudsParameters cloudsParameters = new CloudsParameters();
        Classification classification = new Classification();

        randomData.generateRandomObserwationData(100);
        randomData.printTable(100, programData.getRandomObservationData());


         cloudsParameters.classifyObservations(programData.getRandomObservationData());
//         cloudsParameters.printClasificationTable(100);


//         randomData.printTable(100);

//        cloudsParameters.printClasificationTable(100);


//        classification.cloudsClassification(programData.getRandomObservationData(), cloudsParameters.clasificationTab, 100);
//        cloudsParameters.printClasificationTable(100);



    }
}



