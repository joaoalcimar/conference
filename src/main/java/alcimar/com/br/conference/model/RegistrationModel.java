package alcimar.com.br.conference.model;

import javax.validation.constraints.NotEmpty;

public class RegistrationModel {

    @NotEmpty
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
