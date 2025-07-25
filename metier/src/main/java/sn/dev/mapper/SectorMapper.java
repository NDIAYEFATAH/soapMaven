package sn.dev.mapper;

import sn.dev.dto.SectorDto;
import sn.dev.entity.ClassEntity;
import sn.dev.entity.SectorEntity;

import java.util.List;
import java.util.stream.Collectors;


public class SectorMapper {

    public static List<SectorDto> listSectorEntityTOListSectorDto(List<SectorEntity> sectorEntities) {
        return sectorEntities.stream()
                .map(SectorMapper::toSectorDto)
                .collect(Collectors.toList());
    }
    public static SectorDto toSectorDto(SectorEntity sectorEntity) {
        if (sectorEntity == null) return null;
        return new SectorDto(
                sectorEntity.getId(),
                sectorEntity.getName()
        );
    }

    public static SectorEntity toSectorEntity(SectorDto sectorDto) {
        if (sectorDto == null) return null;
        return new SectorEntity(
                sectorDto.getId(),
                sectorDto.getName()
        );
    }

}
