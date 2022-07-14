package uz.gita.quizappOracle.controller;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizappOracle.R;
import uz.gita.quizappOracle.model.ModelApp;

public class GetListOfQuestion1 {
    private static GetListOfQuestion1 getListOfQuestion1;

    private GetListOfQuestion1(Resources resources){
        loadDataForAT(resources);
        loadDataForOAS(resources);
        loadDataForCJAs(resources);
        loadDataForMAE(resources);
        loadDataForCD(resources);
        loadDataForE(resources);
    }

    public static GetListOfQuestion1 getInstance(Resources resources){
        if (getListOfQuestion1 == null){
            getListOfQuestion1 = new GetListOfQuestion1(resources);
        }
        return getListOfQuestion1;
    }

    private final List<ModelApp> assessmentTest = new ArrayList<>();
    private List<ModelApp> loadDataForAT(Resources resources){

        String[] questionsForAT = resources.getStringArray(R.array.AssessmentTest);
        String[] correctAnswersForAT = resources.getStringArray(R.array.correctAnswersForAssessmentTest);
        String[] keyAForAT = resources.getStringArray(R.array.keysAForAssessmentTest);
        String[] keyBForAT = resources.getStringArray(R.array.keysBForAssessmentTest);
        String[] keyCForAT = resources.getStringArray(R.array.keysCForAssessmentTest);
        String[] keyDForAT = resources.getStringArray(R.array.keysDForAssessmentTest);
        String[] keyEForAT = resources.getStringArray(R.array.keysEForAssessmentTest);
        String[] keyFForAT = resources.getStringArray(R.array.keysFForAssessmentTest);
        String[] answerDefinitionAT = resources.getStringArray(R.array.AnswerDefinitionForAssessmentTest);

        for (int i = 0; i < questionsForAT.length; i++) {
            ModelApp modelApp = new ModelApp(questionsForAT[i], correctAnswersForAT[i], keyAForAT[i], keyBForAT[i], keyCForAT[i], keyDForAT[i], keyEForAT[i], keyFForAT[i], answerDefinitionAT[i]);
            assessmentTest.add(modelApp);
        }
        shuffleAt();
        return assessmentTest;
    }

    private void shuffleAt(){
        Collections.shuffle(assessmentTest);
    }


    private final List<ModelApp> operatorsAndStatements = new ArrayList<>();
    private List<ModelApp> loadDataForOAS(Resources resources){

        String[] questionsForOAS = resources.getStringArray(R.array.OperatorsAndStatements);
        String[] correctAnswersForOAS = resources.getStringArray(R.array.CorrectAnswersForOperatorsAndStatements);
        String[] keyAForOAS = resources.getStringArray(R.array.keysAForOperatorsAndStatements);
        String[] keyBForOAS = resources.getStringArray(R.array.keysBForOperatorsAndStatements);
        String[] keyCForOAS = resources.getStringArray(R.array.keysCForOperatorsAndStatements);
        String[] keyDForOAS = resources.getStringArray(R.array.keysDForOperatorsAndStatements);
        String[] keyEForOAS = resources.getStringArray(R.array.keysEForOperatorsAndStatements);
        String[] keyFForOAS = resources.getStringArray(R.array.keysFForOperatorsAndStatements);
        String[] answerDefinitionOAS = resources.getStringArray(R.array.AnswerDefinitionForOperatorAndStatements);

        for (int i = 0; i < questionsForOAS.length; i++) {
            ModelApp modelApp = new ModelApp(questionsForOAS[i], correctAnswersForOAS[i], keyAForOAS[i], keyBForOAS[i], keyCForOAS[i], keyDForOAS[i], keyEForOAS[i], keyFForOAS[i], answerDefinitionOAS[i]);
            operatorsAndStatements.add(modelApp);
        }
        shuffleOAS();
        return operatorsAndStatements;
    }
    private void shuffleOAS(){
        Collections.shuffle(operatorsAndStatements);
    }

    private final List<ModelApp> coreJavaAPIs = new ArrayList<>();
    private List<ModelApp> loadDataForCJAs(Resources resources){

        String[] questionsForCJAs = resources.getStringArray(R.array.CoreJavaAPIs);
        String[] correctAnswersForCJAs = resources.getStringArray(R.array.CorrectAnswersForCoreJavaAPIs);
        String[] keyAForCJAs = resources.getStringArray(R.array.keysAForCoreJavaAPIs);
        String[] keyBForCJAs = resources.getStringArray(R.array.keysBForCoreJavaAPIs);
        String[] keyCForCJAs = resources.getStringArray(R.array.keysCForCoreJavaAPIs);
        String[] keyDForCJAs = resources.getStringArray(R.array.keysDForCoreJavaAPIs);
        String[] keyEForCJAs = resources.getStringArray(R.array.keysEForCoreJavaAPIs);
        String[] keyFForCJAs = resources.getStringArray(R.array.keysFForCoreJavaAPIs);
        String[] answerDefinitionCJAs = resources.getStringArray(R.array.AnswerDefinitionForCoreJavaAPIs);

        for (int i = 0; i < questionsForCJAs.length; i++) {
            ModelApp modelApp = new ModelApp(questionsForCJAs[i], correctAnswersForCJAs[i], keyAForCJAs[i], keyBForCJAs[i], keyCForCJAs[i], keyDForCJAs[i], keyEForCJAs[i], keyFForCJAs[i], answerDefinitionCJAs[i]);
            coreJavaAPIs.add(modelApp);
        }
        shuffleCJAs();
        return coreJavaAPIs;
    }
    private void shuffleCJAs(){
        Collections.shuffle(coreJavaAPIs);
    }

