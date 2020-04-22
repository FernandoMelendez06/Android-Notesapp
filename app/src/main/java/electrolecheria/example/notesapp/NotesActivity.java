package electrolecheria.example.notesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

public class NotesActivity extends BaseActiviy {

    ListView ltnotes;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);


        setListViewData();
        setLoggoutEvent();

    }


    private void setListViewData(){
        ltnotes=findViewById(R.id.btlistview);

       final String[] notesList= new String[] {
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
        });
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
