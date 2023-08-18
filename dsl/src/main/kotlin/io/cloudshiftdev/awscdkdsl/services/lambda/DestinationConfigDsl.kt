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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.DestinationConfig

/**
 * A destination configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DestinationConfig destinationConfig = DestinationConfig.builder()
 * .destination("destination")
 * .build();
 * ```
 */
@CdkDslMarker
public class DestinationConfigDsl {
    private val cdkBuilder: DestinationConfig.Builder = DestinationConfig.builder()

    /** @param destination The Amazon Resource Name (ARN) of the destination resource. */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): DestinationConfig = cdkBuilder.build()
}
