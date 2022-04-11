package uk.ac.kcl.farm.generator;

import java.util.HashMap;
import java.util.List;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;

@SuppressWarnings("all")
public class Runtime {
  public float time = (Float.valueOf(0)).floatValue();
  
  public List<String> attributeList = CollectionLiterals.<String>newArrayList();
  
  public HashMap<String, GeneratedCrop> cropMap = new HashMap<String, GeneratedCrop>();
  
  public HashMap<String, GeneratedField> fieldMap = new HashMap<String, GeneratedField>();
  
  public HashMap<String, Object> variableMap = new HashMap<String, Object>();
}
