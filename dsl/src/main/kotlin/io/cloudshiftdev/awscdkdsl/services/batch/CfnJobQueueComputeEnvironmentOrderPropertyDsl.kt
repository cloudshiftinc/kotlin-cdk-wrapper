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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobQueue

/**
 * The order that compute environments are tried in for job placement within a queue.
 *
 * Compute environments are tried in ascending order. For example, if two compute environments are
 * associated with a job queue, the compute environment with a lower order integer value is tried
 * for job placement first. Compute environments must be in the `VALID` state before you can
 * associate them with a job queue. All of the compute environments must be either EC2 ( `EC2` or
 * `SPOT` ) or Fargate ( `FARGATE` or `FARGATE_SPOT` ); EC2 and Fargate compute environments can't
 * be mixed.
 *
 * All compute environments that are associated with a job queue must share the same architecture.
 * AWS Batch doesn't support mixing compute environment architecture types in a single job queue.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * ComputeEnvironmentOrderProperty computeEnvironmentOrderProperty =
 * ComputeEnvironmentOrderProperty.builder()
 * .computeEnvironment("computeEnvironment")
 * .order(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobqueue-computeenvironmentorder.html)
 */
@CdkDslMarker
public class CfnJobQueueComputeEnvironmentOrderPropertyDsl {
    private val cdkBuilder: CfnJobQueue.ComputeEnvironmentOrderProperty.Builder =
        CfnJobQueue.ComputeEnvironmentOrderProperty.builder()

    /** @param computeEnvironment The Amazon Resource Name (ARN) of the compute environment. */
    public fun computeEnvironment(computeEnvironment: String) {
        cdkBuilder.computeEnvironment(computeEnvironment)
    }

    /**
     * @param order The order of the compute environment. Compute environments are tried in
     *   ascending order. For example, if two compute environments are associated with a job queue,
     *   the compute environment with a lower `order` integer value is tried for job placement
     *   first.
     */
    public fun order(order: Number) {
        cdkBuilder.order(order)
    }

    public fun build(): CfnJobQueue.ComputeEnvironmentOrderProperty = cdkBuilder.build()
}
