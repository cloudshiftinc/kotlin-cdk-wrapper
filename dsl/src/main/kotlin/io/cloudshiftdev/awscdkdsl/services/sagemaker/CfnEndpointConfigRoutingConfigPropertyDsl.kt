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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnEndpointConfig

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * RoutingConfigProperty routingConfigProperty = RoutingConfigProperty.builder()
 * .routingStrategy("routingStrategy")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpointconfig-routingconfig.html)
 */
@CdkDslMarker
public class CfnEndpointConfigRoutingConfigPropertyDsl {
    private val cdkBuilder: CfnEndpointConfig.RoutingConfigProperty.Builder =
        CfnEndpointConfig.RoutingConfigProperty.builder()

    /** @param routingStrategy the value to be set. */
    public fun routingStrategy(routingStrategy: String) {
        cdkBuilder.routingStrategy(routingStrategy)
    }

    public fun build(): CfnEndpointConfig.RoutingConfigProperty = cdkBuilder.build()
}
