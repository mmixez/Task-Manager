class Task {
    private String name;
    private String deadLine;
    private boolean isImportant;

    public Task(String name,String deadLine,boolean isImporant) {
        this.name = name;
        this.deadLine = deadLine;
        this.isImportant = isImporant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public boolean isImportant() {
        return isImportant;
    }

    public void setImportant(boolean important) {
        isImportant = important;
    }
    @Override
    public String toString() {
        return "Task" + ": "+ name +" Dead Line: "+ deadLine
                + " Important?: " + isImportant;
    }

}
