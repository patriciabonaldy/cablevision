package app.modelo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface AutoRepository extends MongoRepository<Auto, String> {

	List<Auto> findAll();

	Auto findById(@Param("idSigla") String idSigla);
	
	List<Accesorio> findByAccesoriosList(@Param("id") String id);
	
}
