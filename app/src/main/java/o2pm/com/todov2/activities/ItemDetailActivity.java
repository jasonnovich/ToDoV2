package o2pm.com.todov2.activities;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import o2pm.com.todov2.R;

public class ItemDetailActivity extends AppCompatActivity {
    private TextView listTitle;
    private TextView itemTitle;
    private TextView dueDate;
    private TextView address;
    private TextView assignee;
    private TextView dropdownCategory;
    private TextView toDoDetails;
    private TextView actualDetails;
    private int actualPercentage;
    private int id;

    //Static variables - textviews of the UI that describe the variables above
    private TextView dueOn;
    private TextView location;
    private TextView assignedTo;
    private TextView category;
    private TextView percentageComplete;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_detail);
        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //TextViews for user input
        listTitle = findViewById(R.id.detsListTitleID);
        itemTitle = findViewById(R.id.detsItemTitleID);
        dueDate = findViewById(R.id.detsActualDateID);
        address = findViewById(R.id.detsActualLocationID);
        assignee = findViewById(R.id.detsActualNameID);
        dropdownCategory = findViewById(R.id.detsCategoryID); //Todo - figure this one out as well
        toDoDetails = findViewById(R.id.detsActualDetailsID);
        //actualPercentage = findViewById(R.id.detsActualPercentID); //Todo - figure out why integer wont be displayed


        //Text views for static UI data
        dueOn = findViewById(R.id.detsDueOnID);
        location = findViewById(R.id.detsLocationID);
        assignedTo = findViewById(R.id.detsAssignedToID);
        category = findViewById(R.id.detsCategorySpinnerID);
        percentageComplete = findViewById(R.id.detsPercentCompleteID);

        Bundle bundle = getIntent().getExtras();

        if ( bundle != null){
            listTitle.setText(bundle.getString("list_title"));
            itemTitle.setText(bundle.getString("item_title"));
            dueDate.setText(bundle.getString("due_date"));
            address.setText(bundle.getString("address"));
            assignee.setText(bundle.getString("assignee"));
            dropdownCategory.setText(bundle.getString("Category"));
            toDoDetails.setText(bundle.getString("Details"));
            actualPercentage = bundle.getInt("Percentage");
            toDoDetails.setText(bundle.getString("To Do Details"));
        }

    }

}
