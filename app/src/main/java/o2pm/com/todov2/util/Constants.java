package o2pm.com.todov2.util;

public class Constants {

    public static final int DB_VERSION = 1;
    public static final String DB_NAME = "toDoListDB";
    public static final String TABLE_NAME = "toDoListTBL";

    //Table columns of user input
    public static final String KEY_ID = "id";               //ID in the table
    public static final String LISTTITLE = null;            //User input - title of a list of To Do items
    public static final String ITEMTITLE = null;            //User input - title of the to do item itself
    public static final String DUEDATE = null;              //User input - actual due date selected from date picker
    public static final String ADDRESS = null;              //User input - actual location of the to do item from google maps or manual
    public static final String ASSIGNEE = null;             //user input - actual person assigned the task from contact picker
    public static final String DROPDOWNCATEGORY = null;     //User input - actual drop down category as listed categories from google maps
    public static final String ACTUALDETAILS = null;        //User input - actual details that the user enters for the to do item
    public static final int ACTUALPERCENTAGE = 0;           //User input - actual percentage complete in #

    //Static items in the UI
    public static final String DUEON = null;
    public static final String LOCATION = null;
    public static final String ASSIGNEDTO = null;
    public static final String TODODETAILS = null;
    public static final String CATEGORY = null;
    public static final String PERCENTAGECOMPLETE = null;



}
