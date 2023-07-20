@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.constructs.Construct

@CdkDslMarker
public class CfnBridgeOutputDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBridgeOutput.Builder = CfnBridgeOutput.Builder.create(scope, id)

  public fun bridgeArn(bridgeArn: String) {
    cdkBuilder.bridgeArn(bridgeArn)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun networkOutput(networkOutput: IResolvable) {
    cdkBuilder.networkOutput(networkOutput)
  }

  public fun networkOutput(networkOutput: CfnBridgeOutput.BridgeNetworkOutputProperty) {
    cdkBuilder.networkOutput(networkOutput)
  }

  public fun build(): CfnBridgeOutput = cdkBuilder.build()
}
