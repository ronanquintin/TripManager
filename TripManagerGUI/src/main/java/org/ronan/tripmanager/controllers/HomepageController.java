/**
 * 
 */
package org.ronan.tripmanager.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ronan Quintin
 *
 */
@Controller
public class HomepageController {


	private static final String HOMEPAGE_JSP = "homepage";

	@RequestMapping("/")
	public String home() {
		return HOMEPAGE_JSP;
	}

}
