package com.example.finalexam;

import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private ImageView battery;
    private int batteryLevel = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.battery_image);
        battery.setImageLevel(batteryLevel);
    }

    public void changeBatteryLevel(View view)
    {
        switch (view.getId())
        {
            case R.id.decrease_btn:
                if(batteryLevel > 0)
                {
                    batteryLevel--;
                    battery.setImageLevel(batteryLevel);
                }
                break;
            case R.id.increase_btn:
                if(batteryLevel < 6)
                {
                    batteryLevel++;
                    battery.setImageLevel(batteryLevel);
                }
                break;
            default: break;
        }
    }
}
