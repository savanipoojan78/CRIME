package softweb.com.crime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by DELL on 5/12/2018.
 */

public class Addrecord extends AppCompatActivity {
    EditText cnumber,cname,cnickname,cage,coccuption,crimetype,caddress;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.addrecord);
        reg=(Button)findViewById(R.id.btnregister);
        cnumber=(EditText)findViewById(R.id.add_criminal_no);
        cname=(EditText)findViewById(R.id.add_criminal_name);
        cnickname=(EditText)findViewById(R.id.add_nickname);
        cage=(EditText)findViewById(R.id.add_age);
        coccuption=(EditText)findViewById(R.id.add_occuption);
        crimetype=(EditText)findViewById(R.id.add_crime_type);
        caddress=(EditText)findViewById(R.id.add_address);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cnumber.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Criminal Number",Toast.LENGTH_SHORT).show();
                }
                else if(cname.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Criminal Name",Toast.LENGTH_SHORT).show();
                }
                else if(cage.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Criminal age",Toast.LENGTH_SHORT).show();
                }
                else if(coccuption.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Criminal Occupation",Toast.LENGTH_SHORT).show();
                }
                else if(crimetype.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Crime Type",Toast.LENGTH_SHORT).show();
                }
                else if(caddress.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Criminal last Known address",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Add the Criminal data Succesfully",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Addrecord.this,Dsshboed.class);
                    startActivity(i);
                }
            }
        });


    }}
