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

package cloudshift.awscdk.dsl.services.wafv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.wafv2.CfnRuleGroup
import kotlin.String

@CdkDslMarker
public class CfnRuleGroupIPSetForwardedIPConfigurationPropertyDsl {
    private val cdkBuilder: CfnRuleGroup.IPSetForwardedIPConfigurationProperty.Builder =
        CfnRuleGroup.IPSetForwardedIPConfigurationProperty.builder()

    public fun fallbackBehavior(fallbackBehavior: String) {
        cdkBuilder.fallbackBehavior(fallbackBehavior)
    }

    public fun headerName(headerName: String) {
        cdkBuilder.headerName(headerName)
    }

    public fun position(position: String) {
        cdkBuilder.position(position)
    }

    public fun build(): CfnRuleGroup.IPSetForwardedIPConfigurationProperty = cdkBuilder.build()
}
