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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * The optional auto scaling capacity settings for a table in provisioned capacity mode.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * AutoScalingSpecificationProperty autoScalingSpecificationProperty =
 * AutoScalingSpecificationProperty.builder()
 * .readCapacityAutoScaling(AutoScalingSettingProperty.builder()
 * .autoScalingDisabled(false)
 * .maximumUnits(123)
 * .minimumUnits(123)
 * .scalingPolicy(ScalingPolicyProperty.builder()
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * .build())
 * .build())
 * .writeCapacityAutoScaling(AutoScalingSettingProperty.builder()
 * .autoScalingDisabled(false)
 * .maximumUnits(123)
 * .minimumUnits(123)
 * .scalingPolicy(ScalingPolicyProperty.builder()
 * .targetTrackingScalingPolicyConfiguration(TargetTrackingScalingPolicyConfigurationProperty.builder()
 * .targetValue(123)
 * // the properties below are optional
 * .disableScaleIn(false)
 * .scaleInCooldown(123)
 * .scaleOutCooldown(123)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-autoscalingspecification.html)
 */
@CdkDslMarker
public class CfnTableAutoScalingSpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.AutoScalingSpecificationProperty.Builder =
        CfnTable.AutoScalingSpecificationProperty.builder()

    /** @param readCapacityAutoScaling The auto scaling settings for the table's read capacity. */
    public fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling)
    }

    /** @param readCapacityAutoScaling The auto scaling settings for the table's read capacity. */
    public fun readCapacityAutoScaling(
        readCapacityAutoScaling: CfnTable.AutoScalingSettingProperty
    ) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling)
    }

    /** @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity. */
    public fun writeCapacityAutoScaling(writeCapacityAutoScaling: IResolvable) {
        cdkBuilder.writeCapacityAutoScaling(writeCapacityAutoScaling)
    }

    /** @param writeCapacityAutoScaling The auto scaling settings for the table's write capacity. */
    public fun writeCapacityAutoScaling(
        writeCapacityAutoScaling: CfnTable.AutoScalingSettingProperty
    ) {
        cdkBuilder.writeCapacityAutoScaling(writeCapacityAutoScaling)
    }

    public fun build(): CfnTable.AutoScalingSpecificationProperty = cdkBuilder.build()
}
