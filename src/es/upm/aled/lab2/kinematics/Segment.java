package es.upm.aled.lab2.kinematics;

import java.util.ArrayList;
import java.util.List;

public class Segment {
	
	private double length;
	private double angle;
	private List<Segment> children;
	
	//Constructor
	
	/**
	 * Builds a new Segment from its length and angle.
	 * 
	 * @param length The length of the segment, in cm.
	 * @param angle The angle of the segment with its father segment, in rad.
	 */
	
	public Segment (double length, double angle) {
		this.length = length;
		this.angle = angle;
		this.children = new ArrayList<>();
	}
	
	//Getters y setters
	
	/**
	 * Returns the length of the segment.
	 * 
	 * @return The length of the segment.
	 */
	public double getLength() {
		return this.length;
	}
	
	/**
	 * Returns the angle the segment forms with its father segment.
	 * 
	 * @return The angle of the segment.
	 */
	public double getAngle() {
		return this.angle;
	}
	
	/**
	 * Sets the length of the segment.
	 * 
	 * @param angle The angle of the segment, in rad.
	 */
	public void setAngle(double angle) {
		 this.angle = angle;
	}
	
	/**
	 * Returns the Segments. One segment cannot be repeated.
	 * 
	 * @return A List of all the segments.
	 */
	public List<Segment> getChildren() {
		return this.children;
	}
	
	/**
	 * Adds a new Segment to the List of Segments. Each segment can
	 * only appear as a child once.
	 * 
	 * @param child The Segment to be added.
	 */
	public void addChild(Segment child){
		if(!children.contains(child)) {
			children.add(child);
		}
	}
	
	
}

