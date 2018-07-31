package o2pm.com.todov2.model;

public class ToDoItem {

    //Data variables - auto or user input
    private String listTitle;
    private String itemTitle;
    private String dueDate;
    private String address;
    private String assignee;
    private String dropdownCategory;
    private String toDoDetails;
    private String actualDetails;
    private int actualPercentage;
    private int id;

    //Static variables - textviews of the UI that describe the variables above
    private String dueOn;
    private String location;
    private String assignedTo;
    private String category;
    private String percentageComplete;

    // Empty Constructor
    public ToDoItem() {
    }

    //Getters and Setters
    public String getListTitle() {
        return listTitle;
    }

    public void setListTitle(String listTitle) {
        this.listTitle = listTitle;
    }

    public String getItemTitle() {
        return itemTitle;
    }

    public void setItemTitle(String itemTitle) {
        this.itemTitle = itemTitle;
    }

    public String getDueOn() {
        return dueOn;
    }

    public void setDueOn(String dueOn) {
        this.dueOn = dueOn;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getAssignee() {
        return assignee;
    }

    public void setAssignee(String assignee) {
        this.assignee = assignee;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDropdownCategory() {
        return dropdownCategory;
    }

    public void setDropdownCategory(String dropdownCategory) {
        this.dropdownCategory = dropdownCategory;
    }

    public String getToDoDetails() {
        return toDoDetails;
    }

    public void setToDoDetails(String toDoDetails) {
        this.toDoDetails = toDoDetails;
    }

    public String getActualDetails() {
        return actualDetails;
    }

    public void setActualDetails(String actualDetails) {
        this.actualDetails = actualDetails;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPercentageComplete() {
        return percentageComplete;
    }

    public void setPercentageComplete(String percentageComplete) {
        this.percentageComplete = percentageComplete;
    }

    public int getActualPercentage() {
        return actualPercentage;
    }

    public void setActualPercentage(int actualPercentage) {
        this.actualPercentage = actualPercentage;
    }
}
