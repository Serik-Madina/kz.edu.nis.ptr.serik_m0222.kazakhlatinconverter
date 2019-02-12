package kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MyWords extends AppCompatActivity {

    TextView textViewWords;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.layout.activity_my_words);

        textViewWords = (TextView) findViewById(kz.edu.nis.ptr.serik_m0222.kazakhlatinconverter.R.id.textViewWords);
        textViewWords.setText(Dictionary.getWordsAsString(this));

    }
}
