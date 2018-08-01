package o2pm.com.todov2.Data;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.text.DateFormat;
import java.util.Date;
import java.util.List;

import o2pm.com.todov2.model.ToDoItem;
import o2pm.com.todov2.util.Constants;

/**
 * This is for the whole class.
 */
public class DatabaseHandler extends SQLiteOpenHelper {

    private Context ctx;

    /**
     *
      * @param context
     */

    public DatabaseHandler(Context context) {
        super(context, Constants.DB_NAME, null, Constants.DB_VERSION);
        this.ctx = context;
    }

    /**
     * This method is used to create the database
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TO_DO_LIST_TABLE = "CREATE TABLE " + Constants.TABLE_NAME + "("
                + Constants.KEY_ID + " INTEGER PRIMARY KEY," + Constants.LISTTITLE + " TEXT,"
                + Constants.ITEMTITLE + " TEXT,"
                + Constants.DUEDATE + " TEXT,"
                + Constants.ADDRESS + " TEXT,"
                + Constants.ASSIGNEE + " TEXT,"
                + Constants.DROPDOWNCATEGORY + " TEXT,"
                + Constants.ACTUALDETAILS + " TEXT,"
                + Constants.ACTUALPERCENTAGE + " LONG;";

        db.execSQL(CREATE_TO_DO_LIST_TABLE);

    }

    /**
     * <dl>
     * <dt><span class="strong">Heading 1</span></dt><dd>There is a line break.</dd>
     * <dt><span class="strong">Heading 2</span></dt><dd>There is a line break.</dd>
     * </dl>
     *
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + Constants.TABLE_NAME);

        onCreate(db);
    }

    /**
     *
     * @param toDoItem
     */
    public void addToDoItem(ToDoItem toDoItem) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values = new ContentValues();

        values.put(Constants.LISTTITLE, toDoItem.getListTitle());
        values.put(Constants.ITEMTITLE, toDoItem.getItemTitle());
        values.put(Constants.DUEDATE, toDoItem.getDueDate());
        values.put(Constants.ADDRESS, toDoItem.getAddress());
        values.put(Constants.ASSIGNEE, toDoItem.getAssignee());
        values.put(Constants.DROPDOWNCATEGORY, toDoItem.getDropdownCategory());
        values.put(Constants.ACTUALDETAILS, toDoItem.getActualDetails());
        values.put(String.valueOf(Constants.ACTUALPERCENTAGE), toDoItem.getActualPercentage());

        //insert row

        db.insert(Constants.TABLE_NAME, null, values);
    }

    /**
     * Ths method returns a To Do Item from the list based on the ID and the list name.
     * @param listName
     * @param id
     * @return
     */
    public ToDoItem getToDoItem(String listName, int id) {
        SQLiteDatabase db = this.getReadableDatabase();

        Cursor cursor = db.query(Constants.TABLE_NAME, new String[] {Constants.LISTTITLE,
                Constants.ITEMTITLE, Constants.DUEDATE, Constants.ADDRESS,
                Constants.ASSIGNEE,Constants.DROPDOWNCATEGORY, Constants.ACTUALDETAILS,
                String.valueOf(Constants.ACTUALPERCENTAGE)}, Constants.LISTTITLE + "=?", + " AND "
                + Constants.ITEMTITLE + "=?",
                new String[] {Constants.LISTTITLE, Constants.ITEMTITLE}, null,
                null, null, null);

        if (cursor != null)
            cursor.moveToFirst();

            ToDoItem toDoItem = new ToDoItem();
            toDoItem.setId(Integer.parseInt(cursor.getString(cursor.getColumnIndex(Constants.KEY_ID))));
            toDoItem.setListTitle(cursor.getString(cursor.getColumnIndex(Constants.LISTTITLE)));
            toDoItem.setItemTitle(cursor.getString(cursor.getColumnIndex(Constants.ITEMTITLE)));
            toDoItem.setActualDetails(cursor.getString(cursor.getColumnIndex(Constants.ACTUALDETAILS)));
            toDoItem.setAddress(cursor.getString(cursor.getColumnIndex(Constants.ADDRESS)));
            toDoItem.setAssignee(cursor.getString(cursor.getColumnIndex(Constants.ASSIGNEE)));
            toDoItem.setDropdownCategory(cursor.getString(cursor.getColumnIndex(Constants.DROPDOWNCATEGORY)));
            toDoItem.setActualPercentage(cursor.getInt(cursor.getColumnIndex(String.valueOf(Constants.ACTUALPERCENTAGE))));


            //Set the formatted due date
            DateFormat dateFormat = DateFormat.getDateInstance();
            String formattedDate = dateFormat.format(new Date(cursor.getLong(cursor.getColumnIndex(Constants.DUEDATE))));
            toDoItem.setDueDate(formattedDate);

        return toDoItem;

    }

    /**
     * This method returns the entire list of To Do Items.
     * @return
     */
    public List<ToDoItem> getAllToDoItems() {
        SQLiteDatabase db = this.getReadableDatabase();
        return null;
    }

    /**
     * This method updates and returns a To Do item
     * @param toDoItem
     * @return
     */
    public int updateToDoItem(ToDoItem toDoItem) {

        return 0;
    }

    /**
     * This method deletes a To Do Items from a specific list
     * @param listname
     */
    public void deleteToDoItem(String listName) {

    }

    /**
     * This method adds a To Do List to the master database list.
     * @param listName
     */
    public void addToDoList (String listName){

    }

    /**
     * This method deletes a To Do list in its entirety
     * @param listName
     */
    public void deleteToDoList(String listName){

    }

    /**
     * This method returns the amount of items in a specific list
     * @return
     */
    public int getToDoListItemCount() {
        return 0;
    }

}
