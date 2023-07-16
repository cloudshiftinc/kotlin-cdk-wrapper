@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelDvbSdtSettingsPropertyDsl {
  private val cdkBuilder: CfnChannel.DvbSdtSettingsProperty.Builder =
      CfnChannel.DvbSdtSettingsProperty.builder()

  public fun outputSdt(outputSdt: String) {
    cdkBuilder.outputSdt(outputSdt)
  }

  public fun repInterval(repInterval: Number) {
    cdkBuilder.repInterval(repInterval)
  }

  public fun serviceName(serviceName: String) {
    cdkBuilder.serviceName(serviceName)
  }

  public fun serviceProviderName(serviceProviderName: String) {
    cdkBuilder.serviceProviderName(serviceProviderName)
  }

  public fun build(): CfnChannel.DvbSdtSettingsProperty = cdkBuilder.build()
}
