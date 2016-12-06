package com.mobserve.weew.weew;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class entry extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            public void run() {
                entry.this.startActivity(new Intent(entry.this, LoginActivity.class));
                entry.this.finish();
            }
        }, 2000);
    }
}