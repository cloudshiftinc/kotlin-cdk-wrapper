@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.stepfunctions.tasks.ShuffleConfig

/**
 * Configuration for a shuffle option for input data in a channel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * ShuffleConfig shuffleConfig = ShuffleConfig.builder()
 * .seed(123)
 * .build();
 * ```
 */
@CdkDslMarker
public class ShuffleConfigDsl {
    private val cdkBuilder: ShuffleConfig.Builder = ShuffleConfig.builder()

    /** @param seed Determines the shuffling order. */
    public fun seed(seed: Number) {
        cdkBuilder.seed(seed)
    }

    public fun build(): ShuffleConfig = cdkBuilder.build()
}
