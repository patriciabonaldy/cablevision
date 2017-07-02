package app.modelo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface ModeloRepository extends MongoRepository<Modelo, String> {

	Modelo findByNombre(@Param("nombre") String nombre);
	
}
