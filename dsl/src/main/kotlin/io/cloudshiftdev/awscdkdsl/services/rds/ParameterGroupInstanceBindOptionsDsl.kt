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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions

/**
 * Options for `IParameterGroup.bindToInstance`. Empty for now, but can be extended later.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ParameterGroupInstanceBindOptions parameterGroupInstanceBindOptions =
 * ParameterGroupInstanceBindOptions.builder().build();
 * ```
 */
@CdkDslMarker
public class ParameterGroupInstanceBindOptionsDsl {
    private val cdkBuilder: ParameterGroupInstanceBindOptions.Builder =
        ParameterGroupInstanceBindOptions.builder()

    public fun build(): ParameterGroupInstanceBindOptions = cdkBuilder.build()
}
