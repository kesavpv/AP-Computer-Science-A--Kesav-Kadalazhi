package assignments.term2;

public class Assignment_2_Part_1
{
	public static void main(String[] args)
	{
		// *************************************************************************
		// 1. Test Light()
		// *************************************************************************
		Light light1 = new Light();
		System.out.println("1. Test Light()");
		Light.testLight(light1, true, false, "white", "white\ton not burnt out");

		// *************************************************************************
		// 2. Test Light(boolean b, boolean o, String c)
		// *************************************************************************
		System.out.println("\n2. Test Light(boolean b, boolean o, String c)");
		Light light2 = new Light(true, true, "GreeN");
		// Notice that since the light bulb is "burnt out", the value of "on"
		// gets set to false. Also, the color should get saved in all lower case
		// as "green", not "GreeN".
		Light.testLight(light2, false, true, "green", "green\toff burnt out");

		// *************************************************************************
		// 3. Test burnOut()
		// *************************************************************************
		System.out.println("\n3. Test burnOut()");
		// light1 is not burnt out. Lets call burnOut on light1 and make sure it
		// gets burnt out and turned off
		light1.burnOut();
		Light.testLight(light1, false, true, "white", "white\toff burnt out");

		// *************************************************************************
		// 4. Test flip()
		// *************************************************************************
		System.out.println("\n4. Test flip()");
		Light light3 = new Light();
		// light3 is currently on and not burnt out. Lets flip the light off and
		// on and see if it works properly.
		System.out.println("light3 is on");
		Light.testLight(light3, true, false, "white", "white\ton not burnt out");
		light3.flip();
		System.out.println("now light3 should be off");
		Light.testLight(light3, false, false, "white", "white\toff not burnt out");
		light3.flip();
		System.out.println("now light3 should be back on");
		Light.testLight(light3, true, false, "white", "white\ton not burnt out");
		// Try to flip light1 on - this should fail since light1 is burnt out.
		// light1 should stay off
		System.out.println("light1 is burned out and off, we can't flip it on");
		light1.flip();
		Light.testLight(light1, false, true, "white", "white\toff burnt out");

		// *************************************************************************
		// 5. Test isOn()
		// *************************************************************************
		System.out.println("\n5. Test isOn()");
		// We know light1 is off, and light3 is on. Verify that the method isOn
		// reports this correctly.
		if (!light1.isOn())
		{
			System.out.println("*** PASS: isOn() working properly");
		}
		else
		{
			System.out.println("*** FAIL: isOn() not working properly");
		}
		if (light3.isOn())
		{
			System.out.println("*** PASS: isOn() working properly");
		}
		else
		{
			System.out.println("*** FAIL: isOn() not working properly");
		}

		// *************************************************************************
		// 6. Test getColor()
		// *************************************************************************
		System.out.println("\n6. Test getColor()");
		if (light1.getColor().equals("white"))
		{
			System.out.println("*** PASS: getColor() working properly");
		}
		else
		{
			System.out.println("*** FAIL: problem with getColor()");
		}

		// *************************************************************************
		// 7. Test setColor(String)
		// *************************************************************************
		System.out.println("\n7. Test setColor(String)");
		light1.setColor("red");
		System.out.println("*** " + Light.testLightColor(light1, "red"));
		light1.setColor("BLUE"); // should set light to blue
		System.out.println("*** " + Light.testLightColor(light1, "blue"));
		light1.setColor("yellow"); // yellow is not allowed, should set light to
									// white
		System.out.println("*** " + Light.testLightColor(light1, "white"));
	}
}

class Light
{
	private boolean on;
	private boolean burntOut;
	private String color = "";

	/**
	 * Default constructor that sets the bulb to on, not burnt out, and "white".
	 */
	public Light()
	{
		on = true;
		burntOut = false;
		color = "white";
	}

