package com.techpalle.b34_passingobjects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MyApplication m = (MyApplication) getApplicationContext();

        tv = (TextView) findViewById(R.id.textView1);
        //NOW FIRST GET INTENT
        Intent intent = getIntent();
        //GET BUNDLE
        Bundle bundle = intent.getBundleExtra("myobject");
        //NOW GET SERIALIZABLE OBJECT
        Student s = (Student) bundle.getSerializable("stud");
        //NOW WE CAN READ STUDENT VALUES AND APPLY ON TEXTIVEW
        tv.setText(s.sno+"\n"+s.sname+"\n"+s.scourse);
    }
}
