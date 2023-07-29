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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.ParameterGroupClusterBindOptions

/**
 * Options for `IParameterGroup.bindToCluster`. Empty for now, but can be extended later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ParameterGroupClusterBindOptions parameterGroupClusterBindOptions =
 * ParameterGroupClusterBindOptions.builder().build();
 * ```
 */
@CdkDslMarker
public class ParameterGroupClusterBindOptionsDsl {
    private val cdkBuilder: ParameterGroupClusterBindOptions.Builder =
        ParameterGroupClusterBindOptions.builder()

    public fun build(): ParameterGroupClusterBindOptions = cdkBuilder.build()
}
