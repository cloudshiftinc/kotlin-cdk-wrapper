@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

/**
 * Options for a ClientVpnRoute.
 *
 * Example:
 *
 * ```
 * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
 * ClientVpnEndpointOptions.builder()
 * .cidr("10.100.0.0/16")
 * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
 * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
 * .build());
 * // Client-to-client access
 * endpoint.addRoute("Route", ClientVpnRouteOptions.builder()
 * .cidr("10.100.0.0/16")
 * .target(ClientVpnRouteTarget.local())
 * .build());
 * ```
 */
public interface ClientVpnRouteOptions {
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
  public fun cidr(): String

  /**
   * A brief description of the authorization rule.
   *
   * Default: - no description
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The target for the route.
   */
  public fun target(): ClientVpnRouteTarget

  /**
   * A builder for [ClientVpnRouteOptions]
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
     * @param description A brief description of the authorization rule.
     */
    public fun description(description: String)

    /**
     * @param target The target for the route. 
     */
    public fun target(target: ClientVpnRouteTarget)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnRouteOptions.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnRouteOptions.builder()

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

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnRouteOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteOptions,
  ) : CdkObject(cdkObject), ClientVpnRouteOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ClientVpnRouteOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteOptions):
        ClientVpnRouteOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRouteOptions):
        software.amazon.awscdk.services.ec2.ClientVpnRouteOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.ClientVpnRouteOptions
  }
}
