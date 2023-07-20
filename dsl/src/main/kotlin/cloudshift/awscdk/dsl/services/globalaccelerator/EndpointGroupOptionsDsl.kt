@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.globalaccelerator

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions
import software.amazon.awscdk.services.globalaccelerator.HealthCheckProtocol
import software.amazon.awscdk.services.globalaccelerator.IEndpoint
import software.amazon.awscdk.services.globalaccelerator.PortOverride

@CdkDslMarker
public class EndpointGroupOptionsDsl {
  private val cdkBuilder: EndpointGroupOptions.Builder = EndpointGroupOptions.builder()

  private val _endpoints: MutableList<IEndpoint> = mutableListOf()

  private val _portOverrides: MutableList<PortOverride> = mutableListOf()

  public fun endpointGroupName(endpointGroupName: String) {
    cdkBuilder.endpointGroupName(endpointGroupName)
  }

  public fun endpoints(vararg endpoints: IEndpoint) {
    _endpoints.addAll(listOf(*endpoints))
  }

  public fun endpoints(endpoints: Collection<IEndpoint>) {
    _endpoints.addAll(endpoints)
  }

  public fun healthCheckInterval(healthCheckInterval: Duration) {
    cdkBuilder.healthCheckInterval(healthCheckInterval)
  }

  public fun healthCheckPath(healthCheckPath: String) {
    cdkBuilder.healthCheckPath(healthCheckPath)
  }

  public fun healthCheckPort(healthCheckPort: Number) {
    cdkBuilder.healthCheckPort(healthCheckPort)
  }

  public fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
    cdkBuilder.healthCheckProtocol(healthCheckProtocol)
  }

  public fun healthCheckThreshold(healthCheckThreshold: Number) {
    cdkBuilder.healthCheckThreshold(healthCheckThreshold)
  }

  public fun portOverrides(portOverrides: PortOverrideDsl.() -> Unit) {
    _portOverrides.add(PortOverrideDsl().apply(portOverrides).build())
  }

  public fun portOverrides(portOverrides: Collection<PortOverride>) {
    _portOverrides.addAll(portOverrides)
  }

  public fun region(region: String) {
    cdkBuilder.region(region)
  }

  public fun trafficDialPercentage(trafficDialPercentage: Number) {
    cdkBuilder.trafficDialPercentage(trafficDialPercentage)
  }

  public fun build(): EndpointGroupOptions {
    if(_endpoints.isNotEmpty()) cdkBuilder.endpoints(_endpoints)
    if(_portOverrides.isNotEmpty()) cdkBuilder.portOverrides(_portOverrides)
    return cdkBuilder.build()
  }
}
