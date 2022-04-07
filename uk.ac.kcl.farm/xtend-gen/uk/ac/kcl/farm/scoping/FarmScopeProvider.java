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
import uk.ac.kcl.farm.farm.FarmProgram;
import uk.ac.kcl.farm.farm.LoopStatement;
import uk.ac.kcl.farm.farm.RealExpression;
import uk.ac.kcl.farm.farm.RealVarExpression;
import uk.ac.kcl.farm.farm.VariableDeclaration;

/**
 * This class contains custom scoping description.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#scoping
 * on how and when to use it.
 */
@SuppressWarnings("all")
public class FarmScopeProvider extends AbstractDeclarativeScopeProvider {
  public IScope scope_IntVarExpression_var(final RealVarExpression context, final EReference ref) {
    return this.visibleVariablesScope(context);
  }
  
  protected IScope _visibleVariablesScope(final RealExpression ip) {
    return this.visibleVariablesScope(ip.eContainer());
  }
  
  protected IScope _visibleVariablesScope(final FarmProgram tp) {
    return Scopes.scopeFor(Iterables.<VariableDeclaration>filter(tp.getStatements(), VariableDeclaration.class));
  }
  
  protected IScope _visibleVariablesScope(final LoopStatement ls) {
    return this.internalVisibleVariablesScope(ls.eContainer());
  }
  
  protected IScope _internalVisibleVariablesScope(final FarmProgram tp) {
    return Scopes.scopeFor(Iterables.<VariableDeclaration>filter(tp.getStatements(), VariableDeclaration.class));
  }
  
  protected IScope _internalVisibleVariablesScope(final LoopStatement ls) {
    return Scopes.scopeFor(Iterables.<VariableDeclaration>filter(ls.getStatements(), VariableDeclaration.class), this.internalVisibleVariablesScope(ls.eContainer()));
  }
  
  public IScope visibleVariablesScope(final EObject ls) {
    if (ls instanceof LoopStatement) {
      return _visibleVariablesScope((LoopStatement)ls);
    } else if (ls instanceof RealExpression) {
      return _visibleVariablesScope((RealExpression)ls);
    } else if (ls instanceof FarmProgram) {
      return _visibleVariablesScope((FarmProgram)ls);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ls).toString());
    }
  }
  
  public IScope internalVisibleVariablesScope(final EObject ls) {
    if (ls instanceof LoopStatement) {
      return _internalVisibleVariablesScope((LoopStatement)ls);
    } else if (ls instanceof FarmProgram) {
      return _internalVisibleVariablesScope((FarmProgram)ls);
    } else {
      throw new IllegalArgumentException("Unhandled parameter types: " +
        Arrays.<Object>asList(ls).toString());
    }
  }
}
