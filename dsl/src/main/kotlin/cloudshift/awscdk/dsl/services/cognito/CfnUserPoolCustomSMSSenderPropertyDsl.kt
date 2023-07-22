@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

@CdkDslMarker
public class CfnUserPoolCustomSMSSenderPropertyDsl {
  private val cdkBuilder: CfnUserPool.CustomSMSSenderProperty.Builder =
      CfnUserPool.CustomSMSSenderProperty.builder()

  /**
   * @param lambdaArn The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Cognito
   * triggers to send SMS notifications to users.
   */
  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  /**
   * @param lambdaVersion The Lambda version represents the signature of the "request" attribute in
   * the "event" information Amazon Cognito passes to your custom SMS sender Lambda function.
   * The only supported value is `V1_0` .
   */
  public fun lambdaVersion(lambdaVersion: String) {
    cdkBuilder.lambdaVersion(lambdaVersion)
  }

  public fun build(): CfnUserPool.CustomSMSSenderProperty = cdkBuilder.build()
}
