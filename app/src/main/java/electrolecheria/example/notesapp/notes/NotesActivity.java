package electrolecheria.example.notesapp.notes;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

import electrolecheria.example.notesapp.BaseActiviy;
import electrolecheria.example.notesapp.Constants;
import electrolecheria.example.notesapp.LoginActivity;
import electrolecheria.example.notesapp.R;
import electrolecheria.example.notesapp.notes.model.Note;

public class NotesActivity extends BaseActiviy {
  RecyclerView rvnotes;
  ArrayList<Note> noteList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


        setRecyclerViewData();
        setLoggoutEvent();

    }

    private void populateNoteList(){
       noteList =new ArrayList<>();
       //Note note = new Note("Pasear perro", "Hace mucho que no sale");
       noteList.add( new Note("Pasear perro", "Hace mucho que no sale"));
        noteList.add( new Note("Pasear gato", "Nunca sale"));
        noteList.add( new Note("Alimentar perro", "no come"));
        noteList.add( new Note("Alimentar Loro", "Hace mucho que no habla"));
    }




    private void setRecyclerViewData(){
       rvnotes=findViewById(R.id.rvnotes);
        populateNoteList();
       notesAdapter adapter= new notesAdapter(noteList,NotesActivity.this); //maneja la informacion de la lista

       rvnotes.setAdapter(adapter);

       rvnotes.setHasFixedSize(true); // mejora el manejo de la memoria

       RecyclerView.LayoutManager manager = new LinearLayoutManager(NotesActivity.this);

       rvnotes.setLayoutManager(manager); // maneja como se maneja la presentacion?




      /* final String[] notesList= new String[] {
               "Notes1","Notes2","Notes3"

       };

        ArrayAdapter<String> adapter= new ArrayAdapter<String>(NotesActivity.this, android.R.layout.simple_list_item_1,notesList);
        ltnotes.setAdapter(adapter);

        ltnotes.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(NotesActivity.this,DetailNotes.class);
                intent.putExtra(Constants.EXTRA_NOTE,notesList[position]);
                startActivity(intent);
            }
        });*/
    }
    private void setLoggoutEvent(){
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
