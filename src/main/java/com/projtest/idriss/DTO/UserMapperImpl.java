package com.projtest.idriss.DTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projtest.idriss.Entities.Chart;
import com.projtest.idriss.Entities.Users;
import com.projtest.idriss.Repositories.ChartRepository;
@Component
public class UserMapperImpl implements UserMapper{
	@Autowired
    private ChartRepository chartRepository;
	@Override
	public UserDTO toUserDTO(Chart chart, Users user) {
		UserDTO userdto=new UserDTO();
		userdto.setId(user.getId());
		userdto.setUsername(user.getUsername());
		userdto.setPassword(user.getPassword());
		userdto.setName(user.getName());
		userdto.setEmail(user.getEmail());
		if (chart!=null) {
		userdto.setChartid(chart.getId());}
		return userdto;
	}
	 @Override
	    public Users dtoToEntity(UserDTO userDTO) {
	        if (userDTO == null) {
	            return null;
	        }

	        Users usersEntity = new Users();
	        usersEntity.setId(userDTO.getId());
	        usersEntity.setUsername(userDTO.getUsername());
	        usersEntity.setPassword(userDTO.getPassword());
	        usersEntity.setName(userDTO.getName());
	        usersEntity.setEmail(userDTO.getEmail());

	        Long chartId = userDTO.getChartid();
	        if (chartId != null) {
	            Chart chart = chartRepository.findById(chartId).orElse(null);
	            usersEntity.setChart(chart);
	        }

	        return usersEntity;
	    }

}
