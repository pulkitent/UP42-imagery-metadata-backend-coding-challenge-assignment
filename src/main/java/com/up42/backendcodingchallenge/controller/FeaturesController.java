package com.up42.backendcodingchallenge.controller;

import com.up42.backendcodingchallenge.model.FeatureCollection;
import com.up42.backendcodingchallenge.service.FeatureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class FeaturesController {
  private final FeatureService featureService;

  @Autowired
  public FeaturesController(final FeatureService featureService) {
    this.featureService = featureService;
  }

  @GetMapping("/features")
  public List<FeatureCollection.Feature> getFeatures() throws IOException {
    return featureService.getFeatures();
  }
}
