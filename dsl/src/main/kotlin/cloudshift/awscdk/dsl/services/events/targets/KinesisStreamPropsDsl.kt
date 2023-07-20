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

package cloudshift.awscdk.dsl.services.events.targets

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.events.RuleTargetInput
import software.amazon.awscdk.services.events.targets.KinesisStreamProps
import kotlin.String

@CdkDslMarker
public class KinesisStreamPropsDsl {
    private val cdkBuilder: KinesisStreamProps.Builder = KinesisStreamProps.builder()

    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    public fun partitionKeyPath(partitionKeyPath: String) {
        cdkBuilder.partitionKeyPath(partitionKeyPath)
    }

    public fun build(): KinesisStreamProps = cdkBuilder.build()
}
