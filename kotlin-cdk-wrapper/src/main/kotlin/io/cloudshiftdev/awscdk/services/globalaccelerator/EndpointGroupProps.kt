@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.globalaccelerator

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Property of the EndpointGroup.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.globalaccelerator.*;
 * IEndpoint endpoint;
 * Listener listener;
 * EndpointGroupProps endpointGroupProps = EndpointGroupProps.builder()
 * .listener(listener)
 * // the properties below are optional
 * .endpointGroupName("endpointGroupName")
 * .endpoints(List.of(endpoint))
 * .healthCheckInterval(Duration.minutes(30))
 * .healthCheckPath("healthCheckPath")
 * .healthCheckPort(123)
 * .healthCheckProtocol(HealthCheckProtocol.TCP)
 * .healthCheckThreshold(123)
 * .portOverrides(List.of(PortOverride.builder()
 * .endpointPort(123)
 * .listenerPort(123)
 * .build()))
 * .region("region")
 * .trafficDialPercentage(123)
 * .build();
 * ```
 */
public interface EndpointGroupProps : EndpointGroupOptions {
  /**
   * The Amazon Resource Name (ARN) of the listener.
   */
  public fun listener(): IListener

  /**
   * A builder for [EndpointGroupProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param endpointGroupName Name of the endpoint group.
     */
    public fun endpointGroupName(endpointGroupName: String)

    /**
     * @param endpoints Initial list of endpoints for this group.
     */
    public fun endpoints(endpoints: List<IEndpoint>)

    /**
     * @param endpoints Initial list of endpoints for this group.
     */
    public fun endpoints(vararg endpoints: IEndpoint)

    /**
     * @param healthCheckInterval The time between health checks for each endpoint.
     * Must be either 10 or 30 seconds.
     */
    public fun healthCheckInterval(healthCheckInterval: Duration)

    /**
     * @param healthCheckPath The ping path for health checks (if the protocol is HTTP(S)).
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * @param healthCheckPort The port used to perform health checks.
     */
    public fun healthCheckPort(healthCheckPort: Number)

    /**
     * @param healthCheckProtocol The protocol used to perform health checks.
     */
    public fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol)

    /**
     * @param healthCheckThreshold The number of consecutive health checks required to set the state
     * of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy.
     */
    public fun healthCheckThreshold(healthCheckThreshold: Number)

    /**
     * @param listener The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listener(listener: IListener)

    /**
     * @param portOverrides Override the destination ports used to route traffic to an endpoint.
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     */
    public fun portOverrides(portOverrides: List<PortOverride>)

    /**
     * @param portOverrides Override the destination ports used to route traffic to an endpoint.
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     */
    public fun portOverrides(vararg portOverrides: PortOverride)

    /**
     * @param region The AWS Region where the endpoint group is located.
     */
    public fun region(region: String)

    /**
     * @param trafficDialPercentage The percentage of traffic to send to this AWS Region.
     * The percentage is applied to the traffic that would otherwise have been
     * routed to the Region based on optimal routing. Additional traffic is
     * distributed to other endpoint groups for this listener.
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps.Builder =
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps.builder()

    /**
     * @param endpointGroupName Name of the endpoint group.
     */
    override fun endpointGroupName(endpointGroupName: String) {
      cdkBuilder.endpointGroupName(endpointGroupName)
    }

    /**
     * @param endpoints Initial list of endpoints for this group.
     */
    override fun endpoints(endpoints: List<IEndpoint>) {
      cdkBuilder.endpoints(endpoints.map(IEndpoint.Companion::unwrap))
    }

    /**
     * @param endpoints Initial list of endpoints for this group.
     */
    override fun endpoints(vararg endpoints: IEndpoint): Unit = endpoints(endpoints.toList())

    /**
     * @param healthCheckInterval The time between health checks for each endpoint.
     * Must be either 10 or 30 seconds.
     */
    override fun healthCheckInterval(healthCheckInterval: Duration) {
      cdkBuilder.healthCheckInterval(healthCheckInterval.let(Duration.Companion::unwrap))
    }

    /**
     * @param healthCheckPath The ping path for health checks (if the protocol is HTTP(S)).
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * @param healthCheckPort The port used to perform health checks.
     */
    override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * @param healthCheckProtocol The protocol used to perform health checks.
     */
    override fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol.let(HealthCheckProtocol.Companion::unwrap))
    }

    /**
     * @param healthCheckThreshold The number of consecutive health checks required to set the state
     * of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy.
     */
    override fun healthCheckThreshold(healthCheckThreshold: Number) {
      cdkBuilder.healthCheckThreshold(healthCheckThreshold)
    }

    /**
     * @param listener The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listener(listener: IListener) {
      cdkBuilder.listener(listener.let(IListener.Companion::unwrap))
    }

    /**
     * @param portOverrides Override the destination ports used to route traffic to an endpoint.
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     */
    override fun portOverrides(portOverrides: List<PortOverride>) {
      cdkBuilder.portOverrides(portOverrides.map(PortOverride.Companion::unwrap))
    }

    /**
     * @param portOverrides Override the destination ports used to route traffic to an endpoint.
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     */
    override fun portOverrides(vararg portOverrides: PortOverride): Unit =
        portOverrides(portOverrides.toList())

    /**
     * @param region The AWS Region where the endpoint group is located.
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * @param trafficDialPercentage The percentage of traffic to send to this AWS Region.
     * The percentage is applied to the traffic that would otherwise have been
     * routed to the Region based on optimal routing. Additional traffic is
     * distributed to other endpoint groups for this listener.
     */
    override fun trafficDialPercentage(trafficDialPercentage: Number) {
      cdkBuilder.trafficDialPercentage(trafficDialPercentage)
    }

    public fun build(): software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps,
  ) : CdkObject(cdkObject),
      EndpointGroupProps {
    /**
     * Name of the endpoint group.
     *
     * Default: - logical ID of the resource
     */
    override fun endpointGroupName(): String? = unwrap(this).getEndpointGroupName()

    /**
     * Initial list of endpoints for this group.
     *
     * Default: - Group is initially empty
     */
    override fun endpoints(): List<IEndpoint> = unwrap(this).getEndpoints()?.map(IEndpoint::wrap) ?:
        emptyList()

    /**
     * The time between health checks for each endpoint.
     *
     * Must be either 10 or 30 seconds.
     *
     * Default: Duration.seconds(30)
     */
    override fun healthCheckInterval(): Duration? =
        unwrap(this).getHealthCheckInterval()?.let(Duration::wrap)

    /**
     * The ping path for health checks (if the protocol is HTTP(S)).
     *
     * Default: '/'
     */
    override fun healthCheckPath(): String? = unwrap(this).getHealthCheckPath()

    /**
     * The port used to perform health checks.
     *
     * Default: - The listener's port
     */
    override fun healthCheckPort(): Number? = unwrap(this).getHealthCheckPort()

    /**
     * The protocol used to perform health checks.
     *
     * Default: HealthCheckProtocol.TCP
     */
    override fun healthCheckProtocol(): HealthCheckProtocol? =
        unwrap(this).getHealthCheckProtocol()?.let(HealthCheckProtocol::wrap)

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * Default: 3
     */
    override fun healthCheckThreshold(): Number? = unwrap(this).getHealthCheckThreshold()

    /**
     * The Amazon Resource Name (ARN) of the listener.
     */
    override fun listener(): IListener = unwrap(this).getListener().let(IListener::wrap)

    /**
     * Override the destination ports used to route traffic to an endpoint.
     *
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     *
     * Default: - No overrides
     */
    override fun portOverrides(): List<PortOverride> =
        unwrap(this).getPortOverrides()?.map(PortOverride::wrap) ?: emptyList()

    /**
     * The AWS Region where the endpoint group is located.
     *
     * Default: - region of the first endpoint in this group, or the stack region if that region
     * can't be determined
     */
    override fun region(): String? = unwrap(this).getRegion()

    /**
     * The percentage of traffic to send to this AWS Region.
     *
     * The percentage is applied to the traffic that would otherwise have been
     * routed to the Region based on optimal routing. Additional traffic is
     * distributed to other endpoint groups for this listener.
     *
     * Default: 100
     */
    override fun trafficDialPercentage(): Number? = unwrap(this).getTrafficDialPercentage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EndpointGroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps):
        EndpointGroupProps = CdkObjectWrappers.wrap(cdkObject) as? EndpointGroupProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EndpointGroupProps):
        software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.globalaccelerator.EndpointGroupProps
  }
}
