package study1;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Man {

    String name;
    int age;

    @Override
    public String toString() {
        return "HoloMan{" +
                "name='" + name + '\'' +
                ", howLong=" + age +
                '}';
    }
}
