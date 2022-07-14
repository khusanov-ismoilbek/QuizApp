package uz.gita.quizappOracle;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class OCAActivity extends AppCompatActivity {
    private String selectedTopicName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_oca);

        CardView JBB = findViewById(R.id.oca1);
        JBB.setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(1000).playOn(JBB);
            selectedTopicName = "AT";
            Intent intent = new Intent(OCAActivity.this, TestActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView OAS = findViewById(R.id.oca2);
        OAS.setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(1000).playOn(OAS);
            selectedTopicName = "OAS";
            Intent intent = new Intent(OCAActivity.this, TestActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView CJAs = findViewById(R.id.oca3);
        CJAs.setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(1000).playOn(CJAs);
            selectedTopicName = "CJAs";
            Intent intent = new Intent(OCAActivity.this, TestActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView MAE = findViewById(R.id.oca4);
        MAE.setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(1000).playOn(MAE);
            selectedTopicName = "MAE";
            Intent intent = new Intent(OCAActivity.this, TestActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView CD = findViewById(R.id.oca5);
        CD.setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(1000).playOn(CD);
            selectedTopicName = "CD";
            Intent intent = new Intent(OCAActivity.this, TestActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView E = findViewById(R.id.oca6);
        E.setOnClickListener(view -> {
            selectedTopicName = "E";
            Intent intent = new Intent(OCAActivity.this, TestActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });
    }

}
