package com.example.jiemian;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1 = (Button) findViewById(R.id.button_1);
    Button button2 = (Button) findViewById(R.id.button_2);
    final TextView textView = (TextView) findViewById(R.id.Main_Text_1);

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1.setOnClickListener(new View.OnClickListener() {
                                       @Override
                                       public void onClick(View v) {
                                           textView.setText("I'm coming");
                                       }

                                   });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(){
                Intent button2 =new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);
            }



        }   );

    }
}