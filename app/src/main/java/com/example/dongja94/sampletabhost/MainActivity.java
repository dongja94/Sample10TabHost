package com.example.dongja94.sampletabhost;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TabHost;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TabHost tabHost;

    private static final String TAB_TAB1 = "tab1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabHost = (TabHost)findViewById(R.id.tabHost);
        tabHost.setup();

        TabHost.TabSpec spec = tabHost.newTabSpec("tab1");
        TabView tabView = new TabView(this);
        tabView.setTitle("TAB 1");
        spec.setIndicator(tabView);
//        spec.setIndicator("TAB 1");
        spec.setContent(R.id.tab1);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab2");
        tabView = new TabView(this);
        tabView.setTitle("TAB 2");
        spec.setIndicator(tabView);
//        spec.setIndicator("TAB 2");
        spec.setContent(R.id.tab2);
        tabHost.addTab(spec);

        spec = tabHost.newTabSpec("tab3");
        tabView = new TabView(this);
        tabView.setTitle("TAB 3");
        spec.setIndicator(tabView);
//        spec.setIndicator("TAB 3");
        spec.setContent(R.id.tab3);
        tabHost.addTab(spec);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {
                Toast.makeText(MainActivity.this, "selected : " + tabId, Toast.LENGTH_SHORT).show();
            }
        });

        tabHost.setCurrentTabByTag("tab2");

    }
}
