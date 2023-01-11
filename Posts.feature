
  Feature: Post feature of facebook
    This will test the post functionality at the user wall

    Scenario: Post a message on user wall
      Given User should be logged in and should be present in the user wall
      When  I type the message in the box
      And click on post
      Then message gets posted