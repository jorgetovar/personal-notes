# Certification

## EC2

### Instances Types:

- General purpose
- Computed optimized: Process
- GPU Instances : Media processing
- Memory Optimazed : Caches
- Storage : DW, IO

t2.micro : <family><generation>.<size>

### Connect 
```shell
chmod 400 clojure-kp.pem
ssh -i "clojure-kp.pem" ec2-user@ec2-54-198-175-64.compute-1.amazonaws.com
```

#### Install web server

sudo su
yum update -y
yum install httpd
systemctl start httpd
systemctl enable httpd
echo "Hello World" > /var/www/html/index.html
 
#### Metadata 
This commands must be executed in the ec2-instance
curl http://169.254.169.254/latest/meta-data
curl http://169.254.169.254/latest/meta-data/ami-id
curl http://169.254.169.254/latest/meta-data/hostname
curl http://169.254.169.254/latest/meta-data/instance-id
curl http://169.254.169.254/latest/meta-data/instance-type
 
curl http://169.254.169.254/latest/dynamic
curl http://169.254.169.254/latest/dynamic/instance-identity
curl http://169.254.169.254/latest/dynamic/instance-identity/document
 
curl -s http://169.254.169.254/latest/dynamic/instance-identity/document > /var/www/html/index.html


#### Security Groups

SG are default deny
You can specify allow rules only
You can configurate separte rules from inbound and outbound 
Security groups are **stateful**: if a outgoing/incoming rule is allowed the incoming/outgoing response for it is allowed

outbound : curl google.com
inbound : connect

#### Ip address

Public IP are internet addressable
Private IP are internal to corporate network

ALL ICMP allow Ping

When you re-start a instance it gets a new public IP

#### Elastic IP address

you can associate an elastic IP address to an instance
You will be charged but an elastic ip even its not associated with an ec2 instance

#### Template
Configure boostrap scripts in user-data 3. Configuration
#!/bin/bash
commands

aws ecr get-login-password --region us-east-1 | docker login --username AWS --password-stdin 782913492063.dkr.ecr.us-east-1.amazonaws.com
