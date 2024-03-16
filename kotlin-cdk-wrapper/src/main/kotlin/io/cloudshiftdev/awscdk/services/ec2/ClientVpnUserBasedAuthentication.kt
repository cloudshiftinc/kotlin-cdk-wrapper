@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.ISamlProvider
import kotlin.Any
import kotlin.String

/**
 * User-based authentication for a client VPN endpoint.
 *
 * Example:
 *
 * ```
 * ClientVpnEndpoint endpoint = vpc.addClientVpnEndpoint("Endpoint",
 * ClientVpnEndpointOptions.builder()
 * .cidr("10.100.0.0/16")
 * .serverCertificateArn("arn:aws:acm:us-east-1:123456789012:certificate/server-certificate-id")
 * .userBasedAuthentication(ClientVpnUserBasedAuthentication.federated(samlProvider))
 * .authorizeAllUsersToVpcCidr(false)
 * .build());
 * endpoint.addAuthorizationRule("Rule", ClientVpnAuthorizationRuleOptions.builder()
 * .cidr("10.0.10.0/32")
 * .groupId("group-id")
 * .build());
 * ```
 */
public abstract class ClientVpnUserBasedAuthentication internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication,
) : CdkObject(cdkObject) {
  /**
   * Renders the user based authentication.
   */
  public open fun render(): Any = unwrap(this).render()

  public companion object {
    public fun activeDirectory(directoryId: String): ClientVpnUserBasedAuthentication =
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication.activeDirectory(directoryId).let(ClientVpnUserBasedAuthentication::wrap)

    public fun federated(samlProvider: ISamlProvider): ClientVpnUserBasedAuthentication =
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication.federated(samlProvider.let(ISamlProvider::unwrap)).let(ClientVpnUserBasedAuthentication::wrap)

    public fun federated(samlProvider: ISamlProvider, selfServiceSamlProvider: ISamlProvider):
        ClientVpnUserBasedAuthentication =
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication.federated(samlProvider.let(ISamlProvider::unwrap),
        selfServiceSamlProvider.let(ISamlProvider::unwrap)).let(ClientVpnUserBasedAuthentication::wrap)

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication):
        ClientVpnUserBasedAuthentication = CdkObjectWrappers.wrap(cdkObject) as
        ClientVpnUserBasedAuthentication

    internal fun unwrap(wrapped: ClientVpnUserBasedAuthentication):
        software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.ClientVpnUserBasedAuthentication
  }
}
