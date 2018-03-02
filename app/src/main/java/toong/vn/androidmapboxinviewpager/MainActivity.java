package toong.vn.androidmapboxinviewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import toong.vn.androidmapboxinviewpager.fragment.Fragment1;
import toong.vn.androidmapboxinviewpager.fragment.MapboxFragment;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager = findViewById(R.id.viewPager);
        button1 = findViewById(R.id.button_1);
        button2 = findViewById(R.id.button_2);
        button3 = findViewById(R.id.button_3);

        pagerAdapter = new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragment(Fragment1.newInstance());
        pagerAdapter.addFragment(MapboxFragment.newInstance());
        pagerAdapter.addFragment(Fragment1.newInstance());
        viewPager.setAdapter(pagerAdapter);
        viewPager.setOffscreenPageLimit(3);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(0);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(1);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                viewPager.setCurrentItem(2);
            }
        });
    }
}
