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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.PermissionsBoundaryBindOptions

/**
 * Options for binding a Permissions Boundary to a construct scope.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * PermissionsBoundaryBindOptions permissionsBoundaryBindOptions =
 * PermissionsBoundaryBindOptions.builder().build();
 * ```
 */
@CdkDslMarker
public class PermissionsBoundaryBindOptionsDsl {
    private val cdkBuilder: PermissionsBoundaryBindOptions.Builder =
        PermissionsBoundaryBindOptions.builder()

    public fun build(): PermissionsBoundaryBindOptions = cdkBuilder.build()
}
