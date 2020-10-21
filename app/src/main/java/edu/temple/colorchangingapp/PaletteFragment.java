package edu.temple.colorchangingapp;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

public class PaletteFragment extends Fragment implements AdapterView.OnItemClickListener {
    GridView gv;
    public String[] colors = getResources().getStringArray(R.array.colorsArr);
    public String chosenColor;
    View l;

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        l = inflater.inflate(R.layout.activity_palette, container, false);
        return l;
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        chosenColor =
    }
}
