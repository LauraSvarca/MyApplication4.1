package com.example.ardita.myapplication;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.Fragment;
import java.util.ArrayList;
import java.util.List;



public class
MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button Kyqu;
    EditText perdoruesi, Fjalkalimi;
    TextView Regjistrohu;
    TabLayout MyTabs;
    ViewPager MyPager;
    //Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        MyTabs=(TabLayout)findViewById(R.id.MyTabs);
        MyPager=(ViewPager)findViewById(R.id.MyPager);
        perdoruesi = (EditText) findViewById(R.id.perdoruesi);
        Fjalkalimi = (EditText) findViewById(R.id.Fjalkalimi);
        Kyqu = (Button) findViewById(R.id.Kyqu);
        Regjistrohu = (TextView) findViewById(R.id.Regjistrohu);
      //  toolbar = (Toolbar) findViewById(R.id.toolbar);
      // toolbar.setTitle("Test Mature");-
      //  setSupportActionBar(toolbar);
        Kyqu.setOnClickListener(this);
        Regjistrohu.setOnClickListener(this);
        MyTabs.setupWithViewPager(MyPager);

    }
    public void SetUpViewPager (ViewPager viewpage){
        MyViewPageAdapter Adapter = new MyViewPageAdapter(getSupportFragmentManager());

        Adapter.AddFragmentPage(new Historiku_Faqe_1(), "Faqe 1");
        Adapter.AddFragmentPage(new Historiku_Faqe_2(), "Faqe 2");
        Adapter.AddFragmentPage(new Historiku_Faqe_3(), "Faqe 3");
        //We Need Fragment class now

        viewpage.setAdapter(Adapter);

    }

public class MyViewPageAdapter extends FragmentPagerAdapter {
private List <Fragment> MyFragment= new ArrayList<>();
private List<String> MyPageTitle= new ArrayList<>();

    public MyViewPageAdapter(android.support.v4.app.FragmentManager manager){
        super(manager);
    }
public void AddFragmentPage(Fragment Frag, String Title){
        MyFragment.add(Frag);
        MyPageTitle.add(Title);
}
    @Override
    public android.support.v4.app.Fragment getItem(int position) {
        return null;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return super.getPageTitle(position);
    }

    @Override
    public int getCount() {
        return 0;
    }
}

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.Kyqu:

                startActivity(new Intent(this, kyqu.class));
                break;

            case R.id.Regjistrohu:


                startActivity(new Intent(this, Regjistrohu.class));
                break;

        }
    }
}
