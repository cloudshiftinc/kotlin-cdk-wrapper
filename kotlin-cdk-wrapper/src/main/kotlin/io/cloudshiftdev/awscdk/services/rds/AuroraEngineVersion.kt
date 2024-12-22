@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Deprecated
import kotlin.String

/**
 * (deprecated) The versions for the Aurora cluster engine (those returned by
 * `DatabaseClusterEngine.aurora`).
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseClusterFromSnapshot.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.aurora(AuroraClusterEngineProps.builder().version(AuroraEngineVersion.VER_1_22_2).build()))
 * .writer(ClusterInstance.provisioned("writer"))
 * .vpc(vpc)
 * .snapshotIdentifier("mySnapshot")
 * .build();
 * ```
 *
 * @deprecated use `AuroraMysqlEngineVersion` instead
 */
public open class AuroraEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.AuroraEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * (deprecated) The full version string, for example, "5.6.mysql_aurora.1.78.3.6".
   */
  @Deprecated(message = "deprecated in CDK")
  public open fun auroraFullVersion(): String = unwrap(this).getAuroraFullVersion()

  /**
   * (deprecated) The major version of the engine.
   *
   * Currently, it's always "5.6".
   */
  @Deprecated(message = "deprecated in CDK")
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

    @Deprecated(message = "deprecated in CDK")
    public fun of(auroraFullVersion: String): AuroraEngineVersion =
        software.amazon.awscdk.services.rds.AuroraEngineVersion.of(auroraFullVersion).let(AuroraEngineVersion::wrap)

    @Deprecated(message = "deprecated in CDK")
    public fun of(auroraFullVersion: String, auroraMajorVersion: String): AuroraEngineVersion =
        software.amazon.awscdk.services.rds.AuroraEngineVersion.of(auroraFullVersion,
        auroraMajorVersion).let(AuroraEngineVersion::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraEngineVersion):
        AuroraEngineVersion = AuroraEngineVersion(cdkObject)

    internal fun unwrap(wrapped: AuroraEngineVersion):
        software.amazon.awscdk.services.rds.AuroraEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.AuroraEngineVersion
  }
}
