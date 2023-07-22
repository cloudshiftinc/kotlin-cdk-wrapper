@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge

@CdkDslMarker
public class CfnBridgeBridgeOutputPropertyDsl {
  private val cdkBuilder: CfnBridge.BridgeOutputProperty.Builder =
      CfnBridge.BridgeOutputProperty.builder()

  /**
   * @param networkOutput The output of the bridge.
   * A network output is delivered to your premises.
   */
  public fun networkOutput(networkOutput: IResolvable) {
    cdkBuilder.networkOutput(networkOutput)
  }

  /**
   * @param networkOutput The output of the bridge.
   * A network output is delivered to your premises.
   */
  public fun networkOutput(networkOutput: CfnBridge.BridgeNetworkOutputProperty) {
    cdkBuilder.networkOutput(networkOutput)
  }

  public fun build(): CfnBridge.BridgeOutputProperty = cdkBuilder.build()
}
