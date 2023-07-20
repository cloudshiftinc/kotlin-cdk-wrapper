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
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps

@CdkDslMarker
public class KinesisFirehoseStreamPropsDsl {
    private val cdkBuilder: KinesisFirehoseStreamProps.Builder = KinesisFirehoseStreamProps.builder()

    public fun message(message: RuleTargetInput) {
        cdkBuilder.message(message)
    }

    public fun build(): KinesisFirehoseStreamProps = cdkBuilder.build()
}
