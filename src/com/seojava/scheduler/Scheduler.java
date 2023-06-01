package com.seojava.scheduler;

public interface Scheduler {
	public void getNextCall();
	public void sendCallToAgent();
}
