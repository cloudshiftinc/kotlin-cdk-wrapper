@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The versions for the MySQL instance engines (those returned by `DatabaseInstanceEngine.mysql`).
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * Key kmsKey;
 * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_39).build()))
 * .instanceType(InstanceType.of(InstanceClass.R7G, InstanceSize.LARGE))
 * .vpc(vpc)
 * .enablePerformanceInsights(true)
 * .performanceInsightRetention(PerformanceInsightRetention.LONG_TERM)
 * .performanceInsightEncryptionKey(kmsKey)
 * .build();
 * ```
 */
public open class MysqlEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.MysqlEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "10.5.28".
   */
  public open fun mysqlFullVersion(): String = unwrap(this).getMysqlFullVersion()

  /**
   * The major version of the engine, for example, "10.5".
   */
  public open fun mysqlMajorVersion(): String = unwrap(this).getMysqlMajorVersion()

  public companion object {
    public val VER_5_5_54: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_5_54)

    public val VER_5_7: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7)

    public val VER_5_7_16: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_16)

    public val VER_5_7_17: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_17)

    public val VER_5_7_19: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_19)

    public val VER_5_7_21: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_21)

    public val VER_5_7_22: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_22)

    public val VER_5_7_23: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_23)

    public val VER_5_7_24: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_24)

    public val VER_5_7_25: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_25)

    public val VER_5_7_26: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_26)

    public val VER_5_7_28: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_28)

    public val VER_5_7_30: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_30)

    public val VER_5_7_31: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_31)

    public val VER_5_7_33: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_33)

    public val VER_5_7_34: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_34)

    public val VER_5_7_35: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_35)

    public val VER_5_7_36: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_36)

    public val VER_5_7_37: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_37)

    public val VER_5_7_38: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_38)

    public val VER_5_7_39: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_39)

    public val VER_5_7_40: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_40)

    public val VER_5_7_41: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_41)

    public val VER_5_7_42: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_42)

    public val VER_5_7_43: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_43)

    public val VER_5_7_44: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44)

    public val VER_5_7_44_RDS_20240408: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44_RDS_20240408)

    public val VER_5_7_44_RDS_20240529: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44_RDS_20240529)

    public val VER_5_7_44_RDS_20240808: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44_RDS_20240808)

    public val VER_5_7_44_RDS_20250103: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44_RDS_20250103)

    public val VER_5_7_44_RDS_20250213: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44_RDS_20250213)

    public val VER_5_7_44_RDS_20250508: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_5_7_44_RDS_20250508)

    public val VER_8_0: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0)

    public val VER_8_0_11: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_11)

    public val VER_8_0_13: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_13)

    public val VER_8_0_15: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_15)

    public val VER_8_0_16: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_16)

    public val VER_8_0_17: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_17)

    public val VER_8_0_19: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_19)

    public val VER_8_0_20: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_20)

    public val VER_8_0_21: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_21)

    public val VER_8_0_23: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_23)

    public val VER_8_0_25: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_25)

    public val VER_8_0_26: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_26)

    public val VER_8_0_27: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_27)

    public val VER_8_0_28: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_28)

    public val VER_8_0_29: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_29)

    public val VER_8_0_30: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_30)

    public val VER_8_0_31: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_31)

    public val VER_8_0_32: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_32)

    public val VER_8_0_33: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_33)

    public val VER_8_0_34: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_34)

    public val VER_8_0_35: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_35)

    public val VER_8_0_36: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_36)

    public val VER_8_0_37: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_37)

    public val VER_8_0_39: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_39)

    public val VER_8_0_40: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_40)

    public val VER_8_0_41: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_41)

    public val VER_8_0_42: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_0_42)

    public val VER_8_4_3: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_4_3)

    public val VER_8_4_4: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_4_4)

    public val VER_8_4_5: MysqlEngineVersion =
        MysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.MysqlEngineVersion.VER_8_4_5)

    public fun of(mysqlFullVersion: String, mysqlMajorVersion: String): MysqlEngineVersion =
        software.amazon.awscdk.services.rds.MysqlEngineVersion.of(mysqlFullVersion,
        mysqlMajorVersion).let(MysqlEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MysqlEngineVersion):
        MysqlEngineVersion = MysqlEngineVersion(cdkObject)

    internal fun unwrap(wrapped: MysqlEngineVersion):
        software.amazon.awscdk.services.rds.MysqlEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.MysqlEngineVersion
  }
}
