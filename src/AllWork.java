public class AllWork {
    private Task[] tasks = new Task[10];
    private int freePlacesForTasks = 10;
    private int currentUnassignedTask = 0;

    AllWork() {
    }
    void addTask(Task task) {
        if (freePlacesForTasks > 0) {
            tasks[10 - freePlacesForTasks] = task;
            freePlacesForTasks--;
        }
    }

    Task getNextTask() {
        if (currentUnassignedTask == tasks.length) {
            return null;
        }
        return tasks[currentUnassignedTask++];
    }

    boolean isAllWorkDone() {
        for (int i = 0; i < tasks.length; i++) {
            if (!isNull(tasks[i]) && tasks[i].getWorkingHours() != 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isNull(Object o) {
        return o == null;
    }

}
