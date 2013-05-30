package hu.bme.mit.inf.mvsd.inoutinsubs;

import hu.bme.mit.inf.mvsd.inoutinsubs.InOutInSubsMatcher;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcherFactory;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.extensibility.IMatcherFactoryProvider;

/**
 * A pattern-specific matcher factory that can instantiate InOutInSubsMatcher in a type-safe way.
 * 
 * @see InOutInSubsMatcher
 * @see InOutInSubsMatch
 * 
 */
public final class InOutInSubsMatcherFactory extends BaseGeneratedMatcherFactory<InOutInSubsMatcher> {
  /**
   * @return the singleton instance of the matcher factory
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static InOutInSubsMatcherFactory instance() throws IncQueryException {
    try {
    	return LazyHolder.INSTANCE;
    } catch (ExceptionInInitializerError err) {
    	processInitializerError(err);
    	throw err;
    }
    
  }
  
  @Override
  protected InOutInSubsMatcher instantiate(final IncQueryEngine engine) throws IncQueryException {
    return new InOutInSubsMatcher(engine);
    
  }
  
  @Override
  protected String getBundleName() {
    return "hu.bme.mit.inf.mvsd.queries";
    
  }
  
  @Override
  protected String patternName() {
    return "hu.bme.mit.inf.mvsd.inOutInSubs";
    
  }
  
  private InOutInSubsMatcherFactory() throws IncQueryException {
    super();
  }
  public static class Provider implements IMatcherFactoryProvider<InOutInSubsMatcherFactory> {
    @Override
    public InOutInSubsMatcherFactory get() throws IncQueryException {
      return instance();
    }
  }
  
  private static class LazyHolder {
    private final static InOutInSubsMatcherFactory INSTANCE = make();
    
    public static InOutInSubsMatcherFactory make() {
      try {
      	return new InOutInSubsMatcherFactory();
      } catch (IncQueryException ex) {
      	throw new RuntimeException	(ex);
      }
      
    }
  }
  
}
