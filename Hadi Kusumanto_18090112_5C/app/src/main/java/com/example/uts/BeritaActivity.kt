package com.example.uts

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uts.adapter.ImageAdapter

class BeritaActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_berita)

        val imageList = listOf<Image>(
            Image(
                R.drawable.berita1,
                "Usulan Ambang Batas 7 Persen, PPP Khawatirkan Oligarki Politik",
                "Usulan Ambang Batas 7 Persen, PPP Khawatirkan Oligarki Politik" +
                        "\n" +
                        "Menurut Arsul, dinaikkannya ambang batas akan sulit menciptakan pemerintahan yang bersih, karena jumlah partai sedikit untuk mengontrol pemerintah"
            ),
            Image(
                R.drawable.berita2,
                "Polisi Hentikan Kasus Dugaan Politik Uang Tim Paslon Wali Kota Makassar",
                "Polisi Hentikan Kasus Dugaan Politik Uang Tim Paslon Wali Kota Makassar" +
                        "Polisi menghentikan penyidikan kasus dugaan politik uang dengan modus bagi-bagi beras yang dilakukan tim paslon Danny Pomanto dan Fatmawati Rusdu."
            ),
            Image(
                R.drawable.berita3,
                "Austria Keluarkan Berbagai Langkah Ketat Anti-terorisme Pasca terjadi Serangan di Wina",
                "Austria Keluarkan Berbagai Langkah Ketat Anti-terorisme Pasca terjadi Serangan di Wina" +
                        "Pemerintah Austria telah menyetujui berbagai langkah anti-terorisme setelah serangan mematikan di ibu kota, Wina terjadi pada pekan lalu."
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id._imageRecyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = ImageAdapter(this, imageList){
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}