package beer.web.app.model;

import org.springframework.data.annotation.Id;

public class Brewer {
	@Id
	private String id;
	
	private String nickName;
	
	private Diary diary;
}
