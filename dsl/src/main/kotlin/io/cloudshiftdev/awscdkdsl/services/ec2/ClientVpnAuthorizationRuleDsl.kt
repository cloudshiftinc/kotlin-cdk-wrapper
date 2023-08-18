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

package io.cloudshiftdev.awscdkdsl.services.ec2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import software.constructs.Construct

/**
 * A client VPN authorization rule.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * ClientVpnEndpoint clientVpnEndpoint;
 * ClientVpnAuthorizationRule clientVpnAuthorizationRule =
 * ClientVpnAuthorizationRule.Builder.create(this, "MyClientVpnAuthorizationRule")
 * .cidr("cidr")
 * // the properties below are optional
 * .clientVpnEndpoint(clientVpnEndpoint)
 * .description("description")
 * .groupId("groupId")
 * .build();
 * ```
 */
@CdkDslMarker
public class ClientVpnAuthorizationRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ClientVpnAuthorizationRule.Builder =
        ClientVpnAuthorizationRule.Builder.create(scope, id)

    /**
     * The IPv4 address range, in CIDR notation, of the network for which access is being
     * authorized.
     *
     * @param cidr The IPv4 address range, in CIDR notation, of the network for which access is
     *   being authorized.
     */
    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    /**
     * The client VPN endpoint to which to add the rule.
     *
     * Default: clientVpnEndpoint is required
     *
     * @param clientVpnEndpoint The client VPN endpoint to which to add the rule.
     */
    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
        cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
    }

    /**
     * A brief description of the authorization rule.
     *
     * Default: - no description
     *
     * @param description A brief description of the authorization rule.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The ID of the group to grant access to, for example, the Active Directory group or identity
     * provider (IdP) group.
     *
     * Default: - authorize all groups
     *
     * @param groupId The ID of the group to grant access to, for example, the Active Directory
     *   group or identity provider (IdP) group.
     */
    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun build(): ClientVpnAuthorizationRule = cdkBuilder.build()
}
