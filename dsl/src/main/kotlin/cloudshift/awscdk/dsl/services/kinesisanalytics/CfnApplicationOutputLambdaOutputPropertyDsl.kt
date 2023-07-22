@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutput

/**
 * When configuring application output, identifies an AWS Lambda function as the destination.
 *
 * You provide the function Amazon Resource Name (ARN) and also an IAM role ARN that Amazon Kinesis
 * Analytics can use to write to the function on your behalf.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * LambdaOutputProperty lambdaOutputProperty = LambdaOutputProperty.builder()
 * .resourceArn("resourceArn")
 * .roleArn("roleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationoutput-lambdaoutput.html)
 */
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
