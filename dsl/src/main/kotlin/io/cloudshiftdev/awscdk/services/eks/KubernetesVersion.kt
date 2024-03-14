package io.cloudshiftdev.awscdk.services.eks

import kotlin.String

public open class KubernetesVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.KubernetesVersion,
) {
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public open fun of(version: String): KubernetesVersion =
        software.amazon.awscdk.services.eks.KubernetesVersion.of(version).let(KubernetesVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.KubernetesVersion):
        KubernetesVersion = KubernetesVersion(cdkObject)

    internal fun unwrap(wrapped: KubernetesVersion):
        software.amazon.awscdk.services.eks.KubernetesVersion = wrapped.cdkObject
  }
}
