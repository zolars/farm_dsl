package uk.ac.kcl.farm.generator;

import java.util.HashMap;
import org.eclipse.xtend.lib.Data;
import org.eclipse.xtext.xbase.lib.Pure;
import org.eclipse.xtext.xbase.lib.util.ToStringHelper;

@Data
@SuppressWarnings("all")
public class GeneratedStage {
  public final String _name;
  
  public final float _time;
  
  public final float _timeover;
  
  public final HashMap<String, Float> _attributes;
  
  public GeneratedStage(final String name, final float time, final float timeover, final HashMap<String, Float> attributes) {
    super();
    this._name = name;
    this._time = time;
    this._timeover = timeover;
    this._attributes = attributes;
  }
  
  @Override
  @Pure
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((this._name== null) ? 0 : this._name.hashCode());
    result = prime * result + Float.floatToIntBits(this._time);
    result = prime * result + Float.floatToIntBits(this._timeover);
    return prime * result + ((this._attributes== null) ? 0 : this._attributes.hashCode());
  }
  
  @Override
  @Pure
  public boolean equals(final Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    GeneratedStage other = (GeneratedStage) obj;
    if (this._name == null) {
      if (other._name != null)
        return false;
    } else if (!this._name.equals(other._name))
      return false;
    if (Float.floatToIntBits(other._time) != Float.floatToIntBits(this._time))
      return false; 
    if (Float.floatToIntBits(other._timeover) != Float.floatToIntBits(this._timeover))
      return false; 
    if (this._attributes == null) {
      if (other._attributes != null)
        return false;
    } else if (!this._attributes.equals(other._attributes))
      return false;
    return true;
  }
  
  @Override
  @Pure
  public String toString() {
    String result = new ToStringHelper().toString(this);
    return result;
  }
  
  @Pure
  public String getName() {
    return this._name;
  }
  
  @Pure
  public float getTime() {
    return this._time;
  }
  
  @Pure
  public float getTimeover() {
    return this._timeover;
  }
  
  @Pure
  public HashMap<String, Float> getAttributes() {
    return this._attributes;
  }
}
