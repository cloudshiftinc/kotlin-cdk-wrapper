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

package cloudshift.awscdk.dsl.services.sns

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sns.BetweenCondition
import kotlin.Number

@CdkDslMarker
public class BetweenConditionDsl {
    private val cdkBuilder: BetweenCondition.Builder = BetweenCondition.builder()

    public fun start(start: Number) {
        cdkBuilder.start(start)
    }

    public fun stop(stop: Number) {
        cdkBuilder.stop(stop)
    }

    public fun build(): BetweenCondition = cdkBuilder.build()
}
