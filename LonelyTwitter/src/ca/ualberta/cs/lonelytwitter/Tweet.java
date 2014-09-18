/**
 * 
 */
package ca.ualberta.cs.lonelytwitter;

import java.io.Serializable;
import java.util.Date;


public class Tweet extends AbstractTweet implements Serializable {


	public Tweet(Date tweetDate, String tweetBody)
	{

		super(tweetDate, tweetBody);
		// TODO Auto-generated constructor stub
	}

	public String toString() {
		return tweetBody;
	}
}
