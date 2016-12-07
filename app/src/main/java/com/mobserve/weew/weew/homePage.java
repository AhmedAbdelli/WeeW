package com.mobserve.weew.weew;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TabHost;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_home_page);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        TabHost host = (TabHost)findViewById(R.id.tabHostHome);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Events");
        spec.setContent(R.id.Events);
        spec.setIndicator("Events");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Create");
        spec.setContent(R.id.Create);
        spec.setIndicator("Create");
        host.addTab(spec);

        //Tab 3
        spec = host.newTabSpec("Map");
        spec.setContent(R.id.Map);
        spec.setIndicator("Map");
        host.addTab(spec);
/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        */
    }

}
