package com.example.hubble.paralysis_app;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.media.MediaPlayer;
import android.os.Vibrator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class _action_1 extends AppCompatActivity {
    TextView textX, textY, textZ ,textCount;
    SensorManager sensorManager;
    Sensor sensor;
    int i = 0;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__action_1);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        sensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);

        textX = (TextView) findViewById(R.id.textX);
        textY = (TextView) findViewById(R.id.textY);
        textZ = (TextView) findViewById(R.id.textZ);
        textCount =(TextView) findViewById(R.id.textCount);
    }

    public void onResume() {
        super.onResume();
        sensorManager.registerListener(accelListener, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    public void onStop() {
        super.onStop();
        sensorManager.unregisterListener(accelListener);
    }
    public  void get_count(int a) {
        i += a;
        textCount.setText("" + (int)i);

    }

    SensorEventListener accelListener = new SensorEventListener() {
        public void onAccuracyChanged(Sensor sensor, int acc) { }

        public void onSensorChanged(SensorEvent event) {
            Vibrator v = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];

            textX.setText("X : " + (int)x);
            textY.setText("Y : " + (int)y);
            textZ.setText("Z : " + (int)z);
            int a = 0;

            if(x>=8){
                i++;
                v.vibrate(400);
                get_count(i);
                //Toast.makeText(_action_1.this, String.valueOf(i), Toast.LENGTH_SHORT).show();
            }if (x<= -8 ){
                i++;
                v.vibrate(400);
                get_count(i);
            }
        }
    };
}