    private final List<ModelApp> methodsAndEncapsulation = new ArrayList<>();
    private List<ModelApp> loadDataForMAE(Resources resources){

        String[] questionsForMAE = resources.getStringArray(R.array.MethodsAndEncapsulation);
        String[] correctAnswersForMAE = resources.getStringArray(R.array.CorrectAnswersForMethodsAndEncapsulation);
        String[] keyAForMAE = resources.getStringArray(R.array.keysAForMethodsAndEncapsulation);
        String[] keyBForMAE = resources.getStringArray(R.array.keysBForMethodsAndEncapsulation);
        String[] keyCForMAE = resources.getStringArray(R.array.keysCForMethodsAndEncapsulation);
        String[] keyDForMAE = resources.getStringArray(R.array.keysDForMethodsAndEncapsulation);
        String[] keyEForMAE = resources.getStringArray(R.array.keysEForMethodsAndEncapsulation);
        String[] keyFForMAE = resources.getStringArray(R.array.keysFForMethodsAndEncapsulation);
        String[] answerDefinitionMAE = resources.getStringArray(R.array.AnswerDefinitionForMethodsAndEncapsulations);

        for (int i = 0; i < questionsForMAE.length; i++) {
            ModelApp modelApp = new ModelApp(questionsForMAE[i], correctAnswersForMAE[i], keyAForMAE[i], keyBForMAE[i], keyCForMAE[i], keyDForMAE[i], keyEForMAE[i], keyFForMAE[i], answerDefinitionMAE[i]);
            methodsAndEncapsulation.add(modelApp);
        }
        shuffleMAE();
        return methodsAndEncapsulation;
    }
    private void shuffleMAE(){
        Collections.shuffle(methodsAndEncapsulation);
    }


    private final List<ModelApp> classDesign = new ArrayList<>();
    private List<ModelApp> loadDataForCD(Resources resources){

        String[] questionsForCD = resources.getStringArray(R.array.ClassDesign);
        String[] correctAnswersForCD = resources.getStringArray(R.array.CorrectAnswersForForClassDesign);
        String[] keyAForCD = resources.getStringArray(R.array.keysAForClassDesign);
        String[] keyBForCD = resources.getStringArray(R.array.keysBForClassDesign);
        String[] keyCForCD = resources.getStringArray(R.array.keysCForClassDesign);
        String[] keyDForCD = resources.getStringArray(R.array.keysDForClassDesign);
        String[] keyEForCD = resources.getStringArray(R.array.keysEForClassDesign);
        String[] keyFForCD = resources.getStringArray(R.array.keysFForClassDesign);
        String[] answerDefinitionCD = resources.getStringArray(R.array.AnswerDefinitionForClassDesign);

        for (int i = 0; i < questionsForCD.length; i++) {
            ModelApp modelApp = new ModelApp(questionsForCD[i], correctAnswersForCD[i], keyAForCD[i], keyBForCD[i], keyCForCD[i], keyDForCD[i], keyEForCD[i], keyFForCD[i], answerDefinitionCD[i]);
            classDesign.add(modelApp);
        }
        shuffleCD();
        return classDesign;
    }
    private void shuffleCD(){
        Collections.shuffle(classDesign);
    }


    private final List<ModelApp> exceptions = new ArrayList<>();
    private List<ModelApp> loadDataForE(Resources resources){

        String[] questionsForE = resources.getStringArray(R.array.Exceptions);
        String[] correctAnswersForE = resources.getStringArray(R.array.CorrectAnswersForForExceptions);
        String[] keyAForE = resources.getStringArray(R.array.keysAForExceptions);
        String[] keyBForE = resources.getStringArray(R.array.keysBForExceptions);
        String[] keyCForE = resources.getStringArray(R.array.keysCForExceptions);
        String[] keyDForE = resources.getStringArray(R.array.keysDForExceptions);
        String[] keyEForE = resources.getStringArray(R.array.keysEForExceptions);
        String[] keyFForE = resources.getStringArray(R.array.keysFForExceptions);
        String[] answerDefinitionE = resources.getStringArray(R.array.AnswerDefinitionForExceptions);

        for (int i = 0; i < questionsForE.length; i++) {
            ModelApp modelApp = new ModelApp(questionsForE[i], correctAnswersForE[i], keyAForE[i], keyBForE[i], keyCForE[i], keyDForE[i], keyEForE[i], keyFForE[i], answerDefinitionE[i]);
            exceptions.add(modelApp);
        }
        shuffleE();
        return exceptions;
    }
    private void shuffleE(){
        Collections.shuffle(exceptions);
    }

    public List<ModelApp> getQuestions(String selectTopicName){
        switch (selectTopicName){
            case "AT":
                return assessmentTest;
            case "OAS":
                return operatorsAndStatements;
            case "CJAs":
                return coreJavaAPIs;
            case "MAE":
                return methodsAndEncapsulation;
            case "CD":
                return classDesign;
            case "E":
                return exceptions;
            default: return null;
        }
    }

}
