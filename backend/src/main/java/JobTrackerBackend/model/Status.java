package JobTrackerBackend.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "statuses") 
@Data 
@NoArgsConstructor // Lager tom konstruktør
@AllArgsConstructor 
public class Status {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String name; // F.eks. "Applied", "Interview", "Rejected"
}