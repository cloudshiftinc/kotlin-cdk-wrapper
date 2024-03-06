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

package io.cloudshiftdev.awscdkdsl.services.rds

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.rds.AuroraCapacityUnit
import software.amazon.awscdk.services.rds.ServerlessScalingOptions
import software.amazon.awscdk.services.rds.TimeoutAction

/**
 * Options for configuring scaling on an Aurora Serverless cluster.
 *
 * Example:
 * ```
 * Vpc vpc;
 * ServerlessCluster cluster = ServerlessCluster.Builder.create(this, "AnotherCluster")
 * .engine(DatabaseClusterEngine.AURORA_POSTGRESQL)
 * .copyTagsToSnapshot(true) // whether to save the cluster tags when creating the snapshot. Default
 * is 'true'
 * .parameterGroup(ParameterGroup.fromParameterGroupName(this, "ParameterGroup",
 * "default.aurora-postgresql11"))
 * .vpc(vpc)
 * .scaling(ServerlessScalingOptions.builder()
 * .autoPause(Duration.minutes(10)) // default is to pause after 5 minutes of idle time
 * .minCapacity(AuroraCapacityUnit.ACU_8) // default is 2 Aurora capacity units (ACUs)
 * .maxCapacity(AuroraCapacityUnit.ACU_32) // default is 16 Aurora capacity units (ACUs)
 * .timeout(Duration.seconds(100)) // default is 5 minutes
 * .timeoutAction(TimeoutAction.FORCE_APPLY_CAPACITY_CHANGE)
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class ServerlessScalingOptionsDsl {
    private val cdkBuilder: ServerlessScalingOptions.Builder = ServerlessScalingOptions.builder()

    /**
     * @param autoPause The time before an Aurora Serverless database cluster is paused. A database
     *   cluster can be paused only when it is idle (it has no connections). Auto pause time must be
     *   between 5 minutes and 1 day.
     *
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a
     * snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
     *
     * Set to 0 to disable
     */
    public fun autoPause(autoPause: Duration) {
        cdkBuilder.autoPause(autoPause)
    }

    /** @param maxCapacity The maximum capacity for an Aurora Serverless database cluster. */
    public fun maxCapacity(maxCapacity: AuroraCapacityUnit) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity The minimum capacity for an Aurora Serverless database cluster. */
    public fun minCapacity(minCapacity: AuroraCapacityUnit) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param timeout The amount of time that Aurora Serverless v1 tries to find a scaling point to
     *   perform seamless scaling before enforcing the timeout action.
     */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param timeoutAction The action to take when the timeout is reached. Selecting
     *   ForceApplyCapacityChange will force the capacity to the specified value as soon as
     *   possible, even without a scaling point. Selecting RollbackCapacityChange will ignore the
     *   capacity change if a scaling point is not found. This is the default behavior.
     */
    public fun timeoutAction(timeoutAction: TimeoutAction) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    public fun build(): ServerlessScalingOptions = cdkBuilder.build()
}
