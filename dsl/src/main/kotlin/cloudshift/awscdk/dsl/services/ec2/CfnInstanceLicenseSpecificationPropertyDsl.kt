@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnInstance

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
