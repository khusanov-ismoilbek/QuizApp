package uz.gita.quizappOracle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        findViewById(R.id.OCA).setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(500).playOn(findViewById(R.id.OCA));
            Intent intent = new Intent(MainActivity.this, OCAActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.OCP).setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(500).playOn(findViewById(R.id.OCP));
            Intent intent = new Intent(MainActivity.this, OCPActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.StudyTips).setOnClickListener(view -> {
//            YoYo.with(Techniques.BounceIn).duration(500).playOn(findViewById(R.id.StudyTips));
            Intent intent = new Intent(MainActivity.this, StudyTipsActivity.class);
            startActivity(intent);
        });

        findViewById(R.id.OCAOCP).setOnClickListener(view -> {
            Intent intent = new Intent(MainActivity.this, OCAOCPAActivity.class);
            intent.putExtra("selectedTopic", "OCAOCP");
            startActivity(intent);
        });

        findViewById(R.id.exitBtn).setOnClickListener(view -> finish());

    }
}