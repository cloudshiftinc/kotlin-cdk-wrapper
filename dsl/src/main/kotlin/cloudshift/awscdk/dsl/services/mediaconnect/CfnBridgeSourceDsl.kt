@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.constructs.Construct

@CdkDslMarker
public class CfnBridgeSourceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnBridgeSource.Builder = CfnBridgeSource.Builder.create(scope, id)

  public fun bridgeArn(bridgeArn: String) {
    cdkBuilder.bridgeArn(bridgeArn)
  }

  public fun flowSource(flowSource: IResolvable) {
    cdkBuilder.flowSource(flowSource)
  }

  public fun flowSource(flowSource: CfnBridgeSource.BridgeFlowSourceProperty) {
    cdkBuilder.flowSource(flowSource)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun networkSource(networkSource: IResolvable) {
    cdkBuilder.networkSource(networkSource)
  }

  public fun networkSource(networkSource: CfnBridgeSource.BridgeNetworkSourceProperty) {
    cdkBuilder.networkSource(networkSource)
  }

  public fun build(): CfnBridgeSource = cdkBuilder.build()
}
