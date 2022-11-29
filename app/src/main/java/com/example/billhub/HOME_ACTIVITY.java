package com.example.billhub;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.billhub.databinding.ActivityMainBinding;

public class HOME_ACTIVITY extends AppCompatActivity {
    ImageView addDoc;
    ImageView myDoc;
    ImageView printDoc;
    ImageView shareDoc;
    //
    Intent newDoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        addDoc = findViewById(R.id.addDoc);
        myDoc = findViewById(R.id.myDoc);
        printDoc = findViewById(R.id.printDoc);
        shareDoc = findViewById(R.id.shareDoc);

        addDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newDoc = new Intent(HOME_ACTIVITY.this, newDocument.class);
                startActivity(newDoc);
            }
        });
        myDoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                newDoc = new Intent(HOME_ACTIVITY.this, showActivity.class);
                startActivity(newDoc);
            }
        });
    }
}
/// ActivityMainBinding binding;

//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        binding = ActivityMainBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//        addDoc = findViewById(R.id.addDoc);
//        myDoc = findViewById(R.id.myDoc);
//        printDoc = findViewById(R.id.printDoc);
//        shareDoc = findViewById(R.id.shareDoc);
//
//        addDoc.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//                newDoc = new Intent(HOME_ACTIVITY.this,newDocument.class);
//                startActivity(newDoc);
//            }
//        });






