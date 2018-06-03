package softweb.com.crime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by A on 15/09/2017.
 */

public class Register extends AppCompatActivity {

    EditText name,id,post,email,area,contact,address;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);
        name = (EditText) findViewById(R.id.add_name);
        id = (EditText) findViewById(R.id.add_id);
        address = (EditText) findViewById(R.id.add_address);
        post = (EditText) findViewById(R.id.add_post);

        email = (EditText) findViewById(R.id.add_mail);
        contact = (EditText) findViewById(R.id.add_contact);
        area = (EditText) findViewById(R.id.add_work);



        Button btn = (Button) findViewById(R.id.btnregister);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(id.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Member id",Toast.LENGTH_SHORT).show();
                }
                else if(name.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Name",Toast.LENGTH_SHORT).show();
                }
                else if(post.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Post",Toast.LENGTH_SHORT).show();
                }
                else if(area.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Your allocated area",Toast.LENGTH_SHORT).show();
                }
                else if(email.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Email",Toast.LENGTH_SHORT).show();
                }
                else if(contact.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter contact Number",Toast.LENGTH_SHORT).show();
                }
                else if(address.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please Enter Address",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Member Added Sucessfully",Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(Register.this,Dsshboed.class);
                    startActivity(i);
                }

            }
        });
    }
}

