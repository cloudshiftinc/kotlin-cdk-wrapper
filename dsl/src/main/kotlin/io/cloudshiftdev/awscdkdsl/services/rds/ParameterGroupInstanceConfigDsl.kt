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
import kotlin.String
import software.amazon.awscdk.services.rds.ParameterGroupInstanceConfig

/**
 * The type returned from `IParameterGroup.bindToInstance`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ParameterGroupInstanceConfig parameterGroupInstanceConfig =
 * ParameterGroupInstanceConfig.builder()
 * .parameterGroupName("parameterGroupName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ParameterGroupInstanceConfigDsl {
    private val cdkBuilder: ParameterGroupInstanceConfig.Builder =
        ParameterGroupInstanceConfig.builder()

    /** @param parameterGroupName The name of this parameter group. */
    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun build(): ParameterGroupInstanceConfig = cdkBuilder.build()
}
