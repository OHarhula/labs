package lab2;

import lab2.Human;

public abstract class EducationalUnit {
    protected String  title;
    protected Human manager;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setManager(Human manager) {
        this.manager = manager;
    }

    public String getTitle() {
        return title;
    }

    public Human getManager() {
        return manager;
    }
}
