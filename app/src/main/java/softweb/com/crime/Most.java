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

public class Most extends AppCompatActivity {
    EditText cnumber,cname,cnickname,cage,crimetype,chowmany,cdecsription;
Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.most);
         reg=(Button)findViewById(R.id.add);
        cnumber=(EditText) findViewById(R.id.add_cnumber);
        cname=(EditText)findViewById(R.id.add_criminal_name);
        cnickname=(EditText)findViewById(R.id.add_nickname);
        cage=(EditText)findViewById(R.id.add_age);
        crimetype=(EditText)findViewById(R.id.add_crime_type);
        chowmany=(EditText)findViewById(R.id.add_how_many);
        cdecsription=(EditText)findViewById(R.id.add_decsription);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(cnumber.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the criminal Number",Toast.LENGTH_SHORT).show();
                }
                else if(cname.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the criminal Name",Toast.LENGTH_SHORT).show();
                }
                else if(cage.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the criminal Age",Toast.LENGTH_SHORT).show();
                }
                else if(crimetype.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter the Crime Type",Toast.LENGTH_SHORT).show();
                }
                else if(chowmany.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter How many times have the crime is done",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Add the Criminal data Succesfully",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(Most.this,Dsshboed.class);
                    startActivity(i);
                }
            }
        });
    }
}