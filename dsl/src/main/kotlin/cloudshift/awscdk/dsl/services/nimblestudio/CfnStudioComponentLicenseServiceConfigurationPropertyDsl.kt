@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.nimblestudio

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.nimblestudio.CfnStudioComponent

@CdkDslMarker
public class CfnStudioComponentLicenseServiceConfigurationPropertyDsl {
  private val cdkBuilder: CfnStudioComponent.LicenseServiceConfigurationProperty.Builder =
      CfnStudioComponent.LicenseServiceConfigurationProperty.builder()

  /**
   * @param endpoint The endpoint of the license service that is accessed by the studio component
   * resource.
   */
  public fun endpoint(endpoint: String) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun build(): CfnStudioComponent.LicenseServiceConfigurationProperty = cdkBuilder.build()
}
