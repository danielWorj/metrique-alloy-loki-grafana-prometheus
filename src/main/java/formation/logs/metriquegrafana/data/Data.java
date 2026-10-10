package formation.logs.metriquegrafana.data;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String weight;
    private Double height;
    private String suggestions;
}
