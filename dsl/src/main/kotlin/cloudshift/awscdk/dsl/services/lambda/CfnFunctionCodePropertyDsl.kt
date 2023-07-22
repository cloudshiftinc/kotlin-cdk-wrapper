@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionCodePropertyDsl {
  private val cdkBuilder: CfnFunction.CodeProperty.Builder = CfnFunction.CodeProperty.builder()

  /**
   * @param imageUri URI of a [container
   * image](https://docs.aws.amazon.com/lambda/latest/dg/lambda-images.html) in the Amazon ECR
   * registry.
   */
  public fun imageUri(imageUri: String) {
    cdkBuilder.imageUri(imageUri)
  }

  /**
   * @param s3Bucket An Amazon S3 bucket in the same AWS Region as your function.
   * The bucket can be in a different AWS account .
   */
  public fun s3Bucket(s3Bucket: String) {
    cdkBuilder.s3Bucket(s3Bucket)
  }

  /**
   * @param s3Key The Amazon S3 key of the deployment package.
   */
  public fun s3Key(s3Key: String) {
    cdkBuilder.s3Key(s3Key)
  }

  /**
   * @param s3ObjectVersion For versioned objects, the version of the deployment package object to
   * use.
   */
  public fun s3ObjectVersion(s3ObjectVersion: String) {
    cdkBuilder.s3ObjectVersion(s3ObjectVersion)
  }

  /**
   * @param zipFile (Node.js and Python) The source code of your Lambda function. If you include
   * your function source inline with this parameter, AWS CloudFormation places it in a file named
   * `index` and zips it to create a [deployment
   * package](https://docs.aws.amazon.com/lambda/latest/dg/gettingstarted-package.html) . This zip file
   * cannot exceed 4MB. For the `Handler` property, the first part of the handler identifier must be
   * `index` . For example, `index.handler` .
   * For JSON, you must escape quotes and special characters such as newline ( `\n` ) with a
   * backslash.
   *
   * If you specify a function that interacts with an AWS CloudFormation custom resource, you don't
   * have to write your own functions to send responses to the custom resource that invoked the
   * function. AWS CloudFormation provides a response module (
   * [cfn-response](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/cfn-lambda-function-code-cfnresponsemodule.html)
   * ) that simplifies sending responses. See [Using AWS Lambda with AWS
   * CloudFormation](https://docs.aws.amazon.com/lambda/latest/dg/services-cloudformation.html) for
   * details.
   */
  public fun zipFile(zipFile: String) {
    cdkBuilder.zipFile(zipFile)
  }

  public fun build(): CfnFunction.CodeProperty = cdkBuilder.build()
}
