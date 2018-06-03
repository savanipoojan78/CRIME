package softweb.com.crime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DELL on 5/12/2018.
 */

public class Comp extends AppCompatActivity {
    Spinner sp;
Button sub;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.complaint);
        sp = findViewById(R.id.spcrime);
        sub=(Button)findViewById(R.id.button);


        List<String> list = new ArrayList<String>();
        list.add("Select a crime");
        list.add("Arson");
        list.add("Harassment");
        list.add("Burglary");
        list.add("Busines cime");
        list.add("Cyber crime");
        list.add("Drink driving");
        list.add("Froud and forgery");
        list.add("Murder");
        ArrayAdapter<String> dataAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, list);
        dataAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sp.setAdapter(dataAdapter);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Complaint Register Successfully",Toast.LENGTH_SHORT).show();
                Intent i=new Intent(Comp.this,Dsshboed.class);
                startActivity(i);
            }
        });

    }}