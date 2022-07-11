package com.musk.il2cppdumper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.musk.il2cppdumper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    // Used to load the 'il2cppdumper' library on application startup.
    static {
        System.loadLibrary("il2cppdumper");
    }

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Example of a call to a native method
        TextView tv = binding.sampleText;
        tv.setText(stringFromJNI());
    }

    /**
     * A native method that is implemented by the 'il2cppdumper' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}