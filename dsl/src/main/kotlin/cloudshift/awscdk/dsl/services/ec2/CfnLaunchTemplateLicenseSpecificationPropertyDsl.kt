@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@CdkDslMarker
public class CfnLaunchTemplateLicenseSpecificationPropertyDsl {
  private val cdkBuilder: CfnLaunchTemplate.LicenseSpecificationProperty.Builder =
      CfnLaunchTemplate.LicenseSpecificationProperty.builder()

  /**
   * @param licenseConfigurationArn The Amazon Resource Name (ARN) of the license configuration.
   */
  public fun licenseConfigurationArn(licenseConfigurationArn: String) {
    cdkBuilder.licenseConfigurationArn(licenseConfigurationArn)
  }

  public fun build(): CfnLaunchTemplate.LicenseSpecificationProperty = cdkBuilder.build()
}
