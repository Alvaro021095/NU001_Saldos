@ignore
Feature: Category and services
  Background:
    * url  baseUrl
    * path '/recharge/categoriesandservices/'
    * def genericHeader = read('../commons/datajson/headers.json')
    * def data = read('datajson/categoryAndServiceRequest.json')
    * def categoryAndServiceResponse = read('datajson/categoryAndServiceResponse.json')

  Scenario: Categoria de forma exitosa
    * configure headers = genericHeader

    Given request data
    When method POST
    Then status 200
    And match $.data[0].categoryInformation.categoryCode == 'C0001'
    And match $.data[0].categoryInformation.categoryName == 'Transporte'







