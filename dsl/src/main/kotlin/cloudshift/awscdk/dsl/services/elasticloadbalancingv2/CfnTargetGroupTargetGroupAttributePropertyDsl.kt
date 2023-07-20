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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnTargetGroup
import kotlin.String

@CdkDslMarker
public class CfnTargetGroupTargetGroupAttributePropertyDsl {
    private val cdkBuilder: CfnTargetGroup.TargetGroupAttributeProperty.Builder =
        CfnTargetGroup.TargetGroupAttributeProperty.builder()

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTargetGroup.TargetGroupAttributeProperty = cdkBuilder.build()
}
