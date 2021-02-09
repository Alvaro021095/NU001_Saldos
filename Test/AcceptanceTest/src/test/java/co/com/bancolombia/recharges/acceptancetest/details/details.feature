Feature: Get detail of service

  Background:
    * url baseUrl
    * path 'recharge/details'
    * def genericHeader = read('../commons/datajson/headers.json')
    * def data = read('datajson/detailsRequest.json')
    * def detailResponse = read('datajson/detailsResponse.json')


  Scenario: Get right data for detail of service
    * configure headers = genericHeader
    * def detailSchema = read('datajson/schemas.json')

    Given request data
    When method POST
    Then status 200
    And match $.data[0].servicesDetail.servicesMetaInfo == "#[] detailSchema.servicesMetaInfo"
    And match $.data[0].servicesDetail.servicesMetaInfo[0].inputGroups == "#[] detailSchema.inputGroups"
    And match $.data[0].servicesDetail.servicesMetaInfo[1].inputGroups[1].inputs[0].options[0] == detailSchema.options
    And match $.data[0].servicesDetail.servicesMetaInfo[0].inputGroups[0].inputs[0] == detailSchema.inputs
