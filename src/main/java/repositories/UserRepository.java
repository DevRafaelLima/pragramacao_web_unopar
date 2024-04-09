import org.springframework.data.jpa.repository.JpaRepository;
import com.protifolio.programacao_web_unopar.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
}