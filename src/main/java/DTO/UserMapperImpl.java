package DTO;

import com.projtest.idriss.Entities.Chart;
import com.projtest.idriss.Entities.Users;

public class UserMapperImpl implements UserMapper{

	@Override
	public UserDTO toUserDTO(Chart chart, Users user) {
		UserDTO userdto=new UserDTO();
		userdto.setId(user.getId());
		userdto.setUsername(user.getUsername());
		userdto.setPassword(user.getPassword());
		userdto.setName(user.getName());
		userdto.setEmail(user.getEmail());
		userdto.setChartid(chart.getId());
		return null;
	}

}
