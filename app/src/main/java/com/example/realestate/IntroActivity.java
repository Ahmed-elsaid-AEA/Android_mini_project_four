package com.example.realestate;

import androidx.appcompat.app.AppCompatActivity;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.realestate.Activites.MainActivity;
import com.example.realestate.databinding.ActivityIntroBinding;

public class IntroActivity extends AppCompatActivity {
ActivityIntroBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityIntroBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        initview();
    }

    private void initview() {
        binding.btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{Intent intent=new Intent(IntroActivity.this, MainActivity.class);
                startActivity(intent);}catch (Exception ex){
                    Toast.makeText(IntroActivity.this, ex.toString(), Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}