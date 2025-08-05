@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A JobDefinition that uses Eks orchestration.
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
public open class EksJobDefinition(
  cdkObject: software.amazon.awscdk.services.batch.EksJobDefinition,
) : Resource(cdkObject),
    IEksJobDefinition,
    IJobDefinition {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EksJobDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.batch.EksJobDefinition(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(EksJobDefinitionProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: EksJobDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, EksJobDefinitionProps(props)
  )

  /**
   * Add a RetryStrategy to this JobDefinition.
   *
   * @param strategy 
   */
  public override fun addRetryStrategy(strategy: RetryStrategy) {
    unwrap(this).addRetryStrategy(strategy.let(RetryStrategy.Companion::unwrap))
  }

  /**
   * The container this Job Definition will run.
   */
  public override fun container(): EksContainerDefinition =
      unwrap(this).getContainer().let(EksContainerDefinition::wrap)

  /**
   * The DNS Policy of the pod used by this Job Definition.
   */
  public override fun dnsPolicy(): DnsPolicy? = unwrap(this).getDnsPolicy()?.let(DnsPolicy::wrap)

  /**
   * The ARN of this job definition.
   */
  public override fun jobDefinitionArn(): String = unwrap(this).getJobDefinitionArn()

  /**
   * The name of this job definition.
   */
  public override fun jobDefinitionName(): String = unwrap(this).getJobDefinitionName()

  /**
   * The default parameters passed to the container These parameters can be referenced in the
   * `command` that you give to the container.
   */
  public override fun parameters(): Map<String, Any> = unwrap(this).getParameters() ?: emptyMap()

  /**
   * The number of times to retry a job.
   *
   * The job is retried on failure the same number of attempts as the value.
   */
  public override fun retryAttempts(): Number? = unwrap(this).getRetryAttempts()

  /**
   * Defines the retry behavior for this job.
   */
  public override fun retryStrategies(): List<RetryStrategy> =
      unwrap(this).getRetryStrategies().map(RetryStrategy::wrap)

  /**
   * The priority of this Job.
   *
   * Only used in Fairshare Scheduling
   * to decide which job to run first when there are multiple jobs
   * with the same share identifier.
   */
  public override fun schedulingPriority(): Number? = unwrap(this).getSchedulingPriority()

  /**
   * The name of the service account that's used to run the container.
   *
   * service accounts are Kubernetes method of identification and authentication,
   * roughly analogous to IAM users.
   */
  public override fun serviceAccount(): String? = unwrap(this).getServiceAccount()

  /**
   * The timeout time for jobs that are submitted with this job definition.
   *
   * After the amount of time you specify passes,
   * Batch terminates your jobs if they aren't finished.
   */
  public override fun timeout(): Duration? = unwrap(this).getTimeout()?.let(Duration::wrap)

  /**
   * If specified, the Pod used by this Job Definition will use the host's network IP address.
   *
   * Otherwise, the Kubernetes pod networking model is enabled.
   * Most AWS Batch workloads are egress-only and don't require the overhead of IP allocation for
   * each pod for incoming connections.
   */
  public override fun useHostNetwork(): Boolean? = unwrap(this).getUseHostNetwork()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.batch.EksJobDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The container this Job Definition will run.
     *
     * @param container The container this Job Definition will run. 
     */
    public fun container(container: EksContainerDefinition)

    /**
     * The DNS Policy of the pod used by this Job Definition.
     *
     * Default: `DnsPolicy.CLUSTER_FIRST`
     *
     * [Documentation](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
     * @param dnsPolicy The DNS Policy of the pod used by this Job Definition. 
     */
    public fun dnsPolicy(dnsPolicy: DnsPolicy)

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     *
     * @param jobDefinitionName The name of this job definition. 
     */
    public fun jobDefinitionName(jobDefinitionName: String)

    /**
     * The default parameters passed to the container These parameters can be referenced in the
     * `command` that you give to the container.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container. 
     */
    public fun parameters(parameters: Map<String, Any>)

    /**
     * The number of times to retry a job.
     *
     * The job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     *
     * @param retryAttempts The number of times to retry a job. 
     */
    public fun retryAttempts(retryAttempts: Number)

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    public fun retryStrategies(retryStrategies: List<RetryStrategy>)

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    public fun retryStrategies(vararg retryStrategies: RetryStrategy)

    /**
     * The priority of this Job.
     *
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     *
     * Default: none
     *
     * @param schedulingPriority The priority of this Job. 
     */
    public fun schedulingPriority(schedulingPriority: Number)

    /**
     * The name of the service account that's used to run the container.
     *
     * service accounts are Kubernetes method of identification and authentication,
     * roughly analogous to IAM users.
     *
     * Default: - the default service account of the container
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html)
     * @param serviceAccount The name of the service account that's used to run the container. 
     */
    public fun serviceAccount(serviceAccount: String)

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     *
     * Default: - no timeout
     *
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    public fun timeout(timeout: Duration)

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
     * @param useHostNetwork If specified, the Pod used by this Job Definition will use the host's
     * network IP address. 
     */
    public fun useHostNetwork(useHostNetwork: Boolean)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.EksJobDefinition.Builder =
        software.amazon.awscdk.services.batch.EksJobDefinition.Builder.create(scope, id)

    /**
     * The container this Job Definition will run.
     *
     * @param container The container this Job Definition will run. 
     */
    override fun container(container: EksContainerDefinition) {
      cdkBuilder.container(container.let(EksContainerDefinition.Companion::unwrap))
    }

    /**
     * The DNS Policy of the pod used by this Job Definition.
     *
     * Default: `DnsPolicy.CLUSTER_FIRST`
     *
     * [Documentation](https://kubernetes.io/docs/concepts/services-networking/dns-pod-service/#pod-s-dns-policy)
     * @param dnsPolicy The DNS Policy of the pod used by this Job Definition. 
     */
    override fun dnsPolicy(dnsPolicy: DnsPolicy) {
      cdkBuilder.dnsPolicy(dnsPolicy.let(DnsPolicy.Companion::unwrap))
    }

    /**
     * The name of this job definition.
     *
     * Default: - generated by CloudFormation
     *
     * @param jobDefinitionName The name of this job definition. 
     */
    override fun jobDefinitionName(jobDefinitionName: String) {
      cdkBuilder.jobDefinitionName(jobDefinitionName)
    }

    /**
     * The default parameters passed to the container These parameters can be referenced in the
     * `command` that you give to the container.
     *
     * Default: none
     *
     * [Documentation](https://docs.aws.amazon.com/batch/latest/userguide/job_definition_parameters.html#parameters)
     * @param parameters The default parameters passed to the container These parameters can be
     * referenced in the `command` that you give to the container. 
     */
    override fun parameters(parameters: Map<String, Any>) {
      cdkBuilder.parameters(parameters.mapValues{CdkObjectWrappers.unwrap(it.value)})
    }

    /**
     * The number of times to retry a job.
     *
     * The job is retried on failure the same number of attempts as the value.
     *
     * Default: 1
     *
     * @param retryAttempts The number of times to retry a job. 
     */
    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    override fun retryStrategies(retryStrategies: List<RetryStrategy>) {
      cdkBuilder.retryStrategies(retryStrategies.map(RetryStrategy.Companion::unwrap))
    }

    /**
     * Defines the retry behavior for this job.
     *
     * Default: - no `RetryStrategy`
     *
     * @param retryStrategies Defines the retry behavior for this job. 
     */
    override fun retryStrategies(vararg retryStrategies: RetryStrategy): Unit =
        retryStrategies(retryStrategies.toList())

    /**
     * The priority of this Job.
     *
     * Only used in Fairshare Scheduling
     * to decide which job to run first when there are multiple jobs
     * with the same share identifier.
     *
     * Default: none
     *
     * @param schedulingPriority The priority of this Job. 
     */
    override fun schedulingPriority(schedulingPriority: Number) {
      cdkBuilder.schedulingPriority(schedulingPriority)
    }

    /**
     * The name of the service account that's used to run the container.
     *
     * service accounts are Kubernetes method of identification and authentication,
     * roughly analogous to IAM users.
     *
     * Default: - the default service account of the container
     *
     * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/associate-service-account-role.html)
     * @param serviceAccount The name of the service account that's used to run the container. 
     */
    override fun serviceAccount(serviceAccount: String) {
      cdkBuilder.serviceAccount(serviceAccount)
    }

    /**
     * The timeout time for jobs that are submitted with this job definition.
     *
     * After the amount of time you specify passes,
     * Batch terminates your jobs if they aren't finished.
     *
     * Default: - no timeout
     *
     * @param timeout The timeout time for jobs that are submitted with this job definition. 
     */
    override fun timeout(timeout: Duration) {
      cdkBuilder.timeout(timeout.let(Duration.Companion::unwrap))
    }

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
     * @param useHostNetwork If specified, the Pod used by this Job Definition will use the host's
     * network IP address. 
     */
    override fun useHostNetwork(useHostNetwork: Boolean) {
      cdkBuilder.useHostNetwork(useHostNetwork)
    }

    public fun build(): software.amazon.awscdk.services.batch.EksJobDefinition = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.batch.EksJobDefinition.PROPERTY_INJECTION_ID

    public fun fromEksJobDefinitionArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      eksJobDefinitionArn: String,
    ): IEksJobDefinition =
        software.amazon.awscdk.services.batch.EksJobDefinition.fromEksJobDefinitionArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, eksJobDefinitionArn).let(IEksJobDefinition::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): EksJobDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return EksJobDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.EksJobDefinition):
        EksJobDefinition = EksJobDefinition(cdkObject)

    internal fun unwrap(wrapped: EksJobDefinition):
        software.amazon.awscdk.services.batch.EksJobDefinition = wrapped.cdkObject as
        software.amazon.awscdk.services.batch.EksJobDefinition
  }
}
