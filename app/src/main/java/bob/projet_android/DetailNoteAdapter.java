package bob.projet_android;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import bob.projet_android.Model.Note;

/**
 * Created by renando on 10/01/17.
 */

public class DetailNoteAdapter extends RecyclerView.Adapter {
    private List<Note> Notes;

    public DetailNoteAdapter(List<Note> Notes){
        this.Notes=Notes;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.detail_note,parent,false);
        return new NoteViewHolder(v);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        Note b = Notes.get(position);
        System.out.println(b.getTitre());
        NoteViewHolder NoteHolder = (NoteViewHolder)holder;
        NoteHolder.titre.setText(b.getTitre());
        NoteHolder.texte.setText(b.getTexte());
    }

    @Override
    public int getItemCount() {
        return Notes.size();
    }

    public void remove(int direction) {
        Notes.remove(direction);
        this.notifyItemRemoved(direction);
    }
}
