package photoalbum;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Repository;





@Repository
public class PhotoDAO {

	
	
	public List<AlbumDTO> FetchAlbum() {

		// DB CONNECTION BLOCK STARTS

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/student_register");
		dataSource.setUsername("root");
		// dataSource.setPassword("password");

		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		// BLOCK ENDS
		
		
		String sql = "SELECT Image_path,Image_name,Image_tags,Image_description from cat_album";
		// String sql = "SELECT student_name from registration_form";
		// String result = "";

		List<AlbumDTO> rows = new ArrayList<AlbumDTO>();
		try {

			List<Map<String, Object>> result = jdbcTemplate.queryForList(sql);

			if (result != null && !result.isEmpty()) {
				for (Map<String, Object> row : result) {

					AlbumDTO dto = new AlbumDTO();

					// mapping from each map to a dto object that frontend understands

					dto.setPath(row.get("Image_path").toString());
					dto.setName(row.get("Image_name").toString());
					dto.setTags(row.get("Image_tags").toString());
					dto.setDesc(row.get("Image_description").toString());
					

					rows.add(dto);  //list of DTO object going to js

				}

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return rows;

	}

}
