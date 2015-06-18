package com.example.ivani_000.switchscreen;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by ivani_000 on 6/18/2015.
 */
public class SecondScreen extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_layout);

        Intent activitythatCalled = getIntent();

        String previousActivity = activitythatCalled.getExtras().getString("callingActivity");

        TextView callActivitymsg = (TextView) findViewById(R.id.calling_activity_info_text);

        callActivitymsg.append(" " + previousActivity);
    }
}
