package bob.projet_android;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/**
 * Created by renando on 10/01/17.
 */
public class NoteViewHolder extends RecyclerView.ViewHolder{

TextView titre, texte;

    public NoteViewHolder(View iteView){
        super(iteView);
        titre=(TextView) itemView.findViewById(R.id.titre_note);
        texte=(TextView) itemView.findViewById(R.id.texte_note);
    }

}
