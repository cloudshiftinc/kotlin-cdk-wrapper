package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Duration
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

  public interface Builder {
    public fun endpointGroupName(endpointGroupName: String) {
    }

    public fun endpoints(endpoints: List<IEndpoint>) {
    }

    public fun healthCheckInterval(healthCheckInterval: Duration) {
    }

    public fun healthCheckPath(healthCheckPath: String) {
    }

    public fun healthCheckPort(healthCheckPort: Number) {
    }

    public fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
    }

    public fun healthCheckThreshold(healthCheckThreshold: Number) {
    }

    public fun portOverrides(portOverrides: List<PortOverride>) {
    }

    public fun region(region: String) {
    }

    public fun trafficDialPercentage(trafficDialPercentage: Number) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions.Builder =
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions.builder()

    public override fun endpointGroupName(endpointGroupName: String) {
      cdkBuilder.endpointGroupName(endpointGroupName)
    }

    public override fun endpoints(endpoints: List<IEndpoint>) {
      cdkBuilder.endpoints(endpoints.map(IEndpoint::unwrap))
    }

    public override fun healthCheckInterval(healthCheckInterval: Duration) {
      cdkBuilder.healthCheckInterval(healthCheckInterval.let(Duration::unwrap))
    }

    public override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    public override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    public override fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol.let(HealthCheckProtocol::unwrap))
    }

    public override fun healthCheckThreshold(healthCheckThreshold: Number) {
      cdkBuilder.healthCheckThreshold(healthCheckThreshold)
    }

    public override fun portOverrides(portOverrides: List<PortOverride>) {
      cdkBuilder.portOverrides(portOverrides.map(PortOverride::unwrap))
    }

    public override fun region(region: String) {
      cdkBuilder.region(region)
    }

    public override fun trafficDialPercentage(trafficDialPercentage: Number) {
      cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions,
  ) : EndpointGroupOptions {
    public override fun endpointGroupName(): String? = unwrap(this).getEndpointGroupName()

    public override fun endpoints(): List<IEndpoint> =
        unwrap(this).getEndpoints()?.map(IEndpoint::wrap) ?: emptyList()

    public override fun healthCheckInterval(): Duration? =
        unwrap(this).getHealthCheckInterval()?.let(Duration::wrap)

    public override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    public override fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

    public override fun healthCheckProtocol(): HealthCheckProtocol? =
        unwrap(this).getHealthCheckProtocol()?.let(HealthCheckProtocol::wrap)

    public override fun healthCheckThreshold(): Number? = unwrap(this).getHealthCheckThreshold()

    public override fun portOverrides(): List<PortOverride> =
        unwrap(this).getPortOverrides()?.map(PortOverride::wrap) ?: emptyList()

    public override fun region(): String? = unwrap(this).getRegion()

    public override fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EndpointGroupOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions):
        EndpointGroupOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointGroupOptions):
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupOptions = (wrapped as
        Wrapper).cdkObject
  }
}
