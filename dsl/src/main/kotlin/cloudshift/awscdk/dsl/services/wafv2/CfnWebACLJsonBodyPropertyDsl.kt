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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.wafv2.CfnWebACL
import kotlin.String

@CdkDslMarker
public class CfnWebACLJsonBodyPropertyDsl {
    private val cdkBuilder: CfnWebACL.JsonBodyProperty.Builder = CfnWebACL.JsonBodyProperty.builder()

    public fun invalidFallbackBehavior(invalidFallbackBehavior: String) {
        cdkBuilder.invalidFallbackBehavior(invalidFallbackBehavior)
    }

    public fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern)
    }

    public fun matchPattern(matchPattern: CfnWebACL.JsonMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern)
    }

    public fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
    }

    public fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
    }

    public fun build(): CfnWebACL.JsonBodyProperty = cdkBuilder.build()
}
