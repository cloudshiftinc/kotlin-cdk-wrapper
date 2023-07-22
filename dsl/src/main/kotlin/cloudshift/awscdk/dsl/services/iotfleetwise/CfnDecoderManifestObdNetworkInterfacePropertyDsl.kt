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

  /**
   * @param interfaceId the value to be set. 
   */
  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  /**
   * @param obdInterface the value to be set. 
   */
  public fun obdInterface(obdInterface: IResolvable) {
    cdkBuilder.obdInterface(obdInterface)
  }

  /**
   * @param obdInterface the value to be set. 
   */
  public fun obdInterface(obdInterface: CfnDecoderManifest.ObdInterfaceProperty) {
    cdkBuilder.obdInterface(obdInterface)
  }

  /**
   * @param type the value to be set. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.ObdNetworkInterfaceProperty = cdkBuilder.build()
}
