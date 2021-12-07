package simple.example.biodataseventeen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import simple.example.biodataseventeen.model.Seventeen;

public class ProfilActivity extends AppCompatActivity{

    Seventeen seventeen;
    TextView txJudul,txUnit,txNama_panggung,txNama_asli,txLahir,txPosisi,txInstagram;
    ImageView ivFotoSeventeen;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil_seventeen);
        Intent intent = getIntent();
        seventeen = (Seventeen) intent.getSerializableExtra(DaftarSeventeenActivity.SEVENTEEN_TERPILIH);
        inisialisasiView();
        tampilkanProfil(seventeen);
    }
    private void inisialisasiView(){
        txJudul = findViewById(R.id.txJudul);
        txUnit = findViewById(R.id.txUnit);
        txNama_panggung = findViewById(R.id.txNama_panggung);
        txNama_asli = findViewById(R.id.txNama_asli);
        txLahir = findViewById(R.id.txLahir);
        txPosisi = findViewById(R.id.txPosisi);
        txInstagram = findViewById(R.id.txInstagram);
        ivFotoSeventeen = findViewById(R.id.gambarSeventeen);
    }
    private void tampilkanProfil(Seventeen seventeen){
        Log.d("Profil","Menampilkan "+seventeen.getUnit());
        txJudul.setText(seventeen.getNama_panggung());
        txUnit.setText(seventeen.getUnit());
        txNama_panggung.setText(seventeen.getNama_panggung());
        txNama_asli.setText(seventeen.getNama_asli());
        txLahir.setText(seventeen.getLahir());
        txPosisi.setText(seventeen.getPosisi());
        txInstagram.setText(seventeen.getInstagram());
        ivFotoSeventeen.setImageDrawable(this.getDrawable(seventeen.getDrawbleRes()));
    }
}

