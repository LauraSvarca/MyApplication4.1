package com.example.ardita.myapplication;

        import android.support.annotation.Nullable;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.os.Bundle;

public class Historiku_Faqe_1 extends Fragment {
    public Historiku_Faqe_1(){};
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState) {
        View FaqeNje = inflater.inflate(R.layout.historiku_faqe1, container, false);
        return FaqeNje;
    }
}
