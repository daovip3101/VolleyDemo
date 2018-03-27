package com.example.daovip.volleydemo;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;
import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btn;
    String mJSONURLString;
    ImageView img;
     ArrayList<MonAn> arrayList = new ArrayList<>() ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn=findViewById(R.id.btn);
        img=findViewById(R.id.img);
        loadhinh();
        mJSONURLString="http://192.168.1.2/Duan1/project1/hihi.php?kihieu=danh-sach-mon-an-co-ma-nho-hon&ma=20&soluong=5";
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Initialize a new RequestQueue instance
                RequestQueue requestQueue = Volley.newRequestQueue(MainActivity.this);

                // Initialize a new JsonArrayRequest instance
                JsonArrayRequest jsonArrayRequest = new JsonArrayRequest(
                        Request.Method.GET,
                        mJSONURLString,
                        null,
                        new Response.Listener<JSONArray>() {
                            @Override
                            public void onResponse(JSONArray response) {
                                // Do something with response
                                //mTextView.setText(response.toString());

                                // Process the JSON
                                try{
                                    // Loop through the array elements
                                    for(int i=0;i<response.length();i++){
                                        // Get current json object
                                        JSONObject MonAn = response.getJSONObject(i);

                                        // Get the current student (json object) data
                                        int MaMa = MonAn.getInt("MaMA");
                                        String TenMA = MonAn.getString("TenMA");
                                        String NguyenLieu = MonAn.getString("NguyenLieu");
                                        String CachLam = MonAn.getString("CachLam");
                                        String GioiThieu = MonAn.getString("GioiThieu");
                                        int Dongia= MonAn.getInt("Dongia");
                                        String Anh = MonAn.getString("Anh");
                                        int maDM = MonAn.getInt("MaDM");
                                        MonAn monAn = new MonAn(MaMa,TenMA,NguyenLieu,CachLam,GioiThieu,Dongia,Anh,maDM);

                                        arrayList.add(monAn);
                                        // Display the formatted json data in text view
//                                        mTextView.append(firstName +" " + lastName +"\nAge : " + age);
//                                        mTextView.append("\n\n");
                                        Log.d("AAA",""+arrayList.get(i).getHinh());
                                    }
//
                                }catch (JSONException e){
                                    e.printStackTrace();
                                }
                            }

                        },
                        new Response.ErrorListener(){
                            @Override
                            public void onErrorResponse(VolleyError error){
                                // Do something when error occurred
                                Log.d("BBB",error+"");
                            }
                        }
                );

                // Add JsonArrayRequest to the RequestQueue
                requestQueue.add(jsonArrayRequest);
            }
        });

    }

    public void loadhinh(){
        String url ="http://192.168.1.2/Duan1/project1/public/images/IMG_Monan/2.jpg";
        Picasso.get()
                .load("http://192.168.1.2/Duan1/project1/public/images/IMG_Monan/18.png")
                .centerCrop()
                .resize(50,50)
                .into(img);

//        Glide.with(this).load(url).into(img);
}
}
