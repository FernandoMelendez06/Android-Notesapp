package electrolecheria.example.notesapp;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends BaseActiviy {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);

        runsplash();

    }

    private void runsplash() {

        final Runnable splash = new Runnable() {
            @Override
            public void run() {

               boolean userlogged= prefs.getPref(Constants.PREF_USER);

               Intent intent;
               if (userlogged){

                   intent = new Intent(SplashActivity.this,NotesActivity.class);
               }else{
                   intent = new Intent(SplashActivity.this,LoginActivity.class);

               }

                startActivity(intent);
                finish();
            }
        };

        TimerTask task = new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(splash);
            }
        };
        Timer timer = new Timer();
        timer.schedule(task,2000);
    }
    }

