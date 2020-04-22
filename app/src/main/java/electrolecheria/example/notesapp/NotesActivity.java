package electrolecheria.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class NotesActivity extends BaseActiviy {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        Button btlogout= findViewById(R.id.btlogout);

        btlogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prefs.setPref(Constants.PREF_USER,false);
                Intent intent= new Intent(NotesActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }


}
