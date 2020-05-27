aws dynamodb scan --max-items 3 --table-name <TABLE_NAME> \
| jq '{"<TABLE_NAME>": [.Items[] | {PutRequest: {Item: .}}]}' > data.json

aws dynamodb describe-table --table-name <TABLE_NAME> > describe.json | jq ' .Table | {"TableName": .TableName, "KeySchema": .KeySchema, "AttributeDefinitions": .AttributeDefinitions,  "ProvisionedThroughput": {
      "ReadCapacityUnits": 5,
      "WriteCapacityUnits": 5
}}' > table-definition.json

aws dynamodb create-table --cli-input-json file://table-definition.json  --endpoint-url http://localhost:8000 --region us-east-1

aws dynamodb batch-write-item --request-items file://data.json --endpoint-url http://localhost:8000

aws dynamodb scan --table-name <TABLE_NAME> --endpoint-url http://localhost:8000

aws dynamodb get-item --table-name Atm --key '{"idAtm": { "S": "4274" }}'