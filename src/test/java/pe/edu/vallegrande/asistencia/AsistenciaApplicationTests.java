package pe.edu.vallegrande.asistencia;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
@SpringBootTest
class AsistenciaApplicationTests {
 	@Test
 	void contextLoads() {
   // Implementar prueba para verificar que el contexto de Spring carga correctamente.
   assertThat(applicationContext).isNotNull();
 	}
}
