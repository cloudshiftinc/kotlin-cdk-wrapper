package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class AuroraEngineVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.AuroraEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "5.6.mysql_aurora.1.78.3.6".
   */
  public open fun auroraFullVersion(): String = unwrap(this).getAuroraFullVersion()

  /**
   * The major version of the engine.
   *
   * Currently, it's always "5.6".
   */
  public open fun auroraMajorVersion(): String = unwrap(this).getAuroraMajorVersion()

  public companion object {
    public val VER_1_17_9: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_17_9)

    public val VER_1_19_0: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_19_0)

    public val VER_1_19_1: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_19_1)

    public val VER_1_19_2: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_19_2)

    public val VER_1_19_5: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_19_5)

    public val VER_1_19_6: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_19_6)

    public val VER_1_20_0: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_20_0)

    public val VER_1_20_1: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_20_1)

    public val VER_1_21_0: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_21_0)

    public val VER_1_22_0: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_0)

    public val VER_1_22_1: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_1)

    public val VER_1_22_1_3: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_1_3)

    public val VER_1_22_2: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_2)

    public val VER_1_22_3: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_3)

    public val VER_1_22_4: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_4)

    public val VER_1_22_5: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_22_5)

    public val VER_1_23_0: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_23_0)

    public val VER_1_23_1: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_23_1)

    public val VER_1_23_2: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_23_2)

    public val VER_1_23_3: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_23_3)

    public val VER_1_23_4: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_1_23_4)

    public val VER_10_A: AuroraEngineVersion =
        AuroraEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraEngineVersion.VER_10_A)

    public fun of(auroraFullVersion: String): AuroraEngineVersion =
        software.amazon.awscdk.services.rds.AuroraEngineVersion.of(auroraFullVersion).let(AuroraEngineVersion::wrap)

    public fun of(auroraFullVersion: String, auroraMajorVersion: String): AuroraEngineVersion =
        software.amazon.awscdk.services.rds.AuroraEngineVersion.of(auroraFullVersion,
        auroraMajorVersion).let(AuroraEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraEngineVersion):
        AuroraEngineVersion = AuroraEngineVersion(cdkObject)

    internal fun unwrap(wrapped: AuroraEngineVersion):
        software.amazon.awscdk.services.rds.AuroraEngineVersion = wrapped.cdkObject
  }
}
