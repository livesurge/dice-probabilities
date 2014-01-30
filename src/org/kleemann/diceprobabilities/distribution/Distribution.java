package org.kleemann.diceprobabilities.distribution;

import org.apache.commons.math3.fraction.BigFraction;

/**
 * <p>Represents a discrete distribution that exists of the integer set 0 to size()-1
 * Each distribution is represented as a fraction and the sum of all fractions must equal 1.
 * 
 * <p>All our implementation of Distribution are immutable.
 * 
 *  <p>TODO: this could behave like a collection.  Perhaps we should expose an enumarable?
 */
public interface Distribution {

	/**
	 * Although the distribution returns legal values across all integers,
	 * it is guaranteed that there are no non-zero values in the 
	 * range of 0 to size()-1.  This can help with enumeration. 
	 */
	int size();
	
	/**
	 * <p>Returns the probability of the random variable at the point x.
	 * There is no range for i so "out of bounds" values return a probability of zero.
	 * 
	 * <p>Note: x values in this application generally represent sums of dice
	 * rolls.
	 */
	BigFraction getProbability(int x);
	
	/**
	 * <p>Returns the sum of all probabilities in this distribution from
	 * point x onward.  
	 */
	BigFraction getCumulativeProbability(int x);
}
