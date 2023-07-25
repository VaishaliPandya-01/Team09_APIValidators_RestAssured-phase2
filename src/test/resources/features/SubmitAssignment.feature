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

  @CreateAdminUser
  Scenario: Cretae Admin User
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Admin User with mandatory ,additional fields
    Then Validate response code 201

  @CreateStudentUser
  Scenario: Cretae Student User
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Student User with mandatory ,additional fields
    Then Validate response code 201

  @CreateAssignmentByAdmin
  Scenario: Cretae Assignment
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Assignment with mandatory ,additional fields
    Then Validate response code 201

  @MissingMandatoryFieldsAssignmentID
  Scenario: Check if user able to create a submission missing mandatory field AssignmentID in request body
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Assignment submit with missing Assignment ID
    Then User receives 400 Created Status with response body

  @MissingMandatoryFieldsUserID
  Scenario: Check if user able to create a submission missing mandatory field UserID in request body
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Assignment submit with missing User ID
    Then User receives 400 Created Status with response body

  @MissingMandatoryFieldsSubDateTime
  Scenario: Check if user able to create a submission missing mandatory field SubDateTime in request body
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Assignment submit with missing sub Date Time
    Then User receives 400 Created Status with response body

  @DeleteTest1AssignmentSubmit
  Scenario: Delete Assignment Submit
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment submit
    Then Validate response code 200

  @MissingMandatoryFieldsSubmissiondescription
  Scenario: Check if user able to create a submission missing mandatory field Submissiondescription in request body
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Assignment submit with missing Submission description
    Then User receives 400 Created Status with response body

  @DeleteTest2AssignmentSubmit
  Scenario: Delete Assignment Submit
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment submit
    Then Validate response code 200

  @CreateAssignmentSubmitByStudent
  Scenario: Check if user able to  create a submission  with valid endpoint and request body (non existing values)
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for Assignment submit with mandatory ,additional fields
    Then Validate response code 201

  @DuplicateAssignmentSubmit
  Scenario: Check if user able to create a submission with valid endpoint and request body (existing value)
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Request and request Body for duplicate Assignment submit with mandatory ,additional fields
    Then User receives 400 Bad Request Status with message

  @GetAllAssignmentSubmit
  Scenario: Check if user able to retrieve all submission with valid LMS API endpoint
    Given User creates request for the LMS API endpoint
    When User creates GET Request for Assignment submit
    Then User receives 200 OK Status with response body

  @GetAssignmentSubmissionByUsedID
  Scenario: Check if user able to retrieve a submission with valid User ID
    Given User creates request for the LMS API endpoint
    When User sends Get HTTPS Request for Assignment submit by User ID
    Then User receives 200 OK Status with response body

  @GetAssignmentSubmissionByBatchID
  Scenario: Check if user able to retrieve a submission with valid Batch ID
    Given User creates request for the LMS API endpoint
    When User sends Get HTTPS Request for Assignment submit by Batch ID
    Then User receives 200 OK Status with response body

  @ResubmitAssignmentbysubmissionIDBySameStudent
  Scenario: Check if user able to update a submission with valid  submission ID and mandatory request body
    Given User creates request for the LMS API endpoint
    When User sends Put HTTPS Request and request Body for Assignment Submit with mandatory fields
    Then User receives 200 OK Status with updated value in response body
    
    @ResubmitAssignmentbysubmissionIDWithoutMandatoryFields
  Scenario: Check if user able to update a submission with valid  submission ID and missing mandatory fields
    Given User creates request for the LMS API endpoint
    When User sends Put HTTPS Request and request Body for Assignment Submit without mandatory fields
    Then User receives 400 Not Found Status with message

  @UpdateAssignmentDueDateByAdmin
  Scenario: User update assignment due date
    Given User creates request for the LMS API endpoint
    When User sends put HTTPS Request and request Body for updating date in Assignment
    Then Validate response code 200
    
     @UpdateGradeAssignmentbySubmissionIDWithoutMandatoryFields
  Scenario: Check if user able to  grade assignment with valid submission Id and without mandatory fields
    Given User creates request for the LMS API endpoint
    When User sends Put HTTPS Request and request Body to grade Assignment Submit without mandatory fields
    Then User receives 400 Not Found Status with message

  @UpdateGradeAssignmentbySubmissionID
  Scenario: Check if user able to  grade assignment with valid submission  Id and mandatory request body
    Given User creates request for the LMS API endpoint
    When User sends Put HTTPS Request and request Body to grade Assignment Submit
    Then User receives 200 OK Status with updated value in response body
   

  @GetGradeByAssignID
  Scenario: Check if user able to retrieve a grades with valid Assignment ID
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Get Request for Assignment submit with assignment ID
    Then User receives 200 OK Status with response body

  @GetGradeByStudentID
  Scenario: Check if user able to retrieve a grades with valid Student ID
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Get Request for Assignment submit with Student ID
    Then User receives 200 OK Status with response body

  @GetGradeByBatchID
  Scenario: Check if user able to retrieve a grades with valid Assignment ID
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Get Request for Assignment submit with Batch ID
    Then User receives 200 OK Status with response body

  @DeleteAssignmentSubmit
  Scenario: Check if user able to delete a submission with valid submission Id
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment submit
    Then User receives 200 Ok status with message

  @DeleteWithInvalidSubmissionID
  Scenario: Check if user able to delete a submission with invalid submission Id
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment submit
    Then User receives 404 Not Found Status with message

  @DeleteAssignment
  Scenario: Delete Assignment
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for assignment
    Then Validate response code 200

  @DeleteStudentUser
  Scenario: Delete User
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for student user
    Then Validate response code 200

  @DeleteAdminUser
  Scenario: Delete User
    Given User creates request for the LMS API endpoint
    When User sends HTTPS delete Request for admin user
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

  @ResubmitAssignmentbyInvalidSubmissionIDBy
  Scenario: Check if user able to update a submission with Invalid  submission ID and mandatory request body
    Given User creates request for the LMS API endpoint
    When User sends Put HTTPS Request and request Body for Assignment Submit with mandatory fields
    Then User receives 404 Not Found Status with message
    
    @UpdateGradeAssignmentInvalidbySubmissionID
  Scenario: Check if user able to  grade assignment with Invalid submission Id and mandatory request body
    Given User creates request for the LMS API endpoint
    When User sends Put HTTPS Request and request Body to grade Assignment Submit
    Then User receives 404 Not Found Status with message

  @GetAssignmentByInvalidBatchID
  Scenario: Check if user able to retrieve a submission with invalid Batch ID
    Given User creates request for the LMS API endpoint
    When User sends Get HTTPS Request for Assignment submit by invalid Batch ID
    Then User receives 404 Not Found Status with message

  @GetAssignmentByInvalidUsedID
  Scenario: Check if user able to retrieve a submission with invalid User ID
    Given User creates request for the LMS API endpoint
    When User sends Get HTTPS Request for Assignment submit with invalid User ID
    Then User receives 404 Not Found Status with message

  @GetGradeByInvalidAssignID
  Scenario: Check if user able to retrieve a grades with Invalid Assignment ID
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Get Request for Assignment submit with assignment ID
    Then User receives 404 Not Found Status with message

  @GetGradeByInvalidStudentID
  Scenario: Check if user able to retrieve a grades with Invalid Assignment ID
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Get Request for Assignment submit with Student ID
    Then User receives 404 Not Found Status with message

  @GetGradeByInvalidBatchID
  Scenario: Check if user able to retrieve a grades with Invalid Assignment ID
    Given User creates request for the LMS API endpoint
    When User sends HTTPS Get Request for Assignment submit with Batch ID
    Then User receives 404 Not Found Status with message
