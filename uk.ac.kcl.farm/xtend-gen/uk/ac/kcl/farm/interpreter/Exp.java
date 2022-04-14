package uk.ac.kcl.farm.interpreter;

import com.google.common.base.Objects;
import java.util.Arrays;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import uk.ac.kcl.farm.farm.Attribute;
import uk.ac.kcl.farm.farm.Call;
import uk.ac.kcl.farm.farm.CallFunction;
import uk.ac.kcl.farm.farm.ConditionAndExpression;
import uk.ac.kcl.farm.farm.ConditionOrExpression;
import uk.ac.kcl.farm.farm.Crop;
import uk.ac.kcl.farm.farm.CropStage;
import uk.ac.kcl.farm.farm.Divide;
import uk.ac.kcl.farm.farm.Equal;
import uk.ac.kcl.farm.farm.Expression;
import uk.ac.kcl.farm.farm.ExpressionOrCall;
import uk.ac.kcl.farm.farm.FalseLiteral;
import uk.ac.kcl.farm.farm.Field;
import uk.ac.kcl.farm.farm.FieldSetFunction;
import uk.ac.kcl.farm.farm.GetStageFunction;
import uk.ac.kcl.farm.farm.GreaterThan;
import uk.ac.kcl.farm.farm.GreaterThanOrEqual;
import uk.ac.kcl.farm.farm.IsEmptyFunction;
import uk.ac.kcl.farm.farm.LessThan;
import uk.ac.kcl.farm.farm.LessThanOrEqual;
import uk.ac.kcl.farm.farm.Minus;
import uk.ac.kcl.farm.farm.Multiply;
import uk.ac.kcl.farm.farm.NotBooleanExpression;
import uk.ac.kcl.farm.farm.NotEqual;
import uk.ac.kcl.farm.farm.PlantFunction;
import uk.ac.kcl.farm.farm.Plus;
import uk.ac.kcl.farm.farm.RealLiteral;
import uk.ac.kcl.farm.farm.TrueLiteral;
import uk.ac.kcl.farm.farm.UnaryExpression;
import uk.ac.kcl.farm.farm.VarExpression;
import uk.ac.kcl.farm.generator.GeneratedCrop;
import uk.ac.kcl.farm.generator.GeneratedField;
import uk.ac.kcl.farm.generator.GeneratedStage;

/**
 * Expression Interpreter
 */
@SuppressWarnings("all")
public class Exp {
  private uk.ac.kcl.farm.generator.Runtime runtime = null;
  
  public Exp(final uk.ac.kcl.farm.generator.Runtime runtime) {
    this.runtime = runtime;
  }
  
  protected String _toString(final Call exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _string = exp.toString();
    _builder.append(_string);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Call exp) {
    Float _xifexpression = null;
    int _size = exp.getFunctions().size();
    boolean _equals = (_size == 0);
    if (_equals) {
      EList<String> _attributes = exp.getAttributes();
      for (final String attribute : _attributes) {
        return this.toFloat(exp.getInstance(), attribute);
      }
    } else {
      EList<CallFunction> _functions = exp.getFunctions();
      for (final CallFunction function : _functions) {
        return this.toFloat(exp.getInstance(), function);
      }
    }
    return _xifexpression;
  }
  
