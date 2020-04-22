package electrolecheria.example.notesapp;

import android.os.Bundle;
import android.widget.EditText;

import androidx.annotation.Nullable;

public class DetailNotes extends BaseActiviy {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String note= getIntent().getStringExtra(Constants.EXTRA_NOTE);
        setContentView(R.layout.detail_notes_activity);
        EditText btnota=findViewById(R.id.btnota);

        btnota.setText(note);
    }
}
