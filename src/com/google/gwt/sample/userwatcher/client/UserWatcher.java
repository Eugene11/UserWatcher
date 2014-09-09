package com.google.gwt.sample.userwatcher.client;

import com.google.gwt.sample.userwatcher.shared.FieldVerifier;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.Element;
import com.google.gwt.user.client.Window;


import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.EventListener;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class UserWatcher implements EntryPoint {
	
	/**
	 * Page encapsulate page without photo
	 */
	@SuppressWarnings("deprecation")
	final Element pageWithoutPhotoLink = DOM.getElementById("pageWithoutPhotoLink");
	
	/**
	 * Page encapsulate page with photo
	 */
	@SuppressWarnings("deprecation")
	final Element pageWithPhotoLink = DOM.getElementById("pageWithPhotoLink");
	
	
	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		
	    // Associate the Main panel with the HTML host page.
		
		DOM.sinkEvents(pageWithPhotoLink, Event.ONCLICK);
		DOM.setEventListener(pageWithPhotoLink, new EventListener() {
			@Override
		    public void onBrowserEvent(Event event) {
		        if (Event.ONCLICK == event.getTypeInt()) {
		        	PageWithPhoto pageWithPhoto = new PageWithPhoto();
		    		RootPanel.get("userList").clear();
		    	    RootPanel.get("userList").add(pageWithPhoto);
		        }
		    }
		});
		
		DOM.sinkEvents(pageWithoutPhotoLink, Event.ONCLICK);
		DOM.setEventListener(pageWithoutPhotoLink, new EventListener() {
			@Override
		    public void onBrowserEvent(Event event) {
		        if (Event.ONCLICK == event.getTypeInt()) {
		        	PageWithoutPhoto pageWithoutPhoto = new PageWithoutPhoto();
		        	RootPanel.get("userList").clear();
		        	RootPanel.get("userList").add(pageWithoutPhoto);
		        }
		    }
		});
		
		
		PageWithPhoto pageWithPhoto = new PageWithPhoto();
		RootPanel.get("userList").clear();
	    RootPanel.get("userList").add(pageWithPhoto);
	    
	    
	}
	
	 
	  
}
