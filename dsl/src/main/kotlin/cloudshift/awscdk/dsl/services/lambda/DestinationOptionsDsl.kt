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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.DestinationOptions
import software.amazon.awscdk.services.lambda.DestinationType

/**
 * Options when binding a destination to a function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * DestinationOptions destinationOptions = DestinationOptions.builder()
 * .type(DestinationType.FAILURE)
 * .build();
 * ```
 */
@CdkDslMarker
public class DestinationOptionsDsl {
    private val cdkBuilder: DestinationOptions.Builder = DestinationOptions.builder()

    /** @param type The destination type. */
    public fun type(type: DestinationType) {
        cdkBuilder.type(type)
    }

    public fun build(): DestinationOptions = cdkBuilder.build()
}
