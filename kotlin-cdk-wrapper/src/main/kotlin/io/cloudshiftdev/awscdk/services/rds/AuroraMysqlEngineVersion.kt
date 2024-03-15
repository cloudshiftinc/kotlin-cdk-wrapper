@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

public open class AuroraMysqlEngineVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion,
) : CdkObject(cdkObject) {
  public open fun auroraMysqlFullVersion(): String = unwrap(this).getAuroraMysqlFullVersion()

  public open fun auroraMysqlMajorVersion(): String = unwrap(this).getAuroraMysqlMajorVersion()

  public companion object {
    public val VER_2_03_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_03_2)

    public val VER_2_03_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_03_3)

    public val VER_2_03_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_03_4)

    public val VER_2_04_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_0)

    public val VER_2_04_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_1)

    public val VER_2_04_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_2)

    public val VER_2_04_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_3)

    public val VER_2_04_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_4)

    public val VER_2_04_5: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_5)

    public val VER_2_04_6: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_6)

    public val VER_2_04_7: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_7)

    public val VER_2_04_8: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_8)

    public val VER_2_05_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_05_0)

    public val VER_2_06_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_06_0)

    public val VER_2_07_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_0)

    public val VER_2_07_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_1)

    public val VER_2_07_10: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_10)

    public val VER_2_07_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_2)

    public val VER_2_07_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_3)

    public val VER_2_07_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_4)

    public val VER_2_07_5: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_5)

    public val VER_2_07_6: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_6)

    public val VER_2_07_7: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_7)

    public val VER_2_07_8: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_8)

    public val VER_2_07_9: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_07_9)

    public val VER_2_08_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_08_0)

    public val VER_2_08_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_08_1)

    public val VER_2_08_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_08_2)

    public val VER_2_08_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_08_3)

    public val VER_2_08_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_08_4)

    public val VER_2_09_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_09_0)

    public val VER_2_09_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_09_1)

    public val VER_2_09_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_09_2)

    public val VER_2_09_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_09_3)

    public val VER_2_10_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_10_0)

    public val VER_2_10_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_10_1)

    public val VER_2_10_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_10_2)

    public val VER_2_10_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_10_3)

    public val VER_2_11_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_0)

    public val VER_2_11_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_1)

    public val VER_2_11_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_2)

    public val VER_2_11_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_3)

    public val VER_2_11_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_4)

    public val VER_2_12_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_0)

    public val VER_3_01_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_01_0)

    public val VER_3_01_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_01_1)

    public val VER_3_02_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_02_0)

    public val VER_3_02_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_02_1)

    public val VER_3_02_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_02_2)

    public val VER_3_02_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_02_3)

    public val VER_3_03_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_03_0)

    public val VER_3_03_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_03_1)

    public val VER_3_04_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_0)

    public val VER_3_04_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_1)

    public val VER_3_05_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_05_0)

    public val VER_3_05_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_05_1)

    public val VER_3_05_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_05_2)

    public val VER_5_7_12: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_5_7_12)

    public fun of(auroraMysqlFullVersion: String): AuroraMysqlEngineVersion =
        software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.of(auroraMysqlFullVersion).let(AuroraMysqlEngineVersion::wrap)

    public fun of(auroraMysqlFullVersion: String, auroraMysqlMajorVersion: String):
        AuroraMysqlEngineVersion =
        software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.of(auroraMysqlFullVersion,
        auroraMysqlMajorVersion).let(AuroraMysqlEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion):
        AuroraMysqlEngineVersion = AuroraMysqlEngineVersion(cdkObject)

    internal fun unwrap(wrapped: AuroraMysqlEngineVersion):
        software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion = wrapped.cdkObject
  }
}
