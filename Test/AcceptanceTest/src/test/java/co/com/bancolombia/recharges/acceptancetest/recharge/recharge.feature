Feature: Get balance civic card

  Background:
    * url baseUrl
    * path '/recharges/recharge'
    * def genericHeader = read('../commons/datajson/headers.json')
    * def data = read('datajson/rechargeRequest.json')
    * def rechargeResponse = read('datajson/rechargeResponse.json')

  Scenario: Get right data for balance civic card
    * configure headers = genericHeader

    Given request data
    When method POST
    Then status 200
    And match $.data[0].customerInformation.documentType == 'CC'
    And match $.data[0].customerInformation.documentNumber == '1017188177'
    And  match $.data[0].rechargeResponseInformation.referenceRecharge == '6190795'

  Scenario: Get error given empty categoryCode
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "1000" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given empty serviceCode
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "1000" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given empty serviceSupplierCode
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "", referenceRecharge: "6190795",rechargeAmount: "1000" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SPRCG400"

  Scenario: Get error given empty referenceRecharge
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "",rechargeAmount: "1000" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given empty rechargeAmount
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given empty typeProduct
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "1000" }, paymentInformation: { typeProduct: "", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given empty numberProduct
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "1000" }, paymentInformation: { typeProduct: "S", numberProduct: "" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "SA400"

  Scenario: Get error given rechargeAmount lower stop
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "100" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "BPRCG047"

  Scenario: Get error given rechargeAmount exceeds limit
    * configure headers = genericHeader

    Given request {data:[ { rechargeInformation: { categoryCode: "C0001", serviceCode: "S0001", serviceSupplierCode: "PS001", referenceRecharge: "6190795",rechargeAmount: "110000" }, paymentInformation: { typeProduct: "S", numberProduct: "03110001000" } } ] }
    And  print request data
    When method POST
    And status 200
    And match $.errors[0].code ==  "BPRCG112"