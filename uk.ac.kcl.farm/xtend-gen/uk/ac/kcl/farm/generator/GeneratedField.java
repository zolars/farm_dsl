package uk.ac.kcl.farm.generator;

import java.util.HashMap;

@SuppressWarnings("all")
public class GeneratedField {
  public String name;
  
  public String ip;
  
  public String type;
  
  public String light;
  
  public HashMap<String, Float> attributes;
  
  public GeneratedCrop crop;
  
  public GeneratedField(final String name, final String ip, final String type, final String light, final HashMap<String, Float> attributes) {
    this.name = name;
    this.ip = ip;
    this.type = type;
    this.light = light;
    this.attributes = attributes;
    this.crop = null;
  }
}
