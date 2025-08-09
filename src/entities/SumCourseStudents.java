package entities;

import java.util.Objects;

public class SumCourseStudents {
    private int idStudant;

    public SumCourseStudents(int idStudant) {
        this.idStudant = idStudant;
    }

    public int getIdStudant() {
        return idStudant;
    }

    public void setIdStudant(int idStudant) {
        this.idStudant = idStudant;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        SumCourseStudents that = (SumCourseStudents) o;
        return idStudant == that.idStudant;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idStudant);
    }

    @Override
    public String toString() {
        return String.valueOf(idStudant);
    }
}
