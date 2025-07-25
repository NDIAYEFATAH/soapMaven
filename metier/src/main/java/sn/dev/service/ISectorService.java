package sn.dev.service;

import sn.dev.dto.SectorDto;

import java.util.List;

public interface ISectorService {
    // Define the methods that the sector service should implement
    public List<SectorDto> getAllSectors();
    public SectorDto getSectorById(int id);
    public boolean createSector(SectorDto sectorDto);
    public boolean updateSector(SectorDto sectorDto);
    public boolean deleteSector(int id);
}
