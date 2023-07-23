Feature: Assignmdent Submit Scenario

  @CreateNewProgram
  Scenario: Cretae new Program for Batch
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and  request Body for Program with mandatory ,additional fields
    Then User receives 201 Created Status with response body

  @CreateNewBatch
  Scenario: Cretae Batch
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and  request Body for Batch with mandatory ,additional fields
    Then Validate response code 201

  @CreateUser
  Scenario: Cretae User
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and  request Body for User with mandatory ,additional fields
    Then Validate response code 201

  @CreateAssignment
  Scenario: Cretae Assignment
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and  request Body for Assignment with mandatory ,additional fields
    Then Validate response code 201

  @CreateAssignmentSubmit
  Scenario: Check if user able to  create a submission  with valid endpoint and request body (non existing values)
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and  request Body for Assignment submit with mandatory ,additional fields
    Then Validate response code 201
    
    
  #@DuplicateAssignmentSubmit
  #Scenario: Check if user able to create a submission with valid endpoint and request body (existing value)
    #Given User creates request for the LMS API endpoint
    #When User sends HTTPS Request and  request Body for Assignment submit with mandatory ,additional fields
    #Then User receives 400 Created Status with response body

  @DeleteAssignmentSubmit
  Scenario: Delete Assignment Submit
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment submit
    Then Validate response code 200

  @DeleteAssignment
  Scenario: Delete Assignment
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment
    Then Validate response code 200

  @DeleteUser
  Scenario: Delete User
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for user
    Then Validate response code 200

  @DeleteBatchByID
  Scenario: Delete Batch ById
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for batch
    Then Validate response code 200

  @DeleteProgramByName
  Scenario: Delete Program by name
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for program
    Then Validate response code 200
