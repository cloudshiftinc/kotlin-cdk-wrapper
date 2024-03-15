@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EndpointGroupOptions {
  public fun endpointGroupName(): String? = unwrap(this).getEndpointGroupName()

  public fun endpoints(): List<IEndpoint> = unwrap(this).getEndpoints()?.map(IEndpoint::wrap) ?:
      emptyList()

  public fun healthCheckInterval(): Duration? =
      unwrap(this).getHealthCheckInterval()?.let(Duration::wrap)

  public fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

  public fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

  public fun healthCheckProtocol(): HealthCheckProtocol? =
      unwrap(this).getHealthCheckProtocol()?.let(HealthCheckProtocol::wrap)

  public fun healthCheckThreshold(): Number? = unwrap(this).getHealthCheckThreshold()

  public fun portOverrides(): List<PortOverride> =
      unwrap(this).getPortOverrides()?.map(PortOverride::wrap) ?: emptyList()

  public fun region(): String? = unwrap(this).getRegion()

  public fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()

  @CdkDslMarker
  public interface Builder {
    public fun endpointGroupName(endpointGroupName: String)

    public fun endpoints(endpoints: List<IEndpoint>)

    public fun endpoints(vararg endpoints: IEndpoint)

    public fun healthCheckInterval(healthCheckInterval: Duration)

    public fun healthCheckPath(healthCheckPath: String)

    public fun healthCheckPort(healthCheckPort: Number)

    public fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol)

    public fun healthCheckThreshold(healthCheckThreshold: Number)

    public fun portOverrides(portOverrides: List<PortOverride>)

    public fun portOverrides(vararg portOverrides: PortOverride)

    public fun region(region: String)

    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions.Builder =
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions.builder()

    override fun endpointGroupName(endpointGroupName: String) {
      cdkBuilder.endpointGroupName(endpointGroupName)
    }

    override fun endpoints(endpoints: List<IEndpoint>) {
      cdkBuilder.endpoints(endpoints.map(IEndpoint::unwrap))
    }

    override fun endpoints(vararg endpoints: IEndpoint): Unit = endpoints(endpoints.toList())

    override fun healthCheckInterval(healthCheckInterval: Duration) {
      cdkBuilder.healthCheckInterval(healthCheckInterval.let(Duration::unwrap))
    }

    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    override fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol.let(HealthCheckProtocol::unwrap))
    }

    override fun healthCheckThreshold(healthCheckThreshold: Number) {
      cdkBuilder.healthCheckThreshold(healthCheckThreshold)
    }

    override fun portOverrides(portOverrides: List<PortOverride>) {
      cdkBuilder.portOverrides(portOverrides.map(PortOverride::unwrap))
    }

    override fun portOverrides(vararg portOverrides: PortOverride): Unit =
        portOverrides(portOverrides.toList())

    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    override fun trafficDialPercentage(trafficDialPercentage: Number) {
      cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions,
  ) : CdkObject(cdkObject), EndpointGroupOptions {
    override fun endpointGroupName(): String? = unwrap(this).getEndpointGroupName()

    override fun endpoints(): List<IEndpoint> = unwrap(this).getEndpoints()?.map(IEndpoint::wrap) ?:
        emptyList()

    override fun healthCheckInterval(): Duration? =
        unwrap(this).getHealthCheckInterval()?.let(Duration::wrap)

    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    override fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

    override fun healthCheckProtocol(): HealthCheckProtocol? =
        unwrap(this).getHealthCheckProtocol()?.let(HealthCheckProtocol::wrap)

    override fun healthCheckThreshold(): Number? = unwrap(this).getHealthCheckThreshold()

    override fun portOverrides(): List<PortOverride> =
        unwrap(this).getPortOverrides()?.map(PortOverride::wrap) ?: emptyList()

    override fun region(): String? = unwrap(this).getRegion()

    override fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EndpointGroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions):
        EndpointGroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointGroupOptions):
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions
  }
}
