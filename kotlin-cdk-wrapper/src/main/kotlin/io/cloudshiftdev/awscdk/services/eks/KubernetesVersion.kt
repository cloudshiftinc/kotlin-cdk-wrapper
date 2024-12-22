@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Kubernetes cluster version.
 *
 * Example:
 *
 * ```
 * // or
 * Vpc vpc;
 * Cluster.Builder.create(this, "MyCluster")
 * .kubectlMemory(Size.gibibytes(4))
 * .version(KubernetesVersion.V1_31)
 * .build();
 * Cluster.fromClusterAttributes(this, "MyCluster", ClusterAttributes.builder()
 * .kubectlMemory(Size.gibibytes(4))
 * .vpc(vpc)
 * .clusterName("cluster-name")
 * .build());
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/kubernetes-versions.html#kubernetes-release-calendar)
 */
public open class KubernetesVersion(
  cdkObject: software.amazon.awscdk.services.eks.KubernetesVersion,
) : CdkObject(cdkObject) {
  /**
   * cluster version number.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val V1_14: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_14)

    public val V1_15: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_15)

    public val V1_16: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_16)

    public val V1_17: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_17)

    public val V1_18: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_18)

    public val V1_19: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_19)

    public val V1_20: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_20)

    public val V1_21: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_21)

    public val V1_22: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_22)

    public val V1_23: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_23)

    public val V1_24: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_24)

    public val V1_25: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_25)

    public val V1_26: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_26)

    public val V1_27: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_27)

    public val V1_28: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_28)

    public val V1_29: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_29)

    public val V1_30: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_30)

    public val V1_31: KubernetesVersion =
        KubernetesVersion.wrap(software.amazon.awscdk.services.eks.KubernetesVersion.V1_31)

    public fun of(version: String): KubernetesVersion =
        software.amazon.awscdk.services.eks.KubernetesVersion.of(version).let(KubernetesVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesVersion):
        KubernetesVersion = KubernetesVersion(cdkObject)

    internal fun unwrap(wrapped: KubernetesVersion):
        software.amazon.awscdk.services.eks.KubernetesVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.eks.KubernetesVersion
  }
}
