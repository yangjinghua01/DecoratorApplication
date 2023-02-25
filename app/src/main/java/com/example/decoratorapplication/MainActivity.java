package com.example.decoratorapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.WrapperListAdapter;

import com.example.decoratorapplication.simple1.TeacherEat;

public class MainActivity extends AppCompatActivity {
    private RecyclerView ry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ry = findViewById(R.id.ry);
        ry.setLayoutManager(new LinearLayoutManager(this));
        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter();
        WrapRecycleAdapter wrapRecycleAdapter = new WrapRecycleAdapter(recyclerViewAdapter);
        ry.setAdapter(wrapRecycleAdapter);
        View headerView = LayoutInflater.from(this).inflate(R.layout.layout_header_view, null);
        wrapRecycleAdapter.addFooterView(headerView);
    }


    private class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {


        @NonNull
        @org.jetbrains.annotations.NotNull
        @Override
        public ViewHolder onCreateViewHolder(@NonNull @org.jetbrains.annotations.NotNull ViewGroup parent, int viewType) {
            View itemView = LayoutInflater.from(MainActivity.this).inflate(R.layout.item_main, parent, false);
            return new ViewHolder(itemView);
        }

        @Override
        public void onBindViewHolder(@NonNull @org.jetbrains.annotations.NotNull MainActivity.RecyclerViewAdapter.ViewHolder holder, int position) {
            holder.tx.setText("postion=" + position);
        }

        @Override
        public int getItemCount() {
            return 100;
        }

        class ViewHolder extends RecyclerView.ViewHolder {
            public TextView tx;

            public ViewHolder(@NonNull @org.jetbrains.annotations.NotNull View itemView) {
                super(itemView);
                tx = itemView.findViewById(R.id.text);
            }
        }

    }


}