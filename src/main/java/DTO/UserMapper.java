package DTO;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.projtest.idriss.Entities.Chart;
import com.projtest.idriss.Entities.Users;

@Mapper(componentModel="spring")
public interface UserMapper {
@Mapping(source="users.id", target="id")
@Mapping(source="users.username",target="username")
@Mapping(source="users.password",target="password")
@Mapping(source="users.name",target="name")
@Mapping(source="users.email",target="email")
@Mapping(source="chart.id",target="chartid")
 UserDTO toUserDTO(Chart chart, Users user);
}
