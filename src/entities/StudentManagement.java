package entities;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;
import interfaces.Management;
import entities.Etudiant;

public class StudentManagement implements Management {
    public StudentManagement(){}

    public void addStudent(List<Etudiant> students, Etudiant student){
        students.add(student);
    }

    @Override
    public void displayStudents(List<Etudiant> students, Consumer<Etudiant> consumer) {
        for(Etudiant student : students){
            consumer.accept(student);
        }
    }

    @Override
    public void displayStudentsByFilter(List<Etudiant> students, Predicate<Etudiant> predicate, Consumer<Etudiant> consumer) {
        for(Etudiant student : students){
            if(predicate.test(student)){ //Tests
                consumer.accept(student); //Displays
            }
        }
    }

    @Override
    public String returnStudentsNames(List<Etudiant> students, Function<Etudiant, String> function) {
        StringBuilder names = new StringBuilder();
        for (Etudiant student : students) {
            names.append(function.apply(student)).append(", ");
        }
        return names.toString().trim();
    }

    @Override
    public Etudiant createStudent(Supplier<Etudiant> supplier) {
        return supplier.get();
    }

    @Override
    public List<Etudiant> sortStudentsById(List<Etudiant> students, Comparator<Etudiant> comparator) {
        Collections.sort(students, comparator);
        return students;
    }

    @Override
    public Stream<Etudiant> convertToStream(List<Etudiant> students) {
        return students.stream();
    }
}
