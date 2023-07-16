@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.globalaccelerator.CfnEndpointGroupProps

@CdkDslMarker
public class CfnEndpointGroupPropsDsl {
  private val cdkBuilder: CfnEndpointGroupProps.Builder = CfnEndpointGroupProps.builder()

  private val _endpointConfigurations: MutableList<Any> = mutableListOf()

  private val _portOverrides: MutableList<Any> = mutableListOf()

  public fun endpointConfigurations(vararg endpointConfigurations: Any) {
    _endpointConfigurations.addAll(listOf(*endpointConfigurations))
  }

  public fun endpointConfigurations(endpointConfigurations: Collection<Any>) {
    _endpointConfigurations.addAll(endpointConfigurations)
  }

  public fun endpointConfigurations(endpointConfigurations: IResolvable) {
    cdkBuilder.endpointConfigurations(endpointConfigurations)
  }

  public fun endpointGroupRegion(endpointGroupRegion: String) {
    cdkBuilder.endpointGroupRegion(endpointGroupRegion)
  }

  public fun healthCheckIntervalSeconds(healthCheckIntervalSeconds: Number) {
    cdkBuilder.healthCheckIntervalSeconds(healthCheckIntervalSeconds)
  }

  public fun healthCheckPath(healthCheckPath: String) {
    cdkBuilder.healthCheckPath(healthCheckPath)
  }

  public fun healthCheckPort(healthCheckPort: Number) {
    cdkBuilder.healthCheckPort(healthCheckPort)
  }

  public fun healthCheckProtocol(healthCheckProtocol: String) {
    cdkBuilder.healthCheckProtocol(healthCheckProtocol)
  }

  public fun listenerArn(listenerArn: String) {
    cdkBuilder.listenerArn(listenerArn)
  }

  public fun portOverrides(vararg portOverrides: Any) {
    _portOverrides.addAll(listOf(*portOverrides))
  }

  public fun portOverrides(portOverrides: Collection<Any>) {
    _portOverrides.addAll(portOverrides)
  }

  public fun portOverrides(portOverrides: IResolvable) {
    cdkBuilder.portOverrides(portOverrides)
  }

  public fun thresholdCount(thresholdCount: Number) {
    cdkBuilder.thresholdCount(thresholdCount)
  }

  public fun trafficDialPercentage(trafficDialPercentage: Number) {
    cdkBuilder.trafficDialPercentage(trafficDialPercentage)
  }

  public fun build(): CfnEndpointGroupProps {
    if(_endpointConfigurations.isNotEmpty())
        cdkBuilder.endpointConfigurations(_endpointConfigurations)
    if(_portOverrides.isNotEmpty()) cdkBuilder.portOverrides(_portOverrides)
    return cdkBuilder.build()
  }
}
