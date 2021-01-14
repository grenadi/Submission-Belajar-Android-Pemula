package com.example.maskot;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class DetailActivity extends AppCompatActivity {

    TextView nama, info, detail;
    String nm, inf, det;
    int gamb;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        Bundle bundle = getIntent().getExtras();
        nm = bundle.getString("nama");
        inf = bundle.getString("deskripsi");
        det = bundle.getString("detail");
        gamb = bundle.getInt("gambar");

        nama = (TextView) findViewById(R.id.judul);
        info = (TextView) findViewById(R.id.subJudul);
        detail = (TextView) findViewById(R.id.isi);
        img = (ImageView) findViewById(R.id.gambar);

        nama.setText(""+nm);
        info.setText(""+inf);
        detail.setText(""+det);

        Glide.with(DetailActivity.this)
                .load(gamb)
                .apply(new RequestOptions().override(120,120))
                .into(img);
    }
}