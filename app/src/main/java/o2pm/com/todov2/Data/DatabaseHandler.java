package o2pm.com.todov2.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
     * This is for a method in the class
     * @param db
     */
    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    /**
     * <dl>
     * <dt><span class="strong">Heading 1</span></dt><dd>There is a line break.</dd>
     * <dt><span class="strong">Heading 2</span></dt><dd>There is a line break.</dd>
     * </dl>
     * Laura is the greatest techwriter in the world!!
     * @param db
     * @param oldVersion
     * @param newVersion
     */
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    /**
     * This method adds a To Do list item.
     * @param toDoItem
     */
    public void addToDoItem(ToDoItem toDoItem) {

    }

    /**
     * Ths method returns a To Do Item from the list based on the ID and the list name.
     * @param listName
     * @param id
     * @return
     */
    public ToDoItem getToDoItem(String listName, int id) {
        return null;
    }

    /**
     * This method returns the entire list of To Do Items.
     * @return
     */
    public List<ToDoItem> getAllToDoItems() {
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

    /*Make sure that when you create the database you are creating it with one entry which is the list name.
When adding the actual to do list item, that would be an update o1f the database.
Each change in the actual to do list item will mean an update of the item as well.
 */
}
