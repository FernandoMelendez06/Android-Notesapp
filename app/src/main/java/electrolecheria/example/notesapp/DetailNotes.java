package electrolecheria.example.notesapp;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class DetailNotes extends BaseActiviy {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String note= getIntent().getStringExtra(Constants.EXTRA_NOTE);
        setContentView(R.layout.detail_notes_activity);
        TextView btnota=findViewById(R.id.btnota);

        btnota.setText(note);
    }
}
