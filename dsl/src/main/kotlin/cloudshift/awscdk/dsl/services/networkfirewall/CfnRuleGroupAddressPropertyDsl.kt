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

package cloudshift.awscdk.dsl.services.networkfirewall

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.networkfirewall.CfnRuleGroup
import kotlin.String

@CdkDslMarker
public class CfnRuleGroupAddressPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.AddressProperty.Builder =
        CfnRuleGroup.AddressProperty.builder()

    public fun addressDefinition(addressDefinition: String) {
        cdkBuilder.addressDefinition(addressDefinition)
    }

    public fun build(): CfnRuleGroup.AddressProperty = cdkBuilder.build()
}
