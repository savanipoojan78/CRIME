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

public class Askquestion extends AppCompatActivity {
EditText question;
Button reg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.askquestion);
        reg=(Button)findViewById(R.id.postq);
        question=(EditText)findViewById(R.id.edque);
        reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(question.getText().toString().isEmpty())
                {
                    Toast.makeText(getApplicationContext(),"Enter The Question",Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Question is Post Sucessfully You get Your Answer immediately",Toast.LENGTH_LONG).show();
                    Intent i=new Intent(Askquestion.this,Dsshboed.class);
                    startActivity(i);
                }
            }
        });
    }
}

