@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IPeer
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class EndpointGroup internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroup,
) : Resource(cdkObject), IEndpointGroup {
  public open fun addEndpoint(endpoint: IEndpoint) {
    unwrap(this).addEndpoint(endpoint.let(IEndpoint::unwrap))
  }

  public open fun connectionsPeer(id: String, vpc: IVpc): IPeer = unwrap(this).connectionsPeer(id,
      vpc.let(IVpc::unwrap)).let(IPeer::wrap)

  public override fun endpointGroupArn(): String = unwrap(this).getEndpointGroupArn()

  public open fun endpointGroupName(): String = unwrap(this).getEndpointGroupName()

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

    public fun listener(listener: IListener)

    public fun portOverrides(portOverrides: List<PortOverride>)

    public fun portOverrides(vararg portOverrides: PortOverride)

    public fun region(region: String)

    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.EndpointGroup.Builder
        = software.amazon.awscdk.services.globalaccelerator.EndpointGroup.Builder.create(scope, id)

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

    override fun listener(listener: IListener) {
      cdkBuilder.listener(listener.let(IListener::unwrap))
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

    public fun build(): software.amazon.awscdk.services.globalaccelerator.EndpointGroup =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromEndpointGroupArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      endpointGroupArn: String,
    ): IEndpointGroup =
        software.amazon.awscdk.services.globalaccelerator.EndpointGroup.fromEndpointGroupArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, endpointGroupArn).let(IEndpointGroup::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EndpointGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EndpointGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroup):
        EndpointGroup = EndpointGroup(cdkObject)

    internal fun unwrap(wrapped: EndpointGroup):
        software.amazon.awscdk.services.globalaccelerator.EndpointGroup = wrapped.cdkObject
  }
}
