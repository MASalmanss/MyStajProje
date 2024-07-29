package com.stajProje.stajProje.dto;

import com.stajProje.stajProje.entity.Location;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "Spring")
public interface LocationMapper {

    @Mapping(source = "as" , target = "asDescription")
    Location LocationDtoToLocation(LocationDto locationDto);
}
