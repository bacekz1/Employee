public class Task {
    private String name;
    private double workingHours;

    private Employee employee;

    public Task(String name, double workingHours) {
        setName(name);
        setWorkingHours(workingHours);
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cannot be empty");
        } else {
            this.name = name;
        }
    }

     Employee getEmployee() {
        return employee;
    }

     void setEmployee(Employee employee) {
        if (this.employee == null) {
            this.employee = employee;
        }
        else {
            System.out.println(getName() + " already have employee");
        }
    }

    double getWorkingHours() {
        return workingHours;
    }

    void setWorkingHours(double workingHours) {
        if (workingHours < 0) {
            System.out.println("Working hours should be positive number");
        } else {
            this.workingHours = workingHours;
        }
    }
}
