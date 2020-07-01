package com.example.android.zypherproject;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.ImageViewCompat;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.ColorSpace;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.Toast;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.google.android.material.tabs.TabLayout;

import java.util.Objects;

public class MainActivity extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar myToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);
        Objects.requireNonNull(getSupportActionBar()).setDisplayShowHomeEnabled(true);
        myToolbar.setNavigationIcon(R.drawable.navigation_icon);  //your icon
        myToolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Do whatever you want to do here
                Intent intent = new Intent(MainActivity.this, HamburgerActivity.class);
                startActivity(intent);
            }
        });
        getSupportActionBar().setTitle(null);


    }

        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            getMenuInflater().inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);
        }
        @Override
        public boolean onOptionsItemSelected(MenuItem item){

            switch(item.getItemId()){

                case R.id.settings_item:
                    BottomSheetDialogFragment bottomSheetDialogFragment = new SettingsFragment();
                    bottomSheetDialogFragment.show(getSupportFragmentManager(), bottomSheetDialogFragment.getTag());
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
        }
        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public void img(ImageView imv) {

                    Drawable highlight = getResources().getDrawable( R.drawable.highlight);
                    imv.setBackground(highlight);
            //
                    //Do your other stuff here.
                    //
                }

}