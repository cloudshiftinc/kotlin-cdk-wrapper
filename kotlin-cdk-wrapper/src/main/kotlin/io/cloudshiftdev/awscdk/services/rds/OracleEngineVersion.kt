@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The versions for the Oracle instance engines.
 *
 * Those returned by the following list.
 *
 * * `DatabaseInstanceEngine.oracleSe2`
 * * `DatabaseInstanceEngine.oracleSe2Cdb`
 * * `DatabaseInstanceEngine.oracleEe`
 * * `DatabaseInstanceEngine.oracleEeCdb`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseInstance instance = DatabaseInstance.Builder.create(this, "Instance")
 * .engine(DatabaseInstanceEngine.oracleSe2(OracleSe2InstanceEngineProps.builder().version(OracleEngineVersion.VER_19_0_0_0_2020_04_R1).build()))
 * // optional, defaults to m5.large
 * .instanceType(InstanceType.of(InstanceClass.BURSTABLE3, InstanceSize.SMALL))
 * .credentials(Credentials.fromGeneratedSecret("syscdk")) // Optional - will default to 'admin'
 * username and generated password
 * .vpc(vpc)
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build())
 * .build();
 * ```
 */
public open class OracleEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.OracleEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "19.0.0.0.ru-2019-10.rur-2019-10.r1".
   */
  public open fun oracleFullVersion(): String = unwrap(this).getOracleFullVersion()

  /**
   * The major version of the engine, for example, "19".
   */
  public open fun oracleMajorVersion(): String = unwrap(this).getOracleMajorVersion()

  public companion object {
    public val VER_12_1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1)

    public val VER_12_1_0_2_V1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V1)

    public val VER_12_1_0_2_V10: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V10)

    public val VER_12_1_0_2_V11: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V11)

    public val VER_12_1_0_2_V12: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V12)

    public val VER_12_1_0_2_V13: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V13)

    public val VER_12_1_0_2_V14: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V14)

    public val VER_12_1_0_2_V15: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V15)

    public val VER_12_1_0_2_V16: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V16)

    public val VER_12_1_0_2_V17: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V17)

    public val VER_12_1_0_2_V18: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V18)

    public val VER_12_1_0_2_V19: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V19)

    public val VER_12_1_0_2_V2: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V2)

    public val VER_12_1_0_2_V20: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V20)

    public val VER_12_1_0_2_V21: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V21)

    public val VER_12_1_0_2_V22: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V22)

    public val VER_12_1_0_2_V23: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V23)

    public val VER_12_1_0_2_V24: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V24)

    public val VER_12_1_0_2_V25: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V25)

    public val VER_12_1_0_2_V26: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V26)

    public val VER_12_1_0_2_V27: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V27)

    public val VER_12_1_0_2_V28: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V28)

    public val VER_12_1_0_2_V29: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V29)

    public val VER_12_1_0_2_V3: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V3)

    public val VER_12_1_0_2_V4: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V4)

    public val VER_12_1_0_2_V5: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V5)

    public val VER_12_1_0_2_V6: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V6)

    public val VER_12_1_0_2_V7: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V7)

    public val VER_12_1_0_2_V8: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V8)

    public val VER_12_1_0_2_V9: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_1_0_2_V9)

    public val VER_12_2: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2)

    public val VER_12_2_0_1_2018_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2018_10_R1)

    public val VER_12_2_0_1_2019_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2019_01_R1)

    public val VER_12_2_0_1_2019_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2019_04_R1)

    public val VER_12_2_0_1_2019_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2019_07_R1)

    public val VER_12_2_0_1_2019_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2019_10_R1)

    public val VER_12_2_0_1_2020_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2020_01_R1)

    public val VER_12_2_0_1_2020_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2020_04_R1)

    public val VER_12_2_0_1_2020_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2020_07_R1)

    public val VER_12_2_0_1_2020_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2020_10_R1)

    public val VER_12_2_0_1_2021_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2021_01_R1)

    public val VER_12_2_0_1_2021_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2021_04_R1)

    public val VER_12_2_0_1_2021_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2021_07_R1)

    public val VER_12_2_0_1_2021_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2021_10_R1)

    public val VER_12_2_0_1_2022_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_12_2_0_1_2022_01_R1)

    public val VER_18: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18)

    public val VER_18_0_0_0_2019_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2019_07_R1)

    public val VER_18_0_0_0_2019_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2019_10_R1)

    public val VER_18_0_0_0_2020_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2020_01_R1)

    public val VER_18_0_0_0_2020_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2020_04_R1)

    public val VER_18_0_0_0_2020_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2020_07_R1)

    public val VER_18_0_0_0_2020_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2020_10_R1)

    public val VER_18_0_0_0_2021_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2021_01_R1)

    public val VER_18_0_0_0_2021_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_18_0_0_0_2021_04_R1)

    public val VER_19: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19)

    public val VER_19_0_0_0_2019_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2019_07_R1)

    public val VER_19_0_0_0_2019_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2019_10_R1)

    public val VER_19_0_0_0_2020_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2020_01_R1)

    public val VER_19_0_0_0_2020_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2020_04_R1)

    public val VER_19_0_0_0_2020_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2020_07_R1)

    public val VER_19_0_0_0_2020_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2020_10_R1)

    public val VER_19_0_0_0_2021_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2021_01_R1)

    public val VER_19_0_0_0_2021_01_R2: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2021_01_R2)

    public val VER_19_0_0_0_2021_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2021_04_R1)

    public val VER_19_0_0_0_2021_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2021_07_R1)

    public val VER_19_0_0_0_2021_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2021_10_R1)

    public val VER_19_0_0_0_2022_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2022_01_R1)

    public val VER_19_0_0_0_2022_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2022_04_R1)

    public val VER_19_0_0_0_2022_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2022_07_R1)

    public val VER_19_0_0_0_2022_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2022_10_R1)

    public val VER_19_0_0_0_2023_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2023_01_R1)

    public val VER_19_0_0_0_2023_01_R2: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2023_01_R2)

    public val VER_19_0_0_0_2023_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2023_04_R1)

    public val VER_19_0_0_0_2023_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2023_07_R1)

    public val VER_19_0_0_0_2023_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2023_10_R1)

    public val VER_19_0_0_0_2024_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2024_01_R1)

    public val VER_19_0_0_0_2024_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2024_04_R1)

    public val VER_19_0_0_0_2024_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2024_07_R1)

    public val VER_19_0_0_0_2024_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_19_0_0_0_2024_10_R1)

    public val VER_21: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21)

    public val VER_21_0_0_0_2022_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2022_01_R1)

    public val VER_21_0_0_0_2022_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2022_04_R1)

    public val VER_21_0_0_0_2022_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2022_07_R1)

    public val VER_21_0_0_0_2022_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2022_10_R1)

    public val VER_21_0_0_0_2023_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2023_01_R1)

    public val VER_21_0_0_0_2023_01_R2: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2023_01_R2)

    public val VER_21_0_0_0_2023_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2023_04_R1)

    public val VER_21_0_0_0_2023_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2023_07_R1)

    public val VER_21_0_0_0_2023_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2023_10_R1)

    public val VER_21_0_0_0_2024_01_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2024_01_R1)

    public val VER_21_0_0_0_2024_04_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2024_04_R1)

    public val VER_21_0_0_0_2024_07_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2024_07_R1)

    public val VER_21_0_0_0_2024_10_R1: OracleEngineVersion =
        OracleEngineVersion.wrap(software.amazon.awscdk.services.rds.OracleEngineVersion.VER_21_0_0_0_2024_10_R1)

    public fun of(oracleFullVersion: String, oracleMajorVersion: String): OracleEngineVersion =
        software.amazon.awscdk.services.rds.OracleEngineVersion.of(oracleFullVersion,
        oracleMajorVersion).let(OracleEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OracleEngineVersion):
        OracleEngineVersion = OracleEngineVersion(cdkObject)

    internal fun unwrap(wrapped: OracleEngineVersion):
        software.amazon.awscdk.services.rds.OracleEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.OracleEngineVersion
  }
}
