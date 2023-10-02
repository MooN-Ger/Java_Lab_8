import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class ReflectionDemoTest {

    @Test
    public void testGetNumberOfElementsInTheListThatAreObjectsOfTypeHumanOrItsSubtypes() {
        Human human1 = new Human("name1", "surname1", "patronymic1", 11);
        Human human2 = new Human("name2", "surname2", "patronymic2", 22);
        Human human3 = new Human("name3", "surname3", "patronymic3", 33);
        Student student1 = new Student("stName1", "stSurname1", "stPatronymic1", 21, "Math", 1);
        Student student2 = new Student("stName2", "stSurname2", "stPatronymic2", 22, "IT", 2);
        Car car1 = new Car("carName1", "black", 110);
        String str = "string";
        int num = 404;

        var list = new ArrayList<>();
        list.add(human1);
        list.add(human2);
        list.add(human3);
        list.add(student1);
        list.add(student2);
        list.add(car1);
        list.add(str);
        list.add(num);
        assertEquals(5, ReflectionDemo.getNumberOfElementsInTheListThatAreObjectsOfTypeHumanOrItsSubtypes(list));

    }

    @Test
    public void testGetListOfObjectNamesOfItsPublicMethods() {
        Human human1 = new Human("name1", "surname1", "patronymic1", 11);
        List<String> expectedList = new ArrayList<String>();
        Collections.addAll(expectedList, "getName", "equals", "toString", "hashCode", "setName", "getSurname", "setSurname", "getPatronymic", "setPatronymic", "setAge", "getAge", "wait", "wait", "wait", "getClass", "notify", "notifyAll");
        List<String> actualList = new ArrayList<String>(ReflectionDemo.getListOfObjectNamesOfItsPublicMethods(human1));
        Collections.sort(expectedList);
        Collections.sort(actualList);
        assertEquals(expectedList, actualList);
    }

    @Test
    public void testGetListOfNamesOfSuperclasses() {
        Student student1 = new Student("stName1", "stSurname1", "stPatronymic1", 21, "Math", 1);
        List<String> expectedList = new ArrayList<String>();
        Collections.addAll(expectedList, "Human", "Student", "java.lang.Object");
        List<String> actualList = new ArrayList<String>(ReflectionDemo.getListOfNamesOfSuperclasses(student1));
        Collections.sort(expectedList);
        Collections.sort(actualList);
        assertEquals(expectedList, actualList);
    }
}