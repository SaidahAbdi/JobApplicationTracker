package JobTrackerBackend.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "JobApplications")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Application {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String company;
    private String role;
    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status; // F.eks. "Applied", "Interview", "Rejected"
    private String notes;
    private LocalDate dateApplied;

}
