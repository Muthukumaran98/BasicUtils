package in.bracecoder.basicutils;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import in.bracecoder.logutils.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        LogDebug.d("Muthu");
    }
}