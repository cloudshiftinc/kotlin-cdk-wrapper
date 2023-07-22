@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

/**
 * Specifies the license configuration to use.
 *
 * `LicenseSpecification` is a property of the
 * [AWS::EC2::Instance](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance.html)
 * resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * LicenseSpecificationProperty licenseSpecificationProperty =
 * LicenseSpecificationProperty.builder()
 * .licenseConfigurationArn("licenseConfigurationArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ec2-instance-licensespecification.html)
 */
@CdkDslMarker
public class CfnInstanceLicenseSpecificationPropertyDsl {
  private val cdkBuilder: CfnInstance.LicenseSpecificationProperty.Builder =
      CfnInstance.LicenseSpecificationProperty.builder()

  /**
   * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration. 
   */
  public fun licenseConfigurationArn(licenseConfigurationArn: String) {
    cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
  }

  public fun build(): CfnInstance.LicenseSpecificationProperty = cdkBuilder.build()
}
