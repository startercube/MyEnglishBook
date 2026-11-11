package com.jjun.myenglishbook;

import static android.speech.tts.TextToSpeech.ERROR;

import android.content.Intent;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import java.util.Locale;

public class Colors2 extends AppCompatActivity {
    private Intent intent;
    private Toolbar toolbarA;
    private TextView a;
    private TextToSpeech tts;
    private EditText editText;
    private Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors_2);
        toolbarA = findViewById(R.id.toolbar_colors);
        a = findViewById(R.id.colors2);

        setSupportActionBar(toolbarA);
        getSupportActionBar().setTitle("색 (Colors)");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        intent = getIntent();
        intent.getStringExtra("a");
        editText = (EditText) findViewById(R.id.editText);
        button01 = (Button) findViewById(R.id.button01);




        tts = new TextToSpeech(this, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if(status != ERROR) {

                    tts.setLanguage(Locale.US);
                }
            }
        });
        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tts.setSpeechRate(0.8f);
                tts.speak(editText.getText().toString(),TextToSpeech.QUEUE_FLUSH, null);
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(tts != null){
            tts.stop();
            tts.shutdown();
            tts = null;
        }


    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == android.R.id.home) {
            this.finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
