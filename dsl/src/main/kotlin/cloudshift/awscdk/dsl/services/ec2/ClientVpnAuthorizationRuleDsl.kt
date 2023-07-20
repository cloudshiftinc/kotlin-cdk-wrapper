@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRule
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class ClientVpnAuthorizationRuleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ClientVpnAuthorizationRule.Builder =
        ClientVpnAuthorizationRule.Builder.create(scope, id)

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun clientVpnEndpoint(clientVpnEndpoint: IClientVpnEndpoint) {
        cdkBuilder.clientVpnEndpoint(clientVpnEndpoint)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun build(): ClientVpnAuthorizationRule = cdkBuilder.build()
}
