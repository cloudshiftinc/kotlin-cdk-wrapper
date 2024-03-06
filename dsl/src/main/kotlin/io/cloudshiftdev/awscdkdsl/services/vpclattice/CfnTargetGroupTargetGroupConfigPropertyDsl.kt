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

package io.cloudshiftdev.awscdkdsl.services.vpclattice

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.vpclattice.CfnTargetGroup

/**
 * Describes the configuration of a target group.
 *
 * For more information, see
 * [Target groups](https://docs.aws.amazon.com/vpc-lattice/latest/ug/target-groups.html) in the
 * *Amazon VPC Lattice User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.vpclattice.*;
 * TargetGroupConfigProperty targetGroupConfigProperty = TargetGroupConfigProperty.builder()
 * .healthCheck(HealthCheckConfigProperty.builder()
 * .enabled(false)
 * .healthCheckIntervalSeconds(123)
 * .healthCheckTimeoutSeconds(123)
 * .healthyThresholdCount(123)
 * .matcher(MatcherProperty.builder()
 * .httpCode("httpCode")
 * .build())
 * .path("path")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .unhealthyThresholdCount(123)
 * .build())
 * .ipAddressType("ipAddressType")
 * .lambdaEventStructureVersion("lambdaEventStructureVersion")
 * .port(123)
 * .protocol("protocol")
 * .protocolVersion("protocolVersion")
 * .vpcIdentifier("vpcIdentifier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-vpclattice-targetgroup-targetgroupconfig.html)
 */
@CdkDslMarker
public class CfnTargetGroupTargetGroupConfigPropertyDsl {
    private val cdkBuilder: CfnTargetGroup.TargetGroupConfigProperty.Builder =
        CfnTargetGroup.TargetGroupConfigProperty.builder()

    /**
     * @param healthCheck The health check configuration. Not supported if the target group type is
     *   `LAMBDA` or `ALB` .
     */
    public fun healthCheck(healthCheck: IResolvable) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param healthCheck The health check configuration. Not supported if the target group type is
     *   `LAMBDA` or `ALB` .
     */
    public fun healthCheck(healthCheck: CfnTargetGroup.HealthCheckConfigProperty) {
        cdkBuilder.healthCheck(healthCheck)
    }

    /**
     * @param ipAddressType The type of IP address used for the target group. Supported only if the
     *   target group type is `IP` . The default is `IPV4` .
     */
    public fun ipAddressType(ipAddressType: String) {
        cdkBuilder.ipAddressType(ipAddressType)
    }

    /**
     * @param lambdaEventStructureVersion The version of the event structure that your Lambda
     *   function receives. Supported only if the target group type is `LAMBDA` . The default is
     *   `V1` .
     */
    public fun lambdaEventStructureVersion(lambdaEventStructureVersion: String) {
        cdkBuilder.lambdaEventStructureVersion(lambdaEventStructureVersion)
    }

    /**
     * @param port The port on which the targets are listening. For HTTP, the default is 80. For
     *   HTTPS, the default is 443. Not supported if the target group type is `LAMBDA` .
     */
    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol to use for routing traffic to the targets. The default is the
     *   protocol of the target group. Not supported if the target group type is `LAMBDA` .
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param protocolVersion The protocol version. The default is `HTTP1` . Not supported if the
     *   target group type is `LAMBDA` .
     */
    public fun protocolVersion(protocolVersion: String) {
        cdkBuilder.protocolVersion(protocolVersion)
    }

    /**
     * @param vpcIdentifier The ID of the VPC. Not supported if the target group type is `LAMBDA` .
     */
    public fun vpcIdentifier(vpcIdentifier: String) {
        cdkBuilder.vpcIdentifier(vpcIdentifier)
    }

    public fun build(): CfnTargetGroup.TargetGroupConfigProperty = cdkBuilder.build()
}
