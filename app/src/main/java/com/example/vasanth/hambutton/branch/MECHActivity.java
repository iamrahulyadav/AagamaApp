package com.example.vasanth.hambutton.branch;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;
import android.widget.TextView;

import com.example.vasanth.hambutton.R;

import java.util.ArrayList;

public class MECHActivity extends AppCompatActivity {

private ListView mListViewInMECH;

private static final String TAG="MechActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.listview_layout_mech);

        Toolbar toolbar = findViewById(R.id.app_bar);
        setSupportActionBar(toolbar);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(R.string.nothing);

        mListViewInMECH=(ListView)findViewById(R.id.listViewInMECH);


        TextView v=(TextView) mListViewInMECH.findViewById(R.id.cardTitleInMECH);

        ArrayList<Card> listMECH=new ArrayList<>();

        listMECH.add(new Card("drawable://"+R.drawable.mekbolt_mech,"Mekbolt"));
        listMECH.add(new Card("drawable://"+R.drawable.mind_spark_mech,"Mind Spark"));
        listMECH.add(new Card("drawable://"+R.drawable.paper_presentation_mech,"Paper Presentation"));
        listMECH.add(new Card("drawable://"+R.drawable.prayog_mech,"Prayog"));
        listMECH.add(new Card("drawable://"+R.drawable.design_execute_mech,"Dessin Xecute"));
        listMECH.add(new Card("drawable://"+R.drawable.meet_your_thoughts_mech,"Meet Your Thoughts"));
        listMECH.add(new Card("drawable://"+R.drawable.mech_cards,"Mechanical Cards"));
        listMECH.add(new Card("drawable://"+R.drawable.poster_presentation_mech,"Poster Presentation"));






        MECHCustomListAdapter adapterMECH=new MECHCustomListAdapter(this,R.layout.mech_card,listMECH);
        mListViewInMECH.setAdapter(adapterMECH);

    }

}
