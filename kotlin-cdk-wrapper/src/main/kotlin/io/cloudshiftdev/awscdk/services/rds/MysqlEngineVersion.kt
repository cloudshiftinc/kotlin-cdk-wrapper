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
 * DatabaseInstance iopsInstance = DatabaseInstance.Builder.create(this, "IopsInstance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .storageType(StorageType.IO1)
 * .iops(5000)
 * .build();
 * DatabaseInstance gp3Instance = DatabaseInstance.Builder.create(this, "Gp3Instance")
 * .engine(DatabaseInstanceEngine.mysql(MySqlInstanceEngineProps.builder().version(MysqlEngineVersion.VER_8_0_30).build()))
 * .vpc(vpc)
 * .allocatedStorage(500)
 * .storageType(StorageType.GP3)
 * .storageThroughput(500)
 * .build();
 * ```
 */
public open class MysqlEngineVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.MysqlEngineVersion,
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

    public fun of(mysqlFullVersion: String, mysqlMajorVersion: String): MysqlEngineVersion =
        software.amazon.awscdk.services.rds.MysqlEngineVersion.of(mysqlFullVersion,
        mysqlMajorVersion).let(MysqlEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MysqlEngineVersion):
        MysqlEngineVersion = MysqlEngineVersion(cdkObject)

    internal fun unwrap(wrapped: MysqlEngineVersion):
        software.amazon.awscdk.services.rds.MysqlEngineVersion = wrapped.cdkObject
  }
}
