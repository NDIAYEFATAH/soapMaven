package sn.dev.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import sn.dev.dto.SectorDto;

import java.util.List;

@WebService
public class SectorWebServiceImpl implements SectorWebService{
    private final ISectorService sectorService = new SectorService();
    // Cette méthode retourne un secteur par son ID
    @Override
    @WebMethod(operationName = "getSectorById")
    public SectorDto getSectorById(@WebParam(name = "id") int id) {
        return sectorService.getSectorById(id);
    }

    @Override
    @WebMethod(operationName = "getAllSectors")
    public List<SectorDto> getAllSectors() {
        return sectorService.getAllSectors();
    }


    // Cette ajoute un secteur
    @Override
    @WebMethod(operationName = "saveSector")
    public SectorDto createSector(@WebParam(name = "sectorDto") SectorDto sectorDto) {
        return sectorService.createSector(sectorDto) ? sectorDto : null;
    }
    // Cette méthode met à jour un secteur
    @Override
    @WebMethod(operationName = "updateSector")
    public boolean updateSector(SectorDto sectorDto) {
        return sectorService.updateSector(sectorDto);
    }

    // Cette méthode supprime un secteur par son ID
    @Override
    @WebMethod(operationName = "deleteSector")
    public boolean deleteSector(int id) {
        return sectorService.deleteSector(id);
    }
}
