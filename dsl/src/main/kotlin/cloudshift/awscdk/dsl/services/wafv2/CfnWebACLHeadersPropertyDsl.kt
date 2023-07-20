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
public class CfnWebACLHeadersPropertyDsl {
    private val cdkBuilder: CfnWebACL.HeadersProperty.Builder = CfnWebACL.HeadersProperty.builder()

    public fun matchPattern(matchPattern: IResolvable) {
        cdkBuilder.matchPattern(matchPattern)
    }

    public fun matchPattern(matchPattern: CfnWebACL.HeaderMatchPatternProperty) {
        cdkBuilder.matchPattern(matchPattern)
    }

    public fun matchScope(matchScope: String) {
        cdkBuilder.matchScope(matchScope)
    }

    public fun oversizeHandling(oversizeHandling: String) {
        cdkBuilder.oversizeHandling(oversizeHandling)
    }

    public fun build(): CfnWebACL.HeadersProperty = cdkBuilder.build()
}
