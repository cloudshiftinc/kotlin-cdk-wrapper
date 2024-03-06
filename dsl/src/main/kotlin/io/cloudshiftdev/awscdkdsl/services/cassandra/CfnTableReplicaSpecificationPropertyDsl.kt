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
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * The AWS Region specific settings of a multi-Region table.
 *
 * For a multi-Region table, you can configure the table's read capacity differently per AWS Region.
 * You can do this by configuring the following parameters.
 * * `region` : The Region where these settings are applied. (Required)
 * * `readCapacityUnits` : The provisioned read capacity units. (Optional)
 * * `readCapacityAutoScaling` : The read capacity auto scaling settings for the table. (Optional)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * ReplicaSpecificationProperty replicaSpecificationProperty =
 * ReplicaSpecificationProperty.builder()
 * .region("region")
 * // the properties below are optional
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
 * .readCapacityUnits(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-replicaspecification.html)
 */
@CdkDslMarker
public class CfnTableReplicaSpecificationPropertyDsl {
    private val cdkBuilder: CfnTable.ReplicaSpecificationProperty.Builder =
        CfnTable.ReplicaSpecificationProperty.builder()

    /**
     * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
     *   table in the specified AWS Region.
     */
    public fun readCapacityAutoScaling(readCapacityAutoScaling: IResolvable) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling)
    }

    /**
     * @param readCapacityAutoScaling The read capacity auto scaling settings for the multi-Region
     *   table in the specified AWS Region.
     */
    public fun readCapacityAutoScaling(
        readCapacityAutoScaling: CfnTable.AutoScalingSettingProperty
    ) {
        cdkBuilder.readCapacityAutoScaling(readCapacityAutoScaling)
    }

    /**
     * @param readCapacityUnits The provisioned read capacity units for the multi-Region table in
     *   the specified AWS Region.
     */
    public fun readCapacityUnits(readCapacityUnits: Number) {
        cdkBuilder.readCapacityUnits(readCapacityUnits)
    }

    /** @param region The AWS Region. */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): CfnTable.ReplicaSpecificationProperty = cdkBuilder.build()
}
