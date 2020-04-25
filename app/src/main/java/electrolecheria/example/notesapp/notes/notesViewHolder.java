package electrolecheria.example.notesapp.notes;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import electrolecheria.example.notesapp.R;

public class notesViewHolder extends RecyclerView.ViewHolder {

    LinearLayout llNotescontainer ;
    TextView tvNotestitle,tvNotesbody;

    public notesViewHolder(@NonNull View v) {
        super(v);
        llNotescontainer = v.findViewById(R.id.llNotescontainer);
        tvNotestitle = v.findViewById(R.id.tvNotestitle);
        tvNotesbody = v.findViewById(R.id.tvNotesbody);
}
}
