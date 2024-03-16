@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String

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

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.IEksJobDefinition):
        IEksJobDefinition = CdkObjectWrappers.wrap(cdkObject) as IEksJobDefinition

    internal fun unwrap(wrapped: IEksJobDefinition):
        software.amazon.awscdk.services.batch.IEksJobDefinition = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.batch.IEksJobDefinition
  }
}
