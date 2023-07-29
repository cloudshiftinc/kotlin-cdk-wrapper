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

package cloudshift.awscdk.dsl.services.logs.destinations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.logs.destinations.LambdaDestinationOptions

/**
 * Options that may be provided to LambdaDestination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.destinations.*;
 * LambdaDestinationOptions lambdaDestinationOptions = LambdaDestinationOptions.builder()
 * .addPermissions(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class LambdaDestinationOptionsDsl {
    private val cdkBuilder: LambdaDestinationOptions.Builder = LambdaDestinationOptions.builder()

    /** @param addPermissions Whether or not to add Lambda Permissions. */
    public fun addPermissions(addPermissions: Boolean) {
        cdkBuilder.addPermissions(addPermissions)
    }

    public fun build(): LambdaDestinationOptions = cdkBuilder.build()
}
