package com.example.gamedetall; // Ensure this is the correct package name

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class DetailGameActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_game); // Make sure this layout exists

        // Find views by ID
        ImageView gameImage = findViewById(R.id.detail_game_image);
        TextView gameTitle = findViewById(R.id.detail_game_title);
        TextView gameDescription = findViewById(R.id.detail_game_description);

        // Get data passed from MainActivity
        Intent intent = getIntent();
        String gameName = intent.getStringExtra("gameTitle"); // Use key matching the one from MainActivity
        String gameDesc = intent.getStringExtra("gameDescription");
        int gameImageRes = intent.getIntExtra("gameImage", 0); // Image resource ID

        // Set the values in the views
        gameTitle.setText(gameName);
        gameDescription.setText(gameDesc);
        gameImage.setImageResource(gameImageRes);
    }
}
