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

public class Colors1 extends AppCompatActivity {
    private Intent intent;
    private Toolbar toolbarColors1;
    private TextView colors1;
    private TextToSpeech tts;
    private EditText editText;
    private Button button01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.colors_1);
        toolbarColors1 = findViewById(R.id.toolbar_colors);
        colors1 = findViewById(R.id.colors1);

        setSupportActionBar(toolbarColors1);
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
