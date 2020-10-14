package edu.temple.colorchangingapp;


import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class CanvasActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle(getResources().getString(R.string.cActivity));
        String chosenColor = getIntent().getStringExtra("color");
        TextView tv;
        setContentView(R.layout.activity_canvas);
        tv = (TextView) findViewById(R.id.canvasTV);
        tv.setText(chosenColor);
        ConstraintLayout main = (ConstraintLayout) findViewById(R.id.main_layout);

        //Set Background color
        if (chosenColor.equals("Red")) {
            main.setBackgroundColor(Color.RED);

        }
        if (chosenColor.equals("Blue")) {
            main.setBackgroundColor(Color.BLUE);

        }
        if (chosenColor.equals("Black")) {
            main.setBackgroundColor(Color.BLACK);
            tv.setTextColor(Color.WHITE);
        }
        if (chosenColor.equals("Cyan")) {
            main.setBackgroundColor(Color.CYAN);

        }
        if (chosenColor.equals("Green")) {
            main.setBackgroundColor(Color.GREEN);

        }
        if (chosenColor.equals("LTGray")) {
            main.setBackgroundColor(Color.LTGRAY);

        }
        if (chosenColor.equals("DKGay")) {
            main.setBackgroundColor(Color.DKGRAY);

        }
        if (chosenColor.equals("Magenta")) {
            main.setBackgroundColor(Color.MAGENTA);

        }
        if (chosenColor.equals("White")) {
            main.setBackgroundColor(Color.WHITE);

        }
        if (chosenColor.equals("Yellow")) {
            main.setBackgroundColor(Color.YELLOW);

        }

        //French
        if (chosenColor.equals("Rouge")) {
            main.setBackgroundColor(Color.RED);

        }
        if (chosenColor.equals("Bleu")) {
            main.setBackgroundColor(Color.BLUE);

        }
        if (chosenColor.equals("Noire")) {
            main.setBackgroundColor(Color.BLACK);
            tv.setTextColor(Color.WHITE);
        }
        if (chosenColor.equals("Vert")) {
            main.setBackgroundColor(Color.GREEN);

        }
        if (chosenColor.equals("Blanc")) {
            main.setBackgroundColor(Color.WHITE);

        }
        if (chosenColor.equals("Jaune")) {
            main.setBackgroundColor(Color.YELLOW);

        }
    }
}
