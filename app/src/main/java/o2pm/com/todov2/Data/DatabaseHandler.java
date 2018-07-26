package o2pm.com.todov2.Data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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

    public void addToDoItem(ToDoItem toDoItem) {

    }

    /*Make sure that when you create the database you are creating it with one entry which is the list name.
When adding the actual to do list item, that would be an update of the database.
Each change in the actual to do list item will mean an update of the item as well.
 */
}
