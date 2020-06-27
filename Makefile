test:
	spark-submit test.py

install:
	cp ./out/artifacts/spark_auth_extension_jar/spark-auth-extension.jar /usr/local/spark/jars/spark-auth-extension.jar

.PHONY: test install