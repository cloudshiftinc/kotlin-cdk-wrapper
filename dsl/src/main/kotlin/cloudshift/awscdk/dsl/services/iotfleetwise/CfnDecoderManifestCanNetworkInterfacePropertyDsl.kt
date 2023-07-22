@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestCanNetworkInterfacePropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.CanNetworkInterfaceProperty.Builder =
      CfnDecoderManifest.CanNetworkInterfaceProperty.builder()

  /**
   * @param canInterface the value to be set. 
   */
  public fun canInterface(canInterface: IResolvable) {
    cdkBuilder.canInterface(canInterface)
  }

  /**
   * @param canInterface the value to be set. 
   */
  public fun canInterface(canInterface: CfnDecoderManifest.CanInterfaceProperty) {
    cdkBuilder.canInterface(canInterface)
  }

  /**
   * @param interfaceId the value to be set. 
   */
  public fun interfaceId(interfaceId: String) {
    cdkBuilder.interfaceId(interfaceId)
  }

  /**
   * @param type the value to be set. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnDecoderManifest.CanNetworkInterfaceProperty = cdkBuilder.build()
}
