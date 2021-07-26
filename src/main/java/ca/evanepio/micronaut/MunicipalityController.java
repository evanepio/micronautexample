package ca.evanepio.micronaut;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;
import java.util.List;

@Controller("/municipalities")
public class MunicipalityController {
    @Inject
    List<Municipality> municipalities;

    @Get()
    public List<Municipality> municipalityList() {
        return municipalities;
    }
}
