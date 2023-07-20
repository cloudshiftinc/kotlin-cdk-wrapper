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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig
import kotlin.Number

@CdkDslMarker
public class CfnDeploymentConfigTimeBasedCanaryPropertyDsl {
    private val cdkBuilder: CfnDeploymentConfig.TimeBasedCanaryProperty.Builder =
        CfnDeploymentConfig.TimeBasedCanaryProperty.builder()

    public fun canaryInterval(canaryInterval: Number) {
        cdkBuilder.canaryInterval(canaryInterval)
    }

    public fun canaryPercentage(canaryPercentage: Number) {
        cdkBuilder.canaryPercentage(canaryPercentage)
    }

    public fun build(): CfnDeploymentConfig.TimeBasedCanaryProperty = cdkBuilder.build()
}
