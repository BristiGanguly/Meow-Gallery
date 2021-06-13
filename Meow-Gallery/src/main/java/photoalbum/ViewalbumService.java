package photoalbum;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ViewalbumService {
	
	@Autowired
	PhotoDAO dao;
	
public List<AlbumDTO> viewRecords(){
	
	List<AlbumDTO> result= dao.FetchAlbum();
		
		return result;
		
		
	}

}
