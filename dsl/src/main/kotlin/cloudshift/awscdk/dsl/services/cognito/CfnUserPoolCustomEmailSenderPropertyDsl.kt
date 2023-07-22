@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cognito

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cognito.CfnUserPool

/**
 * A custom email sender AWS Lambda trigger.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cognito.*;
 * CustomEmailSenderProperty customEmailSenderProperty = CustomEmailSenderProperty.builder()
 * .lambdaArn("lambdaArn")
 * .lambdaVersion("lambdaVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cognito-userpool-customemailsender.html)
 */
@CdkDslMarker
public class CfnUserPoolCustomEmailSenderPropertyDsl {
  private val cdkBuilder: CfnUserPool.CustomEmailSenderProperty.Builder =
      CfnUserPool.CustomEmailSenderProperty.builder()

  /**
   * @param lambdaArn The Amazon Resource Name (ARN) of the AWS Lambda function that Amazon Cognito
   * triggers to send email notifications to users.
   */
  public fun lambdaArn(lambdaArn: String) {
    cdkBuilder.lambdaArn(lambdaArn)
  }

  /**
   * @param lambdaVersion The Lambda version represents the signature of the "request" attribute in
   * the "event" information that Amazon Cognito passes to your custom email sender AWS Lambda
   * function.
   * The only supported value is `V1_0` .
   */
  public fun lambdaVersion(lambdaVersion: String) {
    cdkBuilder.lambdaVersion(lambdaVersion)
  }

  public fun build(): CfnUserPool.CustomEmailSenderProperty = cdkBuilder.build()
}
