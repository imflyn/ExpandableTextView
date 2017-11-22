package com.flyn.expandabletextview;

import android.content.Context;
import android.graphics.Point;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class RecycleViewActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycleview);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle("RecycleViewActivity");


        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        MyAdapter adapter = new MyAdapter();
        recyclerView.setAdapter(adapter);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recyclerView.setLayoutManager(linearLayoutManager);
    }


    public class MyAdapter extends RecyclerView.Adapter {

        private List<String> data = new ArrayList<>();
        private HashMap<Integer, Integer> collapsedStatusMap = new HashMap();

        public MyAdapter() {
            this.data.add("5年基础上加严约15%。欧盟则计划在2018年上半年制定重型卡车的二氧化碳排放标准。");
            this.data.add("此外，美国的监管法规规定，2027年之前将拖车、货运卡车的燃油效率提高25%。中国政府规定，从2019年开始，重型卡车的燃料消耗量限值在2015年基础上加严约15%。欧盟则计划在2018年上半年制定重型卡车的二氧化碳排放标准。\n" +
                    "所有这些举措均表明，相对于电动汽车的普遍采用而言，货物运输领域采用电动汽车受政策改变的影响可能更大。\n" +
                    "科恩表示：“在我们看来，与家用轿车领域相比，电动汽车在运输行业的普及更值得注意，这有两个原因：相对于家用轿车，在政策可能推动下，货车电动化的临界点可能更快到来；货车整体拥有成本和更快的更新率，可能促使货运公司比客运公司更迅速地采用电动汽车。”");
            this.data.add("他指出，特斯拉进入卡车市场，“让人们对卡车市场采用电动汽车更为乐观”，但在卡车市场的所有领域，长途运输卡车电动化的成本和技术挑战都是最大的。由于自身重量和运输距离的限制，电动汽车可能会首先进入轻型或中型卡车领域以及城市或当地货运市场，最后才是重型、长途运输卡车(包括半挂卡车)领域。\n" +
                    "电动汽车领域的其它一些创业公司正专注于这些卡车市场，将电动马达和电池安装在垃圾运输车和城市巴士上，而不是长途运输卡车上。");
            this.data.add("行业资深人士、特斯拉联合创始人伊恩·赖特(Ian Wright)对CNBC表示，相对于用于短途运输的轻型和中型卡车而言，用于长途运输的重型卡车的电动化是一项更艰巨的任务。\n" +
                    "赖特称：“对他们瞄准长途运输卡车，我有点惊讶，因为这是电池电动汽车最以完成的任务。”赖特现在是电动卡车初创公司Wrightspeed的创始人兼首席执行官，该公司生产排放量非常低的汽车动力总成，将电动马达和电池与一台小型高效柴油发电机整合在一起。");
            this.data.add("记者未能立即联系到特斯拉对该报道置评。\n" +
                    "长途货车电动化的问题之一是，随着运输距离的增加，电池的尺寸也会相应增加。这反过来又增加了卡车的自身重量，从而减少了卡车能装载的货物量。\n" +
                    "Wrightspeed的客户喜欢使用更轻、更小型的电动卡车，这种汽车在本地范围内能更有效地使用。例如，该公司已经为联邦快递的货车和加州北部至少两个县的垃圾车制造了动力总成。");
            this.data.add("上周日，投资公司Stifel Financial分析师迈克尔·鲍登蒂斯蒂尔(Michael Baudendistel)在一份研究报告中称，特斯拉没有披露其纯电动半挂卡车Semi的自身总重量，而这是一项关键信息。");
            this.data.add("鲍登蒂斯蒂尔称：“在没有公布自身重量的情况下披露汽车的运输距离，确实告诉了我们很少的信息。我们有理由相信，特斯拉的半挂卡车上将采用一组10000磅（约4.5吨）重的电池组，续航里程为500英里，或者是一组容量为700千瓦时的电池组。”\n" +
                    "他说，放弃柴油发动机在某种方式上抵消了电池的重量，但这种尺寸的电池组几乎肯定会降低卡车的有效荷载能力。”（刘春）");
            this.data.add("此外，美国的监管法规规定，2027年之前将拖车、货运卡车的燃油效率提高25%。中国政府规定，从2019年开始，重型卡车的燃料消耗量限值在2015年基础上加严约15%。欧盟则计划在2018年上半年制定重型卡车的二氧化碳排放标准。\n" +
                    "所有这些举措均表明，相对于电动汽车的普遍采用而言，货物运输领域采用电动汽车受政策改变的影响可能更大。\n" +
                    "科恩表示：“在我们看来，与家用轿车领域相比，电动汽车在运输行业的普及更值得注意，这有两个原因：相对于家用轿车，在政策可能推动下，货车电动化的临界点可能更快到来；货车整体拥有成本和更快的更新率，可能促使货运公司比客运公司更迅速地采用电动汽车。”");
            this.data.add("他指出，特斯拉进入卡车市场，“让人们对卡车市场采用电动汽车更为乐观”，但在卡车市场的所有领域，长途运输卡车电动化的成本和技术挑战都是最大的。由于自身重量和运输距离的限制，电动汽车可能会首先进入轻型或中型卡车领域以及城市或当地货运市场，最后才是重型、长途运输卡车(包括半挂卡车)领域。\n" +
                    "电动汽车领域的其它一些创业公司正专注于这些卡车市场，将电动马达和电池安装在垃圾运输车和城市巴士上，而不是长途运输卡车上。");
            this.data.add("行业资深人士、特斯拉联合创始人伊恩·赖特(Ian Wright)对CNBC表示，相对于用于短途运输的轻型和中型卡车而言，用于长途运输的重型卡车的电动化是一项更艰巨的任务。\n" +
                    "赖特称：“对他们瞄准长途运输卡车，我有点惊讶，因为这是电池电动汽车最以完成的任务。”赖特现在是电动卡车初创公司Wrightspeed的创始人兼首席执行官，该公司生产排放量非常低的汽车动力总成，将电动马达和电池与一台小型高效柴油发电机整合在一起。");
            this.data.add("记者未能立即联系到特斯拉对该报道置评。\n" +
                    "长途货车电动化的问题之一是，随着运输距离的增加，电池的尺寸也会相应增加。这反过来又增加了卡车的自身重量，从而减少了卡车能装载的货物量。\n" +
                    "Wrightspeed的客户喜欢使用更轻、更小型的电动卡车，这种汽车在本地范围内能更有效地使用。例如，该公司已经为联邦快递的货车和加州北部至少两个县的垃圾车制造了动力总成。");
            this.data.add("上周日，投资公司Stifel Financial分析师迈克尔·鲍登蒂斯蒂尔(Michael Baudendistel)在一份研究报告中称，特斯拉没有披露其纯电动半挂卡车Semi的自身总重量，而这是一项关键信息。");
            this.data.add("鲍登蒂斯蒂尔称：“在没有公布自身重量的情况下披露汽车的运输距离，确实告诉了我们很少的信息。我们有理由相信，特斯拉的半挂卡车上将采用一组10000磅（约4.5吨）重的电池组，续航里程为500英里，或者是一组容量为700千瓦时的电池组。”\n" +
                    "他说，放弃柴油发动机在某种方式上抵消了电池的重量，但这种尺寸的电池组几乎肯定会降低卡车的有效荷载能力。”（刘春）");
        }

        @Override
        public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_recycleviewl, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.textView.setText(data.get(position), position);
        }


        @Override
        public int getItemCount() {
            return this.data.size();
        }


        @Override
        public long getItemId(int position) {
            return data.get(position).hashCode();
        }


        class ViewHolder extends RecyclerView.ViewHolder {
            private ExpandableTextView textView;

            public ViewHolder(View view) {
                super(view);
                textView = view.findViewById(R.id.textView);

                WindowManager wm = (WindowManager) getSystemService(Context.WINDOW_SERVICE);
                Display display = wm.getDefaultDisplay();
                Point size = new Point();
                display.getSize(size);
                textView.setTextViewWidthPx(size.x);//设置文本框宽度
                textView.setCollapsedStatus(collapsedStatusMap);
            }
        }

    }

}

