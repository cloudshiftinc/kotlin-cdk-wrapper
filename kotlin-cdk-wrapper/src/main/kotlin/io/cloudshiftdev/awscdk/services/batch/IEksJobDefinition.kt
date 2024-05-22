@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Node
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.List
import kotlin.collections.Map

/**
 * A JobDefinition that uses Eks orchestration.
 */
public interface IEksJobDefinition : IJobDefinition {
  /**
   * The container this Job Definition will run.
   */
  public fun container(): EksContainerDefinition

  /**
   * The DNS Policy of the pod used by this Job Definition.
   *
   * Default: `DnsPolicy.CLUSTER_FIRST`
   *
   * [Documentation](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
   */
  public fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

  /**
   * The name of the service account that's used to run the container.
   *
   * service accounts are Kubernetes method of identification and authentication,
   * roughly analogous to IAM users.
   *
   * Default: - the default service account of the container
   *
   * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html)
   */
  public fun serviceAccount(): String? = unwrap(this).getServiceAccount()

  /**
   * If specified, the Pod used by this Job Definition will use the host's network IP address.
   *
   * Otherwise, the Kubernetes pod networking model is enabled.
   * Most AWS Batch workloads are egress-only and don't require the overhead of IP allocation for
   * each pod for incoming connections.
   *
   * Default: true
   *
   * [Documentation](https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
   */
  public fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.batch.IEksJobDefinition,
  ) : CdkObject(cdkObject), IEksJobDefinition {
    /**
     * Add a RetryStrategy to this JobDefinition.
     *
     * @param strategy 
     */
    override fun addRetryStrategy(strategy: RetryStrategy) {
      unwrap(this).addRetryStrategy(strategy.let(RetryStrategy.Companion::unwrap))
    }

    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * The container this Job Definition will run.
     */
    override fun container(): EksContainerDefinition =
        unwrap(this).getContainer().let(EksContainerDefinition::wrap)

    /**
     * The DNS Policy of the pod used by this Job Definition.
     *
     * Default: `DnsPolicy.CLUSTER_FIRST`
     *
     * [Documentation](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
     */
    override fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    /**
     * The ARN of this job definition.
     */
    override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

    /**
     * The name of this job definition.
     */
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
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     *
     * Default: none
     */
    override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

    /**
     * The name of the service account that's used to run the container.
     *
     * service accounts are Kubernetes method of identification and authentication,
     * roughly analogous to IAM users.
     *
     * Default: - the default service account of the container
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html)
     */
    override fun serviceAccount(): String? = unwrap(this).getServiceAccount()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     *
     * Default: - no timeout
     */
    override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

    /**
     * If specified, the Pod used by this Job Definition will use the host's network IP address.
     *
     * Otherwise, the Kubernetes pod networking model is enabled.
     * Most AWS Batch workloads are egress-only and don't require the overhead of IP allocation for
     * each pod for incoming connections.
     *
     * Default: true
     *
     * [Documentation](https://kubernetes.io/docs/concepts/workloads/pods/#pod-networking)
     */
    override fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEksJobDefinition):
        IEksJobDefinition = CdkObjectWrappers.wrap(cdkObject) as? IEksJobDefinition ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: IEksJobDefinition):
        software.amazon.awscdk.services.batch.IEksJobDefinition = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.IEksJobDefinition
  }
}