	/**
	 * This constructor sets the variable "on" to the parameter o. The burntOut
	 * variable is set to the parameter b. If burntOut
	 * is true, on is set to false, no matter what value is stored in o.
	 * The color variable is set to the parameter c only if c is "red", "green"
	 * or "blue". The constructor ignores the case of the value in c. If c holds
	 * any value other than "red", "green" or "blue", the constructor sets
	 * color to "white".
	 * 
	 * @param on
	 * @param burntOut
	 * @param color
	 */
	public Light(boolean on, boolean burntOut, String color)
	{
		this.on = on;
		this.burntOut = burntOut;
		
		if(burntOut)
			this.on = false;
		
		color = color.toLowerCase();
		
		if(color.equals("red") || color.equals("green") || color.equals("blue"))
			this.color = color;
		else
			this.color = "white";
	}

	/**
	 * The toString method returns a String with the Light in the format:
	 * red off burnt out
	 * green on not burnt out
	 * 
	 * Notice there is a tab between the value for color and "off"/"on"
	 * and one space before the "burnt out" or "not burnt out".
	*/
	public String toString() {
		return color+"\t"+(on?"on":"off")+" "+(burntOut?"burnt out":"not burnt out");
	}

	/**
	 * This method changes the bulb from on to off, or visa versa. If the
	 * burntOut variable is true, then the on variable may only be set to false.
	 */
	public void flip() {
		on = !on;
		if(burntOut)
			on = false;
	}

	/**
	 * The getColor method returns the color of the bulb.
	 * @return
	 */
	public String getColor() {
		return color;
	}

	/**
	 * The setColor method sets the color of the Light. The color variable is
	 * set to c only if c is "red", "green" or "blue". The method ignore the
	 * case of the value in c. If c holds any value other than "red", "green"
	 * or "blue", color will be set to "white".
	 */
	public void setColor(String color)
	{
		color = color.toLowerCase();
		
		if(color.equals("red") || color.equals("green") || color.equals("blue"))
			this.color = color;
		else
			this.color = "white";
	}

	/**
	 * The isOn method returns true if on, false otherwise.
	 * @return
	 */
	public boolean isOn() {
		return on;
	}

	/**
	 * The burnOut method sets the variable burntOut to true.
	 */
	public void burnOut()
	{
		burntOut = true;
		on = false;
	}

	

	// Private helper methods

	public static void testLight(Light light, boolean o, boolean b, String c, String string)
	{
		System.out.println("*** " + testLightOn(light, o));
		System.out.println("*** " + testLightburntOut(light, b));
		System.out.println("*** " + testLightColor(light, c));
		System.out.println("*** " + testLightToString(light, string));
	}

	public static String testLightOn(Light bulb, boolean o)
	{
		if ((bulb.on && !o) || (!bulb.on && o))
		{
			return "FAIL: on is not set correctly. on should be set to " + o + ", but it is set to " + bulb.on + ".";
		}
		else
		{
			return "PASS: on is set correctly (" + bulb.on + ")";
		}
	}

	public static String testLightburntOut(Light light, boolean b)
	{
		if ((light.burntOut && !b) || (!light.burntOut && b))
		{
			return "FAIL: burntOut is not set correctly (burntOut should be set to " + b + ", but it is set to "
							+ light.burntOut + ")";
		}
		else
		{
			return "PASS: burntOut is set correctly (" + light.burntOut + ")";
		}
	}

	public static String testLightColor(Light light, String c)
	{
		if (!light.color.equals(c))
		{
			return "FAIL: color is not set correctly (color should be set to " + c + ", but it is set to " + light.color
							+ ")";
		}
		else
		{
			return "PASS: color is set correctly (" + light.color + ")";
		}
	}

	public static String testLightToString(Light light, String string)
	{
		String output;

		if (light.toString().equals(string))
		{
			output = "PASS: toString produced the correct output";
		}
		else
		{
			output = "FAIL: toString does not work as expected";
		}
		return output + " (" + light.toString() + ")";
	}
}