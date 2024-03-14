package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ClientVpnRouteProps : ClientVpnRouteOptions {
  /**
   * The client VPN endpoint to which to add the route.
   *
   * Default: clientVpnEndpoint is required
   */
  public fun clientVpnEndpoint(): IClientVpnEndpoint? =
      unwrap(this).getClientVpnEndpoint()?.let(IClientVpnEndpoint::wrap)

  /**
   * A builder for [ClientVpnRouteProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cidr The IPv4 address range, in CIDR notation, of the route destination. 
     * For example:
     *
     * * To add a route for Internet access, enter 0.0.0.0/0
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * * To add a route for the local network, enter the client CIDR range
     */
    public fun cidr(cidr: String)

    /**
     * @param clientVpnEndpoint The client VPN endpoint to which to add the route.
     */
    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint)

    /**
     * @param description A brief description of the authorization rule.
     */
    public fun description(description: String)

    /**
     * @param target The target for the route. 
     */
    public fun target(target: ClientVpnRouteTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnRouteProps.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnRouteProps.builder()

    /**
     * @param cidr The IPv4 address range, in CIDR notation, of the route destination. 
     * For example:
     *
     * * To add a route for Internet access, enter 0.0.0.0/0
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * * To add a route for the local network, enter the client CIDR range
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * @param clientVpnEndpoint The client VPN endpoint to which to add the route.
     */
    override fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
      cdkBuilder.clientVpnEndpoint(clientVpnEndpoint.let(IClientVpnEndpoint::unwrap))
    }

    /**
     * @param description A brief description of the authorization rule.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param target The target for the route. 
     */
    override fun target(target: ClientVpnRouteTarget) {
      cdkBuilder.target(target.let(ClientVpnRouteTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnRouteProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteProps,
  ) : CdkObject(cdkObject), ClientVpnRouteProps {
    /**
     * The IPv4 address range, in CIDR notation, of the route destination.
     *
     * For example:
     *
     * * To add a route for Internet access, enter 0.0.0.0/0
     * * To add a route for a peered VPC, enter the peered VPC's IPv4 CIDR range
     * * To add a route for an on-premises network, enter the AWS Site-to-Site VPN
     * connection's IPv4 CIDR range
     * * To add a route for the local network, enter the client CIDR range
     */
    override fun cidr(): String = unwrap(this).getCidr()

    /**
     * The client VPN endpoint to which to add the route.
     *
     * Default: clientVpnEndpoint is required
     */
    override fun clientVpnEndpoint(): IClientVpnEndpoint? =
        unwrap(this).getClientVpnEndpoint()?.let(IClientVpnEndpoint::wrap)

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The target for the route.
     */
    override fun target(): ClientVpnRouteTarget =
        unwrap(this).getTarget().let(ClientVpnRouteTarget::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnRouteProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteProps):
        ClientVpnRouteProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRouteProps):
        software.amazon.awscdk.services.ec2.ClientVpnRouteProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.ClientVpnRouteProps
  }
}
