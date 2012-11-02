package com.logosstudios.GRANT;

import java.io.File;

import kuusisto.tinysound.Music;
import kuusisto.tinysound.Sound;
import kuusisto.tinysound.TinySound;

public class Sounds
{
	private Sound doorOpen, doorClose, pullStart, pushStart;
	private Music background;
	public Sounds()
	{
		TinySound.init();
		doorOpen = TinySound.loadSound(new File("res/music/doorOpen.wav"));
		doorClose = TinySound.loadSound(new File("res/music/doorClose.wav"));
		pullStart = TinySound.loadSound(new File("res/music/pullRay.wav"));
		pushStart = TinySound.loadSound(new File("res/music/pushRay.wav"));
		background = TinySound.loadMusic(new File("res/music/backgroundMusic.wav"));
	}
	public void startBackgroundMusic()
	{
		background.play(true);
	}
	public void playDoorOpen()
	{
		doorOpen.play();
	}
	public void playDoorClose()
	{
		 doorClose.play();
	}
	public void playPushStart()
	{
		 pushStart.play();
	}
	public void playPullStart()
	{
		pullStart.play();
	}
	public void stopPushStart()
	{
		 pushStart.stop();
	}
	public void stopPullStart()
	{
		pullStart.stop();
	}
}