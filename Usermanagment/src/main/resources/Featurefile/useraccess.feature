Feature: Checking the user managment

  @tag1
  Scenario Outline: User have a View option access
    Given Basic browser configuration
    When KRS Login "<UserName>" and "<Password>"
    And Enter the Job Roles access"<Access>"

    Examples: 
      | UserName                    | Password  | Access    |
      | ashwathaman@expsoltechs.com | Password1 | View Only |
