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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.stepfunctions.FindStateOptions

/**
 * Options for finding reachable states.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * FindStateOptions findStateOptions = FindStateOptions.builder()
 * .includeErrorHandlers(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class FindStateOptionsDsl {
    private val cdkBuilder: FindStateOptions.Builder = FindStateOptions.builder()

    /** @param includeErrorHandlers Whether or not to follow error-handling transitions. */
    public fun includeErrorHandlers(includeErrorHandlers: Boolean) {
        cdkBuilder.includeErrorHandlers(includeErrorHandlers)
    }

    public fun build(): FindStateOptions = cdkBuilder.build()
}
