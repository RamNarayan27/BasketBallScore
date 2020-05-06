package com.example.basketballscore;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void displayA(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreA);
        scoreView.setText(String.valueOf(score));
    }
    public void displayB(int score){
        TextView scoreView = (TextView) findViewById(R.id.scoreB);
        scoreView.setText(String.valueOf(score));
    }
    public void plusThreeA(View view){
        scoreA=scoreA+3;
        displayA(scoreA);
    }
    public void plusThreeB(View view){
        scoreB=scoreB+3;
        displayB(scoreB);
    }
    public void plusTwoA(View view){
        scoreA=scoreA+2;
        displayA(scoreA);
    }
    public void plusTwoB(View view){
        scoreB=scoreB+2;
        displayB(scoreB);
    }
    public void plusOneA(View view){
        scoreA=scoreA+1;
        displayA(scoreA);
    }
    public void plusOneB(View view){
        scoreB=scoreB+1;
        displayB(scoreB);
    }
    public void reset(View view){
        scoreA=0;
        scoreB=0;
        displayA(scoreA);
        displayB(scoreB);
    }
}
