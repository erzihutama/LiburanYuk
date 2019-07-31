package com.erzihutama.liburanyuk;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.erzihutama.liburanyuk.view.home.BudayaFragment;
import com.erzihutama.liburanyuk.view.home.HomeFragment;
import com.erzihutama.liburanyuk.view.home.ProfilFragment;
import com.erzihutama.liburanyuk.view.home.mytripFragment;

public class MainActivity extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // kita set default nya Home Fragment


//        intent untuk ke dalam botom nav bar
        String newString;
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("fragment");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("fragment");
        }

        if(newString==null){

            loadFragment(new HomeFragment());

        } else
        {
            if(newString.equals("budaya")){
                loadFragment(new BudayaFragment()) ;}
        }

//        loadFragment(new HomeFragment());
        // inisialisasi BottomNavigaionView
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        // beri listener pada saat item/menu bottomnavigation terpilih
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
    }

    private boolean loadFragment(android.support.v4.app.Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.framelayout, fragment)
                    .commit();
            return true;
        }
        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        android.support.v4.app.Fragment     fragment = null;
        switch (menuItem.getItemId()) {
            case R.id.navhome:
                fragment = new HomeFragment();
                break;
            case R.id.mytrip:
                fragment = new mytripFragment();
                break;
            case R.id.profil:
                fragment = new ProfilFragment();
                break;

        }
        return loadFragment(fragment);
    }

}

