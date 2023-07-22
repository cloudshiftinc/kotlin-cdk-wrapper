@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2

@CdkDslMarker
public class CfnApplicationV2InputLambdaProcessorPropertyDsl {
  private val cdkBuilder: CfnApplicationV2.InputLambdaProcessorProperty.Builder =
      CfnApplicationV2.InputLambdaProcessorProperty.builder()

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

  public fun build(): CfnApplicationV2.InputLambdaProcessorProperty = cdkBuilder.build()
}
