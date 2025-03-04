public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    public ToDoItem(String description, boolean isDone) {
        this.description = description;
        this.isDone = isDone;
    }
    // Add getters and setters for each field
    public String getDescription(){
        return description;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public boolean getIsDone(){
        return isDone;
    }

    public void setIsDone(boolean isDone){
        this.isDone = isDone;
    }
}