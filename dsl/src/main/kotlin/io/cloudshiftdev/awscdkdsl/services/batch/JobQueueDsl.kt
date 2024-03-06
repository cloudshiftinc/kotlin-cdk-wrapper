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
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.batch.ISchedulingPolicy
import software.amazon.awscdk.services.batch.JobQueue
import software.amazon.awscdk.services.batch.OrderedComputeEnvironment
import software.constructs.Construct

/**
 * JobQueues can receive Jobs, which are removed from the queue when sent to the linked
 * ComputeEnvironment(s) to be executed.
 *
 * Jobs exit the queue in FIFO order unless a `SchedulingPolicy` is linked.
 *
 * Example:
 * ```
 * IVpc vpc;
 * EcsJobDefinition ecsJob = EcsJobDefinition.Builder.create(this, "JobDefn")
 * .container(EcsEc2ContainerDefinition.Builder.create(this, "containerDefn")
 * .image(ContainerImage.fromRegistry("public.ecr.aws/amazonlinux/amazonlinux:latest"))
 * .memory(Size.mebibytes(2048))
 * .cpu(256)
 * .build())
 * .build();
 * JobQueue queue = JobQueue.Builder.create(this, "JobQueue")
 * .computeEnvironments(List.of(OrderedComputeEnvironment.builder()
 * .computeEnvironment(ManagedEc2EcsComputeEnvironment.Builder.create(this, "managedEc2CE")
 * .vpc(vpc)
 * .build())
 * .order(1)
 * .build()))
 * .priority(10)
 * .build();
 * User user = new User(this, "MyUser");
 * ecsJob.grantSubmitJob(user, queue);
 * ```
 */
@CdkDslMarker
public class JobQueueDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: JobQueue.Builder = JobQueue.Builder.create(scope, id)

    private val _computeEnvironments: MutableList<OrderedComputeEnvironment> = mutableListOf()

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the VALID state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the
     * compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT);
     * EC2 and Fargate compute environments can't be mixed.
     *
     * *Note*: All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     * Default: none
     *
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     *   order relative to each other.
     */
    public fun computeEnvironments(computeEnvironments: OrderedComputeEnvironmentDsl.() -> Unit) {
        _computeEnvironments.add(OrderedComputeEnvironmentDsl().apply(computeEnvironments).build())
    }

    /**
     * The set of compute environments mapped to a job queue and their order relative to each other.
     *
     * The job scheduler uses this parameter to determine which compute environment runs a specific
     * job. Compute environments must be in the VALID state before you can associate them with a job
     * queue. You can associate up to three compute environments with a job queue. All of the
     * compute environments must be either EC2 (EC2 or SPOT) or Fargate (FARGATE or FARGATE_SPOT);
     * EC2 and Fargate compute environments can't be mixed.
     *
     * *Note*: All compute environments that are associated with a job queue must share the same
     * architecture. AWS Batch doesn't support mixing compute environment architecture types in a
     * single job queue.
     *
     * Default: none
     *
     * @param computeEnvironments The set of compute environments mapped to a job queue and their
     *   order relative to each other.
     */
    public fun computeEnvironments(computeEnvironments: Collection<OrderedComputeEnvironment>) {
        _computeEnvironments.addAll(computeEnvironments)
    }

    /**
     * If the job queue is enabled, it is able to accept jobs.
     *
     * Otherwise, new jobs can't be added to the queue, but jobs already in the queue can finish.
     *
     * Default: true
     *
     * @param enabled If the job queue is enabled, it is able to accept jobs.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * The name of the job queue.
     *
     * It can be up to 128 letters long. It can contain uppercase and lowercase letters, numbers,
     * hyphens (-), and underscores (_)
     *
     * Default: - no name
     *
     * @param jobQueueName The name of the job queue.
     */
    public fun jobQueueName(jobQueueName: String) {
        cdkBuilder.jobQueueName(jobQueueName)
    }

    /**
     * The priority of the job queue.
     *
     * Job queues with a higher priority are evaluated first when associated with the same compute
     * environment. Priority is determined in descending order. For example, a job queue with a
     * priority of 10 is given scheduling preference over a job queue with a priority of 1.
     *
     * Default: 1
     *
     * @param priority The priority of the job queue.
     */
    public fun priority(priority: Number) {
        cdkBuilder.priority(priority)
    }

    /**
     * The SchedulingPolicy for this JobQueue.
     *
     * Instructs the Scheduler how to schedule different jobs.
     *
     * Default: - no scheduling policy
     *
     * @param schedulingPolicy The SchedulingPolicy for this JobQueue.
     */
    public fun schedulingPolicy(schedulingPolicy: ISchedulingPolicy) {
        cdkBuilder.schedulingPolicy(schedulingPolicy)
    }

    public fun build(): JobQueue {
        if (_computeEnvironments.isNotEmpty()) cdkBuilder.computeEnvironments(_computeEnvironments)
        return cdkBuilder.build()
    }
}
