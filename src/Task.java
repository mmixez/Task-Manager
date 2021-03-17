class Task {
    private String name;
    private String deadLine;
    private boolean isImportant;
    ToDoList list = new ToDoList();
    static int count;
    int num;

    public Task(String name,String deadLine,boolean isImporant) {
        this.name = name;
        this.deadLine = deadLine;
        this.isImportant = isImporant;
        count++;
        num = count;
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
    public int getNum () {
        return num;
    }

    @Override
    public String toString() {
        return "Task#" + getNum() + " " + name +" Dead Line: "+ deadLine
                + " Important?: " + isImportant;
    }

}
