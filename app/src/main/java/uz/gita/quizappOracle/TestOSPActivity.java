package uz.gita.quizappOracle;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quizappOracle.controller.GetListOfQuestion2;
import uz.gita.quizappOracle.model.ModelApp;

public class TestOSPActivity extends AppCompatActivity {
    private List<ModelApp> getQuestionsAndKeysAndAnswers;
    private int position;
    private int correctAnswerCount;
    private List<RadioButton> radioButtons = new ArrayList<>(6);
    private int selectRadioPosition = -1;
    private AppCompatButton nextBtn;
    private TextView textViewForQuestion;
    private int questionsAmount;
    private String answerDefinition;
    private MediaPlayer mediaPlayerCorrect;
    private MediaPlayer mediaPlayerWrong;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quizes);

        findViewById(R.id.backBtnOfQuizzes).setOnClickListener(view -> {
            onBackPressed();
        });

        String getSelectedTopicName = getIntent().getStringExtra("selectedTopic");
        GetListOfQuestion2 getListOfQuestion2 = GetListOfQuestion2.getInstance(getResources());
        getQuestionsAndKeysAndAnswers = getListOfQuestion2.getQuestions(getSelectedTopicName);
        questionsAmount = getQuestionsAndKeysAndAnswers.size();
        Collections.shuffle(getQuestionsAndKeysAndAnswers);

        TextView appBar = findViewById(R.id.appbar);
        appBar.setText(position + 1 + "/" + questionsAmount);

        loadView();
        loadData();

        mediaPlayerCorrect = MediaPlayer.create(this, R.raw.correct_answer);
        mediaPlayerWrong = MediaPlayer.create(this, R.raw.wrong_answer);
    }

    private void loadView() {
        textViewForQuestion = findViewById(R.id.questionsView);
        radioButtons.add(findViewById(R.id.radio_btn1));
        radioButtons.add(findViewById(R.id.radio_btn2));
        radioButtons.add(findViewById(R.id.radio_btn3));
        radioButtons.add(findViewById(R.id.radio_btn4));
        radioButtons.add(findViewById(R.id.radio_btn5));
        radioButtons.add(findViewById(R.id.radio_btn6));
        nextBtn = findViewById(R.id.nextBtn);

        nextBtn.setOnClickListener(view -> {
            YoYo.with(Techniques.Bounce).duration(100000).playOn(nextBtn);
            dialogAlertDefinition();
        });

        clickRadioButton();
    }
    private void finishTest(){
        Intent intent = new Intent(TestOSPActivity.this, WinActivity.class);
        int arr[] = {correctAnswerCount, questionsAmount};
        intent.putExtra("ARRAY", arr);
        startActivity(intent);
    }

    private void loadData() {
        textViewForQuestion.setText(getQuestionsAndKeysAndAnswers.get(position).getQuestion());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(textViewForQuestion);
        radioButtons.get(0).setText(getQuestionsAndKeysAndAnswers.get(position).getKeyA());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(radioButtons.get(0));
        radioButtons.get(1).setText(getQuestionsAndKeysAndAnswers.get(position).getKeyB());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(radioButtons.get(1));
        radioButtons.get(2).setText(getQuestionsAndKeysAndAnswers.get(position).getKeyC());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(radioButtons.get(2));
        radioButtons.get(3).setText(getQuestionsAndKeysAndAnswers.get(position).getKeyD());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(radioButtons.get(3));
        radioButtons.get(4).setText(getQuestionsAndKeysAndAnswers.get(position).getKeyE());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(radioButtons.get(4));
        radioButtons.get(5).setText(getQuestionsAndKeysAndAnswers.get(position).getKeyF());
        YoYo.with(Techniques.BounceIn).duration(1000).playOn(radioButtons.get(5));

        answerDefinition = getQuestionsAndKeysAndAnswers.get(position).getAnswerDefinition();
    }

    private void clickRadioButton() {
        for (int i = 0; i < radioButtons.size(); i++) {
            radioButtons.get(i).setTag(i);
            radioButtons.get(i).setOnClickListener(view -> {
                nextBtn.setEnabled(true);
                clearChecks((Integer) view.getTag());
                selectRadioPosition = (int) view.getTag();
            });
        }
    }

    private void clearChecks(int currentRadioButtonPosition) {
        if (selectRadioPosition > -1 && selectRadioPosition != currentRadioButtonPosition) {
            radioButtons.get(selectRadioPosition).setChecked(false);
        }
    }

    private boolean check() {
//        Toast.makeText(this, radioButtons.get(selectRadioPosition).getText().equals(getQuestionsAndKeysAndAnswers.get(position - 1).getCorrectAnswer()) + "", Toast.LENGTH_SHORT).show();
        return radioButtons.get(selectRadioPosition).getText().equals(getQuestionsAndKeysAndAnswers.get(position).getCorrectAnswer());
    }

    @Override
    public void onBackPressed() {
        View v = LayoutInflater.from(this).inflate(R.layout.activity_dialog_backofquizzes, null);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setCancelable(false)
                .setView(v)
                .create();
        v.findViewById(R.id.btnYes).setOnClickListener(view -> {
            dialog.dismiss();
            super.onBackPressed();
        });

        v.findViewById(R.id.btnNo).setOnClickListener(view -> {
            dialog.dismiss();
        });
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);
        dialog.show();
    }


    private void dialogAlertDefinition(){
        View v = LayoutInflater.from(this).inflate(R.layout.activity_dialog_answer, null);
        AlertDialog dialog = new AlertDialog.Builder(this)
                .setCancelable(false)
                .setView(v)
                .create();

        if (check()){
            TextView correctWrong = v.findViewById(R.id.CorrectWrong);

            correctWrong.setText("Correct");
            mediaPlayerCorrect.start();
            correctAnswerCount++;
        }else {
            TextView correctWrong = v.findViewById(R.id.CorrectWrong);
            correctWrong.setText("Wrong!!!");
            mediaPlayerWrong.start();
        }
        TextView definitionAnswer = v.findViewById(R.id.answer);
        definitionAnswer.setText(answerDefinition);
        v.findViewById(R.id.btnOk).setOnClickListener(view -> {
            dialog.dismiss();
            clearChecks(-1);
            nextBtn.setEnabled(false);
            position++;

            if (position == questionsAmount){
                finish();
                finishTest();
            }else {
                loadData();
            }
            TextView appBar = findViewById(R.id.appbar);
            appBar.setText(position + 1 + "/" + questionsAmount);
        });
        dialog.getWindow().setBackgroundDrawableResource(android.R.color.transparent);;
        dialog.show();
    }
}