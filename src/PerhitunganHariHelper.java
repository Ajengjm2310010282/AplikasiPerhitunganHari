
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

public class PerhitunganHariHelper {

    public static int getJumlahHari(int tahun, int bulan) {
    return LocalDate.of(tahun, bulan, 1).lengthOfMonth();
    }

    public static String getHariPertama(int tahun, int bulan) {
        LocalDate tanggalPertama = LocalDate.of(tahun, bulan, 1);
        return tanggalPertama.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
    }

    public static String getHariTerakhir(int tahun, int bulan) {
        YearMonth ym = YearMonth.of(tahun, bulan);
        LocalDate tanggalTerakhir = ym.atEndOfMonth();
        return tanggalTerakhir.getDayOfWeek().getDisplayName(TextStyle.FULL, new Locale("id", "ID"));
    }

    public static boolean isKabisat(int tahun) {
        return java.time.Year.isLeap(tahun);
    }

    public static long hitungSelisihHari(LocalDate awal, LocalDate akhir) {
        return ChronoUnit.DAYS.between(awal, akhir);
    }
}
