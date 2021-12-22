import java.util.ArrayList;
import java.util.List;

public class ManagerHuman {
    public static void showAll() {
        for (Human human : Main.humans) {
            human.showString();
        }
    }

    public static void showByName(String name) {
        for (Human human : Main.humans) {
            if (human.getName().trim().equals(name.trim())) {
                human.showString();
            }
        }
    }

    public static void showByGender(String gender) {
        for (Human human : Main.humans) {
            if (human.getGender().trim().equals(gender.trim())) {
                human.showString();
            }
        }
    }

    public static void showUpperAge(Long age) {
        for (Human human : Main.humans) {
            if (human.getAge() > age) {
                human.showString();
            }
        }
    }

    public static void showLowerAge(Long age) {
        for (Human human : Main.humans) {
            if (human.getAge() < age) {
                human.showString();
            }
        }
    }

    public static void addNew(Human human) {
        Main.humans.add(human);
    }

    public static void edit(Human human) {
        for (Human h : Main.humans) {
            if (h.getName() == human.getName()) {
                h = human;
                break;
            }
        }
    }

    public static void delete(String name) {
        List<Human> newList = new ArrayList<>();
        for (Human h : Main.humans) {
            if (h.getName().trim() == name.trim()) {
                continue;
            }
            newList.add(h);
        }
        Main.humans = newList;
    }
}
