package com.example.android.rahmanda_1202150065_modul3;

import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.LinkedList;

public class ListMineral extends AppCompatActivity {

    private final LinkedList<String> nTitle = new LinkedList<>();
    private final LinkedList<String> nDesc = new LinkedList<>();
    private final LinkedList<Integer> nPhotos = new LinkedList<>();

    private RecyclerView recycle;
    private RecycleMineral mAdapater;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_mineral);
        data();
        recycle=(RecyclerView)findViewById(R.id.recycle);

        mAdapater=new RecycleMineral(this,nTitle,nDesc,nPhotos);

        recycle.setAdapter(mAdapater);

        recycle.setLayoutManager(new LinearLayoutManager(this));

        if(this.getResources().getConfiguration().orientation== Configuration.ORIENTATION_LANDSCAPE){
            recycle.setLayoutManager(new GridLayoutManager(this, 2));
        }else {
            recycle.setLayoutManager(new LinearLayoutManager(this));
        }

    }

    private void data(){
        nTitle.add("Aqua");
        nTitle.add("Ades");
        nTitle.add("Club");
        nTitle.add("Equil");
        nTitle.add("Amidis");
        nTitle.add("Cleo");
        nTitle.add("Evian");
        nTitle.add("Nestle");
        nTitle.add("Pristine");
        nTitle.add("Vit");
        nTitle.add("LeMinerale");

        nDesc.add("Ini adalah air mineral Aqua");
        nDesc.add("Ini adalah air mineral Ades");
        nDesc.add("Ini adalah air mineral Club");
        nDesc.add("Ini adalah air mineral Equil");
        nDesc.add("Ini adalah air mineral Amidis");
        nDesc.add("Ini adalah air mineral Cleo");
        nDesc.add("Ini adalah air mineral Evian");
        nDesc.add("Ini adalah air mineral Nestle");
        nDesc.add("Ini adalah air mineral Pristine");
        nDesc.add("Ini adalah air mineral Vit");
        nDesc.add("Ini adalah air mineral LeMinarale");


        nPhotos.add(R.drawable.aqua);
        nPhotos.add(R.drawable.ades);
        nPhotos.add(R.drawable.club);
        nPhotos.add(R.drawable.equil);
        nPhotos.add(R.drawable.amidis);
        nPhotos.add(R.drawable.cleo);
        nPhotos.add(R.drawable.evian);
        nPhotos.add(R.drawable.nestle);
        nPhotos.add(R.drawable.pristine);
        nPhotos.add(R.drawable.vit);
        nPhotos.add(R.drawable.leminerale);

    }
}
