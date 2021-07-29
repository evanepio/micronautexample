package ca.evanepio.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/municipalities")
public class MunicipalityController {
    private final List<Municipality> municipalities;

    public MunicipalityController(List<Municipality> municipalities) {
        this.municipalities = municipalities;
    }

    @Get()
    public List<Municipality> municipalityList() {
        return municipalities;
    }
}
