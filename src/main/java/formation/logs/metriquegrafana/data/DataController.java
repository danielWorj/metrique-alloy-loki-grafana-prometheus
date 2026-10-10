package formation.logs.metriquegrafana.data;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping(path = "data")
@AllArgsConstructor
public class DataController {

    private final DataService dataService;

    @GetMapping
    public @ResponseBody List<Data> search(){
        return this.dataService.search();
    }

    @PostMapping
    public Data search(@RequestBody final Data data){
        return this.dataService.calculate(data);
    }
}
