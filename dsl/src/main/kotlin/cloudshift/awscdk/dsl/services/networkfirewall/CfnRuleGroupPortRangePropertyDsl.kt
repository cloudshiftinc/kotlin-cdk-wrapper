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
import kotlin.Number

@CdkDslMarker
public class CfnRuleGroupPortRangePropertyDsl {
    private val cdkBuilder: CfnRuleGroup.PortRangeProperty.Builder =
        CfnRuleGroup.PortRangeProperty.builder()

    public fun fromPort(fromPort: Number) {
        cdkBuilder.fromPort(fromPort)
    }

    public fun toPort(toPort: Number) {
        cdkBuilder.toPort(toPort)
    }

    public fun build(): CfnRuleGroup.PortRangeProperty = cdkBuilder.build()
}
