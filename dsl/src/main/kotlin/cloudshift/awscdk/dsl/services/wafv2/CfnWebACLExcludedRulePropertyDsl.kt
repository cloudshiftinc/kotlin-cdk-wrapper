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
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLExcludedRulePropertyDsl {
    private val cdkBuilder: CfnWebACL.ExcludedRuleProperty.Builder =
        CfnWebACL.ExcludedRuleProperty.builder()

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnWebACL.ExcludedRuleProperty = cdkBuilder.build()
}
