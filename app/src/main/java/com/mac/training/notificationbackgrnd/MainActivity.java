package com.mac.training.notificationbackgrnd;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onGoToSecondActivity(View view) {
        // Implicit intent
        Intent i = new Intent(this, SecondActivity.class);
        this.startActivity(i);
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this, "I'm in background (Main Activity)", Toast.LENGTH_LONG).show();
    }
}
