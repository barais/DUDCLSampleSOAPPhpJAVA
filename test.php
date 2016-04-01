<?php
print "Hello World!";
$client = new SoapClient("http://localhost:8080/demoCXF/HelloWorld?wsdl");

$params = array(
  "arg0" => 500,
  "arg1" => 400,
);
$response = $client->__soapCall("add", array($params));
var_dump($response);
?>
