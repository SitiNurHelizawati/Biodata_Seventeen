package simple.example.biodataseventeen;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton btnPerformance, btnRap, btnVocal;
    public static  final String JENIS_GALERI_KEY = "JENIS_GALERI";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inisialisasiView();

    }

    private void inisialisasiView() {
        btnPerformance = findViewById(R.id.btn_buka_performance);
        btnRap = findViewById(R.id.btn_buka_rap);
        btnVocal = findViewById(R.id.btn_buka_vocal);
        btnPerformance.setOnClickListener(view -> bukaGaleri("Performance"));
        btnRap.setOnClickListener(view -> bukaGaleri("Rap"));
        btnVocal.setOnClickListener(view -> bukaGaleri("Vocal"));
    }


    private void bukaGaleri(String unitSeventeen){
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, DaftarSeventeenActivity.class);
        intent.putExtra(JENIS_GALERI_KEY, unitSeventeen);
        startActivity(intent);
    }


}