package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.Boolean
import kotlin.String

public open class AlbControllerVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.AlbControllerVersion,
) : CdkObject(cdkObject) {
  /**
   * Whether or not its a custom version.
   */
  public open fun custom(): Boolean = unwrap(this).getCustom()

  /**
   * The version of the helm chart to use.
   */
  public open fun helmChartVersion(): String = unwrap(this).getHelmChartVersion()

  /**
   * The version string.
   */
  public open fun version(): String = unwrap(this).getVersion()

  public companion object {
    public val V2_0_0: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_0_0)

    public val V2_0_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_0_1)

    public val V2_1_0: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_1_0)

    public val V2_1_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_1_1)

    public val V2_1_2: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_1_2)

    public val V2_1_3: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_1_3)

    public val V2_2_0: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_2_0)

    public val V2_2_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_2_1)

    public val V2_2_2: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_2_2)

    public val V2_2_3: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_2_3)

    public val V2_2_4: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_2_4)

    public val V2_3_0: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_3_0)

    public val V2_3_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_3_1)

    public val V2_4_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_1)

    public val V2_4_2: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_2)

    public val V2_4_3: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_3)

    public val V2_4_4: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_4)

    public val V2_4_5: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_5)

    public val V2_4_6: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_6)

    public val V2_4_7: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_4_7)

    public val V2_5_0: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_5_0)

    public val V2_5_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_5_1)

    public val V2_5_2: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_5_2)

    public val V2_5_3: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_5_3)

    public val V2_5_4: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_5_4)

    public val V2_6_0: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_6_0)

    public val V2_6_1: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_6_1)

    public val V2_6_2: AlbControllerVersion =
        AlbControllerVersion.wrap(software.amazon.awscdk.services.eks.AlbControllerVersion.V2_6_2)

    public fun of(version: String): AlbControllerVersion =
        software.amazon.awscdk.services.eks.AlbControllerVersion.of(version).let(AlbControllerVersion::wrap)

    public fun of(version: String, helmChartVersion: String): AlbControllerVersion =
        software.amazon.awscdk.services.eks.AlbControllerVersion.of(version,
        helmChartVersion).let(AlbControllerVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AlbControllerVersion):
        AlbControllerVersion = AlbControllerVersion(cdkObject)

    internal fun unwrap(wrapped: AlbControllerVersion):
        software.amazon.awscdk.services.eks.AlbControllerVersion = wrapped.cdkObject
  }
}
