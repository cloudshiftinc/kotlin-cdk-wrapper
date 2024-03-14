package io.cloudshiftdev.awscdk.services.eks

import kotlin.Boolean
import kotlin.String

public open class AlbControllerVersion internal constructor(
  private val cdkObject: software.amazon.awscdk.services.eks.AlbControllerVersion,
) {
  public open fun custom(): Boolean = unwrap(this).getCustom()

  public open fun helmChartVersion(): String = unwrap(this).getHelmChartVersion()

  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public open fun of(version: String): AlbControllerVersion =
        software.amazon.awscdk.services.eks.AlbControllerVersion.of(version).let(AlbControllerVersion::wrap)

    public open fun of(version: String, helmChartVersion: String): AlbControllerVersion =
        software.amazon.awscdk.services.eks.AlbControllerVersion.of(version,
        helmChartVersion).let(AlbControllerVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerVersion):
        AlbControllerVersion = AlbControllerVersion(cdkObject)

    internal fun unwrap(wrapped: AlbControllerVersion):
        software.amazon.awscdk.services.eks.AlbControllerVersion = wrapped.cdkObject
  }
}
