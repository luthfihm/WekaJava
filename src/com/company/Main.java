package com.company;

public class Main {

    public static void main(String[] args) throws Exception {
	// write your code here
        String fileName = "iris.arff";
        String dataSource = "data/"+fileName;

        int classifierType = WekaJava.CUSTOM_C45;

        System.out.println("==================================================================");
        System.out.println("Data Set : "+fileName);
        System.out.println("Classifier : "+WekaJava.names[classifierType]);
        System.out.println("==================================================================");
        WekaJava wekaJava = new WekaJava();
        wekaJava.loadData(dataSource);
        wekaJava.buildClassifier(classifierType);

        wekaJava.testModel();
        wekaJava.tenFoldCrossValidation();
        wekaJava.percentageSplit(70.0);
    }
}
