package com.example.muh_r.mrhead;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CheckBox rambut, kumis, alis, janggut;
    ImageView _rambut, _kumis, _alis, _janggut;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        _rambut = (ImageView)findViewById(R.id.rambut);
        _kumis = (ImageView)findViewById(R.id.kumis);
        _alis = (ImageView)findViewById(R.id.alis);
        _janggut = (ImageView)findViewById(R.id.brewok);

        rambut = (CheckBox)findViewById(R.id.cbRambut);
        kumis = (CheckBox)findViewById(R.id.cbKumis);
        alis = (CheckBox)findViewById(R.id.cbAlis);
        janggut = (CheckBox)findViewById(R.id.cbJanggut);

        rambut.setOnClickListener(this);
        kumis.setOnClickListener(this);
        alis.setOnClickListener(this);
        janggut.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.cbRambut:
                if (!rambut.isChecked()){
                    _rambut.setVisibility(View.INVISIBLE);break;
                }else {
                    _rambut.setVisibility(View.VISIBLE);
                    break;
                }
            case R.id.cbKumis:
                if (!kumis.isChecked()){
                    _kumis.setVisibility(View.INVISIBLE);break;
                }else {
                    _kumis.setVisibility(View.VISIBLE);
                    break;
                }
            case R.id.cbAlis:
                if (!alis.isChecked()){
                    _alis.setVisibility(View.INVISIBLE);break;
                }else {
                    _alis.setVisibility(View.VISIBLE);
                    break;
                }
            case R.id.cbJanggut:
                if (!janggut.isChecked()){
                    _janggut.setVisibility(View.INVISIBLE);break;
                }else {
                    _janggut.setVisibility(View.VISIBLE);
                    break;
                }
        }
    }
}
