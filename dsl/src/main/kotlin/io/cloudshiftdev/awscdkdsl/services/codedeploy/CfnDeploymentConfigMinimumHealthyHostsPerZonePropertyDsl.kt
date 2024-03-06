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

package io.cloudshiftdev.awscdkdsl.services.codedeploy

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.codedeploy.CfnDeploymentConfig

/**
 * Information about the minimum number of healthy instances per Availability Zone.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codedeploy.*;
 * MinimumHealthyHostsPerZoneProperty minimumHealthyHostsPerZoneProperty =
 * MinimumHealthyHostsPerZoneProperty.builder()
 * .type("type")
 * .value(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codedeploy-deploymentconfig-minimumhealthyhostsperzone.html)
 */
@CdkDslMarker
public class CfnDeploymentConfigMinimumHealthyHostsPerZonePropertyDsl {
    private val cdkBuilder: CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.Builder =
        CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty.builder()

    /** @param type The `type` associated with the `MinimumHealthyHostsPerZone` option. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /** @param value The `value` associated with the `MinimumHealthyHostsPerZone` option. */
    public fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnDeploymentConfig.MinimumHealthyHostsPerZoneProperty = cdkBuilder.build()
}
