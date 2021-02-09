Feature: Get cost recharge

  Background:
    * url baseUrl
    * path 'recharge/costrecharge/'
    * def genericHeader = read('../commons/datajson/headers.json')
    * def data = read('datajson/costRechargeRequest.json')
    * def consultationcostResponse = read('datajson/costRechargeResponse.json')


  Scenario: Cost recharge exitoso
    * configure headers = genericHeader

    Given request data
    When method POST
    Then status 200
    And match $.data[0].cost  == 0.0
    And match $.data[0].description  == 'Costo generado para civica'


