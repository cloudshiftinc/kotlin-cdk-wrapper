@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * The versions for the Aurora MySQL cluster engine (those returned by
 * `DatabaseClusterEngine.auroraMysql`).
 *
 * https://docs.aws.amazon.com/AmazonRDS/latest/AuroraMySQLReleaseNotes/Welcome.html
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .caCertificate(CaCertificate.RDS_CA_RSA2048_G1)
 * .build()))
 * .readers(List.of(ClusterInstance.serverlessV2("reader",
 * ServerlessV2ClusterInstanceProps.builder()
 * .caCertificate(CaCertificate.of("custom-ca"))
 * .build())))
 * .vpc(vpc)
 * .build();
 * ```
 */
public open class AuroraMysqlEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "5.7.mysql_aurora.1.78.3.6".
   */
  public open fun auroraMysqlFullVersion(): String = unwrap(this).getAuroraMysqlFullVersion()

  /**
   * The major version of the engine.
   *
   * Currently, it's either "5.7", or "8.0".
   */
  public open fun auroraMysqlMajorVersion(): String = unwrap(this).getAuroraMysqlMajorVersion()

  public companion object {
    public val VER_2_02_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_02_3)

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

    public val VER_2_04_9: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_04_9)

    public val VER_2_05_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_05_0)

    public val VER_2_05_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_05_1)

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

    public val VER_2_11_5: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_5)

    public val VER_2_11_6: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_11_6)

    public val VER_2_12_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_0)

    public val VER_2_12_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_1)

    public val VER_2_12_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_2)

    public val VER_2_12_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_3)

    public val VER_2_12_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_4)

    public val VER_2_12_5: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_2_12_5)

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

    public val VER_3_03_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_03_2)

    public val VER_3_03_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_03_3)

    public val VER_3_04_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_0)

    public val VER_3_04_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_1)

    public val VER_3_04_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_2)

    public val VER_3_04_3: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_3)

    public val VER_3_04_4: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_04_4)

    public val VER_3_05_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_05_0)

    public val VER_3_05_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_05_1)

    public val VER_3_05_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_05_2)

    public val VER_3_06_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_06_0)

    public val VER_3_06_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_06_1)

    public val VER_3_07_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_07_0)

    public val VER_3_07_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_07_1)

    public val VER_3_08_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_08_0)

    public val VER_3_08_1: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_08_1)

    public val VER_3_08_2: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_08_2)

    public val VER_3_09_0: AuroraMysqlEngineVersion =
        AuroraMysqlEngineVersion.wrap(software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion.VER_3_09_0)

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
        software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.AuroraMysqlEngineVersion
  }
}
