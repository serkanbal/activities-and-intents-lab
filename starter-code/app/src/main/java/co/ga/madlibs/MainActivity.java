package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static co.ga.madlibs.R.id.animals;
import static co.ga.madlibs.R.id.game;
import static co.ga.madlibs.R.id.noun1;
import static co.ga.madlibs.R.id.noun2;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private EditText mAdjective1;
    private EditText mAdjective2;
    private EditText mNoun1;
    private EditText mNoun2;
    private EditText mAnimals;
    private EditText mGame;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mAdjective1 = (EditText) findViewById(R.id.adjective1);
        mAdjective2 = (EditText) findViewById(R.id.adjective2);
        mNoun1 = (EditText) findViewById(noun1);
        mNoun2 = (EditText) findViewById(noun2);
        mAnimals = (EditText) findViewById(animals);
        mGame = (EditText) findViewById(game);
        mButton = (Button) findViewById(R.id.buttonsurprise);

        mButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, ResultActivity.class);

        EditText adj1 = (EditText) findViewById(R.id.adjective1);
        String adj1input = adj1.getText().toString();
        if (adj1input.isEmpty()) {
            adj1.setError("Please fill");
        }
        EditText adj2 = (EditText) findViewById(R.id.adjective2);
        String adj2input = adj2.getText().toString();
        if (adj2input.isEmpty()) {
            adj2.setError("Please fill");
        }
        EditText noun1 = (EditText) findViewById(R.id.noun1);
        String noun1input = noun1.getText().toString();
        if (noun1input.isEmpty()) {
            noun1.setError("Please fill");
        }
        EditText noun2 = (EditText) findViewById(R.id.noun2);
        String noun2input = noun2.getText().toString();
        if (noun2input.isEmpty()) {
            noun2.setError("Please fill");
        }
        EditText animals = (EditText) findViewById(R.id.animals);
        String animalsinput = animals.getText().toString();
        if (animalsinput.isEmpty()) {
            animals.setError("Please fill");
        }
        EditText game = (EditText) findViewById(R.id.game);
        String gameinput = game.getText().toString();
        if (gameinput.isEmpty()) {
            game.setError("Please fill");
        }

        intent.putExtra("ADJ1", adj1input);
        intent.putExtra("ADJ2", adj2input);
        intent.putExtra("NOUN1", noun1input);
        intent.putExtra("NOUN2", noun2input);
        intent.putExtra("ANIMALS", animalsinput);
        intent.putExtra("GAME", gameinput);
        if (!adj1input.isEmpty() && !adj2input.isEmpty() && !noun1input.isEmpty() &&
                !noun2input.isEmpty() && !animalsinput.isEmpty() && !gameinput.isEmpty()) {
            startActivity(intent);
        }
    }
}