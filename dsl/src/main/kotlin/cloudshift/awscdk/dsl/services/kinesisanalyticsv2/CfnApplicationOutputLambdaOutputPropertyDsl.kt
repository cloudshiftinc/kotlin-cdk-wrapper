@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplicationOutput

@CdkDslMarker
public class CfnApplicationOutputLambdaOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutput.LambdaOutputProperty.Builder =
      CfnApplicationOutput.LambdaOutputProperty.builder()

  /**
   * @param resourceArn The Amazon Resource Name (ARN) of the destination Lambda function to write
   * to. 
   *
   * To specify an earlier version of the Lambda function than the latest, include the Lambda
   * function version in the Lambda function ARN. For more information about Lambda ARNs, see [Example
   * ARNs: Amazon
   * Lambda](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-lambda)
   */
  public fun resourceArn(resourceArn: String) {
    cdkBuilder.resourceArn(resourceArn)
  }

  public fun build(): CfnApplicationOutput.LambdaOutputProperty = cdkBuilder.build()
}
