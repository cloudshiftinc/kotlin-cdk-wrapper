@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A client VPN route.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * ClientVpnEndpoint clientVpnEndpoint;
 * ClientVpnRouteTarget clientVpnRouteTarget;
 * ClientVpnRoute clientVpnRoute = ClientVpnRoute.Builder.create(this, "MyClientVpnRoute")
 * .cidr("cidr")
 * .target(clientVpnRouteTarget)
 * // the properties below are optional
 * .clientVpnEndpoint(clientVpnEndpoint)
 * .description("description")
 * .build();
 * ```
 */
public open class ClientVpnRoute(
  cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRoute,
) : Resource(cdkObject) {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ClientVpnRouteProps,
  ) :
      this(software.amazon.awscdk.services.ec2.ClientVpnRoute(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(ClientVpnRouteProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: ClientVpnRouteProps.Builder.() -> Unit,
  ) : this(scope, id, ClientVpnRouteProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ec2.ClientVpnRoute].
   */
  @CdkDslMarker
  public interface Builder {
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
     *
     * @param cidr The IPv4 address range, in CIDR notation, of the route destination. 
     */
    public fun cidr(cidr: String)

    /**
     * The client VPN endpoint to which to add the route.
     *
     * Default: clientVpnEndpoint is required
     *
     * @param clientVpnEndpoint The client VPN endpoint to which to add the route. 
     */
    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint)

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     *
     * @param description A brief description of the authorization rule. 
     */
    public fun description(description: String)

    /**
     * The target for the route.
     *
     * @param target The target for the route. 
     */
    public fun target(target: ClientVpnRouteTarget)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.ClientVpnRoute.Builder =
        software.amazon.awscdk.services.ec2.ClientVpnRoute.Builder.create(scope, id)

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
     *
     * @param cidr The IPv4 address range, in CIDR notation, of the route destination. 
     */
    override fun cidr(cidr: String) {
      cdkBuilder.cidr(cidr)
    }

    /**
     * The client VPN endpoint to which to add the route.
     *
     * Default: clientVpnEndpoint is required
     *
     * @param clientVpnEndpoint The client VPN endpoint to which to add the route. 
     */
    override fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
      cdkBuilder.clientVpnEndpoint(clientVpnEndpoint.let(IClientVpnEndpoint::unwrap))
    }

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     *
     * @param description A brief description of the authorization rule. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The target for the route.
     *
     * @param target The target for the route. 
     */
    override fun target(target: ClientVpnRouteTarget) {
      cdkBuilder.target(target.let(ClientVpnRouteTarget::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ec2.ClientVpnRoute = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ClientVpnRoute {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ClientVpnRoute(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRoute): ClientVpnRoute
        = ClientVpnRoute(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRoute): software.amazon.awscdk.services.ec2.ClientVpnRoute
        = wrapped.cdkObject as software.amazon.awscdk.services.ec2.ClientVpnRoute
  }
}
