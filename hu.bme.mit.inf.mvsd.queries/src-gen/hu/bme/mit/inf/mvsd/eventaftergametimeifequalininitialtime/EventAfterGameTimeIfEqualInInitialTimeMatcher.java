package hu.bme.mit.inf.mvsd.eventaftergametimeifequalininitialtime;

import hu.bme.mit.inf.mvsd.eventaftergametimeifequalininitialtime.EventAfterGameTimeIfEqualInInitialTimeMatch;
import hu.bme.mit.inf.mvsd.eventaftergametimeifequalininitialtime.EventAfterGameTimeIfEqualInInitialTimeMatcherFactory;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.EngineManager;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IMatcherFactory;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.rete.misc.DeltaMonitor;
import org.eclipse.incquery.runtime.rete.tuple.Tuple;

/**
 * Generated pattern matcher API of the hu.bme.mit.inf.mvsd.EventAfterGameTimeIfEqualInInitialTime pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * {@literal @}Constraint(message="There should be no events after the initial game time unless it is a tie", location=event, severity="error")
 * pattern EventAfterGameTimeIfEqualInInitialTime(event: Event){
 * 	Match.team1(match, team1);
 * 	Match.team2(match, team2);
 * 	Match.events(match, event);
 * 	find TeamGoalCountInitialTime(team1, goalcount1);
 * 	find TeamGoalCountInitialTime(team2, goalcount2);
 * 	check (goalcount1 != goalcount2);
 * 	Event.time(event, time);
 * 	check(time {@literal >} 2400 && time {@literal <}= 3000);
 * }
 * </pre></code>
 * 
 * @see EventAfterGameTimeIfEqualInInitialTimeMatch
 * @see EventAfterGameTimeIfEqualInInitialTimeMatcherFactory
 * @see EventAfterGameTimeIfEqualInInitialTimeProcessor
 * 
 */
public class EventAfterGameTimeIfEqualInInitialTimeMatcher extends BaseGeneratedMatcher<EventAfterGameTimeIfEqualInInitialTimeMatch> {
  private final static int POSITION_EVENT = 0;
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet). 
   * If a pattern matcher is already constructed with the same root, only a lightweight reference is created.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so 
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public EventAfterGameTimeIfEqualInInitialTimeMatcher(final Notifier emfRoot) throws IncQueryException {
    this(EngineManager.getInstance().getIncQueryEngine(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine. 
   * If the pattern matcher is already constructed in the engine, only a lightweight reference is created.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public EventAfterGameTimeIfEqualInInitialTimeMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return matches represented as a EventAfterGameTimeIfEqualInInitialTimeMatch object.
   * 
   */
  public Collection<EventAfterGameTimeIfEqualInInitialTimeMatch> getAllMatches(final Object pEvent) {
    return rawGetAllMatches(new Object[]{pEvent});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return a match represented as a EventAfterGameTimeIfEqualInInitialTimeMatch object, or null if no match is found.
   * 
   */
  public EventAfterGameTimeIfEqualInInitialTimeMatch getOneArbitraryMatch(final Object pEvent) {
    return rawGetOneArbitraryMatch(new Object[]{pEvent});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pEvent) {
    return rawHasMatch(new Object[]{pEvent});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pEvent) {
    return rawCountMatches(new Object[]{pEvent});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pEvent, final IMatchProcessor<? super EventAfterGameTimeIfEqualInInitialTimeMatch> processor) {
    rawForEachMatch(new Object[]{pEvent}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pEvent, final IMatchProcessor<? super EventAfterGameTimeIfEqualInInitialTimeMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pEvent}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<EventAfterGameTimeIfEqualInInitialTimeMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pEvent) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pEvent});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pEvent the fixed value of pattern parameter event, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public EventAfterGameTimeIfEqualInInitialTimeMatch newMatch(final Object pEvent) {
    return new EventAfterGameTimeIfEqualInInitialTimeMatch.Immutable(pEvent);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for event.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfevent(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_EVENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for event.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfevent() {
    return rawAccumulateAllValuesOfevent(emptyArray());
  }
  
  @Override
  protected EventAfterGameTimeIfEqualInInitialTimeMatch tupleToMatch(final Tuple t) {
    try {
    	return new EventAfterGameTimeIfEqualInInitialTimeMatch.Immutable((java.lang.Object) t.get(POSITION_EVENT));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EventAfterGameTimeIfEqualInInitialTimeMatch arrayToMatch(final Object[] match) {
    try {
    	return new EventAfterGameTimeIfEqualInInitialTimeMatch.Immutable((java.lang.Object) match[POSITION_EVENT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected EventAfterGameTimeIfEqualInInitialTimeMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new EventAfterGameTimeIfEqualInInitialTimeMatch.Mutable((java.lang.Object) match[POSITION_EVENT]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<EventAfterGameTimeIfEqualInInitialTimeMatcher> factory() throws IncQueryException {
    return EventAfterGameTimeIfEqualInInitialTimeMatcherFactory.instance();
  }
}