package com.example.dongja94.sampletabhost;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.TextView;

/**
 * Created by dongja94 on 2016-01-26.
 */
public class TabView extends FrameLayout {
    public TabView(Context context) {
        super(context);
        init();
    }

    TextView titleView;
    private void init() {
        inflate(getContext(), R.layout.tab_view, this);
        titleView = (TextView)findViewById(R.id.text_title);
    }

    public void setTitle(String title) {
        titleView.setText(title);
    }


}
