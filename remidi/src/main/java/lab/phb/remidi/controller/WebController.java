package lab.phb.remidi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import lab.phb.remidi.entity.DataCalonMhs;
import lab.phb.remidi.model.DataCalonMhsModel;
import lab.phb.remidi.services.DataCalonMhsService;

import java.util.Optional;

@Controller
public class WebController {

    @Autowired
    private DataCalonMhsService service;

    @GetMapping("/")
    public String getIndex(Model model) {
        model.addAttribute("data", service.getAllData());
        return "index";
    }

    @GetMapping("/tambah")
    public String tampilkanTambahForm(Model model) {
        model.addAttribute("data", new DataCalonMhsModel());
        return "tambah-data";
    }

    @PostMapping("/simpan")
    public String simpan(DataCalonMhsModel data) {
        service.save(service.convertToEntity(data));
        return "redirect:/";
    }

    @GetMapping("/ubah/{nim}")
    public String ubah(@PathVariable("nim") String nim, Model model) {
        Optional<DataCalonMhs> result = service.findById(nim);
        if(result.isPresent()) {
            DataCalonMhs data1 = result.get();
            model.addAttribute("data", data1);
            return "edit-data";
        } else {
            return "redirect:/";
        }
    }

    @GetMapping("/hapus/{nim}")
    public String hapus(@PathVariable("nim") String nim) {
        service.removeById(nim);
        return "redirect:/";
    }

}