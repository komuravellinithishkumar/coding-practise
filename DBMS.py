import json
import csv

# s3_client = boto3.client('s3')


def lambda_handler():
    # TODO implement
    # bucket = event['Records'][0]['s3']['bucket']['name']
    # csv_file = event['Records'][0]['s3']['object']['key']
    # csv_file_obj = s3_client.get_object(Bucket=bucket, Key=csv_file)

    with open("departments.csv", "r+") as file:

        spamreader = csv.reader(file, delimiter=',')
        for row in spamreader:
            print(row)
        # print(w)


if __name__ == "__main__":

    lambda_handler()
