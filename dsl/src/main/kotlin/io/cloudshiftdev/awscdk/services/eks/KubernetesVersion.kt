package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class KubernetesVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.KubernetesVersion,
) : CdkObject(cdkObject) {
  /**
   * cluster version number.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public fun of(version: String): KubernetesVersion =
        software.amazon.awscdk.services.eks.KubernetesVersion.of(version).let(KubernetesVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesVersion):
        KubernetesVersion = KubernetesVersion(cdkObject)

    internal fun unwrap(wrapped: KubernetesVersion):
        software.amazon.awscdk.services.eks.KubernetesVersion = wrapped.cdkObject
  }
}
