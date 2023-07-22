@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

@CdkDslMarker
public class CfnApplicationInputLambdaProcessorPropertyDsl {
  private val cdkBuilder: CfnApplication.InputLambdaProcessorProperty.Builder =
      CfnApplication.InputLambdaProcessorProperty.builder()

  /**
   * @param resourceArn The ARN of the [AWS Lambda](https://docs.aws.amazon.com/lambda/) function
   * that operates on records in the stream. 
   *
   * To specify an earlier version of the Lambda function than the latest, include the Lambda
   * function version in the Lambda function ARN. For more information about Lambda ARNs, see [Example
   * ARNs: AWS
   * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  /**
   * @param roleArn The ARN of the IAM role that is used to access the AWS Lambda function. 
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplication.InputLambdaProcessorProperty = cdkBuilder.build()
}
