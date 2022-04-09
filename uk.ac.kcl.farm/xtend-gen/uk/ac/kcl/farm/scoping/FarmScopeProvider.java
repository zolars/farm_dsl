/**
 * generated by Xtext 2.18.0.M3
 */
package uk.ac.kcl.farm.scoping;

import com.google.common.collect.Iterables;
import java.util.Arrays;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.xtext.scoping.IScope;
import org.eclipse.xtext.scoping.Scopes;
import org.eclipse.xtext.scoping.impl.AbstractDeclarativeScopeProvider;
import uk.ac.kcl.farm.farm.ExecuteStatement;
import uk.ac.kcl.farm.farm.Expression;
import uk.ac.kcl.farm.farm.FarmProgram;
import uk.ac.kcl.farm.farm.LoopStatement;
import uk.ac.kcl.farm.farm.TaskStatement;
import uk.ac.kcl.farm.farm.Variable;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class FarmScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_IntVarExpression_var(final Expression context, final EReference ref) {
    return this.visibleVariablesScope(context);
  }
  
  protected IScope _visibleVariablesScope(final Expression ip) {
    return this.visibleVariablesScope(ip.eContainer());
  }
  
  protected IScope _visibleVariablesScope(final FarmProgram tp) {
    return Scopes.scopeFor(Iterables.<Variable>filter(tp.getStatements(), Variable.class));
  }
  
  protected IScope _internalVisibleVariablesScope(final FarmProgram tp) {
    return Scopes.scopeFor(Iterables.<Variable>filter(tp.getStatements(), Variable.class));
  }
  
  protected IScope _internalVisibleVariablesScope(final LoopStatement ls) {
    return Scopes.scopeFor(Iterables.<Variable>filter(ls.getStatements(), Variable.class), this.internalVisibleVariablesScope(ls.eContainer()));
  }
  
  protected IScope _internalVisibleVariablesScope(final TaskStatement ls) {
    return Scopes.scopeFor(Iterables.<Variable>filter(ls.getStatements(), Variable.class), this.internalVisibleVariablesScope(ls.eContainer()));
  }
  
  protected IScope _internalVisibleVariablesScope(final ExecuteStatement ls) {
    return Scopes.scopeFor(Iterables.<Variable>filter(ls.getStatements(), Variable.class), this.internalVisibleVariablesScope(ls.eContainer()));
  }
  
  public IScope visibleVariablesScope(final EObject ip) {
    if (ip instanceof Expression) {
      return _visibleVariablesScope((Expression)ip);
    } else if (ip instanceof FarmProgram) {
      return _visibleVariablesScope((FarmProgram)ip);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ip).toString());
    }
  }
  
  public IScope internalVisibleVariablesScope(final EObject ls) {
    if (ls instanceof LoopStatement) {
      return _internalVisibleVariablesScope((LoopStatement)ls);
    } else if (ls instanceof ExecuteStatement) {
      return _internalVisibleVariablesScope((ExecuteStatement)ls);
    } else if (ls instanceof FarmProgram) {
      return _internalVisibleVariablesScope((FarmProgram)ls);
    } else if (ls instanceof TaskStatement) {
      return _internalVisibleVariablesScope((TaskStatement)ls);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ls).toString());
    }
  }
}
