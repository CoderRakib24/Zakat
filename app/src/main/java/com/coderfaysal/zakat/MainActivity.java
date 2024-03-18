package com.coderfaysal.zakat;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    ArrayList<HashMap<String, String>> arrayList = new ArrayList<>();
    HashMap<String, String> hashMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recycleView);


        hashMap = new HashMap<>();
        hashMap.put("title", "যাকাত কাকে বলে?");
        hashMap.put("message", "প্রত্যেক স্বাধীন, পূর্ণবয়স্ক মুসলমান নর-নারীকে প্রতি বছর স্বীয় আয় ও সম্পত্তির একটি নির্দিষ্ট অংশ, যদি তা ইসলামী শরিয়ত নির্ধারিত সীমা (নিসাব পরিমাণ) অতিক্রম করে তবে, গরীব-দুঃস্থদের মধ্যে বিতরণের নিয়মকে যাকাত বলা হয়।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "যাকাত ফরজ হওয়ার শর্তসমূহ-");
        hashMap.put("message", "১. নেসাব পরিমাণ মালের মালিক হওয়া। অর্থাৎ সাড়ে সাত তোলা স্বর্ণ, বা সাড়ে বায়ান্ন তোলা রুপা,কিংবা সমপরিমাণ মূল্যের নগদ টাকা বা ব্যবসার মালের মালিক হওয়া। \n" +
                "\n" +
                "২. মুসলমান হওয়া। কাফেরের উপর যাকাত ফরজ নয়। \n" +
                "\n" +
                "৩. বালেগ হওয়া। নাবালেগের উপর যাকাত ফরজ নয়। \n" +
                "\n" +
                "৪. জ্ঞানী ও বিবেক সম্পন্ন হওয়া। সর্বদা যে পাগল থাকে তার নেসাব পরিমাণ মাল থাকলেও তার উপর যাকাত ফরজ নয়। \n" +
                "\n" +
                "৫. স্বাধীন বা মুক্ত হওয়া। দাস-দাসীর উপর যাকাত ফরজ নয়। \n" +
                "\n" +
                "৬. মালের উপর পূর্ণ মালিকানা থাকা। অসম্পূর্ণ মালিকানার উপর যাকাত ফরজ হয় না। \n" +
                "\n" +
                "৭. নেসাব পরিমাণ মাল নিত্য প্রয়োজনীয় সম্পদের অতিরিক্ত হওয়া। \n" +
                "\n" +
                "৮. নেসাব পরিমাণ মালের উপর এক বছর অতিবাহিত হওয়া। \n" +
                "\n" +
                "৯. মাল বর্ধনশীল হওয়া। যাকাতের ফজিলত, আল্লাহ তাআলা ইরশাদ করেন, ‘তোমরা যা কিছু (আল্লাহর রাস্তায়) ব্যয় কর তিনি তার বিনিময় দান করবেন। আর তিনিই উত্তম রিজিকদাতা। (সুরা সাবা,আয়াত:৩৯)");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "যাকাত বন্টনের খাত -");
        hashMap.put("message", "১. ফকির। ঐ গরিব ব্যক্তি যার নিকট এক বেলা বা দুই বেলার বেশি খাবারের ব্যবস্থা নেই। \n" +
                "\n" +
                "২. মিসকিন। যার আয়ের চেয়ে ব্যয় বেশি। যেমন কোন ব্যক্তির আয় আছে ‘বিশ হাজার’ টাকা কিন্তু তার নিজের বা পরিবারের কারও অসুস্থার পেছনে ব্যয় আছে ‘চল্লিশ হাজার’ টাকা। তাকে দেয়া। \n" +
                "\n" +
                "৩. যাকাত আদায় ও বিতরণের কর্মচারীদের। \n" +
                "\n" +
                "৪. নওমুসলিম অর্থাৎ যারা অন্য ধর্ম ছাড়ার কারণে পারিবারিক, সামাজিক ও আর্থিকভাবে বঞ্চিত হয়েছে, তাদেরকে দেয়া। \n" +
                "\n" +
                "৫. দাসমুক্তির জন্য। (বর্তমানে যদি কোন লোক এমন পাওয়া যায় যে, যে র্নিদোষভাবে জেলে আছে তাকে) \n" +
                "\n" +
                "৬. ঋণ মুক্তির জন্য। জীবনের মৌলিক বা প্রয়োজনীয় চাহিদা পূরনের জন্য সংগত কারণে ঋণগ্রস্ত ব্যক্তিদের ঋণ মুক্তির জন্য যাকাত প্রদান করা যাবে। \n" +
                "\n" +
                "৭. ফী সাবিলিল্লাহ বা জিহাদ। অর্থাৎ ইসলামকে বোল-বালা বা বিজয়ী করার লক্ষে যারা কাফির বা বিধর্মীদের সাথে জিহাদে রত সে সকল মুজাহিদদের প্রয়োজনে যাকাত দেয়া যাবে। \n" +
                "\n" +
                "৮. মুসাফির। মুসাফির অবস্থায় কোনো ব্যক্তি বিশেষ কারণে অভাব গ্রস্ত হলে ঐ ব্যক্তির বাড়িতে যতই ধন-সম্পদ থাকুক না কেন তাকে যাকাত প্রদান করা যাবে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "যাকাত এর সংজ্ঞা:");
        hashMap.put("message", "যাকাত শব্দের অর্থ শুচিতা ও পবিত্রতা, শুদ্ধি ও বৃদ্ধি। \n" +
                "\n" +
                "পরিভাষায় আল্লাহর সন্তুষ্টি লাভের উদ্দেশ্যে শরিয়ত নির্ধারিত পরিমাণ সম্পদের নির্দিষ্ট অংশ কুরআনে বর্ণিত আট প্রকারের কোন এক প্রকার লোক অথবা প্রত্যেককে দান করে মালিক বানিয়ে দেয়াকে যাকাত বলে।");
        arrayList.add(hashMap);

        hashMap = new HashMap<>();
        hashMap.put("title", "জাকাত না দেওয়ার শাস্তি-");
        hashMap.put("message", "কোরআনে জাকাত অনাদায়ের কঠিন শাস্তি : জাকাতের বিধান কেউ অস্বীকার করলে সে মুসলিম হিসেবে গণ্য হবে না। এটি মহান আল্লাহর অবশ্যপালনীয় বিধান। পবিত্র কোরআন ও হাদিসে জাকাত আদায় না করলে কঠিন শাস্তির কথা বর্ণিত হয়েছে। পবিত্র আল-কোরআনে মহান আল্লাহ বলেন, ‘এবং যারা সোনা ও রুপা জমা করে রাখে, আর তা আল্লাহর রাস্তায় খরচ করে না, আপনি তাদের বেদনাদায়ক আজাবের সুসংবাদ দিন, যেদিন জাহান্নামের আগুনে তা গরম করা হবে, অতঃপর তা দিয়ে তাদের কপালে, পার্শ্বদেশে ও পিঠে সেঁক দেওয়া হবে। (আর বলা হবে) এটা তা-ই, যা তোমরা নিজেদের জন্য জমা করে রেখেছিলে। সুতরাং তোমরা যা জমা করেছিলে তার স্বাদ উপভোগ করো।’ (সুরা : তাওবা, আয়াত : ৩৪-৩৫)");
        arrayList.add(hashMap);


        XAdapter xAdapter = new XAdapter();
        recyclerView.setAdapter(xAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(MainActivity.this));


    }


    private class XAdapter extends RecyclerView.Adapter<XAdapter.XViewHolder>{


        @NonNull
        @Override
        public XViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.items, parent, false );
            return new XViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull XViewHolder holder, int position) {

            hashMap = arrayList.get(position);
            String title = hashMap.get("title");
            String message = hashMap.get("message");

            holder.textView.setText(title);

            holder.cardView.setOnClickListener(view -> {
                Details.TITLE = title;
                Details.MESSAGE = message;
                startActivity(new Intent(MainActivity.this, Details.class));
            });


        }

        @Override
        public int getItemCount() {
            return arrayList.size();
        }

        private class XViewHolder extends RecyclerView.ViewHolder{

            TextView textView;
            CardView cardView;

            public XViewHolder(@NonNull View itemView) {
                super(itemView);

                textView = itemView.findViewById(R.id.textView);
                cardView = itemView.findViewById(R.id.cardView);
            }
        }

    }






}