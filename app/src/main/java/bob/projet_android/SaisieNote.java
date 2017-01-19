package bob.projet_android;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import bob.projet_android.Model.Note;

public class SaisieNote extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_saisie_note);

        Button boutonEnregistrer = (Button) findViewById(R.id.enregister);

        boutonEnregistrer.setOnClickListener((View v) -> {
            onEnregister();
        });
    }

    protected void onEnregister(){
        String title = ((EditText)findViewById(R.id.titre)).getText().toString();
        String texte = ((EditText)findViewById(R.id.texte)).getText().toString();
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();
        long now = System.currentTimeMillis() / 1000L;
        if(title.length() > 0 && texte.length() > 0){
            Note n = new Note(title, texte, now, now);
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            DatabaseReference notesRef = database.getReference("notes");
            notesRef.child(user.getUid()).push().setValue(n);
        }

        this.finish();
    }
}
