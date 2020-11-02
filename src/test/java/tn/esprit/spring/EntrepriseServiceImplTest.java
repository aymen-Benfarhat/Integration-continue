package tn.esprit.spring;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import tn.esprit.spring.entities.Entreprise;
import tn.esprit.spring.repository.DepartementRepository;
import tn.esprit.spring.services.IEntrepriseService;

@RunWith(SpringRunner.class)

@SpringBootTest

public class EntrepriseServiceImplTest {

	@Autowired
	IEntrepriseService es;
	@Autowired
	DepartementRepository deptRepoistory;

	@Test
	public void ajouterEntrepriseTest() {
		

		Entreprise ent = new Entreprise("eeprise1", "raient1");
		
		 ent.setId(2);
		 es.ajouterEntreprise(ent);
			assertEquals(2,ent.getId());
		

		
	
	}
}
