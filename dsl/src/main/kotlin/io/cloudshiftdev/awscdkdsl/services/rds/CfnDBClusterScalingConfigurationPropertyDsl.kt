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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.rds.CfnDBCluster

/**
 * The `ScalingConfiguration` property type specifies the scaling configuration of an Aurora
 * Serverless DB cluster.
 *
 * For more information, see
 * [Using Amazon Aurora Serverless](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.html)
 * in the *Amazon Aurora User Guide* .
 *
 * This property is only supported for Aurora Serverless v1. For Aurora Serverless v2, use
 * `ServerlessV2ScalingConfiguration` property.
 *
 * Valid for: Aurora DB clusters only
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rds.*;
 * ScalingConfigurationProperty scalingConfigurationProperty =
 * ScalingConfigurationProperty.builder()
 * .autoPause(false)
 * .maxCapacity(123)
 * .minCapacity(123)
 * .secondsBeforeTimeout(123)
 * .secondsUntilAutoPause(123)
 * .timeoutAction("timeoutAction")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-rds-dbcluster-scalingconfiguration.html)
 */
@CdkDslMarker
public class CfnDBClusterScalingConfigurationPropertyDsl {
    private val cdkBuilder: CfnDBCluster.ScalingConfigurationProperty.Builder =
        CfnDBCluster.ScalingConfigurationProperty.builder()

    /**
     * @param autoPause A value that indicates whether to allow or disallow automatic pause for an
     *   Aurora DB cluster in `serverless` DB engine mode. A DB cluster can be paused only when it's
     *   idle (it has no connections).
     *
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a
     * snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
     */
    public fun autoPause(autoPause: Boolean) {
        cdkBuilder.autoPause(autoPause)
    }

    /**
     * @param autoPause A value that indicates whether to allow or disallow automatic pause for an
     *   Aurora DB cluster in `serverless` DB engine mode. A DB cluster can be paused only when it's
     *   idle (it has no connections).
     *
     * If a DB cluster is paused for more than seven days, the DB cluster might be backed up with a
     * snapshot. In this case, the DB cluster is restored when there is a request to connect to it.
     */
    public fun autoPause(autoPause: IResolvable) {
        cdkBuilder.autoPause(autoPause)
    }

    /**
     * @param maxCapacity The maximum capacity for an Aurora DB cluster in `serverless` DB engine
     *   mode. For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` ,
     *   `64` , `128` , and `256` .
     *
     * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` , `192`
     * , and `384` .
     *
     * The maximum capacity must be greater than or equal to the minimum capacity.
     */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /**
     * @param minCapacity The minimum capacity for an Aurora DB cluster in `serverless` DB engine
     *   mode. For Aurora MySQL, valid capacity values are `1` , `2` , `4` , `8` , `16` , `32` ,
     *   `64` , `128` , and `256` .
     *
     * For Aurora PostgreSQL, valid capacity values are `2` , `4` , `8` , `16` , `32` , `64` , `192`
     * , and `384` .
     *
     * The minimum capacity must be less than or equal to the maximum capacity.
     */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    /**
     * @param secondsBeforeTimeout The amount of time, in seconds, that Aurora Serverless v1 tries
     *   to find a scaling point to perform seamless scaling before enforcing the timeout action.
     *   The default is 300.
     *
     * Specify a value between 60 and 600 seconds.
     */
    public fun secondsBeforeTimeout(secondsBeforeTimeout: Number) {
        cdkBuilder.secondsBeforeTimeout(secondsBeforeTimeout)
    }

    /**
     * @param secondsUntilAutoPause The time, in seconds, before an Aurora DB cluster in
     *   `serverless` mode is paused. Specify a value between 300 and 86,400 seconds.
     */
    public fun secondsUntilAutoPause(secondsUntilAutoPause: Number) {
        cdkBuilder.secondsUntilAutoPause(secondsUntilAutoPause)
    }

    /**
     * @param timeoutAction The action to take when the timeout is reached, either
     *   `ForceApplyCapacityChange` or `RollbackCapacityChange` . `ForceApplyCapacityChange` sets
     *   the capacity to the specified value as soon as possible.
     *
     * `RollbackCapacityChange` , the default, ignores the capacity change if a scaling point isn't
     * found in the timeout period.
     *
     * If you specify `ForceApplyCapacityChange` , connections that prevent Aurora Serverless v1
     * from finding a scaling point might be dropped.
     *
     * For more information, see
     * [Autoscaling for Aurora Serverless v1](https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/aurora-serverless.how-it-works.html#aurora-serverless.how-it-works.auto-scaling)
     * in the *Amazon Aurora User Guide* .
     */
    public fun timeoutAction(timeoutAction: String) {
        cdkBuilder.timeoutAction(timeoutAction)
    }

    public fun build(): CfnDBCluster.ScalingConfigurationProperty = cdkBuilder.build()
}
