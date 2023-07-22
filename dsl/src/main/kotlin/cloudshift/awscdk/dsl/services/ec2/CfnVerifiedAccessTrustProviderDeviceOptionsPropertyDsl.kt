@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnVerifiedAccessTrustProvider

@CdkDslMarker
public class CfnVerifiedAccessTrustProviderDeviceOptionsPropertyDsl {
  private val cdkBuilder: CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.Builder =
      CfnVerifiedAccessTrustProvider.DeviceOptionsProperty.builder()

  /**
   * @param tenantId The ID of the tenant application with the device-identity provider.
   */
  public fun tenantId(tenantId: String) {
    cdkBuilder.tenantId(tenantId)
  }

  public fun build(): CfnVerifiedAccessTrustProvider.DeviceOptionsProperty = cdkBuilder.build()
}
