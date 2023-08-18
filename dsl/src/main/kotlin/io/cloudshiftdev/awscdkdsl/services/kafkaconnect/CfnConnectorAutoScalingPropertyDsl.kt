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

package io.cloudshiftdev.awscdkdsl.services.kafkaconnect

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Specifies how the connector scales.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * AutoScalingProperty autoScalingProperty = AutoScalingProperty.builder()
 * .maxWorkerCount(123)
 * .mcuCount(123)
 * .minWorkerCount(123)
 * .scaleInPolicy(ScaleInPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .scaleOutPolicy(ScaleOutPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-autoscaling.html)
 */
@CdkDslMarker
public class CfnConnectorAutoScalingPropertyDsl {
    private val cdkBuilder: CfnConnector.AutoScalingProperty.Builder =
        CfnConnector.AutoScalingProperty.builder()

    /** @param maxWorkerCount The maximum number of workers allocated to the connector. */
    public fun maxWorkerCount(maxWorkerCount: Number) {
        cdkBuilder.maxWorkerCount(maxWorkerCount)
    }

    /**
     * @param mcuCount The number of microcontroller units (MCUs) allocated to each connector
     *   worker. The valid values are 1,2,4,8.
     */
    public fun mcuCount(mcuCount: Number) {
        cdkBuilder.mcuCount(mcuCount)
    }

    /** @param minWorkerCount The minimum number of workers allocated to the connector. */
    public fun minWorkerCount(minWorkerCount: Number) {
        cdkBuilder.minWorkerCount(minWorkerCount)
    }

    /** @param scaleInPolicy The sacle-in policy for the connector. */
    public fun scaleInPolicy(scaleInPolicy: IResolvable) {
        cdkBuilder.scaleInPolicy(scaleInPolicy)
    }

    /** @param scaleInPolicy The sacle-in policy for the connector. */
    public fun scaleInPolicy(scaleInPolicy: CfnConnector.ScaleInPolicyProperty) {
        cdkBuilder.scaleInPolicy(scaleInPolicy)
    }

    /** @param scaleOutPolicy The sacle-out policy for the connector. */
    public fun scaleOutPolicy(scaleOutPolicy: IResolvable) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy)
    }

    /** @param scaleOutPolicy The sacle-out policy for the connector. */
    public fun scaleOutPolicy(scaleOutPolicy: CfnConnector.ScaleOutPolicyProperty) {
        cdkBuilder.scaleOutPolicy(scaleOutPolicy)
    }

    public fun build(): CfnConnector.AutoScalingProperty = cdkBuilder.build()
}
