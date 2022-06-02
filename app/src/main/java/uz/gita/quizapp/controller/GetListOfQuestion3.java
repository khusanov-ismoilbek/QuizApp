package uz.gita.quizapp.controller;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizapp.R;
import uz.gita.quizapp.model.ModelApp;

public class GetListOfQuestion3 {
    private static GetListOfQuestion3 getListOfQuestion3;

    private GetListOfQuestion3(Resources resources){
        loadDataForOCAOCP(resources);
    }

    public static GetListOfQuestion3 getInstance(Resources resources){
        if (getListOfQuestion3 == null){
            getListOfQuestion3 = new GetListOfQuestion3(resources);
        }
        return getListOfQuestion3;
    }

    private List<ModelApp> OCAOCP = new ArrayList<>();
    private List<ModelApp> loadDataForOCAOCP(Resources resources){
        String questionForOCAOCP[] = resources.getStringArray(R.array.OCAOCP);
        String correctAnswersForOCAOCP[] = resources.getStringArray(R.array.correctAnswersForOCAOCP);
        String keyAForOCAOCP[] = resources.getStringArray(R.array.keysAForOCAOCP);
        String keyBForOCAOCP[] = resources.getStringArray(R.array.keysBForOCAOCP);
        String keyCForOCAOCP[] = resources.getStringArray(R.array.keysCForOCAOCP);
        String keyDForOCAOCP[] = resources.getStringArray(R.array.keysDForOCAOCP);
        String keyEForOCAOCP[] = resources.getStringArray(R.array.keysEForOCAOCP);
        String keyFForOCAOCP[] = resources.getStringArray(R.array.keysFForOCAOCP);
        String answerDefinitionOCAOCP[] = resources.getStringArray(R.array.AnswerDefinitionForOCAOCP);

        for (int i = 0; i < questionForOCAOCP.length; i++) {
            ModelApp modelApp =  new ModelApp(questionForOCAOCP[i], correctAnswersForOCAOCP[i], keyAForOCAOCP[i], keyBForOCAOCP[i], keyCForOCAOCP[i], keyDForOCAOCP[i], keyEForOCAOCP[i], keyFForOCAOCP[i], answerDefinitionOCAOCP[i]);
            OCAOCP.add(modelApp);
        }
        shuffleACD();
        return OCAOCP;
    }

    private void shuffleACD(){
        Collections.shuffle(OCAOCP);
    }

    public List<ModelApp> getQuestions(String selectedTopicName){
        switch (selectedTopicName){
            default:
                return OCAOCP;
        }
    }


}
