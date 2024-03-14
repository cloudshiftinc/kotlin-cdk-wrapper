package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class MariaDbEngineVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.MariaDbEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "10.5.28".
   */
  public open fun mariaDbFullVersion(): String = unwrap(this).getMariaDbFullVersion()

  /**
   * The major version of the engine, for example, "10.5".
   */
  public open fun mariaDbMajorVersion(): String = unwrap(this).getMariaDbMajorVersion()

  public companion object {
    public val VER_10_11: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_11)

    public val VER_10_11_4: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_11_4)

    public val VER_10_11_5: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_11_5)

    public val VER_10_11_6: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_11_6)

    public val VER_10_2: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2)

    public val VER_10_2_11: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_11)

    public val VER_10_2_12: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_12)

    public val VER_10_2_15: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_15)

    public val VER_10_2_21: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_21)

    public val VER_10_2_32: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_32)

    public val VER_10_2_37: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_37)

    public val VER_10_2_39: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_39)

    public val VER_10_2_40: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_40)

    public val VER_10_2_41: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_2_41)

    public val VER_10_3: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3)

    public val VER_10_3_13: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_13)

    public val VER_10_3_20: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_20)

    public val VER_10_3_23: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_23)

    public val VER_10_3_28: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_28)

    public val VER_10_3_31: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_31)

    public val VER_10_3_32: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_32)

    public val VER_10_3_34: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_34)

    public val VER_10_3_35: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_35)

    public val VER_10_3_36: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_36)

    public val VER_10_3_37: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_37)

    public val VER_10_3_38: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_38)

    public val VER_10_3_39: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_39)

    public val VER_10_3_8: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_3_8)

    public val VER_10_4: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4)

    public val VER_10_4_13: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_13)

    public val VER_10_4_18: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_18)

    public val VER_10_4_21: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_21)

    public val VER_10_4_22: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_22)

    public val VER_10_4_24: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_24)

    public val VER_10_4_25: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_25)

    public val VER_10_4_26: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_26)

    public val VER_10_4_27: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_27)

    public val VER_10_4_28: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_28)

    public val VER_10_4_29: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_29)

    public val VER_10_4_30: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_30)

    public val VER_10_4_31: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_31)

    public val VER_10_4_32: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_32)

    public val VER_10_4_8: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_4_8)

    public val VER_10_5: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5)

    public val VER_10_5_12: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_12)

    public val VER_10_5_13: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_13)

    public val VER_10_5_15: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_15)

    public val VER_10_5_16: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_16)

    public val VER_10_5_17: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_17)

    public val VER_10_5_18: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_18)

    public val VER_10_5_19: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_19)

    public val VER_10_5_20: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_20)

    public val VER_10_5_21: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_21)

    public val VER_10_5_22: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_22)

    public val VER_10_5_23: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_23)

    public val VER_10_5_8: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_8)

    public val VER_10_5_9: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_5_9)

    public val VER_10_6: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6)

    public val VER_10_6_10: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_10)

    public val VER_10_6_11: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_11)

    public val VER_10_6_12: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_12)

    public val VER_10_6_13: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_13)

    public val VER_10_6_14: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_14)

    public val VER_10_6_15: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_15)

    public val VER_10_6_16: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_16)

    public val VER_10_6_5: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_5)

    public val VER_10_6_7: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_7)

    public val VER_10_6_8: MariaDbEngineVersion =
        MariaDbEngineVersion.wrap(software.amazon.awscdk.services.rds.MariaDbEngineVersion.VER_10_6_8)

    public fun of(mariaDbFullVersion: String, mariaDbMajorVersion: String): MariaDbEngineVersion =
        software.amazon.awscdk.services.rds.MariaDbEngineVersion.of(mariaDbFullVersion,
        mariaDbMajorVersion).let(MariaDbEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MariaDbEngineVersion):
        MariaDbEngineVersion = MariaDbEngineVersion(cdkObject)

    internal fun unwrap(wrapped: MariaDbEngineVersion):
        software.amazon.awscdk.services.rds.MariaDbEngineVersion = wrapped.cdkObject
  }
}
