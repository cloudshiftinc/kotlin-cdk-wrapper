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

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig
import kotlin.Number

@CdkDslMarker
public class ShuffleConfigDsl {
    private val cdkBuilder: ShuffleConfig.Builder = ShuffleConfig.builder()

    public fun seed(seed: Number) {
        cdkBuilder.seed(seed)
    }

    public fun build(): ShuffleConfig = cdkBuilder.build()
}
