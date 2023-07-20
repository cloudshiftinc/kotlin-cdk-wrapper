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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pipes.CfnPipe
import kotlin.Number

@CdkDslMarker
public class CfnPipeBatchRetryStrategyPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchRetryStrategyProperty.Builder =
        CfnPipe.BatchRetryStrategyProperty.builder()

    public fun attempts(attempts: Number) {
        cdkBuilder.attempts(attempts)
    }

    public fun build(): CfnPipe.BatchRetryStrategyProperty = cdkBuilder.build()
}
