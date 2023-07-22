@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.licensemanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.licensemanager.CfnLicense

/**
 * Details about a provisional configuration.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.licensemanager.*;
 * ProvisionalConfigurationProperty provisionalConfigurationProperty =
 * ProvisionalConfigurationProperty.builder()
 * .maxTimeToLiveInMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-licensemanager-license-provisionalconfiguration.html)
 */
@CdkDslMarker
public class CfnLicenseProvisionalConfigurationPropertyDsl {
  private val cdkBuilder: CfnLicense.ProvisionalConfigurationProperty.Builder =
      CfnLicense.ProvisionalConfigurationProperty.builder()

  /**
   * @param maxTimeToLiveInMinutes Maximum time for the provisional configuration, in minutes. 
   */
  public fun maxTimeToLiveInMinutes(maxTimeToLiveInMinutes: Number) {
    cdkBuilder.maxTimeToLiveInMinutes(maxTimeToLiveInMinutes)
  }

  public fun build(): CfnLicense.ProvisionalConfigurationProperty = cdkBuilder.build()
}
