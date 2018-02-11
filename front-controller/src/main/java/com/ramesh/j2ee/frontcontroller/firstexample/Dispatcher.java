package com.ramesh.j2ee.frontcontroller.firstexample;

public class Dispatcher {
	   private StudentView studentView;
	   private HomeView homeView;
	   private DashboardView dashboardView;
	   private ErrorView errorView; 
	   
	   public Dispatcher(){
	      studentView = new StudentView();
	      homeView = new HomeView();
	      dashboardView = new DashboardView();
	      errorView = new ErrorView();
	   }

	   public void dispatch(String request){
	      if(request.equalsIgnoreCase("STUDENT")){
	         studentView.show();
	      }
	      if(request.equalsIgnoreCase("DASHBOARD")){
	         dashboardView.show();
	      }
	     if(request.equalsIgnoreCase("HOME")){
	         homeView.show();
	      }
	      else{
	         errorView.show();
	      } 
	   }
	}