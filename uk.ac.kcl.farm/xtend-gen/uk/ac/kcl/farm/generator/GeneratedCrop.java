package uk.ac.kcl.farm.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class GeneratedCrop {
  public String name;
  
  public List<GeneratedStage> stage = CollectionLiterals.<GeneratedStage>newArrayList();
  
  public float time;
  
  public GeneratedStage currentStage;
  
  public int currentStageID = 0;
  
  public GeneratedField field;
  
  public GeneratedCrop(final String name, final List<GeneratedStage> stage) {
    this.name = name;
    this.stage = stage;
    this.time = 0;
    this.currentStage = this.stage.get(0);
    this.currentStageID = 0;
    this.field = null;
  }
}
