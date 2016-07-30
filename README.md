AWS SDK for Java Sample
-----------------------

This sample demonstrates how to make basic requests to AWS services using the AWS SDK for Java.

For lots more information on using the AWS SDK for Java, including information on high-level APIs
and advanced features, check out the
[AWS SDK for Java Developer Guide](http://docs.aws.amazon.com/AWSSdkDocsJava/latest/DeveloperGuide/welcome.html).

Stay up to date with new features in the AWS SDK for Java by following the
[AWS Java Developer Blog](https://java.awsblog.com).

Prerequisites
=============

* You must have a valid Amazon Web Services developer account.  If you don't have an account yet, you can
      [get started for free](http://aws.amazon.com/free).
      
Running the Sample
==================

1. Configure your AWS security credentials in a `.aws/credentials` file in your home directory. For example:
  ```text
    [default]
    aws_access_key_id     = &lt;your AWS access key&gt;
    aws_secret_access_key = &lt;your AWS secret access key&gt;
  ```
  [More information on configuring `~/.aws/config`](http://docs.aws.amazon.com/cli/latest/userguide/cli-chap-getting-started.html)

2. Run `mvn package exec:java` to build and run the AwsSdkSample class.
