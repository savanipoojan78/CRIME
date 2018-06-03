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

public class Register2 extends AppCompatActivity {


    EditText name,fcode,dept,email,pwd,contact,address;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register2);


        name = (EditText) findViewById(R.id.edname);
        fcode = (EditText) findViewById(R.id.edfaculty);
       // dept = (EditText) findViewById(R.id.eddept);
        email = (EditText) findViewById(R.id.add_mail);

       // pwd = (EditText) findViewById(R.id.edpwd);
        contact = (EditText) findViewById(R.id.edcontact);
        address = (EditText) findViewById(R.id.edadd);

        Button btn = (Button) findViewById(R.id.btnregister);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(name.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please enter name",Toast.LENGTH_LONG).show();
                }
                else if(fcode.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please enter Occupation",Toast.LENGTH_LONG).show();
                }

                else if(contact.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please enter Contact Number",Toast.LENGTH_LONG).show();
                }
                else if(address.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Please enter The Address",Toast.LENGTH_LONG).show();
                }
                else
                {
                    Intent i = new Intent(Register2.this,Homepage.class);
                    startActivity(i);
                    Toast.makeText(getApplicationContext(),"Register Sucessfully ",Toast.LENGTH_LONG).show();

                }

            }
        });
    }
}

