@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps

@CdkDslMarker
public class CfnLinkAssociationPropsDsl {
  private val cdkBuilder: CfnLinkAssociationProps.Builder = CfnLinkAssociationProps.builder()

  /**
   * @param deviceId The device ID for the link association. 
   */
  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  /**
   * @param globalNetworkId The ID of the global network. 
   */
  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  /**
   * @param linkId The ID of the link. 
   */
  public fun linkId(linkId: String) {
    cdkBuilder.linkId(linkId)
  }

  public fun build(): CfnLinkAssociationProps = cdkBuilder.build()
}
