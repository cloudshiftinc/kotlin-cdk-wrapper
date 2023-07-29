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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Unit
import software.amazon.awscdk.services.appmesh.CfnVirtualGateway
import software.amazon.awscdk.services.appmesh.CfnVirtualNode
import software.amazon.awscdk.services.appmesh.HealthCheckConfig

/**
 * All Properties for Health Checks for mesh endpoints.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appmesh.*;
 * HealthCheckConfig healthCheckConfig = HealthCheckConfig.builder()
 * .virtualGatewayHealthCheck(VirtualGatewayHealthCheckPolicyProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build())
 * .virtualNodeHealthCheck(HealthCheckProperty.builder()
 * .healthyThreshold(123)
 * .intervalMillis(123)
 * .protocol("protocol")
 * .timeoutMillis(123)
 * .unhealthyThreshold(123)
 * // the properties below are optional
 * .path("path")
 * .port(123)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class HealthCheckConfigDsl {
    private val cdkBuilder: HealthCheckConfig.Builder = HealthCheckConfig.builder()

    /** @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks. */
    public fun virtualGatewayHealthCheck(
        virtualGatewayHealthCheck:
            CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl.() -> Unit =
            {}
    ) {
        val builder = CfnVirtualGatewayVirtualGatewayHealthCheckPolicyPropertyDsl()
        builder.apply(virtualGatewayHealthCheck)
        cdkBuilder.virtualGatewayHealthCheck(builder.build())
    }

    /** @param virtualGatewayHealthCheck VirtualGateway CFN configuration for Health Checks. */
    public fun virtualGatewayHealthCheck(
        virtualGatewayHealthCheck: CfnVirtualGateway.VirtualGatewayHealthCheckPolicyProperty
    ) {
        cdkBuilder.virtualGatewayHealthCheck(virtualGatewayHealthCheck)
    }

    /** @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks. */
    public fun virtualNodeHealthCheck(
        virtualNodeHealthCheck: CfnVirtualNodeHealthCheckPropertyDsl.() -> Unit = {}
    ) {
        val builder = CfnVirtualNodeHealthCheckPropertyDsl()
        builder.apply(virtualNodeHealthCheck)
        cdkBuilder.virtualNodeHealthCheck(builder.build())
    }

    /** @param virtualNodeHealthCheck VirtualNode CFN configuration for Health Checks. */
    public fun virtualNodeHealthCheck(virtualNodeHealthCheck: CfnVirtualNode.HealthCheckProperty) {
        cdkBuilder.virtualNodeHealthCheck(virtualNodeHealthCheck)
    }

    public fun build(): HealthCheckConfig = cdkBuilder.build()
}
