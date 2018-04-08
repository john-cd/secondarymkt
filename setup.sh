#! /usr/bin/env bash

# Install Spark on Ubuntu on Windows
# See https://jamiekt.wordpress.com/2017/04/23/running-spark-on-ubuntu-un-windows-subsystem-for-linux/

sudo apt-get -y update 
sudo apt-get -y dist-upgrade
sudo apt -y autoremove

# Install Java runtime environment (JRE)

sudo apt-get -y install openjdk-8-jre-headless
export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre
echo "export JAVA_HOME=/usr/lib/jvm/java-1.8.0-openjdk-amd64/jre"  >> ~/.bashrc

# Download spark - visit https://spark.apache.org/downloads.html if you want a different version

wget http://mirror.stjschools.org/public/apache/spark/spark-2.3.0/spark-2.3.0-bin-hadoop2.7.tgz

# Untar and set a symlink

sudo tar -xvzf spark-2.3.0-bin-hadoop2.7.tgz -C /opt
sudo ln -s spark-2.1.0-bin-hadoop2.7 /opt/spark

# After installation, run Spark using: 
# /opt/spark/bin/spark-shell
