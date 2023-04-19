package edu.iu.c322.assetmanagement.assetsservice.controller;

import edu.iu.c322.assetmanagement.assetsservice.model.Asset;
import edu.iu.c322.assetmanagement.assetsservice.repository.AssetsRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assets")
public class AssetsController {
    private AssetsRepository repository;


    public AssetsController(AssetsRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    public List<Asset> getassets(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Asset getAsset(@PathVariable int id){

        Optional<Asset> maybeAsset = repository.findById(id);
        if(maybeAsset.isPresent()){
            Asset asset = maybeAsset.get();
            return asset;
        } else {
            throw new IllegalStateException("licensing id is invalid.");
        }
    }



    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public int create(@RequestBody Asset asset){
        Asset newAsset = repository.save(asset);
        return newAsset.getId();
    }

}
