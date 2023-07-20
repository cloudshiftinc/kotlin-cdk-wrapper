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
import software.amazon.awscdk.services.ec2.ClientVpnAuthorizationRuleOptions
import kotlin.String

@CdkDslMarker
public class ClientVpnAuthorizationRuleOptionsDsl {
    private val cdkBuilder: ClientVpnAuthorizationRuleOptions.Builder =
        ClientVpnAuthorizationRuleOptions.builder()

    public fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun groupId(groupId: String) {
        cdkBuilder.groupId(groupId)
    }

    public fun build(): ClientVpnAuthorizationRuleOptions = cdkBuilder.build()
}
