@SearchMusic
Feature: Home
  As a user
  I want to be able to search a song with song name as keyword
  So i can find the music that i want to hear

  @PlaySong
  Scenario:  User want search a song with search menu
  	Given User already login with correct account
		And User search menu
		And User input the title song
		When User click the song
		Then User can hear that song
		