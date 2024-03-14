package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

public interface IJobDefinition : IResource {
    /**
     * Add a RetryStrategy to this JobDefinition.
     *
     * @param strategy
     */
    public fun addRetryStrategy(strategy: RetryStrategy)

    /** The ARN of this job definition. */
    public fun jobDefinitionArn(): String

    /** The name of this job definition. */
    public fun jobDefinitionName(): String

    /**
     * The default parameters passed to the container These parameters can be referenced in the
     * `command` that you give to the container.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
     */
    public fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

    /**
     * The number of times to retry a job.
     *
     * The job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     */
    public fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     */
    public fun retryStrategies(): List<RetryStrategy>

    /**
     * The priority of this Job.
     *
     * Only used in Fairshare Scheduling to decide which job to run first when there are multiple
     * jobs with the same share identifier.
     *
     * Default: none
     */
    public fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes, Batch terminates your jobs if they aren't
     * finished.
     *
     * Default: - no timeout
     */
    public fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    private class Wrapper
    internal constructor(
        internal val cdkObject: software.amazon.awscdk.services.batch.IJobDefinition,
    ) : IJobDefinition {
        /**
         * Add a RetryStrategy to this JobDefinition.
         *
         * @param strategy
         */
        override fun addRetryStrategy(strategy: RetryStrategy) {
            unwrap(this).addRetryStrategy(strategy.let(RetryStrategy::unwrap))
        }

        /**
         * Apply the given removal policy to this resource.
         *
         * The Removal Policy controls what happens to this resource when it stops being managed by
         * CloudFormation, either because you've removed it from the CDK application or because
         * you've made a change that requires the resource to be replaced.
         *
         * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS account for
         * data recovery and cleanup later (`RemovalPolicy.RETAIN`).
         *
         * @param policy
         */
        override fun applyRemovalPolicy(policy: RemovalPolicy) {
            unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy::unwrap))
        }

        /**
         * The environment this resource belongs to.
         *
         * For resources that are created and managed by the CDK (generally, those created by
         * creating new class instances like Role, Bucket, etc.), this is always the same as the
         * environment of the stack they belong to; however, for imported resources (those obtained
         * from static methods like fromRoleArn, fromBucketName, etc.), that might be different than
         * the stack they were imported into.
         */
        override fun env(): ResourceEnvironment =
            unwrap(this).getEnv().let(ResourceEnvironment::wrap)

        /** The ARN of this job definition. */
        override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

        /** The name of this job definition. */
        override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

        override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

        /**
         * The default parameters passed to the container These parameters can be referenced in the
         * `command` that you give to the container.
         *
         * Default: none
         *
         * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
         */
        override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

        /**
         * The number of times to retry a job.
         *
         * The job is retried on failure the same number of attempts as the value.
         *
         * Default: 1
         */
        override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

        /**
         * Defines the retry behavior for this job.
         *
         * Default: - no `RetryStrategy`
         */
        override fun retryStrategies(): List<RetryStrategy> =
            unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

        /**
         * The priority of this Job.
         *
         * Only used in Fairshare Scheduling to decide which job to run first when there are
         * multiple jobs with the same share identifier.
         *
         * Default: none
         */
        override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

        /** The stack in which this resource is defined. */
        override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

        /**
         * The timeout time for jobs that are submitted with this job definition.
         *
         * After the amount of time you specify passes, Batch terminates your jobs if they aren't
         * finished.
         *
         * Default: - no timeout
         */
        override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)
    }

    public companion object {
        init {}

        internal fun wrap(
            cdkObject: software.amazon.awscdk.services.batch.IJobDefinition
        ): IJobDefinition = Wrapper(cdkObject)

        internal fun unwrap(
            wrapped: IJobDefinition
        ): software.amazon.awscdk.services.batch.IJobDefinition = (wrapped as Wrapper).cdkObject
    }
}
