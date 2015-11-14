package com.example.qinc0.myapplication1;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        radioGroup=(RadioGroup)findViewById(R.id.RadioGroup1);
        radioGroup.setOnCheckedChangeListener(this);
    }


    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch (checkedId) {
            case(R.id.radio1):
                Toast.makeText(getApplicationContext(),"你当前选中了男孩",Toast.LENGTH_SHORT).show();
                Log.i("tag","您现在选中了男孩");
                break;
            case R.id.radio2:
                Toast.makeText(getApplicationContext(),"你当前选中了男孩",Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
