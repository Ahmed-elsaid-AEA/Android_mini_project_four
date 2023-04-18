package com.example.realestate.Activites;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.realestate.Adaptor.ItemAdaptor;
import com.example.realestate.Domain.ItemDomain;
import com.example.realestate.R;
import com.example.realestate.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    private RecyclerView.Adapter adapterPopular, adapterNew;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportActionBar().hide();
        initRecyclerView();
    }

    private void initRecyclerView() {
        ArrayList<ItemDomain> itemDomainArrayList = new ArrayList<>();
        itemDomainArrayList.add(new ItemDomain("house with greate view", "san fransescco", "jkojkl", 2, 1, 5641265, "pic1", true));
        itemDomainArrayList.add(new ItemDomain("house with greate view", "san fransescco", "jkojkl", 2, 1, 5641265, "pic1", true));
        itemDomainArrayList.add(new ItemDomain("house with greate view", "san fransescco", "jkojkl", 3, 1, 5641265, "pic1", true));
        itemDomainArrayList.add(new ItemDomain("house with greate view", "san fransescco", "jkojkl", 3, 1, 5641265, "pic1", true));
        itemDomainArrayList.add(new ItemDomain("house with greate view", "san fransescco", "jkojkl", 2, 1, 5641265, "pic1", true));
        LinearLayoutManager layoutManager=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL ,false);
        LinearLayoutManager layoutManager2=new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL ,false);
        binding.ViewPopular.setLayoutManager(layoutManager);
        binding.ViewNew.setLayoutManager(layoutManager2);
        adapterNew=new ItemAdaptor(itemDomainArrayList,getApplicationContext());
        adapterPopular=new ItemAdaptor(itemDomainArrayList,getApplicationContext());


        binding.ViewPopular.setAdapter(adapterPopular);
        binding.ViewNew.setAdapter(adapterNew);
    }
}