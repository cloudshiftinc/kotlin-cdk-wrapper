@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.rds.ParameterGroupClusterConfig
import kotlin.String

@CdkDslMarker
public class ParameterGroupClusterConfigDsl {
    private val cdkBuilder: ParameterGroupClusterConfig.Builder =
        ParameterGroupClusterConfig.builder()

    public fun parameterGroupName(parameterGroupName: String) {
        cdkBuilder.parameterGroupName(parameterGroupName)
    }

    public fun build(): ParameterGroupClusterConfig = cdkBuilder.build()
}
