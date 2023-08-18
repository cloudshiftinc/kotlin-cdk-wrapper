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
import software.amazon.awscdk.services.lambda.DlqDestinationConfig

/**
 * A destination configuration.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DlqDestinationConfig dlqDestinationConfig = DlqDestinationConfig.builder()
 * .destination("destination")
 * .build();
 * ```
 */
@CdkDslMarker
public class DlqDestinationConfigDsl {
    private val cdkBuilder: DlqDestinationConfig.Builder = DlqDestinationConfig.builder()

    /** @param destination The Amazon Resource Name (ARN) of the destination resource. */
    public fun destination(destination: String) {
        cdkBuilder.destination(destination)
    }

    public fun build(): DlqDestinationConfig = cdkBuilder.build()
}
