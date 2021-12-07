package simple.example.biodataseventeen.model;

import java.io.Serializable;

public class Seventeen implements Serializable {
    private String unit;
    private String nama_panggung;
    private String nama_asli;
    private String lahir;
    private String posisi;
    private String instagram;
    private int drawbleRes;

    public Seventeen (String unit,String nama_panggung, String nama_asli,String lahir, String posisi, String instagram, int drawbleRes){
        this.unit = unit;
        this.nama_panggung = nama_panggung;
        this.nama_asli = nama_asli;
        this.lahir = lahir;
        this.posisi = posisi;
        this.instagram = instagram;
        this.drawbleRes = drawbleRes;
    }
    public String getUnit(){ return  unit; }
    public void setUnit(String unit){ this.unit = unit; }
    public String getNama_panggung(){ return nama_panggung; }
    public void setNama_panggung(String nama_panggung){ this.nama_panggung = nama_panggung; }
    public String getNama_asli(){ return nama_asli; }
    public void setNama_asli(String nama_asli){ this.nama_asli = nama_asli; }
    public String getLahir(){ return lahir; }
    public void setLahir(String lahir){ this.lahir = lahir; }
    public String getPosisi(){ return posisi; }
    public void setPosisi(String lahir){ this.posisi = posisi; }
    public String getInstagram(){ return instagram; }
    public void setInstagram(String instagram){ this.instagram = instagram; }
    public int getDrawbleRes(){ return drawbleRes; }
    public void setDrawbleRes(int drawbleRes){ this.drawbleRes =drawbleRes; }
}
