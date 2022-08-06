public class Demo {
    public static void main(String[] args) {
        /* version 1.0
        Employee go6o = new Employee("Georgi");
        Task kopai = new Task("Izkopai rov",2);
        go6o.showReport();
        go6o.setCurrentTask(kopai);
        go6o.showReport();
        go6o.setHoursLeft(5);
        go6o.showReport();
        go6o.work();
        go6o.showReport();
        go6o.setHoursLeft(6);
         */
        Employee go6o = new Employee("Georgi");
        Employee pe6o = new Employee("Petar");
        Employee pe6ka = new Employee("Petra");
        Task kopai = new Task("Izkopai rov", 8);
        Task tro6i = new Task("Troshi kamuni", 20);
        Task subirai = new Task("Suberi bokluka", 5);
        Task izmii = new Task("Izmii kolata", 7);
        Task drusai = new Task("Drusai slivata", 14);
        Task kurti = new Task("Kurti plochki", 13);
        Task kodi = new Task("Kodi kato lud", 20);
        Task debugvai = new Task("Debugvai kato lud", 3);
        Task piiBira = new Task("Pii bira", 5);
        Task debaaa = new Task("debaaa", 13);
        AllWork allWork = new AllWork();
        allWork.addTask(kopai);
        allWork.addTask(tro6i);
        allWork.addTask(subirai);
        allWork.addTask(izmii);
        allWork.addTask(drusai);
        allWork.addTask(kurti);
        allWork.addTask(kodi);
        allWork.addTask(debugvai);
        allWork.addTask(piiBira);
        allWork.addTask(debaaa);
        go6o.setAllWork(allWork);
        pe6o.setAllWork(allWork);
        pe6ka.setAllWork(allWork);

        int days = 0;
        while (true) {
            days++;
            System.out.printf("Day %d all workers start working\n", days);

            go6o.startWorkingDay();
            go6o.work();
            if (allWork.isAllWorkDone()) {
                break;
            }
            pe6o.startWorkingDay();
            pe6o.work();
            if (allWork.isAllWorkDone()) {
                break;
            }
            pe6ka.startWorkingDay();
            pe6ka.work();
            if (allWork.isAllWorkDone()) {
                break;
            }
        }
    }

}
