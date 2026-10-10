package formation.logs.metriquegrafana.data;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@AllArgsConstructor
@Service
public class DataService {
    private final DataRepository dataRepository;
    public @ResponseBody List<Data> search(){
        return this.dataRepository.findAll();
    }
    public Data calculate(Data data){
        return this.dataRepository.save(data);
    }
}
