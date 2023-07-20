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
import software.amazon.awscdk.services.rds.ParameterGroupInstanceBindOptions

@CdkDslMarker
public class ParameterGroupInstanceBindOptionsDsl {
    private val cdkBuilder: ParameterGroupInstanceBindOptions.Builder =
        ParameterGroupInstanceBindOptions.builder()

    public fun build(): ParameterGroupInstanceBindOptions = cdkBuilder.build()
}
