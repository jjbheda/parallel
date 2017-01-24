package com.gordon.rawe.daughter;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class DaughterHomeActivity extends Activity  implements View.OnClickListener{
    private TextView daughter_sub_tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.daughter);
        daughter_sub_tv = (TextView) findViewById(R.id.daughter_sub_tv);
        daughter_sub_tv.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.daughter_sub_tv){
            try {
                startActivity(new Intent(this, Class.forName("com.gordon.rawe.flat.FlatHomeActivity")));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
