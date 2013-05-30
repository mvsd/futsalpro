package hu.bme.mit.inf.mvsd.futsal.core.database;

// Generated 2013.05.25. 20:05:45 by Hibernate Tools 4.0.0

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Team generated by hbm2java
 */
@Entity
@Table(name = "Team", catalog = "futsaldb")
public class Team implements java.io.Serializable {

	private Integer id;
	private String name;
	private Set<Player> players = new HashSet<Player>(0);
	private Set<GoalKeeper> goalkeepers = new HashSet<GoalKeeper>(0);
	private Set<Crew> crew = new HashSet<Crew>(0);

	public Team() {
	}

	public Team(String name) {
		this.name = name;
	}

	public Team(String name, Set<Player> players, Set<GoalKeeper> goalkeepers,
			Set<Crew> crew) {
		this.name = name;
		this.players = players;
		this.goalkeepers = goalkeepers;
		this.crew = crew;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "Id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "Name", nullable = false, length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<GoalKeeper> getGoalkeepers() {
		return this.goalkeepers;
	}

	public void setGoalkeepers(Set<GoalKeeper> goalkeepers) {
		this.goalkeepers = goalkeepers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "team")
	public Set<Crew> getCrew() {
		return this.crew;
	}

	public void setCrew(Set<Crew> crew) {
		this.crew = crew;
	}

}
