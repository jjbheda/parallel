package com.gordon.rawe.father;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class FatherHomeActivity extends Activity implements View.OnClickListener {
    private TextView son_tv,daughter_tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_father_home_activity);
        son_tv = (TextView) findViewById(R.id.son);
        daughter_tv = (TextView) findViewById(R.id.daughter);
        son_tv.setOnClickListener(this);
        daughter_tv.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.son){
            try {
                startActivity(new Intent(this,Class.forName("com.gordon.rawe.son.SonHomeActivity")));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        } else if (v.getId() ==R.id.daughter){
            try {
                startActivity(new Intent(this,Class.forName("com.gordon.rawe.daughter.DaughterHomeActivity")));
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }
}
