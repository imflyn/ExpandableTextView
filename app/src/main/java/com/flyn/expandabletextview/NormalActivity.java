package com.flyn.expandabletextview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;


public class NormalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("NormalActivity");

        ExpandableTextView textView = findViewById(R.id.textView);
        textView.setText("周一，巴克莱(Barclays)分析师迈克尔·科恩(Michael Cohen)在一份研究报告中称，不断增加的监管压力和未来政策的变化，可能会促使货运公司在其车队中采用低排放的汽车。\n" +
                "但特斯拉最近推出纯电动半挂卡车Semi，瞄准的是卡车市场中的半挂卡车领域，而该领域在采用电动汽车上可能的速度最慢的。受价格、运输范围和有效载荷能力的限制，长途货运市场将可能落后于城市货运、其它短途货运和轻型卡车市场，成为最后一个接受电动卡车的市场。\n" +
                "总体而言，重型卡车是污染大户。尽管它们只占汽车保有量的10%，行驶里程也仅占汽车全部行驶里程的20%，但其排放量约占所有汽车排放总量的40%，这使得该行业面临严峻的减排压力。\n" +
                "科恩称，事实上，全球有200多个城市出台了某种汽车排放法规，马德里、巴黎、伦敦和墨西哥城等主要城市已经宣布了对柴油发动机的禁令，这可能会加速人们对电动汽车的兴趣。");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                finish();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}

