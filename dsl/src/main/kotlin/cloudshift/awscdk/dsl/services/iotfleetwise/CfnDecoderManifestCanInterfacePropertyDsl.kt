@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifest

@CdkDslMarker
public class CfnDecoderManifestCanInterfacePropertyDsl {
  private val cdkBuilder: CfnDecoderManifest.CanInterfaceProperty.Builder =
      CfnDecoderManifest.CanInterfaceProperty.builder()

  /**
   * @param name The unique name of the interface. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param protocolName (Optional) The name of the communication protocol for the interface.
   */
  public fun protocolName(protocolName: String) {
    cdkBuilder.protocolName(protocolName)
  }

  /**
   * @param protocolVersion (Optional) The version of the communication protocol for the interface.
   */
  public fun protocolVersion(protocolVersion: String) {
    cdkBuilder.protocolVersion(protocolVersion)
  }

  public fun build(): CfnDecoderManifest.CanInterfaceProperty = cdkBuilder.build()
}
