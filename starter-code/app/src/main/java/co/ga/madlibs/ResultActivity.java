package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by james on 12/7/15.
 */
public class ResultActivity extends AppCompatActivity {
    private Button mBackButton;
    private TextView mText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();
        String adj1 = intent.getStringExtra("ADJ1");
        String adj2 = intent.getStringExtra("ADJ2");
        String noun1 = intent.getStringExtra("NOUN1");
        String noun2 = intent.getStringExtra("NOUN2");
        String animals = intent.getStringExtra("ANIMALS");
        String game = intent.getStringExtra("GAME");

        mBackButton = (Button) findViewById(R.id.back_button);
        mText = (TextView) findViewById(R.id.result_textview);

        mText.setText("A vacation is when you take a trip to a " + adj1 + " place with your " +
        adj2 + " family. Usually you go to a place that is near " + noun1 + " or up on a " +
        noun2 + ". A good vacation place is where you can ride " + animals + " or play " +
        game + ".");

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}