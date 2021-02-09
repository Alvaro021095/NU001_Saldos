Feature: Get balance civic card

  Background:
    * url baseUrl
    * path '/recharges/balance'
    * def genericHeader = read('../commons/datajson/headers.json')
    * def data = read('datajson/balanceRequest.json')
    * def balanceResponse = read('datajson/balanceResponse.json')



  Scenario: Get right data for balance civic card
    * configure headers = genericHeader

    Given request data
    When method POST
    Then status 200
    And match response.data[0].customerInformation.documentType == genericHeader.ClientType
    And match response.data[0].customerInformation.documentNumber == genericHeader.ClientID
    And match response == balanceResponse


  Scenario: Get error given client no existen body
    * configure headers = genericHeader


    Given request {data: [{productInformation: {firstReference: "CC",secondReference: "1000"} } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "BPRCG202"

  Scenario: Get error given empty body
    * configure headers = genericHeader

    Given request {}
    When method POST
    And status 200
    And match $.errors[0].code ==  "REC100"


  Scenario: Get error given firstReference empty
    * configure headers = genericHeader
    Given request {data: [{productInformation: {firstReference: "",secondReference: "1026162125"} } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "REC102"

  Scenario: Get error given firstReference is indefinite
    * configure headers = genericHeader
    Given request {data: [{productInformation: {firstReference: "AA",secondReference: "1026162125"} } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given firstReference empty
    * configure headers = genericHeader
    Given request {data: [{productInformation: {firstReference: "CC",secondReference: ""} } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "REC103"
