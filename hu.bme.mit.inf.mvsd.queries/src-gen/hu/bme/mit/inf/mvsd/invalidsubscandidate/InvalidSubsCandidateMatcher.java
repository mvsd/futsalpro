package hu.bme.mit.inf.mvsd.invalidsubscandidate;

import hu.bme.mit.inf.mvsd.invalidsubscandidate.InvalidSubsCandidateMatch;
import hu.bme.mit.inf.mvsd.invalidsubscandidate.InvalidSubsCandidateMatcherFactory;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.mvsd.invalidSubsCandidate pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern invalidSubsCandidate(player : Player, current : Substitution, candidate : Substitution){
 * 	find outSubs(player, current);
 * 	find outSubs(player, candidate);
 * 	current != candidate;
 * 	neg find outInOutSubs(player, candidate, _, current);
 * } or {
 * 	find inSubs(player, current);
 * 	find inSubs(player, candidate);
 * 	current != candidate;
 * 	neg find inOutInSubs(player, candidate, _, current);
 * }
 * </pre></code>
 * 
 * @see InvalidSubsCandidateMatch
 * @see InvalidSubsCandidateMatcherFactory
 * @see InvalidSubsCandidateProcessor
 * 
 */
public class InvalidSubsCandidateMatcher extends BaseGeneratedMatcher<InvalidSubsCandidateMatch> {
  private final static int POSITION_PLAYER = 0;
  
  private final static int POSITION_CURRENT = 1;
  
  private final static int POSITION_CANDIDATE = 2;
  
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
  public InvalidSubsCandidateMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public InvalidSubsCandidateMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @return matches represented as a InvalidSubsCandidateMatch object.
   * 
   */
  public Collection<InvalidSubsCandidateMatch> getAllMatches(final Object pPlayer, final Object pCurrent, final Object pCandidate) {
    return rawGetAllMatches(new Object[]{pPlayer, pCurrent, pCandidate});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @return a match represented as a InvalidSubsCandidateMatch object, or null if no match is found.
   * 
   */
  public InvalidSubsCandidateMatch getOneArbitraryMatch(final Object pPlayer, final Object pCurrent, final Object pCandidate) {
    return rawGetOneArbitraryMatch(new Object[]{pPlayer, pCurrent, pCandidate});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pPlayer, final Object pCurrent, final Object pCandidate) {
    return rawHasMatch(new Object[]{pPlayer, pCurrent, pCandidate});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pPlayer, final Object pCurrent, final Object pCandidate) {
    return rawCountMatches(new Object[]{pPlayer, pCurrent, pCandidate});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pPlayer, final Object pCurrent, final Object pCandidate, final IMatchProcessor<? super InvalidSubsCandidateMatch> processor) {
    rawForEachMatch(new Object[]{pPlayer, pCurrent, pCandidate}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pPlayer, final Object pCurrent, final Object pCandidate, final IMatchProcessor<? super InvalidSubsCandidateMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pPlayer, pCurrent, pCandidate}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<InvalidSubsCandidateMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pPlayer, final Object pCurrent, final Object pCandidate) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pPlayer, pCurrent, pCandidate});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param pCurrent the fixed value of pattern parameter current, or null if not bound.
   * @param pCandidate the fixed value of pattern parameter candidate, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public InvalidSubsCandidateMatch newMatch(final Object pPlayer, final Object pCurrent, final Object pCandidate) {
    return new InvalidSubsCandidateMatch.Immutable(pPlayer, pCurrent, pCandidate);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for player.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfplayer(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_PLAYER, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for player.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfplayer() {
    return rawAccumulateAllValuesOfplayer(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for player.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfplayer(final InvalidSubsCandidateMatch partialMatch) {
    return rawAccumulateAllValuesOfplayer(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for player.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfplayer(final Object pCurrent, final Object pCandidate) {
    return rawAccumulateAllValuesOfplayer(new Object[]{null, pCurrent, pCandidate});
  }
  
  /**
   * Retrieve the set of values that occur in matches for current.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfcurrent(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_CURRENT, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for current.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfcurrent() {
    return rawAccumulateAllValuesOfcurrent(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for current.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfcurrent(final InvalidSubsCandidateMatch partialMatch) {
    return rawAccumulateAllValuesOfcurrent(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for current.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfcurrent(final Object pPlayer, final Object pCandidate) {
    return rawAccumulateAllValuesOfcurrent(new Object[]{pPlayer, null, pCandidate});
  }
  
  /**
   * Retrieve the set of values that occur in matches for candidate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfcandidate(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_CANDIDATE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for candidate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfcandidate() {
    return rawAccumulateAllValuesOfcandidate(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for candidate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfcandidate(final InvalidSubsCandidateMatch partialMatch) {
    return rawAccumulateAllValuesOfcandidate(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for candidate.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfcandidate(final Object pPlayer, final Object pCurrent) {
    return rawAccumulateAllValuesOfcandidate(new Object[]{pPlayer, pCurrent, null});
  }
  
  @Override
  protected InvalidSubsCandidateMatch tupleToMatch(final Tuple t) {
    try {
    	return new InvalidSubsCandidateMatch.Immutable((java.lang.Object) t.get(POSITION_PLAYER), (java.lang.Object) t.get(POSITION_CURRENT), (java.lang.Object) t.get(POSITION_CANDIDATE));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected InvalidSubsCandidateMatch arrayToMatch(final Object[] match) {
    try {
    	return new InvalidSubsCandidateMatch.Immutable((java.lang.Object) match[POSITION_PLAYER], (java.lang.Object) match[POSITION_CURRENT], (java.lang.Object) match[POSITION_CANDIDATE]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected InvalidSubsCandidateMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new InvalidSubsCandidateMatch.Mutable((java.lang.Object) match[POSITION_PLAYER], (java.lang.Object) match[POSITION_CURRENT], (java.lang.Object) match[POSITION_CANDIDATE]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<InvalidSubsCandidateMatcher> factory() throws IncQueryException {
    return InvalidSubsCandidateMatcherFactory.instance();
  }
}
