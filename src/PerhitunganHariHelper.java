
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class PerhitunganHariHelper {
    // Hitung jumlah hari dalam bulan tertentu
    public static int getJumlahHari(int tahun, int bulan) {
        YearMonth ym = YearMonth.of(tahun, bulan);
        return ym.lengthOfMonth();
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

    public static long hitungSelisihHari(LocalDate awal, LocalDate akhir) {
        return ChronoUnit.DAYS.between(awal, akhir);
    }
}
