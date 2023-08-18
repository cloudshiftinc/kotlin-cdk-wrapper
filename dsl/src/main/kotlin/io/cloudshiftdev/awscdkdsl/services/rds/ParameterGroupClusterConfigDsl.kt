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
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig

/**
 * The type returned from `IParameterGroup.bindToCluster`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ParameterGroupClusterConfig parameterGroupClusterConfig = ParameterGroupClusterConfig.builder()
 * .parameterGroupName("parameterGroupName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ParameterGroupClusterConfigDsl {
    private val cdkBuilder: ParameterGroupClusterConfig.Builder =
        ParameterGroupClusterConfig.builder()

    /** @param parameterGroupName The name of this parameter group. */
    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun build(): ParameterGroupClusterConfig = cdkBuilder.build()
}
