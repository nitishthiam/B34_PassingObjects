package com.techpalle.b34_passingobjects;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText et1, et2, et3;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MyApplication m = (MyApplication) getApplicationContext();


        et1 = (EditText) findViewById(R.id.editText1);
        et2 = (EditText) findViewById(R.id.editText2);
        et3 = (EditText) findViewById(R.id.editText3);
        b = (Button) findViewById(R.id.button1);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //PASS STUDENT OBJECT TO NEXT ACTIVITY
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                //NOW PERPARE OBJECT
                Student s = new Student();
                //FILL DATA INTO OBJECT
                s.sno = Integer.parseInt(et1.getText().toString());
                s.sname = et2.getText().toString();
                s.scourse = et3.getText().toString();
                //NOW USE PUT SERIALIZABLE METHOD
                Bundle bundle = new Bundle();
                bundle.putSerializable("stud", s);
                //PASS BUNDLE TO INTENT
                intent.putExtra("myobject", bundle);

                //THEN START ACTIVITY
                startActivity(intent);
            }
        });
    }
}
