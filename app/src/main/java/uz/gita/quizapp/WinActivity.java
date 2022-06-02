package uz.gita.quizapp;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;

public class WinActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_record);

        int str[] = getIntent().getIntArrayExtra("ARRAY");
        TextView textView = findViewById(R.id.setScore);
        textView.setText(str[0] + "/" + str[1]);
        findViewById(R.id.backBtnOfRecord).setOnClickListener(view -> {
            finish();
        });
    }
}
