package entities;

import javafx.geometry.BoundingBox;
import javafx.geometry.Point2D;

public interface Entity {
	
	/** 
     * Set entity position
     * @param position entity's position
     */
	void setPosition(Point2D position);
	
	 /** 
     * @return entity position
     */
	Point2D getPosition();
	
	 /** 
     * Set the size of the bounding box
     * @param height of the bounding box 
     * @param widht of the bounding box 
     */
	void setBoundingBox(float height, float width);
	
	 /** 
     * @return bounding box
     */
    BoundingBox getBoundingBox();
    
    /** 
     * @return eight
     */
    float getHeight();
    
    /** 
     * @return width
     */
    float getWidth();
    
    /** 
     * @return entity type
     */
    EntityType getEntityType();
    
	}
