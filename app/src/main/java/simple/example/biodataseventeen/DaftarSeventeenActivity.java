package simple.example.biodataseventeen;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.List;

import simple.example.biodataseventeen.model.Seventeen;

public class DaftarSeventeenActivity extends AppCompatActivity {
    public final static String SEVENTEEN_TERPILIH ="seventeen_obj_key";
    List<Seventeen> seventeens;
    ListView listView;
    String unitSeventeen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_seventeen);
        Intent intent = getIntent();
        unitSeventeen = intent.getStringExtra(MainActivity.JENIS_GALERI_KEY);
        TextView txJudul = findViewById(R.id.text_title_daftar);
        txJudul.setText("DAFTAR ANGGOTA SEVENTEEN"+unitSeventeen.toUpperCase());
        seventeens = DataProvider.getSeventeensByTpe(this,unitSeventeen);
        setupListView();
    }

    private void setupListView(){
        listView = findViewById(R.id.listview_anggota_seventeen);
        DaftarSeventeenAdapter adapter = new DaftarSeventeenAdapter(this,seventeens);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(onListClik);
    }

    private AdapterView.OnItemClickListener onListClik = new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
            Seventeen terpilih = seventeens.get(position);
            bukaProfilSeventeen(terpilih);
        }

    };

    private void bukaProfilSeventeen(Seventeen seventeenTerpilih){
        Log.d("MAIN","Buka activity galeri");
        Intent intent = new Intent(this, ProfilActivity.class);
        intent.putExtra(SEVENTEEN_TERPILIH, seventeenTerpilih);
        startActivity(intent);
    }
}