package com.example.behavioral.momento;

/**
 * @author Mahdi Sharifi
 * @since 9/24/22
 */
//https://www.geeksforgeeks.org/memento-design-pattern/
//The Memento Design Pattern offers a solution to implement undoable actions. 

class Life
{
    private String time;

    public void set(String time)
    {
        System.out.println("Setting time to " + time);
        this.time = time;
    }

    public Memento saveToMemento()
    {
        System.out.println("Saving time to Memento");
        return new Memento(time);
    }

    public String restoreFromMemento(Memento memento)
    {
        time = memento.getSavedTime();
        System.out.println("Time restored from Memento: " + time);
        return time;
    }

    public static class Memento
    {
        private final String time;

        public Memento(String timeToSave)
        {
            time = timeToSave;
        }

        public String getSavedTime()
        {
            return time;
        }
    }
}
