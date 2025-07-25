package sn.dev.service;

import sn.dev.dao.ISectorDao;
import sn.dev.dao.SectorDao;
import sn.dev.dto.SectorDto;
import sn.dev.entity.SectorEntity;
import sn.dev.mapper.SectorMapper;

import java.util.List;

public class SectorService implements ISectorService{
    private final ISectorDao sectorDao = new SectorDao();
    @Override
    public List<SectorDto> getAllSectors() {
        return SectorMapper.listSectorEntityTOListSectorDto(sectorDao.findAll(new SectorEntity()));
    }

    @Override
    public SectorDto getSectorById(int id) {
        SectorEntity entity = sectorDao.findById(id, new SectorEntity());
        System.out.println("🔍 [LOG] Résultat trouvé pour ID=" + id + " : " + entity);
        return SectorMapper.toSectorDto(entity);
    }

    @Override
    public boolean createSector(SectorDto sectorDto) {
        return sectorDao.save(SectorMapper.toSectorEntity(sectorDto));
    }

    @Override
    public boolean updateSector(SectorDto sectorDto) {
        return sectorDao.update(SectorMapper.toSectorEntity(sectorDto));
    }

    @Override
    public boolean deleteSector(int id) {
        return sectorDao.delete(id, new SectorEntity());
    }
}
