package controller;

public class UpdateListMessage implements Message{

    // Controller updates the sidebar if we want to show only important tasks

    private boolean showImportant;
    public UpdateListMessage(boolean showImportant){
        this.showImportant = showImportant;
    }
    public boolean isShowAll() {
        return showImportant;
    }

//    @Override
//    public String getTaskName() {
//        return null;
//    }
//
//    @Override
//    public String getDetails() {
//        return null;
//    }
//
//    @Override
//    public String getDate() {
//        return null;
//    }
}
