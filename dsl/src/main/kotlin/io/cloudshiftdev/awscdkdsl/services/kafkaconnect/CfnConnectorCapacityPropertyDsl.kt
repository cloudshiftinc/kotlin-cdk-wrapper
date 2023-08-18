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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector

/**
 * Information about the capacity of the connector, whether it is auto scaled or provisioned.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kafkaconnect.*;
 * CapacityProperty capacityProperty = CapacityProperty.builder()
 * .autoScaling(AutoScalingProperty.builder()
 * .maxWorkerCount(123)
 * .mcuCount(123)
 * .minWorkerCount(123)
 * .scaleInPolicy(ScaleInPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .scaleOutPolicy(ScaleOutPolicyProperty.builder()
 * .cpuUtilizationPercentage(123)
 * .build())
 * .build())
 * .provisionedCapacity(ProvisionedCapacityProperty.builder()
 * .workerCount(123)
 * // the properties below are optional
 * .mcuCount(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kafkaconnect-connector-capacity.html)
 */
@CdkDslMarker
public class CfnConnectorCapacityPropertyDsl {
    private val cdkBuilder: CfnConnector.CapacityProperty.Builder =
        CfnConnector.CapacityProperty.builder()

    /** @param autoScaling Information about the auto scaling parameters for the connector. */
    public fun autoScaling(autoScaling: IResolvable) {
        cdkBuilder.autoScaling(autoScaling)
    }

    /** @param autoScaling Information about the auto scaling parameters for the connector. */
    public fun autoScaling(autoScaling: CfnConnector.AutoScalingProperty) {
        cdkBuilder.autoScaling(autoScaling)
    }

    /** @param provisionedCapacity Details about a fixed capacity allocated to a connector. */
    public fun provisionedCapacity(provisionedCapacity: IResolvable) {
        cdkBuilder.provisionedCapacity(provisionedCapacity)
    }

    /** @param provisionedCapacity Details about a fixed capacity allocated to a connector. */
    public fun provisionedCapacity(provisionedCapacity: CfnConnector.ProvisionedCapacityProperty) {
        cdkBuilder.provisionedCapacity(provisionedCapacity)
    }

    public fun build(): CfnConnector.CapacityProperty = cdkBuilder.build()
}
