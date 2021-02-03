package mybase.domain.types;

import java.util.Arrays;
import java.util.List;

public enum GoalType {

    /*цели : личное, здоровье, работа, быт, финансовое благополучие, досуг, учеба, семья, творчество, ремесло*/

    PERSONAL(10, "Личное"),
    HEALTH(20, "здоровье"),
    JOB(30, "Личное"),
    EVERYDAY_LIFE(40, "Личное"),
    FINANCE(50, "Личное"),
    LEISURE(60, "Личное"),
    STUDY(70, "Личное"),
    FAMILY(80, "Личное"),
    CREATION(90, "Личное"),
    CRAFT(100, "Личное");

    private final String name;

    private int code;

    GoalType(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public static List<GoalType> getAllTypes() {
        return Arrays.asList(GoalType.values());
    }
}
