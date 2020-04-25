package electrolecheria.example.notesapp.notes;


import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import electrolecheria.example.notesapp.Constants;
import electrolecheria.example.notesapp.notes.model.Note;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import electrolecheria.example.notesapp.R;

public class notesAdapter extends RecyclerView.Adapter<notesViewHolder> {
   public ArrayList<Note> noteList;
    public Context ctx;

    public notesAdapter(ArrayList<Note> noteList, Context ctx) {
        this.noteList = noteList;
        this.ctx = ctx;
    }

    @NonNull
    @Override
    public notesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_notes, parent, false);
        return new notesViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull notesViewHolder holder, final int i) {
       holder.tvNotestitle.setText(noteList.get(i).getTittle());
        holder.tvNotesbody.setText(noteList.get(i).getBody());

        holder.llNotescontainer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent= new Intent(ctx,DetailNotes.class);
            intent.putExtra(Constants.EXTRA_NOTE_TITTLE,noteList.get(i).getTittle());
            intent.putExtra(Constants.EXTRA_NOTE_BODY,noteList.get(i).getTittle());
            ctx.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return noteList.size();
    }
}
