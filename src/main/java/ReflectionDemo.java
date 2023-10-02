import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReflectionDemo {

    public static <T> int getNumberOfElementsInTheListThatAreObjectsOfTypeHumanOrItsSubtypes(ArrayList<T> objList) {
        return (int) objList.stream().filter(n->n instanceof Human).count();
    }

    public static <T> List<String> getListOfObjectNamesOfItsPublicMethods (T obj) {
        return Arrays.stream(obj.getClass().getMethods()).map(Method::getName).toList();
    }

    public static <T> List<String> getListOfNamesOfSuperclasses(T obj) {
        List<String> superclassNamesList = new ArrayList<String>();
        Class<?> objClass = obj.getClass();
        while(objClass != null) {
            superclassNamesList.add(objClass.getName());
            objClass = objClass.getSuperclass();
        }
        return superclassNamesList;
    }
}
