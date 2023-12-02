package com.projtest.idriss.Services;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projtest.idriss.DTO.UserDTO;
import com.projtest.idriss.DTO.UserMapper;
import com.projtest.idriss.DTO.UserMapperImpl;
import com.projtest.idriss.Entities.Users;
import com.projtest.idriss.Repositories.UserRepository;

@Service
public class UserService {
@Autowired
UserRepository Urepo;
@Autowired
UserMapperImpl umi;
@Autowired
UserMapper umap;
public UserDTO getUserbyId(long id) {
	 
	Optional<Users> aaa = Urepo.findById(id);
	System.out.println(aaa.get().getName());
	
	return aaa.map(user->{
		return umi.toUserDTO(user.getChart(), user);}).orElse(new UserDTO());
}


public Users saveUser(UserDTO userdto) {
	Users usr=new Users();
	usr.setId(userdto.getId());
	usr.setUsername(userdto.getUsername());
	usr.setPassword(userdto.getPassword());
	usr.setName(userdto.getName());
	usr.setEmail(userdto.getEmail());
	return Urepo.save(usr);
}
public Users editUser(long id,UserDTO userdto) { 
	Users u1=umi.dtoToEntity(userdto);
Users u=Urepo.findById(id).get();
u.setId(u1.getId());
u.setUsername(u1.getUsername());
u.setPassword(u1.getPassword());
u.setName(u1.getName());
u.setEmail(u1.getEmail());
return Urepo.save(u);


}
public void deleteUser(long id) {
	Urepo.deleteById(id);
}
private <U> U toUserDTO(Users users1) {
	return null;
}
}

