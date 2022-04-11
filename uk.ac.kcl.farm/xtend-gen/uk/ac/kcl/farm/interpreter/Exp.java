package uk.ac.kcl.farm.interpreter;

import com.google.common.base.Objects;
import java.util.Arrays;
import java.util.HashMap;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.xbase.lib.Exceptions;
import uk.ac.kcl.farm.farm.ConditionAndExpression;
import uk.ac.kcl.farm.farm.ConditionOrExpression;
import uk.ac.kcl.farm.farm.Divide;
import uk.ac.kcl.farm.farm.Equal;
import uk.ac.kcl.farm.farm.Expression;
import uk.ac.kcl.farm.farm.FalseLiteral;
import uk.ac.kcl.farm.farm.GreaterThan;
import uk.ac.kcl.farm.farm.GreaterThanOrEqual;
import uk.ac.kcl.farm.farm.LessThan;
import uk.ac.kcl.farm.farm.LessThanOrEqual;
import uk.ac.kcl.farm.farm.Minus;
import uk.ac.kcl.farm.farm.Multiply;
import uk.ac.kcl.farm.farm.NotBooleanExpression;
import uk.ac.kcl.farm.farm.NotEqual;
import uk.ac.kcl.farm.farm.Plus;
import uk.ac.kcl.farm.farm.RealLiteral;
import uk.ac.kcl.farm.farm.TrueLiteral;
import uk.ac.kcl.farm.farm.UnaryExpression;
import uk.ac.kcl.farm.farm.VarExpression;

/**
 * Expression Interpreter
 */
@SuppressWarnings("all")
public class Exp {
  public HashMap<String, Object> variableMap = new HashMap<String, Object>();
  
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
    return Float.valueOf(this.variableMap.get(exp.getVar().getName()).toString());
  }
  
  protected Boolean _toBoolean(final VarExpression exp) {
    return Boolean.valueOf(this.variableMap.get(exp.getVar().getName()).toString());
  }
  
  protected String _toString(final RealLiteral exp) {
    return Float.toString(exp.getNum());
  }
  
  protected Float _toFloat(final RealLiteral exp) {
    return Float.valueOf(exp.getNum());
  }
  
  protected Boolean _toBoolean(final RealLiteral exp) {
    try {
      throw new Exception("Variable cannot be interpreted");
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  protected String _toString(final TrueLiteral exp) {
    return exp.getValue();
  }
  
  protected Float _toFloat(final TrueLiteral exp) {
    try {
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
      throw new Exception("Variable cannot be interpreted");
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
  
  public String toString(final Expression exp) {
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
    } else if (exp != null) {
      return _toString(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public Float toFloat(final Expression exp) {
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
    } else if (exp != null) {
      return _toFloat(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
  
  public Boolean toBoolean(final Expression exp) {
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
    } else if (exp != null) {
      return _toBoolean(exp);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(exp).toString());
    }
  }
}
