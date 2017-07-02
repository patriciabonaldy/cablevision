package app.modelo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface AccesorioRepository extends MongoRepository<Accesorio, String> {

	Accesorio findByNombre(@Param("nombre") String nombre);

	Accesorio findById(@Param("id") String id);
	
}
