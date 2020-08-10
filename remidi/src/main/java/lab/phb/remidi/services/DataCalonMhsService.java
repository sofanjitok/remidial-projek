package lab.phb.remidi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lab.phb.remidi.entity.DataCalonMhs;
import lab.phb.remidi.model.DataCalonMhsModel;
import lab.phb.remidi.repo.DataCalonMhsRepo;

import java.util.List;
import java.util.Optional;

@Service
public class DataCalonMhsService {

    @Autowired
    private DataCalonMhsRepo repo;

    public List<DataCalonMhs> getAllData() {
        return repo.findAll();
    }

    public DataCalonMhs convertToEntity(DataCalonMhsModel model) {
        DataCalonMhs result = new DataCalonMhs();
        result.setNis(model.getNis());
        result.setNama(model.getNama());
        result.setAsalSekolah(model.getAsalSekolah());
        result.setTTL(model.getTTL());
        result.setNamaOrtu(model.getNamaOrtu());
        result.setAgama(model.getAgama());
        result.setAlamat(model.getAlamat());
        result.setNo_hp(model.getNo_hp());
        return result;
    }

    public DataCalonMhs save(DataCalonMhs data) {
        return repo.save(data);
    }

    public Optional<DataCalonMhs> findById(String nis) {
        return repo.findById(nis);
    }

    public void removeById(String nis) {
        repo.deleteById(nis);
    }

}