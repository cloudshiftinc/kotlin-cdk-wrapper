@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

@CdkDslMarker
public class CfnApplicationOutputLambdaOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.LambdaOutputProperty.Builder =
      CfnApplicationOutput.LambdaOutputProperty.builder()

  /**
   * @param resourceArn Amazon Resource Name (ARN) of the destination Lambda function to write to. 
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
   * @param roleArn ARN of the IAM role that Amazon Kinesis Analytics can assume to write to the
   * destination function on your behalf. 
   * You need to grant the necessary permissions to this role.
   */
  public fun roleArn(roleArn: String) {
    cdkBuilder.roleArn(roleArn)
  }

  public fun build(): CfnApplicationOutput.LambdaOutputProperty = cdkBuilder.build()
}
