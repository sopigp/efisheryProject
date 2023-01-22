$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("feature/2-ExploreMusic.feature");
formatter.feature({
  "line": 2,
  "name": "Home",
  "description": "As a user\r\nI want to explore the music playlist based on categories",
  "id": "home",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@ExploreMusic"
    }
  ]
});
formatter.before({
  "duration": 5916624700,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "User want explore the music playlist based on categories and see list of song form each categories",
  "description": "",
  "id": "home;user-want-explore-the-music-playlist-based-on-categories-and-see-list-of-song-form-each-categories",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 6,
      "name": "@ExploreMusic"
    }
  ]
});
formatter.step({
  "line": 8,
  "name": "User on homepage with already login",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "User click explore menu",
  "keyword": "And "
});
formatter.step({
  "line": 10,
  "name": "User should be navigated to explore menu",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User explore the music based on categories",
  "keyword": "When "
});
formatter.step({
  "line": 12,
  "name": "User can see new album and single section, mood and genres section, trending section, new music video section",
  "keyword": "Then "
});
formatter.match({
  "location": "ExploreMusicSteps.homePage()"
});
formatter.result({
  "duration": 7767053400,
  "status": "passed"
});
formatter.match({
  "location": "ExploreMusicSteps.exploreMenu()"
});
formatter.result({
  "duration": 94111000,
  "status": "passed"
});
formatter.match({
  "location": "ExploreMusicSteps.navigateToExploreMenu()"
});
formatter.result({
  "duration": 1254102200,
  "status": "passed"
});
formatter.match({
  "location": "ExploreMusicSteps.chooseSongfromNewAlbumandSingleSection()"
});
formatter.result({
  "duration": 168711700,
  "status": "passed"
});
formatter.match({
  "location": "ExploreMusicSteps.exploreMusicBasedonCategories()"
});
formatter.result({
  "duration": 8985026900,
  "status": "passed"
});
formatter.after({
  "duration": 59800,
  "status": "passed"
});
});