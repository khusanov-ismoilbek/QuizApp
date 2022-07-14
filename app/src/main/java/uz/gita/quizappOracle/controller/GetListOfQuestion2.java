package uz.gita.quizappOracle.controller;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizappOracle.R;
import uz.gita.quizappOracle.model.ModelApp;

public class GetListOfQuestion2 {
    private static GetListOfQuestion2 getListOfQuestion2;

    private GetListOfQuestion2(Resources resources){
        loadDataForACD(resources);
        loadDataForDPAP(resources);
        loadDataForGAC(resources);
        loadDataForFP(resources);
        loadDataForDSAL(resources);
        loadDataForATOSP(resources);
    }

    public static GetListOfQuestion2 getInstance(Resources resources){
        if (getListOfQuestion2 == null){
            getListOfQuestion2 = new GetListOfQuestion2(resources);
        }
        return getListOfQuestion2;
    }

    private final List<ModelApp> advancedClassDesign = new ArrayList<>();
    private List<ModelApp> loadDataForACD(Resources resources){
        String[] questionForACD = resources.getStringArray(R.array.AdvancedClassDesign);
        String[] correctAnswersForACD = resources.getStringArray(R.array.CorrectAnswersForAdvancedClassDesign);
        String[] keyAForACD = resources.getStringArray(R.array.keysAForAdvancedClassDesign);
        String[] keyBForACD = resources.getStringArray(R.array.keysBForAdvancedClassDesign);
        String[] keyCForACD = resources.getStringArray(R.array.keysCForAdvancedClassDesign);
        String[] keyDForACD = resources.getStringArray(R.array.keysDForAdvancedClassDesign);
        String[] keyEForACD = resources.getStringArray(R.array.keysEForAdvancedClassDesign);
        String[] keyFForACD = resources.getStringArray(R.array.keysFForAdvancedClassDesign);
        String[] answerDefinitionACD = resources.getStringArray(R.array.AnswerDefinitionForAdvancedClassDesign);

        for (int i = 0; i < questionForACD.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForACD[i], correctAnswersForACD[i], keyAForACD[i], keyBForACD[i], keyCForACD[i], keyDForACD[i], keyEForACD[i], keyFForACD[i], answerDefinitionACD[i]);
            advancedClassDesign.add(modelApp);
        }
        shuffleACD();
        return advancedClassDesign;
    }

    private void shuffleACD(){
        Collections.shuffle(advancedClassDesign);
    }



    private final List<ModelApp> designPatternAndPrinciples = new ArrayList<>();
    private List<ModelApp> loadDataForDPAP(Resources resources){
        String[] questionForDPAP = resources.getStringArray(R.array.DesignPatternAndPrinciples);
        String[] correctAnswersForDPAP = resources.getStringArray(R.array.CorrectAnswersForDesignPatternAndPrinciples);
        String[] keyAForDPAP = resources.getStringArray(R.array.keysAForAdvancedDesignPatternAndPrinciples);
        String[] keyBForDPAP = resources.getStringArray(R.array.keysBForAdvancedDesignPatternAndPrinciples);
        String[] keyCForDPAP = resources.getStringArray(R.array.keysCForAdvancedDesignPatternAndPrinciples);
        String[] keyDForDPAP = resources.getStringArray(R.array.keysDForAdvancedDesignPatternAndPrinciples);
        String[] keyEForDPAP = resources.getStringArray(R.array.keysEForAdvancedDesignPatternAndPrinciples);
        String[] keyFForDPAP = resources.getStringArray(R.array.keysFForAdvancedDesignPatternAndPrinciples);
        String[] answerDefinitionDPAP = resources.getStringArray(R.array.AnswerDefinitionForDesignPatternAndPrinciples);

        for (int i = 0; i < questionForDPAP.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForDPAP[i], correctAnswersForDPAP[i], keyAForDPAP[i], keyBForDPAP[i], keyCForDPAP[i], keyDForDPAP[i], keyEForDPAP[i], keyFForDPAP[i], answerDefinitionDPAP[i]);
            designPatternAndPrinciples.add(modelApp);
        }
        shuffleDPAP();
        return designPatternAndPrinciples;
    }

    private void shuffleDPAP(){
        Collections.shuffle(designPatternAndPrinciples);
    }


    private final List<ModelApp> genericsAndCollections = new ArrayList<>();
    private List<ModelApp> loadDataForGAC(Resources resources){
        String[] questionForGAC = resources.getStringArray(R.array.GenericsAndCollections);
        String[] correctAnswersForGAC = resources.getStringArray(R.array.CorrectAnswersForGenericsAndCollections);
        String[] keyAForGAC = resources.getStringArray(R.array.keysAForGenericsAndCollections);
        String[] keyBForGAC = resources.getStringArray(R.array.keysBForGenericsAndCollections);
        String[] keyCForGAC = resources.getStringArray(R.array.keysCForGenericsAndCollections);
        String[] keyDForGAC = resources.getStringArray(R.array.keysDForGenericsAndCollections);
        String[] keyEForGAC = resources.getStringArray(R.array.keysEForGenericsAndCollections);
        String[] keyFForGAC = resources.getStringArray(R.array.keysFForGenericsAndCollections);
        String[] answerDefinitionGAC = resources.getStringArray(R.array.AnswerDefinitionForGenericsAndCollections);

        for (int i = 0; i < questionForGAC.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForGAC[i], correctAnswersForGAC[i], keyAForGAC[i], keyBForGAC[i], keyCForGAC[i], keyDForGAC[i], keyEForGAC[i], keyFForGAC[i], answerDefinitionGAC[i]);
            genericsAndCollections.add(modelApp);
        }
        shuffleGAC();
        return genericsAndCollections;
    }

    private void shuffleGAC(){
        Collections.shuffle(genericsAndCollections);
    }


    private final List<ModelApp> functionalProgramming = new ArrayList<>();
    private List<ModelApp> loadDataForFP(Resources resources){
        String[] questionForFP = resources.getStringArray(R.array.FunctionalProgramming);
        String[] correctAnswersForFP = resources.getStringArray(R.array.CorrectAnswersForFunctionalProgramming);
        String[] keyAForFP = resources.getStringArray(R.array.keysAForFunctionalProgramming);
        String[] keyBForFP = resources.getStringArray(R.array.keysBForFunctionalProgramming);
        String[] keyCForFP = resources.getStringArray(R.array.keysCForFunctionalProgramming);
        String[] keyDForFP = resources.getStringArray(R.array.keysDForFunctionalProgramming);
        String[] keyEForFP = resources.getStringArray(R.array.keysEForFunctionalProgramming);
        String[] keyFForFP = resources.getStringArray(R.array.keysFForFunctionalProgramming);
        String[] answerDefinitionFP = resources.getStringArray(R.array.AnswerDefinitionForFunctionalProgramming);

        for (int i = 0; i < questionForFP.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForFP[i], correctAnswersForFP[i], keyAForFP[i], keyBForFP[i], keyCForFP[i], keyDForFP[i], keyEForFP[i], keyFForFP[i], answerDefinitionFP[i]);
            functionalProgramming.add(modelApp);
        }
        shuffleFP();
        return functionalProgramming;
    }

    private void shuffleFP(){
        Collections.shuffle(functionalProgramming);
    }


    private final List<ModelApp> datesStringsAndLocalization = new ArrayList<>();
    private List<ModelApp> loadDataForDSAL(Resources resources){
        String[] questionForDSAL = resources.getStringArray(R.array.DatesStringsAndLocalization);
        String[] correctAnswersForDSAL = resources.getStringArray(R.array.CorrectAnswersForDatesStringsAndLocalization);
        String[] keyAForDSAL = resources.getStringArray(R.array.keysAForDatesStringsAndLocalization);
        String[] keyBForDSAL = resources.getStringArray(R.array.keysBForDatesStringsAndLocalization);
        String[] keyCForDSAL = resources.getStringArray(R.array.keysCForDatesStringsAndLocalization);
        String[] keyDForDSAL = resources.getStringArray(R.array.keysDForDatesStringsAndLocalization);
        String[] keyEForDSAL = resources.getStringArray(R.array.keysEForDatesStringsAndLocalization);
        String[] keyFForDSAL = resources.getStringArray(R.array.keysFForDatesStringsAndLocalization);
        String[] answerDefinitionDSAL = resources.getStringArray(R.array.AnswerDefinitionForDatesStringsAndLocalization);

        for (int i = 0; i < questionForDSAL.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForDSAL[i], correctAnswersForDSAL[i], keyAForDSAL[i], keyBForDSAL[i], keyCForDSAL[i], keyDForDSAL[i], keyEForDSAL[i], keyFForDSAL[i], answerDefinitionDSAL[i]);
            datesStringsAndLocalization.add(modelApp);
        }
        shuffleDSAL();
        return datesStringsAndLocalization;
    }

    private void shuffleDSAL(){
        Collections.shuffle(datesStringsAndLocalization);
    }


    private final List<ModelApp> assessmentTestOSP = new ArrayList<>();
    private List<ModelApp> loadDataForATOSP(Resources resources){
        String[] questionForATOSP = resources.getStringArray(R.array.AssessmentTestOSP);
        String[] correctAnswersForATOSP = resources.getStringArray(R.array.CorrectAnswersForAssessmentTestOSP);
        String[] keyAForATOSP = resources.getStringArray(R.array.keysAForAssessmentTestOSP);
        String[] keyBForATOSP = resources.getStringArray(R.array.keysBForAssessmentTestOSP);
        String[] keyCForATOSP = resources.getStringArray(R.array.keysCForAssessmentTestOSP);
        String[] keyDForATOSP = resources.getStringArray(R.array.keysDForAssessmentTestOSP);
        String[] keyEForATOSP = resources.getStringArray(R.array.keysEForAssessmentTestOSP);
        String[] keyFForATOSP = resources.getStringArray(R.array.keysFForAssessmentTestOSP);
        String[] answerDefinitionATOSP = resources.getStringArray(R.array.AnswerDefinitionForAssessmentTestOSP);

        for (int i = 0; i < questionForATOSP.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForATOSP[i], correctAnswersForATOSP[i], keyAForATOSP[i], keyBForATOSP[i], keyCForATOSP[i], keyDForATOSP[i], keyEForATOSP[i], keyFForATOSP[i], answerDefinitionATOSP[i]);
            assessmentTestOSP.add(modelApp);
        }
        shuffleATOSP();
        return assessmentTestOSP;
    }

    private void shuffleATOSP(){
        Collections.shuffle(assessmentTestOSP);
    }

    public List<ModelApp> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            case "ACD":
                return advancedClassDesign;
            case "DPAP":
                return designPatternAndPrinciples;
            case "GAC":
                return genericsAndCollections;
            case "FP":
                return functionalProgramming;
            case "DSAL":
                return datesStringsAndLocalization;
            case "ATOSP":
                return assessmentTestOSP;
            default:
                return null;
        }
    }

}
