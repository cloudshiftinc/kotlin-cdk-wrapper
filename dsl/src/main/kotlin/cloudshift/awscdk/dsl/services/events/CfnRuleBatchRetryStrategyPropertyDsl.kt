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

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.CfnRule
import kotlin.Number

@CdkDslMarker
public class CfnRuleBatchRetryStrategyPropertyDsl {
    private val cdkBuilder: CfnRule.BatchRetryStrategyProperty.Builder =
        CfnRule.BatchRetryStrategyProperty.builder()

    public fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
    }

    public fun build(): CfnRule.BatchRetryStrategyProperty = cdkBuilder.build()
}
