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
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnEndpoint

/**
 * Specifies a rolling deployment strategy for updating a SageMaker endpoint.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * RollingUpdatePolicyProperty rollingUpdatePolicyProperty = RollingUpdatePolicyProperty.builder()
 * .maximumBatchSize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .waitIntervalInSeconds(123)
 * // the properties below are optional
 * .maximumExecutionTimeoutInSeconds(123)
 * .rollbackMaximumBatchSize(CapacitySizeProperty.builder()
 * .type("type")
 * .value(123)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-endpoint-rollingupdatepolicy.html)
 */
@CdkDslMarker
public class CfnEndpointRollingUpdatePolicyPropertyDsl {
    private val cdkBuilder: CfnEndpoint.RollingUpdatePolicyProperty.Builder =
        CfnEndpoint.RollingUpdatePolicyProperty.builder()

    /**
     * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
     *   traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. Value
     *   must be between 5% to 50% of the variant's total instance count.
     */
    public fun maximumBatchSize(maximumBatchSize: IResolvable) {
        cdkBuilder.maximumBatchSize(maximumBatchSize)
    }

    /**
     * @param maximumBatchSize Batch size for each rolling step to provision capacity and turn on
     *   traffic on the new endpoint fleet, and terminate capacity on the old endpoint fleet. Value
     *   must be between 5% to 50% of the variant's total instance count.
     */
    public fun maximumBatchSize(maximumBatchSize: CfnEndpoint.CapacitySizeProperty) {
        cdkBuilder.maximumBatchSize(maximumBatchSize)
    }

    /**
     * @param maximumExecutionTimeoutInSeconds The time limit for the total deployment. Exceeding
     *   this limit causes a timeout.
     */
    public fun maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds: Number) {
        cdkBuilder.maximumExecutionTimeoutInSeconds(maximumExecutionTimeoutInSeconds)
    }

    /**
     * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet. Each
     *   rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
     *   terminate capacity on the new endpoint fleet. If this field is absent, the default value
     *   will be set to 100% of total capacity which means to bring up the whole capacity of the old
     *   fleet at once during rollback.
     */
    public fun rollbackMaximumBatchSize(rollbackMaximumBatchSize: IResolvable) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize)
    }

    /**
     * @param rollbackMaximumBatchSize Batch size for rollback to the old endpoint fleet. Each
     *   rolling step to provision capacity and turn on traffic on the old endpoint fleet, and
     *   terminate capacity on the new endpoint fleet. If this field is absent, the default value
     *   will be set to 100% of total capacity which means to bring up the whole capacity of the old
     *   fleet at once during rollback.
     */
    public fun rollbackMaximumBatchSize(
        rollbackMaximumBatchSize: CfnEndpoint.CapacitySizeProperty
    ) {
        cdkBuilder.rollbackMaximumBatchSize(rollbackMaximumBatchSize)
    }

    /**
     * @param waitIntervalInSeconds The length of the baking period, during which SageMaker monitors
     *   alarms for each batch on the new fleet.
     */
    public fun waitIntervalInSeconds(waitIntervalInSeconds: Number) {
        cdkBuilder.waitIntervalInSeconds(waitIntervalInSeconds)
    }

    public fun build(): CfnEndpoint.RollingUpdatePolicyProperty = cdkBuilder.build()
}
