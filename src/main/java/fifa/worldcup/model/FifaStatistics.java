package fifa.worldcup.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_stats")

public class FifaStatistics {
	
	@Id
	@Column
	private int id;
	
	@Column
	private String player;
	
	@Column
	private String position;
	
	@Column
	private String team;
	
	@Column
	private String age;
	
	@Column
	private int birth_year;
	
	@Column
	private double minutes_90s;
	
	@Column
	private int tackles;
	
	@Column
	private int tackles_won;
	
	@Column
	private int tackles_def_3rd;
	
	@Column
	private int tackles_mid_3rd;
	
	@Column
	private int tackles_att_3rd;
	
	@Column
	private int dribble_tackles;
	
	@Column
	private int dribbles_vs;
	
	@Column
	private double dribble_tackles_pct;
	
	@Column
	private int dribbled_past;
	
	@Column
	private int blocks;
	
	@Column
	private int blocked_shots;
	
	@Column
	private int blocked_passes;
	
	@Column
	private int interceptions;
	
	@Column
	private int tackles_interceptions;
	
	@Column
	private int clearances;
	
	@Column
	private int errors;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPlayer() {
		return player;
	}

	public void setPlayer(String player) {
		this.player = player;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public int getBirth_year() {
		return birth_year;
	}

	public void setBirth_year(int birth_year) {
		this.birth_year = birth_year;
	}

	public double getMinutes_90s() {
		return minutes_90s;
	}

	public void setMinutes_90s(double minutes_90s) {
		this.minutes_90s = minutes_90s;
	}

	public int getTackles() {
		return tackles;
	}

	public void setTackles(int tackles) {
		this.tackles = tackles;
	}

	public int getTackles_won() {
		return tackles_won;
	}

	public void setTackles_won(int tackles_won) {
		this.tackles_won = tackles_won;
	}

	public int getTackles_def_3rd() {
		return tackles_def_3rd;
	}

	public void setTackles_def_3rd(int tackles_def_3rd) {
		this.tackles_def_3rd = tackles_def_3rd;
	}

	public int getTackles_mid_3rd() {
		return tackles_mid_3rd;
	}

	public void setTackles_mid_3rd(int tackles_mid_3rd) {
		this.tackles_mid_3rd = tackles_mid_3rd;
	}

	public int getTackles_att_3rd() {
		return tackles_att_3rd;
	}

	public void setTackles_att_3rd(int tackles_att_3rd) {
		this.tackles_att_3rd = tackles_att_3rd;
	}

	public int getDribble_tackles() {
		return dribble_tackles;
	}

	public void setDribble_tackles(int dribble_tackles) {
		this.dribble_tackles = dribble_tackles;
	}

	public int getDribbles_vs() {
		return dribbles_vs;
	}

	public void setDribbles_vs(int dribbles_vs) {
		this.dribbles_vs = dribbles_vs;
	}

	public double getDribble_tackles_pct() {
		return dribble_tackles_pct;
	}

	public void setDribble_tackles_pct(double dribble_tackles_pct) {
		this.dribble_tackles_pct = dribble_tackles_pct;
	}

	public int getDribbled_past() {
		return dribbled_past;
	}

	public void setDribbled_past(int dribbled_past) {
		this.dribbled_past = dribbled_past;
	}

	public int getBlocks() {
		return blocks;
	}

	public void setBlocks(int blocks) {
		this.blocks = blocks;
	}

	public int getBlocked_shots() {
		return blocked_shots;
	}

	public void setBlocked_shots(int blocked_shots) {
		this.blocked_shots = blocked_shots;
	}

	public int getBlocked_passes() {
		return blocked_passes;
	}

	public void setBlocked_passes(int blocked_passes) {
		this.blocked_passes = blocked_passes;
	}

	public int getInterceptions() {
		return interceptions;
	}

	public void setInterceptions(int interceptions) {
		this.interceptions = interceptions;
	}

	public int getTackles_interceptions() {
		return tackles_interceptions;
	}

	public void setTackles_interceptions(int tackles_interceptions) {
		this.tackles_interceptions = tackles_interceptions;
	}

	public int getClearances() {
		return clearances;
	}

	public void setClearances(int clearances) {
		this.clearances = clearances;
	}

	public int getErrors() {
		return errors;
	}

	public void setErrors(int errors) {
		this.errors = errors;
	}

	@Override
	public String toString() {
		return "FifaStatistics [id=" + id + ", player=" + player + ", position=" + position + ", team=" + team
				+ ", age=" + age + ", birth_year=" + birth_year + ", minutes_90s=" + minutes_90s + ", tackles="
				+ tackles + ", tackles_won=" + tackles_won + ", tackles_def_3rd=" + tackles_def_3rd
				+ ", tackles_mid_3rd=" + tackles_mid_3rd + ", tackles_att_3rd=" + tackles_att_3rd + ", dribble_tackles="
				+ dribble_tackles + ", dribbles_vs=" + dribbles_vs + ", dribble_tackles_pct=" + dribble_tackles_pct
				+ ", dribbled_past=" + dribbled_past + ", blocks=" + blocks + ", blocked_shots=" + blocked_shots
				+ ", blocked_passes=" + blocked_passes + ", interceptions=" + interceptions + ", tackles_interceptions="
				+ tackles_interceptions + ", clearances=" + clearances + ", errors=" + errors + "]";
	}

	public FifaStatistics(int id, String player, String position, String team, String age, int birth_year,
			double minutes_90s, int tackles, int tackles_won, int tackles_def_3rd, int tackles_mid_3rd,
			int tackles_att_3rd, int dribble_tackles, int dribbles_vs, double dribble_tackles_pct, int dribbled_past,
			int blocks, int blocked_shots, int blocked_passes, int interceptions, int tackles_interceptions,
			int clearances, int errors) {
		super();
		this.id = id;
		this.player = player;
		this.position = position;
		this.team = team;
		this.age = age;
		this.birth_year = birth_year;
		this.minutes_90s = minutes_90s;
		this.tackles = tackles;
		this.tackles_won = tackles_won;
		this.tackles_def_3rd = tackles_def_3rd;
		this.tackles_mid_3rd = tackles_mid_3rd;
		this.tackles_att_3rd = tackles_att_3rd;
		this.dribble_tackles = dribble_tackles;
		this.dribbles_vs = dribbles_vs;
		this.dribble_tackles_pct = dribble_tackles_pct;
		this.dribbled_past = dribbled_past;
		this.blocks = blocks;
		this.blocked_shots = blocked_shots;
		this.blocked_passes = blocked_passes;
		this.interceptions = interceptions;
		this.tackles_interceptions = tackles_interceptions;
		this.clearances = clearances;
		this.errors = errors;
	}

	public FifaStatistics() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
