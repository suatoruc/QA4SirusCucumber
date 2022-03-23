package stepdefinations.suat;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import utilities.ReUsableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
;

public class ExcelStepDefinations {

    String path = "src/test/resources/datas/ulkeler.xlsx";
    Workbook workbook = null;
    FileInputStream fis;
    FileOutputStream fos;


    @Given("{int}.satirdaki {int}.hucreye gidelim ve yazdiralim")
    public void satirdaki_hucreye_gidelim_ve_yazdiralim(Integer satir, Integer hucre) {
        System.out.println(satir + " satır " + hucre + " hecrede olan ülke:  " + ReUsableMethods.hucreGetir(path, "Sayfa1", satir, hucre));


    }

    @Then("baskenti {string} olan ulke ismini yazdiralim")
    public void baskenti_olan_ulke_ismini_yazdiralim(String baskent) {

        Map<String, String> excelListesi = ReUsableMethods.valuemapOlustur(path, "Sayfa1");
        System.out.println("Başkenti " + baskent + " olan Ülke: " + excelListesi.get(baskent));

    }


    @Then("Ulke sayisini bulalim")
    public void ulke_sayisini_bulalim() {
        Map<String, String> excelList = ReUsableMethods.mapOlustur(path, "Sayfa1");
        System.out.println("excel Listesindeki Ülke Sayısı: " + (excelList.keySet().size() - 1));

    }

    @Then("Fiziki olarak kullanilan satir sayisini bulun")
    public void fiziki_olarak_kullanilan_satir_sayisini_bulun() {
        Workbook workbook = null;
        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel de Fiziki Kullanılan Tüm Satır Sayısı: " + workbook.getSheet("Sayfa1").getPhysicalNumberOfRows());


    }

    @Then("Tum bilgileri map olarak kaydedeli")
    public void tum_bilgileri_map_olarak_kaydedeli() {
        Map<String, String> excelList = ReUsableMethods.mapOlustur(path, "Sayfa1");
        System.out.println("Excel Sayfasındaki Tüm Bilgiler: " + excelList);


    }

    @Then("Satir ve sutun bilgisi ile hucre yazdiralim")
    public void satir_ve_sutun_bilgisi_ile_hucre_yazdiralim() {
        Workbook workbook = null;

        try {
            FileInputStream fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);


        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Excel de ki Satır Sayısı: " + workbook.getSheet("Sayfa1").getLastRowNum());
        System.out.println("Excel de Kullanılan Sutun Sayısı: " + workbook.getSheet("Sayfa1").getRepeatingColumns().iterator().hasNext());


    }


    @Given("excel Sayfasına baglan")
    public void excel_sayfasına_baglan() {

    }

    @Then("baslik satirinda ilk bos hucreye yeni bir cell olusturalim")
    public void baslik_satirinda_ilk_bos_hucreye_yeni_bir_cell_olusturalim() {

    }

    @Then("Olusturdugumuz hucreye “ulke nufusu” yazdiralim")
    public void olusturdugumuz_hucreye_ulke_nufusu_yazdiralim() throws IOException {


              fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
          workbook.getSheet("Sayfa1").getRow(0).createCell(6).setCellValue("ULKE NUFUSU");




    }

    @Then("{int}.satir ulke nufusu kolonuna “{double} milyar” yazdiralim")
    public void satir_ulke_nufusu_kolonuna_milyar_yazdiralim(Integer satir, Double miktr) throws IOException {



            fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
          workbook.getSheet("Sayfa1").getRow(satir).createCell(6).setCellValue(miktr + " Milyar");





    }

    @Then("{int}.satir nufus kolonuna {int} milyon yazdiralim")
    public void satir_nufus_kolonuna_milyon_yazdiralim(Integer satr, Integer miktar) throws IOException {



         fis = new FileInputStream(path);
            workbook = WorkbookFactory.create(fis);
          workbook.getSheet("Sayfa1").getRow(satr).createCell(6).setCellValue(miktar + " Milyon");




    }

    @Then("dosyayi kayit edelim")
    public void dosyayi_kayit_edelim() {

      try {
         fis = new FileInputStream(path);
        workbook = WorkbookFactory.create(fis);
        fos = new FileOutputStream(path);
        workbook.write(fos);


      } catch (IOException e) {
        e.printStackTrace();
      }






    }

    @Then("dosyayi kapatalim")
    public void dosyayi_kapatalim() {

    }



}

