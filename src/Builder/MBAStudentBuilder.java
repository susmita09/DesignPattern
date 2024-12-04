package Builder;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubject() {
        List<String> sub = new ArrayList<>();
        sub.add("Finance");
        sub.add("Math");

        this.subjects = sub;
        return  this;
    }
}
