package softweb.com.crime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ProgressBar;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    long delay = 1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ProgressBar pb = (ProgressBar) findViewById(R.id.progressBar);

        Timer timer = new Timer();
        TimerTask task = new TimerTask() {
            @Override
            public void run() {

                finish();

                Intent i = new Intent(MainActivity.this,Homepage.class);
                startActivity(i);

            }
        };
        timer.schedule(task,delay);

    }
}
