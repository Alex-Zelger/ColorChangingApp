package edu.temple.colorchangingapp;

import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


import androidx.appcompat.app.AppCompatActivity;

public class PaletteActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {

    public String[] colors;
    public String chosenColor;
    GridView gv;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        colors = getResources().getStringArray(R.array.colorsArr);
        setContentView(R.layout.activity_palette);
        getSupportActionBar().setTitle(getResources().getString(R.string.pActivity));
        gv=(GridView)findViewById(R.id.paletteGV);
        gv.setOnItemClickListener(this);

        CustomAdapter paletteAdapter=new CustomAdapter(PaletteActivity.this, colors);
        gv.setAdapter(paletteAdapter);
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        chosenColor = colors[position];
        Intent intent = new Intent(PaletteActivity.this, CanvasActivity.class);
        intent.putExtra("color", chosenColor);
        startActivity(intent);
    }

}
