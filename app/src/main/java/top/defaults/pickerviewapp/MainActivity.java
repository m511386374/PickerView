package top.defaults.pickerviewapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @OnClick(R.id.defaultPicker) void defaultPicker() {
        startActivity(new Intent(this, DefaultPickerActivity.class));
    }

    @OnClick(R.id.divisionPicker) void divisionPicker() {
        startActivity(new Intent(this, DivisionPickerActivity.class));
    }

    @OnClick(R.id.datePicker) void datePicker() {
        startActivity(new Intent(this, DatePickerActivity.class));
    }

    @OnClick(R.id.pickerDialog) void pickerDialog() {
        startActivity(new Intent(this, PickerDialogActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }
}
