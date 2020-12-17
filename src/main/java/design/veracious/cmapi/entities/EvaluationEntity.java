package design.veracious.cmapi.entities;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class EvaluationEntity {

	// Possible grades:
	// 1 - very good
	// 2 - good
	// 3 - neutral
	// 4 - bad
	// 10 - n/a

	private int evaluationGrade;
	private int itemDescription;
	private int packaging;
	private int speed;

	private String comment;

	// Possible complaint values:
	// badCommunication
	// incompleteShipment
	// notFoil
	// rudeSeller
	// shipDamage
	// unorderedShipment
	// wrongEd
	// wrongLang
	private List<String> complaint;

	public EvaluationEntity() {
	}

	public int getEvaluationGrade() {
		return evaluationGrade;
	}

	public void setEvaluationGrade(int evaluationGrade) {
		this.evaluationGrade = evaluationGrade;
	}

	public int getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(int itemDescription) {
		this.itemDescription = itemDescription;
	}

	public int getPackaging() {
		return packaging;
	}

	public void setPackaging(int packaging) {
		this.packaging = packaging;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public List<String> getComplaint() {
		return complaint;
	}

	public void setComplaint(List<String> complaint) {
		this.complaint = complaint;
	}

}
