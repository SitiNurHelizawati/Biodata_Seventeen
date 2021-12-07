package simple.example.biodataseventeen;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import simple.example.biodataseventeen.model.Performance;
import simple.example.biodataseventeen.model.Rap;
import simple.example.biodataseventeen.model.Seventeen;
import simple.example.biodataseventeen.model.Vocal;

public class DataProvider {
    public static List<Seventeen> seventeens = new ArrayList<>();

    private static List<Performance> initDataPerformance (Context ctx) {
        List<Performance> performances = new ArrayList<>();
        performances.add(new Performance("Hoshi (호시)", "Kwon Soonyoung (권순영)",
                "Namyangju-si, Gyeonggi-do Korea Selatan, 15 Juni 1996", "Tim Performance (Leader), Penari Utama, Vokalis Utama", "ho5hi_kwon", R.drawable.hoshi));
        performances.add(new Performance("Jun (준)", "Wen Junhui (文 俊辉)",
                "Shenzen, Guangdong Cina, 10 Juni 1996", "Penari Utama, Sub Vokalis", "junhui_moon", R.drawable.jun));
        performances.add(new Performance("THE8 (디 에잇)", "Xu Minghao (徐明浩)",
                "Anshan, Liaoning, Cina 7 November 1997", "Penari Utama, Sub Vokalis, Sub Rapper", "@xuminghao_o", R.drawable.the8));
        performances.add(new Performance("Dino (디노)", "Lee Chan (이찬)",
                "Iksan-si, Jeollakbu-do, Korea Selatan 11 Februari 1999", "Penari Utama, Sub Rapper, Member Termuda (Maknae)", "-", R.drawable.dino));
        return performances;
    }
    private static List<Rap> initDataRap (Context ctx) {
        List<Rap> raps = new ArrayList<>();
        raps.add(new Rap("S.coups (에스쿱스)","Choi Seung Cheol (최승철)",
                "Namyangju-si, Gyeonggi-do Korea Selatan, 8Agustus 1995","Leader, Main Rapper","@sound_of_coups",R.drawable.scoups));
        raps.add(new Rap("Wonwoo (원우)","Jeon Wonwoo (전원 우)",
                "Changwon, Gyeongsangnam-do Korea Selatan, 17 Juli 1996","Rapper Utama", "@eceryone_woo",R.drawable.wonwoo));
        raps.add(new Rap("Mingyu (민규)","Kim Mingyu (김민규)",
                "Shenzen, Guangdong Cina, 10 Juni 1996","Lead rapper, visual","@min9yu_k",R.drawable.mingyu));
        raps.add(new Rap("Vernon (버논)","Hansol Vernon Chwe",
                "New York, Amerika Serikat 18 Februari 1998","Rapper Utama","@cvernon_98",R.drawable.vernon));
        return raps;
    }
    private static List<Vocal> initDataVocal (Context ctx) {
        List<Vocal> vocals = new ArrayList<>();
        vocals.add(new Vocal("Jeonghan (정한)","Yoon Jeong Han (윤정한)",
                "LSeoul, Korea Selatan 04 Oktober 1995","Vokalis Utama", "jeonghaniyoo_n",R.drawable.jeonghan));
        vocals.add(new Vocal("Joshua (조슈아)","Joshua Hong",
                "Los Angeles, California, Amerika Serikat,  30 Desember 1995"," Lead Vocalist", "@joshu_acoustic",R.drawable.joshua));
        vocals.add(new Vocal("Woozi (우지)","Lee Jihoon (이지훈)",
                "Busan, Korea Selatan 22 November 1996","Tim Vokal (Leader), Lead Vocal","@woozi_universefactory",R.drawable.woozi));
        vocals.add(new Vocal("DK (도겸)","Lee Seokmin (이석민)",
                "Suji-gu, Yongin-si, Gyeonggi-do, Korea Selatan 18 Februari 1997","Main Vocal","dk_is_dokyeom",R.drawable.dk));
        vocals.add(new Vocal("Seungkwan (승관)","Boo Seung Kwan (부승관)",
                "Busan, Korea Selatan 16 Januari 1998","Main Vocal","@pledis_boos",R.drawable.seungkwan));
        return vocals;
    }

    private static void  initAllSeventeens(Context ctx){
        seventeens.addAll(initDataPerformance(ctx));
        seventeens.addAll(initDataRap(ctx));
        seventeens.addAll(initDataVocal(ctx));
    }
    public static List<Seventeen> getAllSeventeen(Context ctx){
        if (seventeens.size() == 0){
            initAllSeventeens(ctx);
        }
        return seventeens;
    }
    public static List<Seventeen> getSeventeensByTpe(Context ctx, String unit){
        List<Seventeen> seventeensByTpe = new ArrayList<>();
        if (seventeens.size() == 0){
            initAllSeventeens(ctx);
        }
        for (Seventeen s : seventeens){
            if ( (s.getUnit().equals(unit))){
                seventeensByTpe.add(s);
            }
        }
        return seventeensByTpe;
    }
}
