package a11848552;

/**
 *  A potion has a specific magic effect on its consumer
 */
public abstract class Potion extends MagicItem {

	
	public Potion(String name, int usages, int price, int weight) 
	{
		super(name,usages,price, weight);
	}
	
	/**
	 * Delegates to method call useOn(drinker)
	 * @param drinker the consumer of the potion
	 */
	/*public void drink(Wizard drinker) {
		useOn(drinker);
	}
	*/
	  
	/**
	 * returns "gulp" if usages is equal to 1, "gulps" otherwise
	 * @return "gulp" or "gulps" depending on number of usages left
	 */
	@Override
	public String usageString() {
		if (getUsages() == 1) {
            return "gulp";
        } 
		else {
            return "gulps";
        }
	}
}