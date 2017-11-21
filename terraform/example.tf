provider "aws" {
  access_key = "AKIAIJRGGFLHC2X7O65Q"
  secret_key = "DaPXMgQesMNTCHDFZ2hqxZpWSnTF6Z/yd/c9SJ/m"
  region     = "us-east-1"
}

resource "aws_instance" "example" {
  ami           = "ami-ae7bfdb8"
  instance_type = "t2.micro"
  key_name = "terraform"

}