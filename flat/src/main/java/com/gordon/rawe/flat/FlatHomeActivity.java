package com.gordon.rawe.flat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FlatHomeActivity  extends Activity {
    TextView flat_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flat);
        flat_tv = (TextView) findViewById(R.id.flat_tv);
        flat_tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    startActivity(new Intent(FlatHomeActivity.this, Class.forName("com.gordon.rawe.parallel.HomeActivity")));
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
