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

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.rds.AuroraCapacityUnit
import software.amazon.awscdk.services.rds.ServerlessScalingOptions

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
 * "default.aurora-postgresql10"))
 * .vpc(vpc)
 * .scaling(ServerlessScalingOptions.builder()
 * .autoPause(Duration.minutes(10)) // default is to pause after 5 minutes of idle time
 * .minCapacity(AuroraCapacityUnit.ACU_8) // default is 2 Aurora capacity units (ACUs)
 * .maxCapacity(AuroraCapacityUnit.ACU_32)
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

    public fun build(): ServerlessScalingOptions = cdkBuilder.build()
}
