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

package cloudshift.awscdk.dsl.services.vpclattice

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup
import kotlin.String

@CdkDslMarker
public class CfnTargetGroupMatcherPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.MatcherProperty.Builder =
        CfnTargetGroup.MatcherProperty.builder()

    public fun httpCode(httpCode: String) {
        cdkBuilder.httpCode(httpCode)
    }

    public fun build(): CfnTargetGroup.MatcherProperty = cdkBuilder.build()
}
