package com.emto.testaar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.aigestudio.wheelpicker.widgets.WheelDateTimePicker;
import com.aigestudio.wheelpicker.widgets.WheelDayPicker;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WheelDayPicker picker = new WheelDayPicker(this);
        picker.setCurved(true);
        picker.setCyclic(true);


        setContentView(picker);
    }
}
