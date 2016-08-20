package beer.web.app.model;

import org.springframework.data.annotation.Id;

public class Beer {
	@Id
	private String id;
	
	private Recipe recipe;
}
