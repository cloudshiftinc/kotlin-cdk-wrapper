@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String

/**
 * Target for a client VPN route.
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
public abstract class ClientVpnRouteTarget internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget,
) : CdkObject(cdkObject) {
  /**
   * The subnet ID.
   */
  public open fun subnetId(): String = unwrap(this).getSubnetId()

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget,
  ) : ClientVpnRouteTarget(cdkObject)

  public companion object {
    public fun local(): ClientVpnRouteTarget =
        software.amazon.awscdk.services.ec2.ClientVpnRouteTarget.local().let(ClientVpnRouteTarget::wrap)

    public fun subnet(subnet: ISubnet): ClientVpnRouteTarget =
        software.amazon.awscdk.services.ec2.ClientVpnRouteTarget.subnet(subnet.let(ISubnet::unwrap)).let(ClientVpnRouteTarget::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnRouteTarget):
        ClientVpnRouteTarget = CdkObjectWrappers.wrap(cdkObject) as? ClientVpnRouteTarget ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClientVpnRouteTarget):
        software.amazon.awscdk.services.ec2.ClientVpnRouteTarget = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.ClientVpnRouteTarget
  }
}
