@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnBridge
import software.amazon.awscdk.services.mediaconnect.CfnBridgeProps

@CdkDslMarker
public class CfnBridgePropsDsl {
  private val cdkBuilder: CfnBridgeProps.Builder = CfnBridgeProps.builder()

  private val _outputs: MutableList<Any> = mutableListOf()

  private val _sources: MutableList<Any> = mutableListOf()

  public fun egressGatewayBridge(egressGatewayBridge: IResolvable) {
    cdkBuilder.egressGatewayBridge(egressGatewayBridge)
  }

  public fun egressGatewayBridge(egressGatewayBridge: CfnBridge.EgressGatewayBridgeProperty) {
    cdkBuilder.egressGatewayBridge(egressGatewayBridge)
  }

  public fun ingressGatewayBridge(ingressGatewayBridge: IResolvable) {
    cdkBuilder.ingressGatewayBridge(ingressGatewayBridge)
  }

  public fun ingressGatewayBridge(ingressGatewayBridge: CfnBridge.IngressGatewayBridgeProperty) {
    cdkBuilder.ingressGatewayBridge(ingressGatewayBridge)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun outputs(vararg outputs: Any) {
    _outputs.addAll(listOf(*outputs))
  }

  public fun outputs(outputs: Collection<Any>) {
    _outputs.addAll(outputs)
  }

  public fun outputs(outputs: IResolvable) {
    cdkBuilder.outputs(outputs)
  }

  public fun placementArn(placementArn: String) {
    cdkBuilder.placementArn(placementArn)
  }

  public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun sourceFailoverConfig(sourceFailoverConfig: CfnBridge.FailoverConfigProperty) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun sources(vararg sources: Any) {
    _sources.addAll(listOf(*sources))
  }

  public fun sources(sources: Collection<Any>) {
    _sources.addAll(sources)
  }

  public fun sources(sources: IResolvable) {
    cdkBuilder.sources(sources)
  }

  public fun build(): CfnBridgeProps {
    if(_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
    if(_sources.isNotEmpty()) cdkBuilder.sources(_sources)
    return cdkBuilder.build()
  }
}
