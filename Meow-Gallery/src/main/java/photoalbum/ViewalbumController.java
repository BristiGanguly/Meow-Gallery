package photoalbum;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ViewalbumController {
	
	
    @Autowired
	ViewalbumService service;
	
    @RequestMapping(value={"/Rest/View"},method= RequestMethod.POST,produces="application/json")
	public @ResponseBody List<AlbumDTO> view(){
		
		List<AlbumDTO> result= service.viewRecords();
		
		return result;
		
		
	}

}
