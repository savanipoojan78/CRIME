package softweb.com.crime;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by A on 15/09/2017.
 */

public class Dsshboed extends AppCompatActivity
{

    Button addm,arecord,most,comp,askque,sugges,view;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);

        addm = (Button) findViewById(R.id.addm);
        arecord = (Button) findViewById(R.id.arecord);
        most = (Button) findViewById(R.id.most);
        comp = (Button) findViewById(R.id.complaint);
        askque = (Button) findViewById(R.id.askque);
        sugges = (Button) findViewById(R.id.sugges);

        //view = (Button) findViewById(R.id.fileshare);
        addm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dsshboed.this,Register.class);
                startActivity(i);
            }
        });
        arecord.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dsshboed.this,Addrecord.class);
                startActivity(i);
            }
        });
        most.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dsshboed.this,Most.class);
                startActivity(i);
            }
        });

        comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dsshboed.this,Comp.class);
                startActivity(i);
            }
        });

        askque.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dsshboed.this,Askquestion.class);
                startActivity(i);
            }
        });
       /* sugges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Dsshboed.this,Register.class);
                startActivity(i);
            }
        });*/


    }
}

