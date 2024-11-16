package com.example.gamedetall;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Ensure activity_main.xml is set up properly

        // Handle click on Mobile Legends
        LinearLayout mobileLegendsLayout = findViewById(R.id.mobile_legends_layout); // Check if ID matches in XML
        mobileLegendsLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity("Mobile Legends",
                        "Mobile Legends: Mobile Legends adalah sebuah game MOBA (Multiplayer Online Battle Arena) yang sangat populer di Indonesia. Dalam game ini, pemain bertempur dalam tim untuk menghancurkan markas musuh sambil mempertahankan markas mereka sendiri. Setiap pemain memilih hero dengan kemampuan unik untuk bertarung. Game ini bisa dijadikan salah satu bagian dari Dekripsi Game karena keseruannya yang melibatkan strategi tim, pemilihan hero yang tepat, dan koordinasi dalam pertarungan. Kamu bisa membuat bagian aplikasi yang menjelaskan tentang hero-hero dalam Mobile Legends, cara bermain, atau bahkan tips dan trik untuk pemula.",
                        R.drawable.mobile_legends);
            }
        });

        // Handle click on Wukong
        LinearLayout wukongLayout = findViewById(R.id.wukong_layout); // Check if ID matches in XML
        wukongLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity("Wukong",
                        "Wukong Black Myth: Black Myth: Wukong adalah game aksi petualangan yang terinspirasi dari cerita legendaris Journey to the West, di mana karakter utama, Wukong, adalah seekor monyet sakti. Game ini menggunakan elemen mitologi Tiongkok yang sangat kaya dan visual yang sangat memukau, dengan Wukong berjuang melawan musuh dalam dunia yang penuh tantangan. Dalam game ini, pemain akan mengendalikan Wukong dalam perjalanan epik melawan musuh-musuhnya sambil menggunakan berbagai kemampuan khusus. Untuk bagian Dekripsi Game, kamu bisa menjelaskan latar belakang karakter Wukong, kemampuan unik yang dimiliki, serta elemen-elemen menarik dari game ini seperti grafik, alur cerita, dan tantangan yang ada.",
                        R.drawable.wukong);
            }
        });

        // Handle click on Chained Together
        LinearLayout chainedTogetherLayout = findViewById(R.id.chained_together_layout); // Check if ID matches in XML
        chainedTogetherLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity("Chained Together",
                        "Chained Together: Chained Together adalah game yang menggabungkan elemen puzzle dan aksi. Pemain diharuskan untuk memecahkan teka-teki dengan mengendalikan karakter yang saling terikat dalam rantai. Game ini menguji keterampilan berpikir dan koordinasi, karena karakter-karakter yang saling terikat harus bergerak secara bersamaan untuk menyelesaikan tantangan yang ada. Kamu bisa membuat aplikasi Dekripsi Game yang menjelaskan cara bermain, tips dan trik untuk memecahkan teka-teki, serta menampilkan mekanisme gameplay yang unik ini.",
                        R.drawable.chained_together);
            }
        });
    }

    // Function to open DetailActivity
    private void openDetailActivity(String title, String description, int imageResId) {
        Intent intent = new Intent(MainActivity.this, DetailGameActivity.class);
        intent.putExtra("gameTitle", title); // Passing title to DetailGameActivity
        intent.putExtra("gameDescription", description); // Passing description to DetailGameActivity
        intent.putExtra("gameImage", imageResId); // Passing image resource to DetailGameActivity
        startActivity(intent); // Starting the activity
    }
}
