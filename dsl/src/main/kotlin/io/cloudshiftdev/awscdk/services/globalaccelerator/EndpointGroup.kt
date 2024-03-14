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
  /**
   * Add an endpoint.
   *
   * @param endpoint 
   */
  public open fun addEndpoint(endpoint: IEndpoint) {
    unwrap(this).addEndpoint(endpoint.let(IEndpoint::unwrap))
  }

  /**
   * Return an object that represents the Accelerator's Security Group.
   *
   * Uses a Custom Resource to look up the Security Group that Accelerator
   * creates at deploy time. Requires your VPC ID to perform the lookup.
   *
   * The Security Group will only be created if you enable **Client IP
   * Preservation** on any of the endpoints.
   *
   * You cannot manipulate the rules inside this security group, but you can
   * use this security group as a Peer in Connections rules on other
   * constructs.
   *
   * @param id 
   * @param vpc 
   */
  public open fun connectionsPeer(id: String, vpc: IVpc): IPeer = unwrap(this).connectionsPeer(id,
      vpc.let(IVpc::unwrap)).let(IPeer::wrap)

  /**
   * EndpointGroup ARN.
   */
  public override fun endpointGroupArn(): String = unwrap(this).getEndpointGroupArn()

  /**
   * The name of the endpoint group.
   */
  public open fun endpointGroupName(): String = unwrap(this).getEndpointGroupName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.globalaccelerator.EndpointGroup].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of the endpoint group.
     *
     * Default: - logical ID of the resource
     *
     * @param endpointGroupName Name of the endpoint group. 
     */
    public fun endpointGroupName(endpointGroupName: String)

    /**
     * Initial list of endpoints for this group.
     *
     * Default: - Group is initially empty
     *
     * @param endpoints Initial list of endpoints for this group. 
     */
    public fun endpoints(endpoints: List<IEndpoint>)

    /**
     * Initial list of endpoints for this group.
     *
     * Default: - Group is initially empty
     *
     * @param endpoints Initial list of endpoints for this group. 
     */
    public fun endpoints(vararg endpoints: IEndpoint)

    /**
     * The time between health checks for each endpoint.
     *
     * Must be either 10 or 30 seconds.
     *
     * Default: Duration.seconds(30)
     *
     * @param healthCheckInterval The time between health checks for each endpoint. 
     */
    public fun healthCheckInterval(healthCheckInterval: Duration)

    /**
     * The ping path for health checks (if the protocol is HTTP(S)).
     *
     * Default: '/'
     *
     * @param healthCheckPath The ping path for health checks (if the protocol is HTTP(S)). 
     */
    public fun healthCheckPath(healthCheckPath: String)

    /**
     * The port used to perform health checks.
     *
     * Default: - The listener's port
     *
     * @param healthCheckPort The port used to perform health checks. 
     */
    public fun healthCheckPort(healthCheckPort: Number)

    /**
     * The protocol used to perform health checks.
     *
     * Default: HealthCheckProtocol.TCP
     *
     * @param healthCheckProtocol The protocol used to perform health checks. 
     */
    public fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol)

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * Default: 3
     *
     * @param healthCheckThreshold The number of consecutive health checks required to set the state
     * of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. 
     */
    public fun healthCheckThreshold(healthCheckThreshold: Number)

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * @param listener The Amazon Resource Name (ARN) of the listener. 
     */
    public fun listener(listener: IListener)

    /**
     * Override the destination ports used to route traffic to an endpoint.
     *
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     *
     * Default: - No overrides
     *
     * @param portOverrides Override the destination ports used to route traffic to an endpoint. 
     */
    public fun portOverrides(portOverrides: List<PortOverride>)

    /**
     * Override the destination ports used to route traffic to an endpoint.
     *
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     *
     * Default: - No overrides
     *
     * @param portOverrides Override the destination ports used to route traffic to an endpoint. 
     */
    public fun portOverrides(vararg portOverrides: PortOverride)

    /**
     * The AWS Region where the endpoint group is located.
     *
     * Default: - region of the first endpoint in this group, or the stack region if that region
     * can't be determined
     *
     * @param region The AWS Region where the endpoint group is located. 
     */
    public fun region(region: String)

    /**
     * The percentage of traffic to send to this AWS Region.
     *
     * The percentage is applied to the traffic that would otherwise have been
     * routed to the Region based on optimal routing. Additional traffic is
     * distributed to other endpoint groups for this listener.
     *
     * Default: 100
     *
     * @param trafficDialPercentage The percentage of traffic to send to this AWS Region. 
     */
    public fun trafficDialPercentage(trafficDialPercentage: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.globalaccelerator.EndpointGroup.Builder
        = software.amazon.awscdk.services.globalaccelerator.EndpointGroup.Builder.create(scope, id)

    /**
     * Name of the endpoint group.
     *
     * Default: - logical ID of the resource
     *
     * @param endpointGroupName Name of the endpoint group. 
     */
    override fun endpointGroupName(endpointGroupName: String) {
      cdkBuilder.endpointGroupName(endpointGroupName)
    }

    /**
     * Initial list of endpoints for this group.
     *
     * Default: - Group is initially empty
     *
     * @param endpoints Initial list of endpoints for this group. 
     */
    override fun endpoints(endpoints: List<IEndpoint>) {
      cdkBuilder.endpoints(endpoints.map(IEndpoint::unwrap))
    }

    /**
     * Initial list of endpoints for this group.
     *
     * Default: - Group is initially empty
     *
     * @param endpoints Initial list of endpoints for this group. 
     */
    override fun endpoints(vararg endpoints: IEndpoint): Unit = endpoints(endpoints.toList())

    /**
     * The time between health checks for each endpoint.
     *
     * Must be either 10 or 30 seconds.
     *
     * Default: Duration.seconds(30)
     *
     * @param healthCheckInterval The time between health checks for each endpoint. 
     */
    override fun healthCheckInterval(healthCheckInterval: Duration) {
      cdkBuilder.healthCheckInterval(healthCheckInterval.let(Duration::unwrap))
    }

    /**
     * The ping path for health checks (if the protocol is HTTP(S)).
     *
     * Default: '/'
     *
     * @param healthCheckPath The ping path for health checks (if the protocol is HTTP(S)). 
     */
    override fun healthCheckPath(healthCheckPath: String) {
      cdkBuilder.healthCheckPath(healthCheckPath)
    }

    /**
     * The port used to perform health checks.
     *
     * Default: - The listener's port
     *
     * @param healthCheckPort The port used to perform health checks. 
     */
    override fun healthCheckPort(healthCheckPort: Number) {
      cdkBuilder.healthCheckPort(healthCheckPort)
    }

    /**
     * The protocol used to perform health checks.
     *
     * Default: HealthCheckProtocol.TCP
     *
     * @param healthCheckProtocol The protocol used to perform health checks. 
     */
    override fun healthCheckProtocol(healthCheckProtocol: HealthCheckProtocol) {
      cdkBuilder.healthCheckProtocol(healthCheckProtocol.let(HealthCheckProtocol::unwrap))
    }

    /**
     * The number of consecutive health checks required to set the state of a healthy endpoint to
     * unhealthy, or to set an unhealthy endpoint to healthy.
     *
     * Default: 3
     *
     * @param healthCheckThreshold The number of consecutive health checks required to set the state
     * of a healthy endpoint to unhealthy, or to set an unhealthy endpoint to healthy. 
     */
    override fun healthCheckThreshold(healthCheckThreshold: Number) {
      cdkBuilder.healthCheckThreshold(healthCheckThreshold)
    }

    /**
     * The Amazon Resource Name (ARN) of the listener.
     *
     * @param listener The Amazon Resource Name (ARN) of the listener. 
     */
    override fun listener(listener: IListener) {
      cdkBuilder.listener(listener.let(IListener::unwrap))
    }

    /**
     * Override the destination ports used to route traffic to an endpoint.
     *
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     *
     * Default: - No overrides
     *
     * @param portOverrides Override the destination ports used to route traffic to an endpoint. 
     */
    override fun portOverrides(portOverrides: List<PortOverride>) {
      cdkBuilder.portOverrides(portOverrides.map(PortOverride::unwrap))
    }

    /**
     * Override the destination ports used to route traffic to an endpoint.
     *
     * Unless overridden, the port used to hit the endpoint will be the same as the port
     * that traffic arrives on at the listener.
     *
     * Default: - No overrides
     *
     * @param portOverrides Override the destination ports used to route traffic to an endpoint. 
     */
    override fun portOverrides(vararg portOverrides: PortOverride): Unit =
        portOverrides(portOverrides.toList())

    /**
     * The AWS Region where the endpoint group is located.
     *
     * Default: - region of the first endpoint in this group, or the stack region if that region
     * can't be determined
     *
     * @param region The AWS Region where the endpoint group is located. 
     */
    override fun region(region: String) {
      cdkBuilder.region(region)
    }

    /**
     * The percentage of traffic to send to this AWS Region.
     *
     * The percentage is applied to the traffic that would otherwise have been
     * routed to the Region based on optimal routing. Additional traffic is
     * distributed to other endpoint groups for this listener.
     *
     * Default: 100
     *
     * @param trafficDialPercentage The percentage of traffic to send to this AWS Region. 
     */
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
