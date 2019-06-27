# Springboot-SOAPServer

cURL:
curl -X POST \
  http://localhost:8080/service/student-details \
  -H 'Accept: */*' \
  -H 'Cache-Control: no-cache' \
  -H 'Connection: keep-alive' \
  -H 'Content-Type: text/xml' \
  -H 'Host: localhost:8080' \
  -H 'Postman-Token: 024dfd4e-97d0-4a6a-87ac-bc070a5f1e0d,ed536dff-db8c-4442-aee3-07157567a517' \
  -H 'User-Agent: PostmanRuntime/7.11.0' \
  -H 'accept-encoding: gzip, deflate' \
  -H 'cache-control: no-cache' \
  -H 'content-length: 349' \
  -H 'cookie: JSESSIONID=A8C4DE1323F37E28A42B068E2928533B' \
  -b JSESSIONID=A8C4DE1323F37E28A42B068E2928533B \
  -d '<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:gs="com/rish/tutorial/springboot/soap/server/xsd/models">
    <soapenv:Header/>
    <soapenv:Body>
        <gs:StudentDetailsRequest>
         <gs:name>Sajal</gs:name>
      </gs:StudentDetailsRequest>
    </soapenv:Body>
</soapenv:Envelope>'
