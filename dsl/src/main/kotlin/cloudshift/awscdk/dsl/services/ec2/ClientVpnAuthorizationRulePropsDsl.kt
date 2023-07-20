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
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleProps
import software.amazon.awscdk.services.ec2.IClientVpnEndpoint
import kotlin.String

@CdkDslMarker
public class ClientVpnAuthorizationRulePropsDsl {
    private val cdkBuilder: ClientVpnAuthorizationRuleProps.Builder =
        ClientVpnAuthorizationRuleProps.builder()

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

    public fun build(): ClientVpnAuthorizationRuleProps = cdkBuilder.build()
}
