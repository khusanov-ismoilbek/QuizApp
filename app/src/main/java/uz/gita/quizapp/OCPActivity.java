package uz.gita.quizapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class OCPActivity extends AppCompatActivity {
    private String selectedTopicName;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ocp);

        CardView ATOSP = findViewById(R.id.ocp1);
        ATOSP.setOnClickListener(view -> {
            selectedTopicName = "ATOSP";
            Intent intent = new Intent(OCPActivity.this, TestOSPActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView ACD = findViewById(R.id.ocp2);
        ACD.setOnClickListener(view -> {
            selectedTopicName = "ACD";
            Intent intent = new Intent(OCPActivity.this, TestOSPActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView DPAP = findViewById(R.id.ocp3);
        DPAP.setOnClickListener(view -> {
            selectedTopicName = "DPAP";
            Intent intent = new Intent(OCPActivity.this, TestOSPActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView GAC = findViewById(R.id.ocp4);
        GAC.setOnClickListener(view -> {
            selectedTopicName = "GAC";
            Intent intent = new Intent(OCPActivity.this, TestOSPActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView FP = findViewById(R.id.ocp5);
        FP.setOnClickListener(view -> {
            selectedTopicName = "FP";
            Intent intent = new Intent(OCPActivity.this, TestOSPActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

        CardView DSAL = findViewById(R.id.ocp6);
        DSAL.setOnClickListener(view -> {
            selectedTopicName = "DSAL";
            Intent intent = new Intent(OCPActivity.this, TestOSPActivity.class);
            intent.putExtra("selectedTopic", selectedTopicName);
            startActivity(intent);
        });

    }

}
