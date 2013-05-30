package hu.bme.mit.inf.mvsd.futsal.core.database;

// Generated 2013.05.25. 20:05:45 by Hibernate Tools 4.0.0

import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Account generated by hbm2java
 */
@Entity
@Table(name = "Account", catalog = "futsaldb")
public class Account implements java.io.Serializable {

	private Integer id;
	private String name;
	private Date birthdate;
	private String address;
	private String email;
	private String phone;
	private Set<Player> players = new HashSet<Player>(0);
	private Set<Supervisor> supervisors = new HashSet<Supervisor>(0);
	private Set<GoalKeeper> goalKeepers = new HashSet<GoalKeeper>(0);
	private Set<Crew> crews = new HashSet<Crew>(0);
	private Set<Referee> referees = new HashSet<Referee>(0);

	public Account() {
	}

	public Account(String name, Date birthdate) {
		this.name = name;
		this.birthdate = birthdate;
	}

	public Account(String name, Date birthdate, String address, String email,
			String phone, Set<Player> players, Set<Supervisor> supervisors,
			Set<GoalKeeper> goalKeepers, Set<Crew> crews, Set<Referee> referees) {
		this.name = name;
		this.birthdate = birthdate;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.players = players;
		this.supervisors = supervisors;
		this.goalKeepers = goalKeepers;
		this.crews = crews;
		this.referees = referees;
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

	@Column(name = "Name", nullable = false, length = 45)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "Birthdate", nullable = false, length = 10)
	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	@Column(name = "Address", length = 250)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "Email", length = 45)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "Phone", length = 20)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Player> getPlayers() {
		return this.players;
	}

	public void setPlayers(Set<Player> players) {
		this.players = players;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Supervisor> getSupervisors() {
		return this.supervisors;
	}

	public void setSupervisors(Set<Supervisor> supervisors) {
		this.supervisors = supervisors;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<GoalKeeper> getGoalKeepers() {
		return this.goalKeepers;
	}

	public void setGoalKeepers(Set<GoalKeeper> goalKeepers) {
		this.goalKeepers = goalKeepers;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Crew> getCrews() {
		return this.crews;
	}

	public void setCrews(Set<Crew> crews) {
		this.crews = crews;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	public Set<Referee> getReferees() {
		return this.referees;
	}

	public void setReferees(Set<Referee> referees) {
		this.referees = referees;
	}

}