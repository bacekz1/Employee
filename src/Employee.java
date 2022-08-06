public class Employee {
    private final static String noWork = "The employee haven`t current task.";

    private AllWork allWork;
    private String name;
    private Task currentTask;
    private double hoursLeft;

    Employee(String name) {
        setName(name);
    }

    void setAllWork(AllWork allWork) {
        this.allWork = allWork;
    }


    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

    void setCurrentTask(Task task) {
        if (task == null) {
            System.out.println("exception set Current task");
        } else {
            this.currentTask = task;
        }
        System.out.printf("%s get %s\n", name, currentTask.getName());
    }

    double getHoursLeft() {
        return hoursLeft;
    }

    void setHoursLeft(double hoursLeft) {
        if (hoursLeft <= 0) {
            System.out.println("Working hours should be positive number");
        } else {
            this.hoursLeft = hoursLeft;
        }
    }

    void startWorkingDay() {
        setHoursLeft(8);
    }

    void work() {
        if (!isNull(currentTask)) {
            if (currentTask.getWorkingHours() > hoursLeft) {
                currentTask.setWorkingHours(currentTask.getWorkingHours() - getHoursLeft());
                printJobAlreadyNotDone();
                hoursLeft = 0;
            } else if (currentTask.getWorkingHours() < hoursLeft) {
                hoursLeft -= currentTask.getWorkingHours();
                printJobDone(currentTask.getWorkingHours());
                currentTask.setWorkingHours(0);
                currentTask = allWork.getNextTask();
                if (isNull(currentTask)){
                    return;
                }
                printWorkerSetJob();
                work();
            } else {
                printJobDone(hoursLeft);
                hoursLeft = 0;
                currentTask.setWorkingHours(0);
                currentTask = null;
            }
        } else {
            currentTask = allWork.getNextTask();
            if (isNull(currentTask)) {
                return;
            }
            printWorkerSetJob();
            work();
        }
    }

    private void printWorkerSetJob() {
        System.out.printf("%s start work on %s\n", name, currentTask.getName());
    }

    private void printJobAlreadyNotDone() {
        System.out.printf("%s work on %s %.2f hours %.2f hours left on task %s\n"
                , name, currentTask.getName(), this.hoursLeft,
                this.currentTask.getWorkingHours(), currentTask.getName());
    }

    private void printJobDone(double num) {
        System.out.printf("%s work %.2f hours and %s is done\n"
                , this.name, num, this.currentTask.getName());
    }

    void showReport() {
        if (!isNull(currentTask)) {
            print();
        } else {
            System.out.println(noWork);
        }
    }

    private boolean isNull(Task task) {
        return task == null;
    }

    private void print() {
        System.out.printf("Employee:%s\nTask:%s\nEmployee can work %.2f hours\nTask need %.2f hours to be finished",
                name, currentTask.getName(), getHoursLeft(), currentTask.getWorkingHours());
        System.out.println();
    }
}
