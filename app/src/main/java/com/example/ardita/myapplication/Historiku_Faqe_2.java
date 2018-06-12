package com.example.ardita.myapplication;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.os.Bundle;

public class Historiku_Faqe_2 extends Fragment {
    public Historiku_Faqe_2(){};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View FaqeDy = inflater.inflate(R.layout.historiku_faqe2, container, false);
        return FaqeDy;
    }
}