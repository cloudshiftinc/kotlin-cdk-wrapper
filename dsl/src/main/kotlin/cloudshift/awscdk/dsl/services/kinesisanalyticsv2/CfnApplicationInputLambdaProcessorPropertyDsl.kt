@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationInputLambdaProcessorPropertyDsl {
  private val cdkBuilder: CfnApplication.InputLambdaProcessorProperty.Builder =
      CfnApplication.InputLambdaProcessorProperty.builder()

  /**
   * @param resourceArn The ARN of the Amazon Lambda function that operates on records in the
   * stream. 
   *
   * To specify an earlier version of the Lambda function than the latest, include the Lambda
   * function version in the Lambda function ARN. For more information about Lambda ARNs, see [Example
   * ARNs: Amazon
   * Lambda](https://docs.aws.amazon.com//general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplication.InputLambdaProcessorProperty = cdkBuilder.build()
}
