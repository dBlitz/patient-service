provider "aws" {

  access_key = ""
  secret_key = ""
  region     = "us-east-1"
}

resource "aws_instance" "hello" {
  ami           = "ami-a89d3ad2"
  instance_type = "t2.medium"
}