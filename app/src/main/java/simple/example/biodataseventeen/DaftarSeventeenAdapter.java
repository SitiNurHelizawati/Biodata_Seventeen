package simple.example.biodataseventeen;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;


import java.util.List;

import simple.example.biodataseventeen.model.Seventeen;

public class DaftarSeventeenAdapter extends ArrayAdapter<Seventeen> {
    Context context;
    public DaftarSeventeenAdapter(Context context, List<Seventeen> seventeens){
        super(context, R.layout.row_daftar_seventeen, seventeens);
        this.context = context;
    }

    private static class ViewHolder{
        TextView textUnit;
        TextView textPosisi;
        ImageView gambar;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Seventeen seventeen = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null){
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_seventeen, parent, false);
            viewHolder.textUnit = convertView.findViewById(R.id.row_text_unit);
            viewHolder.textPosisi = convertView.findViewById(R.id.row_text_posisi);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_seventeen);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }
        viewHolder.textUnit.setText(seventeen.getNama_panggung());
        viewHolder.textPosisi.setText(seventeen.getPosisi());
        viewHolder.gambar.setImageDrawable(context.getDrawable(seventeen.getDrawbleRes()));
        return convertView;
    }

}