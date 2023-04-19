package edu.iu.c322.assetmanagement.licensingservice.repository;

import edu.iu.c322.assetmanagement.licensingservice.model.Asset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AssetsRepository extends JpaRepository<Asset, Integer> {
}
