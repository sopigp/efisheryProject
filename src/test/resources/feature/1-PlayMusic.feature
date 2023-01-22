@PlayYoutubeMusic
Feature: Home
  As a user
  I want to be able to choose and play a song
  So i can hearing the music based on that i choose before

  @PlaySong
  Scenario:  User want play a song that have been choosed before
  	Given User already login on youtube music
		And User click one of song in playlist
		Then User can hear the song
		
		
		
		
		
		
		
