@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions

/**
 * Options for a ClientVpnAuthorizationRule.
 *
 * Example:
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
@CdkDslMarker
public class ClientVpnAuthorizationRuleOptionsDsl {
    private val cdkBuilder: ClientVpnAuthorizationRuleOptions.Builder =
        ClientVpnAuthorizationRuleOptions.builder()

    /**
     * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
     *   being authorized.
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /** @param description A brief description of the authorization rule. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * @param groupId The ID of the group to grant access to, for example, the Active Directory
     *   group or identity provider (IdP) group.
     */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun build(): ClientVpnAuthorizationRuleOptions = cdkBuilder.build()
}
