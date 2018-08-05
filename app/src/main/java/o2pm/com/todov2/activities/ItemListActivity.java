package o2pm.com.todov2.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;

import java.util.List;

import o2pm.com.todov2.Data.DatabaseHandler;
import o2pm.com.todov2.R;
import o2pm.com.todov2.model.ToDoItem;

public class ItemListActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private RecydlerViewAdapater recyclerViewAdapter;
    //Todo - Recyclerviewadapter not importing right
    private List<ToDoItem> toDoItemList;
    private List<ToDoItem> toDoItems;
    private DatabaseHandler db;
    private AlertDialog.Builder dialogBuilder;
    private AlertDialog dialog;

    private

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                startActivity(new Intent(ItemListActivity.this, ItemDetailActivity.class));
                Log.d("FAB1 Clicked", "Yes!");
                finish();

            }
        });
    }

}
