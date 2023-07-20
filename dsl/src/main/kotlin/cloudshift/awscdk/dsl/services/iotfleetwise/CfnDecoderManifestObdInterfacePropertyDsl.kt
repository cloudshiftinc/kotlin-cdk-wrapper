@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestObdInterfacePropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.ObdInterfaceProperty.Builder =
      CfnDecoderManifest.ObdInterfaceProperty.builder()

  public fun dtcRequestIntervalSeconds(dtcRequestIntervalSeconds: String) {
    cdkBuilder.dtcRequestIntervalSeconds(dtcRequestIntervalSeconds)
  }

  public fun hasTransmissionEcu(hasTransmissionEcu: String) {
    cdkBuilder.hasTransmissionEcu(hasTransmissionEcu)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun obdStandard(obdStandard: String) {
    cdkBuilder.obdStandard(obdStandard)
  }

  public fun pidRequestIntervalSeconds(pidRequestIntervalSeconds: String) {
    cdkBuilder.pidRequestIntervalSeconds(pidRequestIntervalSeconds)
  }

  public fun requestMessageId(requestMessageId: String) {
    cdkBuilder.requestMessageId(requestMessageId)
  }

  public fun useExtendedIds(useExtendedIds: String) {
    cdkBuilder.useExtendedIds(useExtendedIds)
  }

  public fun build(): CfnDecoderManifest.ObdInterfaceProperty = cdkBuilder.build()
}
