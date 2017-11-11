package eg.com.taman.mohamed.hellokotlin;

/**
 * Created by mohamed_taman on 11/6/17.
 */

public interface AgeComparer {

    default int compareAges(Person p1, Person p2){

        return Integer.valueOf(p1.getAge()).compareTo(p2.getAge());

    }
}
