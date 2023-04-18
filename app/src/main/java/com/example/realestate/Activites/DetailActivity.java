package com.example.realestate.Activites;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.realestate.Domain.ItemDomain;
import com.example.realestate.R;
import com.example.realestate.databinding.ActivityDetailBinding;
import com.example.realestate.databinding.ActivityIntroBinding;

public class DetailActivity extends AppCompatActivity {
    ActivityDetailBinding binding;
    private ItemDomain item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetailBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        setvariable();
    }

    private void setvariable() {
        item = (ItemDomain) getIntent().getSerializableExtra("object");
        binding.titletxt.setText(item.getTitle());
    }


}