package com.example.caner.bil495;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    List<Receipt> fis_listesi;
    List<Tag> tag_list;
    User u;


    //@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fis_listesi = new ArrayList<>();
        tag_list = new ArrayList<Tag>();
        u = new User();
    }



    //serverdan fis listesini al

    //deneme amaçlı koda gömdüm

    //bu metotlar giris yapıldı varsayımı ile çalışıyor eğer yappılmadı ise çıkan uyarı zaten yaptırıyor.
    void addReceipt(String totalcost, String location, String Date){
        Receipt r = new Receipt(totalcost, location, Date);
        fis_listesi.add(r);
    }
    //listedeki eleman numarası ile cağırılır
    void deleteReceipt(int index){
        fis_listesi.remove(index);
    }
    //çalışma şekli:
    //kullanıcı güncelleye basınca karsısına elemanklar olan yazı yerii çıkar
    //yani var olan yazılar aynı kalıp update olacak
    void updateReceipt(String totalcost, String location, String date,int index){
        fis_listesi.get(index).setTotalCost(totalcost);
        fis_listesi.get(index).setLocation(location);
        fis_listesi.get(index).setDate(date);
    }
    void addTagFromReceipt(Tag t, int index){
        fis_listesi.get(index).addTag(t);
    }
    //istenilen tagin üstüne baılarak yapılacak
    void removeTagFromReceipt(Tag t, int index){
        fis_listesi.get(index).removeTag(t);
    }
    boolean login(String username, String password){
        this.u = new User();
        u.setUsername(username);
        u.setPassword(password);
        //database bağlanmak lazım

        return true;
    }
    boolean createAccount(String username, String password){
        //check if that username exist
        //return false; hata mesajı bas

        //database'e username ile passwordu ekle

        //kayıt olunan hesap ile çıkış yap
        login(username, password);
        //zaten login çağırılınca u değişkeninin set ediyor
        return true;//ve ya ekrana başarı ile oluşturuldu bas
    }

    void addTag(String s){
        //Her tage bakıyor zaten var mı diye tek tek karşılaştırıyor
        for( Tag t : tag_list){
            if(t.getTag() == s){
                //Hata  mesajı ver zaten var diye
            }
        }
        Tag new_tag = new Tag(s);//yeni tagi oluştur.
        tag_list.add(new_tag);//Yeni oluşan tagi listeye ekle
    }
    //Bir tagin üstüne basılınca o tagi alıp siler her tagin bir dümesi vars
    void removetag(Tag t){
        tag_list.remove(t);
    }
}