  protected Boolean _toBoolean(final Call exp) {
    try {
      Boolean _xifexpression = null;
      int _size = exp.getFunctions().size();
      boolean _notEquals = (_size != 0);
      if (_notEquals) {
        EList<CallFunction> _functions = exp.getFunctions();
        for (final CallFunction function : _functions) {
          return this.toBoolean(exp.getInstance(), function);
        }
      } else {
        throw new Exception("The function do not have attributes");
      }
      return _xifexpression;
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final CropStage exp, final String attribute) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      Object _get = this.runtime.fieldMap.get(exp.getName()).getClass().getField(attribute).get(this.runtime.fieldMap.get(exp.getName()));
      _builder.append(_get);
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Float _toFloat(final CropStage exp, final String attribute) {
    try {
      return Float.valueOf(this.runtime.fieldMap.get(exp.getName()).getClass().getField(attribute).get(this.runtime.fieldMap.get(exp.getName())).toString());
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final CropStage exp, final String attribute) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Field exp, final String attribute) {
    try {
      StringConcatenation _builder = new StringConcatenation();
      Object _get = this.runtime.fieldMap.get(exp.getName()).getClass().getField(attribute).get(this.runtime.fieldMap.get(exp.getName()));
      _builder.append(_get);
      _builder.newLineIfNotEmpty();
      return _builder.toString();
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Float _toFloat(final Field exp, final String attribute) {
    Float _xblockexpression = null;
    {
      GeneratedField field = this.runtime.fieldMap.get(exp.getName());
      _xblockexpression = field.attributes.get(attribute);
    }
    return _xblockexpression;
  }
  
  protected Boolean _toBoolean(final Field exp, final String attribute) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Crop exp, final GetStageFunction function) {
    return "";
  }
  
  protected Float _toFloat(final Crop exp, final GetStageFunction function) {
    GeneratedCrop crop = this.runtime.cropMap.get(exp.getName());
    GeneratedStage stage = crop.stage.get(function.getId());
    String _attribute = function.getAttribute();
    boolean _equals = Objects.equal(_attribute, "timeConsumed");
    if (_equals) {
      return Float.valueOf(stage.getTime());
    } else {
      return stage.getAttributes().get(function.getAttribute());
    }
  }
  
  protected Boolean _toBoolean(final Crop exp, final GetStageFunction function) {
    try {
      throw new Exception("Expected Float but received Boolean");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Field exp, final FieldSetFunction function) {
    return "";
  }
  
  protected Float _toFloat(final Field exp, final FieldSetFunction function) {
    try {
      throw new Exception("Expected Boolean but received Float");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final Field exp, final FieldSetFunction function) {
    try {
      boolean _xblockexpression = false;
      {
        GeneratedField field = this.runtime.fieldMap.get(exp.getName());
        boolean _xtrycatchfinallyexpression = false;
        try {
          boolean _xblockexpression_1 = false;
          {
            field.attributes.put(function.getAttribute().getName(), this.toFloat(function.getValue()));
            _xblockexpression_1 = true;
          }
          _xtrycatchfinallyexpression = _xblockexpression_1;
        } catch (final Throwable _t) {
          if (_t instanceof Exception) {
            StringConcatenation _builder = new StringConcatenation();
            _builder.append("Value ");
            Float _float = this.toFloat(function.getValue());
            _builder.append(_float);
            _builder.append(" cannot be given to ");
            Attribute _attribute = function.getAttribute();
            _builder.append(_attribute);
            throw new Exception(_builder.toString());
          } else {
            throw Exceptions.sneakyThrow(_t);
          }
        }
        _xblockexpression = _xtrycatchfinallyexpression;
      }
      return Boolean.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Field exp, final IsEmptyFunction function) {
    return "";
  }
  
  protected Float _toFloat(final Field exp, final IsEmptyFunction function) {
    try {
      throw new Exception("Expected Boolean but received Float");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final Field exp, final IsEmptyFunction function) {
    try {
      boolean _xblockexpression = false;
      {
        GeneratedField field = this.runtime.fieldMap.get(exp.getName());
        boolean _xifexpression = false;
        String _left = function.getLeft();
        boolean _equals = Objects.equal(_left, "(");
        if (_equals) {
          try {
            return Boolean.valueOf((field.crop == null));
          } catch (final Throwable _t) {
            if (_t instanceof Exception) {
              StringConcatenation _builder = new StringConcatenation();
              throw new Exception(_builder.toString());
            } else {
              throw Exceptions.sneakyThrow(_t);
            }
          }
        } else {
          _xifexpression = false;
        }
        _xblockexpression = _xifexpression;
      }
      return Boolean.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Field exp, final PlantFunction function) {
    return "";
  }
  
  protected Float _toFloat(final Field exp, final PlantFunction function) {
    try {
      throw new Exception("Expected Boolean but received Float");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  public Boolean judegeEnvironment(final GeneratedField field, final GeneratedStage stage) {
    try {
      boolean key = true;
      for (final String attribute : this.runtime.attributeList) {
        Float _get = field.attributes.get(attribute);
        Float _get_1 = stage.getAttributes().get(attribute);
        boolean _notEquals = (!Objects.equal(_get, _get_1));
        if (_notEquals) {
          key = false;
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Crop cannot be plant in Field `");
          _builder.append(field.name);
          _builder.append("` because attribute `");
          _builder.append(attribute);
          _builder.append("` (expected ");
          Float _get_2 = stage.getAttributes().get(attribute);
          _builder.append(_get_2);
          _builder.append(" but got ");
          Float _get_3 = field.attributes.get(attribute);
          _builder.append(_get_3);
          _builder.append(")");
          throw new Exception(_builder.toString());
        }
      }
      return Boolean.valueOf(key);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final Field exp, final PlantFunction function) {
    try {
      boolean _xblockexpression = false;
      {
        GeneratedField field = this.runtime.fieldMap.get(exp.getName());
        GeneratedCrop crop = this.runtime.cropMap.get(function.getPlantCrop().getName());
        boolean _xifexpression = false;
        if (((field.crop != null) || (crop.field != null))) {
          StringConcatenation _builder = new StringConcatenation();
          _builder.append("Crop `");
          _builder.append(crop.name);
          _builder.append("` have been plant in Field `");
          _builder.append(field.name);
          _builder.append("`");
          throw new Exception(_builder.toString());
        } else {
          boolean _xifexpression_1 = false;
          Boolean _judegeEnvironment = this.judegeEnvironment(field, crop.currentStage);
          if ((_judegeEnvironment).booleanValue()) {
            boolean _xblockexpression_1 = false;
            {
              field.crop = crop;
              crop.field = field;
              crop.time = 0;
              crop.currentStageID = 0;
              _xblockexpression_1 = true;
            }
            _xifexpression_1 = _xblockexpression_1;
          } else {
            _xifexpression_1 = false;
          }
          _xifexpression = _xifexpression_1;
        }
        _xblockexpression = _xifexpression;
      }
      return Boolean.valueOf(_xblockexpression);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Expression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("(");
    String _string = exp.toString();
    _builder.append(_string);
    _builder.append(")");
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Expression exp) {
    return this.toFloat(exp);
  }
  
  protected Boolean _toBoolean(final Expression exp) {
    return this.toBoolean(exp);
  }
  
  protected String _toString(final VarExpression exp) {
    return exp.getVar().getName();
  }
  
  protected Float _toFloat(final VarExpression exp) {
    return Float.valueOf(this.runtime.variableMap.get(exp.getVar().getName()).toString());
  }
  
  protected Boolean _toBoolean(final VarExpression exp) {
    return Boolean.valueOf(this.runtime.variableMap.get(exp.getVar().getName()).toString());
  }
  
  protected String _toString(final RealLiteral exp) {
    return Float.toString(exp.getNum());
  }
  
  protected Float _toFloat(final RealLiteral exp) {
    return Float.valueOf(exp.getNum());
  }
  
  protected Boolean _toBoolean(final RealLiteral exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final TrueLiteral exp) {
    return exp.getValue();
  }
  
  protected Float _toFloat(final TrueLiteral exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final TrueLiteral exp) {
    return Boolean.valueOf(true);
  }
  
  protected String _toString(final FalseLiteral exp) {
    return exp.getValue();
  }
  
  protected Float _toFloat(final FalseLiteral exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final FalseLiteral exp) {
    return Boolean.valueOf(false);
  }
  
  protected String _toString(final NotBooleanExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("! ");
    String _string = exp.getExp().toString();
    _builder.append(_string);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final NotBooleanExpression exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final NotBooleanExpression exp) {
    Boolean _boolean = this.toBoolean(exp.getExp());
    return Boolean.valueOf((!(_boolean).booleanValue()));
  }
  
  protected String _toString(final UnaryExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("- ");
    String _string = exp.getExp().toString();
    _builder.append(_string);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final UnaryExpression exp) {
    Float _float = this.toFloat(exp.getExp());
    return Float.valueOf((-(_float).floatValue()));
  }
  
  protected Boolean _toBoolean(final UnaryExpression exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final ConditionOrExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" || ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final ConditionOrExpression exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final ConditionOrExpression exp) {
    return Boolean.valueOf(((this.toBoolean(exp.getLeft())).booleanValue() || (this.toBoolean(exp.getRight())).booleanValue()));
  }
  
  protected String _toString(final ConditionAndExpression exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" && ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    return _builder.toString();
  }
  
  protected Float _toFloat(final ConditionAndExpression exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final ConditionAndExpression exp) {
    return Boolean.valueOf(((this.toBoolean(exp.getLeft())).booleanValue() && (this.toBoolean(exp.getRight())).booleanValue()));
  }
  
  protected String _toString(final Plus exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" + ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Plus exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Float.valueOf(((_float).floatValue() + (_float_1).floatValue()));
  }
  
  protected Boolean _toBoolean(final Plus exp) {
    return Boolean.valueOf(((this.toBoolean(exp.getLeft())).booleanValue() || (this.toBoolean(exp.getRight())).booleanValue()));
  }
  
  protected String _toString(final Minus exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" - ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Minus exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Float.valueOf(((_float).floatValue() - (_float_1).floatValue()));
  }
  
  protected Boolean _toBoolean(final Minus exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final Multiply exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" * ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Multiply exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Float.valueOf(((_float).floatValue() * (_float_1).floatValue()));
  }
  
  protected Boolean _toBoolean(final Multiply exp) {
    return Boolean.valueOf(((this.toBoolean(exp.getLeft())).booleanValue() && (this.toBoolean(exp.getRight())).booleanValue()));
  }
  
  protected String _toString(final Divide exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" / ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Divide exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Float.valueOf(((_float).floatValue() / (_float_1).floatValue()));
  }
  
  protected Boolean _toBoolean(final Divide exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final LessThanOrEqual exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" <= ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final LessThanOrEqual exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final LessThanOrEqual exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Boolean.valueOf((_float.compareTo(_float_1) <= 0));
  }
  
  protected String _toString(final LessThan exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" < ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final LessThan exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final LessThan exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Boolean.valueOf((_float.compareTo(_float_1) < 0));
  }
  
  protected String _toString(final GreaterThanOrEqual exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" >= ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final GreaterThanOrEqual exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final GreaterThanOrEqual exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Boolean.valueOf((_float.compareTo(_float_1) >= 0));
  }
  
  protected String _toString(final GreaterThan exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" > ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final GreaterThan exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final GreaterThan exp) {
    Float _float = this.toFloat(exp.getLeft());
    Float _float_1 = this.toFloat(exp.getRight());
    return Boolean.valueOf((_float.compareTo(_float_1) > 0));
  }
  
  protected String _toString(final Equal exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" == ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final Equal exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final Equal exp) {
    boolean _xtrycatchfinallyexpression = false;
    try {
      Float _float = this.toFloat(exp.getLeft());
      Float _float_1 = this.toFloat(exp.getRight());
      _xtrycatchfinallyexpression = Objects.equal(_float, _float_1);
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        Boolean _boolean = this.toBoolean(exp.getLeft());
        Boolean _boolean_1 = this.toBoolean(exp.getRight());
        _xtrycatchfinallyexpression = Objects.equal(_boolean, _boolean_1);
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return Boolean.valueOf(_xtrycatchfinallyexpression);
  }
  
  protected String _toString(final NotEqual exp) {
    StringConcatenation _builder = new StringConcatenation();
    String _string = exp.getLeft().toString();
    _builder.append(_string);
    _builder.append(" != ");
    String _string_1 = exp.getRight().toString();
    _builder.append(_string_1);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }
  
  protected Float _toFloat(final NotEqual exp) {
    try {
      throw new Exception("Variable cannot be interpreted - TypeError");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected Boolean _toBoolean(final NotEqual exp) {
    boolean _xtrycatchfinallyexpression = false;
    try {
      Float _float = this.toFloat(exp.getLeft());
      Float _float_1 = this.toFloat(exp.getRight());
      _xtrycatchfinallyexpression = (!Objects.equal(_float, _float_1));
    } catch (final Throwable _t) {
      if (_t instanceof Exception) {
        Boolean _boolean = this.toBoolean(exp.getLeft());
        Boolean _boolean_1 = this.toBoolean(exp.getRight());
        _xtrycatchfinallyexpression = (!Objects.equal(_boolean, _boolean_1));
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
    return Boolean.valueOf(_xtrycatchfinallyexpression);
  }
  
  public String toString(final ExpressionOrCall exp) {
    if (exp instanceof FalseLiteral) {
      return _toString((FalseLiteral)exp);
    } else if (exp instanceof RealLiteral) {
      return _toString((RealLiteral)exp);
    } else if (exp instanceof TrueLiteral) {
      return _toString((TrueLiteral)exp);
    } else if (exp instanceof ConditionAndExpression) {
      return _toString((ConditionAndExpression)exp);
    } else if (exp instanceof ConditionOrExpression) {
      return _toString((ConditionOrExpression)exp);
    } else if (exp instanceof Divide) {
      return _toString((Divide)exp);
    } else if (exp instanceof Equal) {
      return _toString((Equal)exp);
    } else if (exp instanceof GreaterThan) {
      return _toString((GreaterThan)exp);
    } else if (exp instanceof GreaterThanOrEqual) {
      return _toString((GreaterThanOrEqual)exp);
    } else if (exp instanceof LessThan) {
      return _toString((LessThan)exp);
    } else if (exp instanceof LessThanOrEqual) {
      return _toString((LessThanOrEqual)exp);
    } else if (exp instanceof Minus) {
      return _toString((Minus)exp);
    } else if (exp instanceof Multiply) {
      return _toString((Multiply)exp);
    } else if (exp instanceof NotBooleanExpression) {
      return _toString((NotBooleanExpression)exp);
    } else if (exp instanceof NotEqual) {
      return _toString((NotEqual)exp);
    } else if (exp instanceof Plus) {
      return _toString((Plus)exp);
    } else if (exp instanceof UnaryExpression) {
      return _toString((UnaryExpression)exp);
    } else if (exp instanceof VarExpression) {
      return _toString((VarExpression)exp);
    } else if (exp instanceof Call) {
      return _toString((Call)exp);
    } else if (exp instanceof Expression) {
      return _toString((Expression)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public Float toFloat(final ExpressionOrCall exp) {
    if (exp instanceof FalseLiteral) {
      return _toFloat((FalseLiteral)exp);
    } else if (exp instanceof RealLiteral) {
      return _toFloat((RealLiteral)exp);
    } else if (exp instanceof TrueLiteral) {
      return _toFloat((TrueLiteral)exp);
    } else if (exp instanceof ConditionAndExpression) {
      return _toFloat((ConditionAndExpression)exp);
    } else if (exp instanceof ConditionOrExpression) {
      return _toFloat((ConditionOrExpression)exp);
    } else if (exp instanceof Divide) {
      return _toFloat((Divide)exp);
    } else if (exp instanceof Equal) {
      return _toFloat((Equal)exp);
    } else if (exp instanceof GreaterThan) {
      return _toFloat((GreaterThan)exp);
    } else if (exp instanceof GreaterThanOrEqual) {
      return _toFloat((GreaterThanOrEqual)exp);
    } else if (exp instanceof LessThan) {
      return _toFloat((LessThan)exp);
    } else if (exp instanceof LessThanOrEqual) {
      return _toFloat((LessThanOrEqual)exp);
    } else if (exp instanceof Minus) {
      return _toFloat((Minus)exp);
    } else if (exp instanceof Multiply) {
      return _toFloat((Multiply)exp);
    } else if (exp instanceof NotBooleanExpression) {
      return _toFloat((NotBooleanExpression)exp);
    } else if (exp instanceof NotEqual) {
      return _toFloat((NotEqual)exp);
    } else if (exp instanceof Plus) {
      return _toFloat((Plus)exp);
    } else if (exp instanceof UnaryExpression) {
      return _toFloat((UnaryExpression)exp);
    } else if (exp instanceof VarExpression) {
      return _toFloat((VarExpression)exp);
    } else if (exp instanceof Call) {
      return _toFloat((Call)exp);
    } else if (exp instanceof Expression) {
      return _toFloat((Expression)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public Boolean toBoolean(final ExpressionOrCall exp) {
    if (exp instanceof FalseLiteral) {
      return _toBoolean((FalseLiteral)exp);
    } else if (exp instanceof RealLiteral) {
      return _toBoolean((RealLiteral)exp);
    } else if (exp instanceof TrueLiteral) {
      return _toBoolean((TrueLiteral)exp);
    } else if (exp instanceof ConditionAndExpression) {
      return _toBoolean((ConditionAndExpression)exp);
    } else if (exp instanceof ConditionOrExpression) {
      return _toBoolean((ConditionOrExpression)exp);
    } else if (exp instanceof Divide) {
      return _toBoolean((Divide)exp);
    } else if (exp instanceof Equal) {
      return _toBoolean((Equal)exp);
    } else if (exp instanceof GreaterThan) {
      return _toBoolean((GreaterThan)exp);
    } else if (exp instanceof GreaterThanOrEqual) {
      return _toBoolean((GreaterThanOrEqual)exp);
    } else if (exp instanceof LessThan) {
      return _toBoolean((LessThan)exp);
    } else if (exp instanceof LessThanOrEqual) {
      return _toBoolean((LessThanOrEqual)exp);
    } else if (exp instanceof Minus) {
      return _toBoolean((Minus)exp);
    } else if (exp instanceof Multiply) {
      return _toBoolean((Multiply)exp);
    } else if (exp instanceof NotBooleanExpression) {
      return _toBoolean((NotBooleanExpression)exp);
    } else if (exp instanceof NotEqual) {
      return _toBoolean((NotEqual)exp);
    } else if (exp instanceof Plus) {
      return _toBoolean((Plus)exp);
    } else if (exp instanceof UnaryExpression) {
      return _toBoolean((UnaryExpression)exp);
    } else if (exp instanceof VarExpression) {
      return _toBoolean((VarExpression)exp);
    } else if (exp instanceof Call) {
      return _toBoolean((Call)exp);
    } else if (exp instanceof Expression) {
      return _toBoolean((Expression)exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public String toString(final EObject exp, final Object function) {
    if (exp instanceof Crop
         && function instanceof GetStageFunction) {
      return _toString((Crop)exp, (GetStageFunction)function);
    } else if (exp instanceof Field
         && function instanceof FieldSetFunction) {
      return _toString((Field)exp, (FieldSetFunction)function);
    } else if (exp instanceof Field
         && function instanceof IsEmptyFunction) {
      return _toString((Field)exp, (IsEmptyFunction)function);
    } else if (exp instanceof Field
         && function instanceof PlantFunction) {
      return _toString((Field)exp, (PlantFunction)function);
    } else if (exp instanceof Field
         && function instanceof String) {
      return _toString((Field)exp, (String)function);
    } else if (exp instanceof CropStage
         && function instanceof String) {
      return _toString((CropStage)exp, (String)function);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp, function).toString());
    }
  }
  
  public Float toFloat(final EObject exp, final Object function) {
    if (exp instanceof Crop
         && function instanceof GetStageFunction) {
      return _toFloat((Crop)exp, (GetStageFunction)function);
    } else if (exp instanceof Field
         && function instanceof FieldSetFunction) {
      return _toFloat((Field)exp, (FieldSetFunction)function);
    } else if (exp instanceof Field
         && function instanceof IsEmptyFunction) {
      return _toFloat((Field)exp, (IsEmptyFunction)function);
    } else if (exp instanceof Field
         && function instanceof PlantFunction) {
      return _toFloat((Field)exp, (PlantFunction)function);
    } else if (exp instanceof Field
         && function instanceof String) {
      return _toFloat((Field)exp, (String)function);
    } else if (exp instanceof CropStage
         && function instanceof String) {
      return _toFloat((CropStage)exp, (String)function);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp, function).toString());
    }
  }
  
  public Boolean toBoolean(final EObject exp, final Object function) {
    if (exp instanceof Crop
         && function instanceof GetStageFunction) {
      return _toBoolean((Crop)exp, (GetStageFunction)function);
    } else if (exp instanceof Field
         && function instanceof FieldSetFunction) {
      return _toBoolean((Field)exp, (FieldSetFunction)function);
    } else if (exp instanceof Field
         && function instanceof IsEmptyFunction) {
      return _toBoolean((Field)exp, (IsEmptyFunction)function);
    } else if (exp instanceof Field
         && function instanceof PlantFunction) {
      return _toBoolean((Field)exp, (PlantFunction)function);
    } else if (exp instanceof Field
         && function instanceof String) {
      return _toBoolean((Field)exp, (String)function);
    } else if (exp instanceof CropStage
         && function instanceof String) {
      return _toBoolean((CropStage)exp, (String)function);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp, function).toString());
    }
  }
}
