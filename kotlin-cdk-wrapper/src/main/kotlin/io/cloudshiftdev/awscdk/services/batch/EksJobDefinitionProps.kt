@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Props for EksJobDefinition.
 *
 * Example:
 *
 * ```
 * EksJobDefinition jobDefn = EksJobDefinition.Builder.create(this, "eksf2")
 * .container(EksContainerDefinition.Builder.create(this, "container")
 * .image(ContainerImage.fromRegistry("amazon/amazon-ecs-sample"))
 * .volumes(List.of(EksVolume.emptyDir(EmptyDirVolumeOptions.builder()
 * .name("myEmptyDirVolume")
 * .mountPath("/mount/path")
 * .medium(EmptyDirMediumType.MEMORY)
 * .readonly(true)
 * .sizeLimit(Size.mebibytes(2048))
 * .build())))
 * .build())
 * .build();
 * ```
 */
public interface EksJobDefinitionProps : JobDefinitionProps {
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

  /**
   * A builder for [EksJobDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param container The container this Job Definition will run. 
     */
    public fun container(container: EksContainerDefinition)

    /**
     * @param dnsPolicy The DNS Policy of the pod used by this Job Definition.
     */
    public fun dnsPolicy(dnsPolicy: DnsPolicy)

    /**
     * @param jobDefinitionName The name of this job definition.
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container.
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * @param retryAttempts The number of times to retry a job.
     * The job is retried on failure the same number of attempts as the value.
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    /**
     * @param schedulingPriority The priority of this Job.
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     */
    public fun schedulingPriority(schedulingPriority: Number)

    /**
     * @param serviceAccount The name of the service account that's used to run the container.
     * service accounts are Kubernetes method of identification and authentication,
     * roughly analogous to IAM users.
     */
    public fun serviceAccount(serviceAccount: String)

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     */
    public fun timeout(timeout: Duration)

    /**
     * @param useHostNetwork If specified, the Pod used by this Job Definition will use the host's
     * network IP address.
     * Otherwise, the Kubernetes pod networking model is enabled.
     * Most AWS Batch workloads are egress-only and don't require the overhead of IP allocation for
     * each pod for incoming connections.
     */
    public fun useHostNetwork(useHostNetwork: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksJobDefinitionProps.Builder =
        software.amazon.awscdk.services.batch.EksJobDefinitionProps.builder()

    /**
     * @param container The container this Job Definition will run. 
     */
    override fun container(container: EksContainerDefinition) {
      cdkBuilder.container(container.let(EksContainerDefinition::unwrap))
    }

    /**
     * @param dnsPolicy The DNS Policy of the pod used by this Job Definition.
     */
    override fun dnsPolicy(dnsPolicy: DnsPolicy) {
      cdkBuilder.dnsPolicy(dnsPolicy.let(DnsPolicy::unwrap))
    }

    /**
     * @param jobDefinitionName The name of this job definition.
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container.
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters)
    }

    /**
     * @param retryAttempts The number of times to retry a job.
     * The job is retried on failure the same number of attempts as the value.
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    override fun retryStrategies(retryStrategies: List<RetryStrategy>) {
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy::unwrap))
    }

    /**
     * @param retryStrategies Defines the retry behavior for this job.
     */
    override fun retryStrategies(vararg retryStrategies: RetryStrategy): Unit =
        retryStrategies(retryStrategies.toList())

    /**
     * @param schedulingPriority The priority of this Job.
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     */
    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * @param serviceAccount The name of the service account that's used to run the container.
     * service accounts are Kubernetes method of identification and authentication,
     * roughly analogous to IAM users.
     */
    override fun serviceAccount(serviceAccount: String) {
      cdkBuilder.serviceAccount(serviceAccount)
    }

    /**
     * @param timeout The timeout time for jobs that are submitted with this job definition.
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration::unwrap))
    }

    /**
     * @param useHostNetwork If specified, the Pod used by this Job Definition will use the host's
     * network IP address.
     * Otherwise, the Kubernetes pod networking model is enabled.
     * Most AWS Batch workloads are egress-only and don't require the overhead of IP allocation for
     * each pod for incoming connections.
     */
    override fun useHostNetwork(useHostNetwork: Boolean) {
      cdkBuilder.useHostNetwork(useHostNetwork)
    }

    public fun build(): software.amazon.awscdk.services.batch.EksJobDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.batch.EksJobDefinitionProps,
  ) : CdkObject(cdkObject), EksJobDefinitionProps {
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
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     */
    override fun jobDefinitionName(): String? = unwrap(this).getJobDefinitionName()

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
        unwrap(this).getRetryStrategies()?.map(RetryStrategy::wrap) ?: emptyList()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): EksJobDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksJobDefinitionProps):
        EksJobDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EksJobDefinitionProps):
        software.amazon.awscdk.services.batch.EksJobDefinitionProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.batch.EksJobDefinitionProps
  }
}
