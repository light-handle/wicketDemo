package com.knoa;

import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.Component;

public class HomePage extends WebPage {
	private static final long serialVersionUID = 1L;

    public HomePage(final PageParameters parameters) {
  //      add(new Label("version", getApplication().getFrameworkSettings().getVersion()));
       add(new Label("subject", "Kunal T"));
        
       //Label s = new Label("subject", "John");
    //   add(new Component[] { s });
        // TODO Add your page's components here
    }
}
