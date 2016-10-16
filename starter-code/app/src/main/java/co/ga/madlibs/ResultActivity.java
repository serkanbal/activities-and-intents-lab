package co.ga.madlibs;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Html;
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


        mText.setText(Html.fromHtml("A vacation is when you take a trip to a " +
                "<b><font color='#0037ff'>" +adj1 + "</font></b>" + " place with your " +
                "<b><font color='#0037ff'>"+ adj2 +"</font></b>"+ " family. " +
                "Usually you go to a place that is near " +
                "<b><font color='#08b916'>" +noun1 +"</font></b>" + " or up on a "
                + "<b><font color='#08b916'>" +noun2 + "</font></b>"+
                ". A good vacation place is where you can ride " +
                "<b><font color='#5e0fa9'>" +animals +"</font></b>"+" or play " +
                "<b><font color='#b3b605'>" +game +"</font></b>"+ "."));

        mBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}