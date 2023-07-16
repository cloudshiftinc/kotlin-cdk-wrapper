@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps

@CdkDslMarker
public class CfnLinkAssociationPropsDsl {
  private val cdkBuilder: CfnLinkAssociationProps.Builder = CfnLinkAssociationProps.builder()

  public fun deviceId(deviceId: String) {
    cdkBuilder.deviceId(deviceId)
  }

  public fun globalNetworkId(globalNetworkId: String) {
    cdkBuilder.globalNetworkId(globalNetworkId)
  }

  public fun linkId(linkId: String) {
    cdkBuilder.linkId(linkId)
  }

  public fun build(): CfnLinkAssociationProps = cdkBuilder.build()
}
