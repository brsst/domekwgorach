package com.example.domekwgorach;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int likes = 0;
    private TextView likesCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        likesCounter = findViewById(R.id.likes_counter);
        Button likeButton = findViewById(R.id.button_like);
        Button unlikeButton = findViewById(R.id.button_unlike);


        likeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                likes++;
                updateLikesCounter();
            }
        });

        unlikeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (likes > 0) {
                    likes--;
                    updateLikesCounter();
                }
            }
        });
    }

    private void updateLikesCounter() {
        likesCounter.setText(likes + " polubień");
    }
}