package softweb.com.crime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by A on 15/09/2017.
 */

public class Homepage extends AppCompatActivity {

    EditText name ,pwd;
    TextView tv;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepagee);

        name = (EditText) findViewById(R.id.add_mail);
        pwd = (EditText) findViewById(R.id.edpwd);

        tv = (TextView) findViewById(R.id.textView3);

        submit = (Button) findViewById(R.id.loginbtn);
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(Homepage.this,Register2.class);
                startActivity(i);
            }
        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               // if(name.getText().toString().equals("kapil272@gmail.com") && pwd.getText().toString().equals("kapil272")) {

                   Intent i = new Intent(Homepage.this, Dsshboed.class);
                    startActivity(i);

                //}
              //  else
                //{
                  //  Toast.makeText(getApplicationContext(),"Please enter valid emailId and Password",Toast.LENGTH_LONG).show();
                //}
            }
        });
    }

}

