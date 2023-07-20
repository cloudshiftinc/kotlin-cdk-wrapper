@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestObdNetworkInterfacePropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.ObdNetworkInterfaceProperty.Builder =
      CfnDecoderManifest.ObdNetworkInterfaceProperty.builder()

  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  public fun obdInterface(obdInterface: IResolvable) {
    cdkBuilder.obdInterface(obdInterface)
  }

  public fun obdInterface(obdInterface: CfnDecoderManifest.ObdInterfaceProperty) {
    cdkBuilder.obdInterface(obdInterface)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.ObdNetworkInterfaceProperty = cdkBuilder.build()
}
