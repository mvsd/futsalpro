package hu.bme.mit.inf.mvsd.allplayers;

import hu.bme.mit.inf.mvsd.allplayers.AllPlayersMatch;
import hu.bme.mit.inf.mvsd.allplayers.AllPlayersMatcherFactory;
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
 * Generated pattern matcher API of the hu.bme.mit.inf.mvsd.allPlayers pattern, 
 * providing pattern-specific query methods.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern allPlayers(team : Team, player : Player){
 * 	Team.fieldPlayers(team, player);
 * } or {
 * 	Team.goalKeeper(team, player);
 * } or {
 * 	Team.subtitutePlayers(team, player);
 * } or {
 * 	Team.subtituteGoalKeepers(team, player);
 * }
 * </pre></code>
 * 
 * @see AllPlayersMatch
 * @see AllPlayersMatcherFactory
 * @see AllPlayersProcessor
 * 
 */
public class AllPlayersMatcher extends BaseGeneratedMatcher<AllPlayersMatch> {
  private final static int POSITION_TEAM = 0;
  
  private final static int POSITION_PLAYER = 1;
  
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
  public AllPlayersMatcher(final Notifier emfRoot) throws IncQueryException {
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
  public AllPlayersMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, factory());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @return matches represented as a AllPlayersMatch object.
   * 
   */
  public Collection<AllPlayersMatch> getAllMatches(final Object pTeam, final Object pPlayer) {
    return rawGetAllMatches(new Object[]{pTeam, pPlayer});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @return a match represented as a AllPlayersMatch object, or null if no match is found.
   * 
   */
  public AllPlayersMatch getOneArbitraryMatch(final Object pTeam, final Object pPlayer) {
    return rawGetOneArbitraryMatch(new Object[]{pTeam, pPlayer});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final Object pTeam, final Object pPlayer) {
    return rawHasMatch(new Object[]{pTeam, pPlayer});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final Object pTeam, final Object pPlayer) {
    return rawCountMatches(new Object[]{pTeam, pPlayer});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final Object pTeam, final Object pPlayer, final IMatchProcessor<? super AllPlayersMatch> processor) {
    rawForEachMatch(new Object[]{pTeam, pPlayer}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.  
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @param processor the action that will process the selected match. 
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final Object pTeam, final Object pPlayer, final IMatchProcessor<? super AllPlayersMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pTeam, pPlayer}, processor);
  }
  
  /**
   * Registers a new filtered delta monitor on this pattern matcher.
   * The DeltaMonitor can be used to track changes (delta) in the set of filtered pattern matches from now on, considering those matches only that conform to the given fixed values of some parameters. 
   * It can also be reset to track changes from a later point in time, 
   * and changes can even be acknowledged on an individual basis. 
   * See {@link DeltaMonitor} for details.
   * @param fillAtStart if true, all current matches are reported as new match events; if false, the delta monitor starts empty.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @return the delta monitor.
   * 
   */
  public DeltaMonitor<AllPlayersMatch> newFilteredDeltaMonitor(final boolean fillAtStart, final Object pTeam, final Object pPlayer) {
    return rawNewFilteredDeltaMonitor(fillAtStart, new Object[]{pTeam, pPlayer});
  }
  
  /**
   * Returns a new (partial) Match object for the matcher. 
   * This can be used e.g. to call the matcher with a partial match. 
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pTeam the fixed value of pattern parameter team, or null if not bound.
   * @param pPlayer the fixed value of pattern parameter player, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public AllPlayersMatch newMatch(final Object pTeam, final Object pPlayer) {
    return new AllPlayersMatch.Immutable(pTeam, pPlayer);
    
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<Object> rawAccumulateAllValuesOfteam(final Object[] parameters) {
    Set<Object> results = new HashSet<Object>();
    rawAccumulateAllValues(POSITION_TEAM, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfteam() {
    return rawAccumulateAllValuesOfteam(emptyArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfteam(final AllPlayersMatch partialMatch) {
    return rawAccumulateAllValuesOfteam(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for team.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfteam(final Object pPlayer) {
    return rawAccumulateAllValuesOfteam(new Object[]{null, pPlayer});
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
  public Set<Object> getAllValuesOfplayer(final AllPlayersMatch partialMatch) {
    return rawAccumulateAllValuesOfplayer(partialMatch.toArray());
  }
  
  /**
   * Retrieve the set of values that occur in matches for player.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<Object> getAllValuesOfplayer(final Object pTeam) {
    return rawAccumulateAllValuesOfplayer(new Object[]{pTeam, null});
  }
  
  @Override
  protected AllPlayersMatch tupleToMatch(final Tuple t) {
    try {
    	return new AllPlayersMatch.Immutable((java.lang.Object) t.get(POSITION_TEAM), (java.lang.Object) t.get(POSITION_PLAYER));	
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in tuple not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected AllPlayersMatch arrayToMatch(final Object[] match) {
    try {
    	return new AllPlayersMatch.Immutable((java.lang.Object) match[POSITION_TEAM], (java.lang.Object) match[POSITION_PLAYER]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  @Override
  protected AllPlayersMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return new AllPlayersMatch.Mutable((java.lang.Object) match[POSITION_TEAM], (java.lang.Object) match[POSITION_PLAYER]);
    } catch(ClassCastException e) {engine.getLogger().error("Element(s) in array not properly typed!",e);	//throw new IncQueryRuntimeException(e.getMessage());
    	return null;
    }
    
  }
  
  /**
   * @return the singleton instance of the factory of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IMatcherFactory<AllPlayersMatcher> factory() throws IncQueryException {
    return AllPlayersMatcherFactory.instance();
  }
}
