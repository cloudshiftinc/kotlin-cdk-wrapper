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

package cloudshift.awscdk.dsl.services.lambda.eventsources

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.lambda.StartingPosition
import software.amazon.awscdk.services.lambda.eventsources.BaseStreamEventSourceProps
import kotlin.Boolean
import kotlin.Number

@CdkDslMarker
public class BaseStreamEventSourcePropsDsl {
    private val cdkBuilder: BaseStreamEventSourceProps.Builder = BaseStreamEventSourceProps.builder()

    public fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
    }

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun maxBatchingWindow(maxBatchingWindow: Duration) {
        cdkBuilder.maxBatchingWindow(maxBatchingWindow)
    }

    public fun startingPosition(startingPosition: StartingPosition) {
        cdkBuilder.startingPosition(startingPosition)
    }

    public fun build(): BaseStreamEventSourceProps = cdkBuilder.build()
}
