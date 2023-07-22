@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationOutputV2

@CdkDslMarker
public class CfnApplicationOutputV2LambdaOutputPropertyDsl {
  private val cdkBuilder: CfnApplicationOutputV2.LambdaOutputProperty.Builder =
      CfnApplicationOutputV2.LambdaOutputProperty.builder()

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

  public fun build(): CfnApplicationOutputV2.LambdaOutputProperty = cdkBuilder.build()
}
