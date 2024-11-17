package com.example.fessutival;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;

import com.example.fessutival.bottomNavigation.CalendarFragment;
import com.example.fessutival.bottomNavigation.HomeFragment;
import com.example.fessutival.bottomNavigation.ReservationFragment;
import com.example.fessutival.bottomNavigation.SettingsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemId = item.getItemId();

                // replace to navigation item 1 click
                if(itemId == R.id.page_1) {
                    transforTo(HomeFragment.newInstance("param1","param2"));
                    return true;
                }
                if(itemId == R.id.page_2) {
                    transforTo(CalendarFragment.newInstance("param1","param2"));
                    return true;
                }
                if(itemId == R.id.page_3) {
                    transforTo(ReservationFragment.newInstance("param1","param2"));
                    return true;
                }
                if(itemId == R.id.page_4) {
                    transforTo(SettingsFragment.newInstance("param1","param2"));
                    return true;
                }

                return false;
            }
        });

        // 이걸로 . 이게 없으면 다시 눌를때 초기화 계속 됨.
        bottomNavigationView.setOnItemReselectedListener(new NavigationBarView.OnItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {

            }
        });

        transforTo(HomeFragment.newInstance("param1","param2"));

    }

    private void transforTo(Fragment fragment) {
//        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//        fragmentTransaction.replace(R.id.fragment_container, fragment);
//        fragmentTransaction.commit();

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}