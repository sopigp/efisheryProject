@ExploreMusic
Feature: Home
  As a user
  I want to explore the music playlist based on categories

  @ExploreMusic
  Scenario:  User want explore the music playlist based on categories and see list of song form each categories
  	Given User on homepage with already login
		And User click explore menu
		Then User should be navigated to explore menu
		When User explore the music based on categories
		Then User can see new album and single section, mood and genres section, trending section, new music video section