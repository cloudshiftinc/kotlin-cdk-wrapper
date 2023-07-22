@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnPublisherProps

/**
 * Properties for defining a `CfnPublisher`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * CfnPublisherProps cfnPublisherProps = CfnPublisherProps.builder()
 * .acceptTermsAndConditions(false)
 * // the properties below are optional
 * .connectionArn("connectionArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudformation-publisher.html)
 */
@CdkDslMarker
public class CfnPublisherPropsDsl {
  private val cdkBuilder: CfnPublisherProps.Builder = CfnPublisherProps.builder()

  /**
   * @param acceptTermsAndConditions Whether you accept the [Terms and
   * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
   * for publishing extensions in the CloudFormation registry. You must accept the terms and conditions
   * in order to register to publish public extensions to the CloudFormation registry. 
   * The default is `false` .
   */
  public fun acceptTermsAndConditions(acceptTermsAndConditions: Boolean) {
    cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
  }

  /**
   * @param acceptTermsAndConditions Whether you accept the [Terms and
   * Conditions](https://docs.aws.amazon.com/https://cloudformation-registry-documents.s3.amazonaws.com/Terms_and_Conditions_for_AWS_CloudFormation_Registry_Publishers.pdf)
   * for publishing extensions in the CloudFormation registry. You must accept the terms and conditions
   * in order to register to publish public extensions to the CloudFormation registry. 
   * The default is `false` .
   */
  public fun acceptTermsAndConditions(acceptTermsAndConditions: IResolvable) {
    cdkBuilder.acceptTermsAndConditions(acceptTermsAndConditions)
  }

  /**
   * @param connectionArn If you are using a Bitbucket or GitHub account for identity verification,
   * the Amazon Resource Name (ARN) for your connection to that account.
   * For more information, see [Registering your account to publish CloudFormation
   * extensions](https://docs.aws.amazon.com/cloudformation-cli/latest/userguide/publish-extension.html#publish-extension-prereqs)
   * in the *CloudFormation CLI User Guide* .
   */
  public fun connectionArn(connectionArn: String) {
    cdkBuilder.connectionArn(connectionArn)
  }

  public fun build(): CfnPublisherProps = cdkBuilder.build()
}
