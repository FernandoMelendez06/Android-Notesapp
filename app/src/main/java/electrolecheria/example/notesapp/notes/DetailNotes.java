package electrolecheria.example.notesapp.notes;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import electrolecheria.example.notesapp.BaseActiviy;
import electrolecheria.example.notesapp.Constants;
import electrolecheria.example.notesapp.R;

public class DetailNotes extends BaseActiviy {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String noteTittle= getIntent().getStringExtra(Constants.EXTRA_NOTE_TITTLE);
        String noteBody= getIntent().getStringExtra(Constants.EXTRA_NOTE_BODY);

        setContentView(R.layout.detail_notes_activity);
        TextView btnotaTittle=findViewById(R.id.btnotaTittle);
        TextView btnotaBody=findViewById(R.id.btnotaBody);

        btnotaTittle.setText(noteTittle);
        btnotaBody.setText(noteBody);
    }
}
