package sn.dev.mapper;

import sn.dev.dto.ClasseDto;
import sn.dev.dto.SectorDto;
import sn.dev.entity.ClassEntity;
import sn.dev.entity.SectorEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ClasseMapper {
    public static List<ClasseDto> listClasseEntityToListClasseDto(List<ClassEntity> classEntities){
        return classEntities.stream()
                .map(ClasseMapper::toClasseDto)
                .collect(Collectors.toList());
    }
    public static ClasseDto toClasseDto(ClassEntity classEntity)
    {
        SectorEntity sector = classEntity.getSector();
        SectorDto sectorDto = new SectorDto(sector.getId(), sector.getName());
        return new ClasseDto(
                classEntity.getId(),
                classEntity.getClassName(),
                classEntity.getDescription(),
                sectorDto
        );
    }
    public static ClassEntity toClassEntity(ClasseDto classeDto)
    {
        SectorDto sectorDto = classeDto.getSector();
        SectorEntity sector = new SectorEntity(sectorDto.getId(), sectorDto.getName());
        return new ClassEntity(
                classeDto.getId(),
                classeDto.getClassName(),
                classeDto.getDescription(),
                sector
        );
    }
}
