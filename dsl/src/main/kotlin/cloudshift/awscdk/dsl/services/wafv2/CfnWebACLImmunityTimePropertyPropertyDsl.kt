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
import kotlin.Number

@CdkDslMarker
public class CfnWebACLImmunityTimePropertyPropertyDsl {
    private val cdkBuilder: CfnWebACL.ImmunityTimePropertyProperty.Builder =
        CfnWebACL.ImmunityTimePropertyProperty.builder()

    public fun immunityTime(immunityTime: Number) {
        cdkBuilder.immunityTime(immunityTime)
    }

    public fun build(): CfnWebACL.ImmunityTimePropertyProperty = cdkBuilder.build()
}
