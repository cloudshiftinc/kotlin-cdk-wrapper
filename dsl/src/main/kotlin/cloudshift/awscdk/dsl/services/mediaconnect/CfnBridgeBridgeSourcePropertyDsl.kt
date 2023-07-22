@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeBridgeSourcePropertyDsl {
  private val cdkBuilder: CfnBridge.BridgeSourceProperty.Builder =
      CfnBridge.BridgeSourceProperty.builder()

  /**
   * @param flowSource The source of the bridge.
   * A flow source originates in MediaConnect as an existing cloud flow.
   */
  public fun flowSource(flowSource: IResolvable) {
    cdkBuilder.flowSource(flowSource)
  }

  /**
   * @param flowSource The source of the bridge.
   * A flow source originates in MediaConnect as an existing cloud flow.
   */
  public fun flowSource(flowSource: CfnBridge.BridgeFlowSourceProperty) {
    cdkBuilder.flowSource(flowSource)
  }

  /**
   * @param networkSource The source of the bridge.
   * A network source originates at your premises.
   */
  public fun networkSource(networkSource: IResolvable) {
    cdkBuilder.networkSource(networkSource)
  }

  /**
   * @param networkSource The source of the bridge.
   * A network source originates at your premises.
   */
  public fun networkSource(networkSource: CfnBridge.BridgeNetworkSourceProperty) {
    cdkBuilder.networkSource(networkSource)
  }

  public fun build(): CfnBridge.BridgeSourceProperty = cdkBuilder.build()
}
