@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

/**
 * Specifies the credit option for CPU usage of a T2, T3, or T3a instance.
 *
 * `CreditSpecification` is a property of [AWS::EC2::LaunchTemplate
 * LaunchTemplateData](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-launchtemplatedata.html)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CreditSpecificationProperty creditSpecificationProperty = CreditSpecificationProperty.builder()
 * .cpuCredits("cpuCredits")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-launchtemplate-creditspecification.html)
 */
@CdkDslMarker
public class CfnLaunchTemplateCreditSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.CreditSpecificationProperty.Builder =
      CfnLaunchTemplate.CreditSpecificationProperty.builder()

  /**
   * @param cpuCredits The credit option for CPU usage of a T instance.
   * Valid values: `standard` | `unlimited`
   */
  public fun cpuCredits(cpuCredits: String) {
    cdkBuilder.cpuCredits(cpuCredits)
  }

  public fun build(): CfnLaunchTemplate.CreditSpecificationProperty = cdkBuilder.build()
}
