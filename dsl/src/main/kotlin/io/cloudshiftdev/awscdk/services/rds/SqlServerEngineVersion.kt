package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import kotlin.String

public open class SqlServerEngineVersion internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.rds.SqlServerEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "15.00.3049.1.v1".
   */
  public open fun sqlServerFullVersion(): String = unwrap(this).getSqlServerFullVersion()

  /**
   * The major version of the engine, for example, "15.00".
   */
  public open fun sqlServerMajorVersion(): String = unwrap(this).getSqlServerMajorVersion()

  public companion object {
    public val VER_11: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_11)

    public val VER_11_00_5058_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_11_00_5058_0_V1)

    public val VER_11_00_6020_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_11_00_6020_0_V1)

    public val VER_11_00_6594_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_11_00_6594_0_V1)

    public val VER_11_00_7462_6_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_11_00_7462_6_V1)

    public val VER_11_00_7493_4_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_11_00_7493_4_V1)

    public val VER_12: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12)

    public val VER_12_00_5000_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_5000_0_V1)

    public val VER_12_00_5546_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_5546_0_V1)

    public val VER_12_00_5571_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_5571_0_V1)

    public val VER_12_00_6293_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_6293_0_V1)

    public val VER_12_00_6329_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_6329_1_V1)

    public val VER_12_00_6433_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_6433_1_V1)

    public val VER_12_00_6439_10_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_6439_10_V1)

    public val VER_12_00_6444_4_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_6444_4_V1)

    public val VER_12_00_6449_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_12_00_6449_1_V1)

    public val VER_13: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13)

    public val VER_13_00_2164_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_2164_0_V1)

    public val VER_13_00_4422_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_4422_0_V1)

    public val VER_13_00_4451_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_4451_0_V1)

    public val VER_13_00_4466_4_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_4466_4_V1)

    public val VER_13_00_4522_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_4522_0_V1)

    public val VER_13_00_5216_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5216_0_V1)

    public val VER_13_00_5292_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5292_0_V1)

    public val VER_13_00_5366_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5366_0_V1)

    public val VER_13_00_5426_0_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5426_0_V1)

    public val VER_13_00_5598_27_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5598_27_V1)

    public val VER_13_00_5820_21_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5820_21_V1)

    public val VER_13_00_5850_14_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5850_14_V1)

    public val VER_13_00_5882_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_5882_1_V1)

    public val VER_13_00_6300_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_6300_2_V1)

    public val VER_13_00_6419_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_6419_1_V1)

    public val VER_13_00_6430_49_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_6430_49_V1)

    public val VER_13_00_6435_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_13_00_6435_1_V1)

    public val VER_14: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14)

    public val VER_14_00_1000_169_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_1000_169_V1)

    public val VER_14_00_3015_40_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3015_40_V1)

    public val VER_14_00_3035_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3035_2_V1)

    public val VER_14_00_3049_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3049_1_V1)

    public val VER_14_00_3192_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3192_2_V1)

    public val VER_14_00_3223_3_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3223_3_V1)

    public val VER_14_00_3281_6_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3281_6_V1)

    public val VER_14_00_3294_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3294_2_V1)

    public val VER_14_00_3356_20_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3356_20_V1)

    public val VER_14_00_3381_3_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3381_3_V1)

    public val VER_14_00_3401_7_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3401_7_V1)

    public val VER_14_00_3421_10_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3421_10_V1)

    public val VER_14_00_3451_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3451_2_V1)

    public val VER_14_00_3460_9_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3460_9_V1)

    public val VER_14_00_3465_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_14_00_3465_1_V1)

    public val VER_15: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15)

    public val VER_15_00_4043_16_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4043_16_V1)

    public val VER_15_00_4073_23_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4073_23_V1)

    public val VER_15_00_4153_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4153_1_V1)

    public val VER_15_00_4198_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4198_2_V1)

    public val VER_15_00_4236_7_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4236_7_V1)

    public val VER_15_00_4312_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4312_2_V1)

    public val VER_15_00_4316_3_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4316_3_V1)

    public val VER_15_00_4322_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4322_2_V1)

    public val VER_15_00_4335_1_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4335_1_V1)

    public val VER_15_00_4345_5_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_15_00_4345_5_V1)

    public val VER_16: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_16)

    public val VER_16_00_4085_2_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_16_00_4085_2_V1)

    public val VER_16_00_4095_4_V1: SqlServerEngineVersion =
        SqlServerEngineVersion.wrap(software.amazon.awscdk.services.rds.SqlServerEngineVersion.VER_16_00_4095_4_V1)

    public fun of(sqlServerFullVersion: String, sqlServerMajorVersion: String):
        SqlServerEngineVersion =
        software.amazon.awscdk.services.rds.SqlServerEngineVersion.of(sqlServerFullVersion,
        sqlServerMajorVersion).let(SqlServerEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.SqlServerEngineVersion):
        SqlServerEngineVersion = SqlServerEngineVersion(cdkObject)

    internal fun unwrap(wrapped: SqlServerEngineVersion):
        software.amazon.awscdk.services.rds.SqlServerEngineVersion = wrapped.cdkObject
  }
}
