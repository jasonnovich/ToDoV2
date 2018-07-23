package o2pm.com.todov2.activities.model;

public class ToDoItem {

    private String listTitle
    private String itemTitle;
    private String dueOn;
    private String dueDate;
    private String location;
    private String address;
    private String assignedTo;
    private String assignee;
    private String category;
    private String dropdownCategory;
    private String toDoDetails;
    private String actualDetails;
    private int id;

    public ToDoItem() {
    }

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
}
