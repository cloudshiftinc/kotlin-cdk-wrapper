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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class CfnListenerRuleTargetGroupStickinessConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.TargetGroupStickinessConfigProperty.Builder =
        CfnListenerRule.TargetGroupStickinessConfigProperty.builder()

    public fun durationSeconds(durationSeconds: Number) {
        cdkBuilder.durationSeconds(durationSeconds)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun build(): CfnListenerRule.TargetGroupStickinessConfigProperty = cdkBuilder.build()
}
