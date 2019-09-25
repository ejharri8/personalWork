import java.util.*;

public class Scheduler {
    // variables
    protected ArrayList<String> schedule = new ArrayList<>();
    protected int size = 0;
    protected Scheduler()
    {

    }

    public void addClass(String myClass)
    {
        schedule.add(myClass);
        size++;
    }

    protected void viewClasses()
    {
        for(int i = 0 ; i < size ; i++) {
            System.out.println((i+1) + " " + schedule.get(i));
        }
    }

    public boolean removeClass(String thisClass) {
        boolean res = true;
        for (int y = 0; y < schedule.size(); y++) {
            if (schedule.get(y).equals(thisClass)) {
                schedule.remove(thisClass);
                size--;
                return res;
            } else {
                res = false;
            }

        }
        return res;
    }

    public boolean isEmpty()
    {
        boolean res = true;
        if (!schedule.isEmpty())
        {
            res = false;
        }
        return res;
    }

    public String lastAdded()
    {
        return schedule.get(size-1);
    }

    public int getSize()
    {
        return size;
    }

}
