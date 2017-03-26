package com.example.hubble.paralysis_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class mode_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mode_);
    }

    public void Action_1(View view) {
        // เปิดหน้า activity ขึ้นใหม่โดยไม่ปิด activity เดิม
        // เปิด ท่าที่ 1  สำหรับใช้ Accelerometer
        Intent i = new Intent(getApplicationContext(), _action_1.class);
        startActivity(i);
    }
}
