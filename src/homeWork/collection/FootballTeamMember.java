package homeWork.collection;

import java.util.Objects;

public final class FootballTeamMember {
    int number;
    String name;

    public FootballTeamMember(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FootballTeamMember that = (FootballTeamMember) o;
        return number == that.number && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name);
    }

    @Override
    public String toString() {
        return "FootballTeamMember{" +
                "number=" + number +
                ", name='" + name + '\'' +
                '}';
    }
}
