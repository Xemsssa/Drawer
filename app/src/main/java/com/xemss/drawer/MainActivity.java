package com.xemss.drawer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                if (i == 1) {
//                    Intent intent = new Intent(MainActivity.this, PizzaActivity.class);
//                    startActivity(intent);
//                }
                Intent intent = null;
                switch(i) {
                    case 1:
                        intent = new Intent(MainActivity.this, PizzaActivity.class);
                        break;
                    case 2:
                        intent = new Intent(MainActivity.this, PastaActivity.class);
                        break;
                    case 3:
                        intent = new Intent(MainActivity.this, StoresActivity.class);
                        break;
                    default:
//                        intent = new Intent(MainActivity.this, PizzaActivity.class);
                        break;
                }

                startActivity(intent);
            }
        };

        listView = (ListView) findViewById(R.id.list_item);
        listView.setOnItemClickListener(onItemClickListener);
    }
}
