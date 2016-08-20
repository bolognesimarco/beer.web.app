package beer.web.app.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.annotation.Id;

public class Diary {
	@Id
	private String id;
	
	private List<Beer> beers = new ArrayList<Beer>();
}
