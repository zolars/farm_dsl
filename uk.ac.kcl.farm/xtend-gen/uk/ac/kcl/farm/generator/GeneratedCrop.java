package uk.ac.kcl.farm.generator;

import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class GeneratedCrop {
  public String ID;
  
  public String name;
  
  public List<GeneratedStage> stage = CollectionLiterals.<GeneratedStage>newArrayList();
  
  public float time;
  
  public GeneratedStage currentStage;
  
  public int currentStageID = 0;
  
  public GeneratedField field;
  
  public GeneratedCrop(final String ID, final String name, final List<GeneratedStage> stage) {
    this.ID = ID;
    this.name = name;
    this.stage = stage;
    this.time = 0;
    this.currentStage = this.stage.get(0);
    this.currentStageID = 0;
    this.field = null;
  }
  
  public GeneratedStage addStage() {
    GeneratedStage _xblockexpression = null;
    {
      int _currentStageID = this.currentStageID;
      this.currentStageID = (_currentStageID + 1);
      GeneratedStage _xifexpression = null;
      int _size = this.stage.size();
      boolean _lessThan = (this.currentStageID < _size);
      if (_lessThan) {
        _xifexpression = this.currentStage = this.stage.get(this.currentStageID);
      }
      _xblockexpression = _xifexpression;
    }
    return _xblockexpression;
  }
  
  public GeneratedField refresh() {
    GeneratedField _xblockexpression = null;
    {
      this.field.crop = null;
      this.time = 0;
      this.currentStage = this.stage.get(0);
      this.currentStageID = 0;
      _xblockexpression = this.field = null;
    }
    return _xblockexpression;
  }
}
