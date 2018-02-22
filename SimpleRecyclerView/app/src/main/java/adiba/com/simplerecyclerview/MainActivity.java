package adiba.com.simplerecyclerview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    ArrayList <SingleItem> itemArrayList = new ArrayList <>();
    SingleItem singleItem;
    RecyclerViewAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction("Action", null).show();
            }
        });

        String[] name = {"name1", "name2", "name3", "name4", "name5", "name6", "name7", "name8", "name9"};
        String[] vName = {"varsityName1", "varsityName2", "varsityName3", "varsityName4", "varsityName5", "varsityName6", "varsityName7", "varsityName8", "varsityName9"};
        String[] address = {"address1", "address2", "address3", "address4", "address5", "address6", "address7", "address8", "address9"};

        for (int i = 0; i < name.length; i++) {

            singleItem = new SingleItem(name[i], vName[i], address[i]);
            itemArrayList.add(singleItem);
            Log.d(TAG, "onCreate: "+ itemArrayList);
        }


        recyclerView = (RecyclerView) findViewById(R.id.recyclerview);

        adapter = new RecyclerViewAdapter(MainActivity.this, itemArrayList);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setAdapter(adapter);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
