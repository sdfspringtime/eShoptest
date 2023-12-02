package com.projtest.idriss.DTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.projtest.idriss.Entities.Chart;
import com.projtest.idriss.Entities.Users;
@Component
@Mapper(componentModel="spring")
public interface UserMapper {
@Mapping(source="users.id", target="id")
@Mapping(source="users.username",target="username")
@Mapping(source="users.password",target="password")
@Mapping(source="users.name",target="name")
@Mapping(source="users.email",target="email")
@Mapping(source="chart.id",target="chartid")
 UserDTO toUserDTO(Chart chart, Users user);

@Mapping(source = "id", target = "id")  // Mapping UserDTO.id to Users.id
@Mapping(source = "username", target = "username")  // Mapping UserDTO.username to Users.username
@Mapping(source = "password", target = "password")  // Mapping UserDTO.password to Users.password
@Mapping(source = "name", target = "name")  // Mapping UserDTO.name to Users.name
@Mapping(source = "email", target = "email")  // Mapping UserDTO.email to Users.email
@Mapping(source = "chartid", target = "chart.id")
 Users dtoToEntity(UserDTO userDTO);
}
