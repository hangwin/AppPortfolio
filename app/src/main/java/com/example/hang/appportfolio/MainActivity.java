package com.example.hang.appportfolio;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_movie:
                Toast.makeText(this,"Popular Movies" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_bigger:
                Toast.makeText(this,"Build it bigger" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_hawk:
                Toast.makeText(this,"Stock hawk" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_material:
                Toast.makeText(this,"Make your app material" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_capstone:
                Toast.makeText(this,"Capstone" , Toast.LENGTH_SHORT).show();
                break;
            case R.id.bt_go:
                Toast.makeText(this,"Go ubiquitous" , Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
