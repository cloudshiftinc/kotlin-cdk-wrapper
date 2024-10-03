@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The versions for the PostgreSQL instance engines (those returned by
 * `DatabaseInstanceEngine.postgres`).
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * IInstanceEngine engine =
 * DatabaseInstanceEngine.postgres(PostgresInstanceEngineProps.builder().version(PostgresEngineVersion.VER_16_3).build());
 * Key myKey = new Key(this, "MyKey");
 * DatabaseInstance.Builder.create(this, "InstanceWithCustomizedSecret")
 * .engine(engine)
 * .vpc(vpc)
 * .credentials(Credentials.fromGeneratedSecret("postgres", CredentialsBaseOptions.builder()
 * .secretName("my-cool-name")
 * .encryptionKey(myKey)
 * .excludeCharacters("!&amp;*^#&#64;()")
 * .replicaRegions(List.of(ReplicaRegion.builder().region("eu-west-1").build(),
 * ReplicaRegion.builder().region("eu-west-2").build()))
 * .build()))
 * .build();
 * ```
 */
public open class PostgresEngineVersion(
  cdkObject: software.amazon.awscdk.services.rds.PostgresEngineVersion,
) : CdkObject(cdkObject) {
  /**
   * The full version string, for example, "13.11".
   */
  public open fun postgresFullVersion(): String = unwrap(this).getPostgresFullVersion()

  /**
   * The major version of the engine, for example, "13".
   */
  public open fun postgresMajorVersion(): String = unwrap(this).getPostgresMajorVersion()

  public companion object {
    public val VER_10: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10)

    public val VER_10_1: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_1)

    public val VER_10_10: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_10)

    public val VER_10_11: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_11)

    public val VER_10_12: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_12)

    public val VER_10_13: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_13)

    public val VER_10_14: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_14)

    public val VER_10_15: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_15)

    public val VER_10_16: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_16)

    public val VER_10_17: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_17)

    public val VER_10_18: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_18)

    public val VER_10_19: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_19)

    public val VER_10_20: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_20)

    public val VER_10_21: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_21)

    public val VER_10_22: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_22)

    public val VER_10_23: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_23)

    public val VER_10_3: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_3)

    public val VER_10_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_4)

    public val VER_10_5: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_5)

    public val VER_10_6: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_6)

    public val VER_10_7: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_7)

    public val VER_10_9: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_10_9)

    public val VER_11: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11)

    public val VER_11_1: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_1)

    public val VER_11_10: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_10)

    public val VER_11_11: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_11)

    public val VER_11_12: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_12)

    public val VER_11_13: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_13)

    public val VER_11_14: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_14)

    public val VER_11_15: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_15)

    public val VER_11_16: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_16)

    public val VER_11_17: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_17)

    public val VER_11_18: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_18)

    public val VER_11_19: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_19)

    public val VER_11_2: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_2)

    public val VER_11_20: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_20)

    public val VER_11_21: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_21)

    public val VER_11_22: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_22)

    public val VER_11_22_RDS_20240418: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_22_RDS_20240418)

    public val VER_11_22_RDS_20240509: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_22_RDS_20240509)

    public val VER_11_22_RDS_20240808: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_22_RDS_20240808)

    public val VER_11_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_4)

    public val VER_11_5: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_5)

    public val VER_11_6: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_6)

    public val VER_11_7: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_7)

    public val VER_11_8: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_8)

    public val VER_11_9: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_11_9)

    public val VER_12: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12)

    public val VER_12_10: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_10)

    public val VER_12_11: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_11)

    public val VER_12_12: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_12)

    public val VER_12_13: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_13)

    public val VER_12_14: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_14)

    public val VER_12_15: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_15)

    public val VER_12_16: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_16)

    public val VER_12_17: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_17)

    public val VER_12_18: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_18)

    public val VER_12_19: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_19)

    public val VER_12_2: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_2)

    public val VER_12_20: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_20)

    public val VER_12_3: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_3)

    public val VER_12_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_4)

    public val VER_12_5: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_5)

    public val VER_12_6: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_6)

    public val VER_12_7: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_7)

    public val VER_12_8: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_8)

    public val VER_12_9: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_12_9)

    public val VER_13: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13)

    public val VER_13_1: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_1)

    public val VER_13_10: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_10)

    public val VER_13_11: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_11)

    public val VER_13_12: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_12)

    public val VER_13_13: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_13)

    public val VER_13_14: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_14)

    public val VER_13_15: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_15)

    public val VER_13_16: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_16)

    public val VER_13_2: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_2)

    public val VER_13_3: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_3)

    public val VER_13_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_4)

    public val VER_13_5: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_5)

    public val VER_13_6: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_6)

    public val VER_13_7: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_7)

    public val VER_13_8: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_8)

    public val VER_13_9: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_13_9)

    public val VER_14: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14)

    public val VER_14_1: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_1)

    public val VER_14_10: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_10)

    public val VER_14_11: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_11)

    public val VER_14_12: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_12)

    public val VER_14_13: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_13)

    public val VER_14_2: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_2)

    public val VER_14_3: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_3)

    public val VER_14_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_4)

    public val VER_14_5: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_5)

    public val VER_14_6: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_6)

    public val VER_14_7: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_7)

    public val VER_14_8: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_8)

    public val VER_14_9: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_14_9)

    public val VER_15: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15)

    public val VER_15_2: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_2)

    public val VER_15_3: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_3)

    public val VER_15_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_4)

    public val VER_15_5: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_5)

    public val VER_15_6: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_6)

    public val VER_15_7: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_7)

    public val VER_15_8: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_15_8)

    public val VER_16: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_16)

    public val VER_16_1: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_16_1)

    public val VER_16_2: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_16_2)

    public val VER_16_3: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_16_3)

    public val VER_16_4: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_16_4)

    public val VER_9_6_24: PostgresEngineVersion =
        PostgresEngineVersion.wrap(software.amazon.awscdk.services.rds.PostgresEngineVersion.VER_9_6_24)

    public fun of(postgresFullVersion: String, postgresMajorVersion: String): PostgresEngineVersion
        = software.amazon.awscdk.services.rds.PostgresEngineVersion.of(postgresFullVersion,
        postgresMajorVersion).let(PostgresEngineVersion::wrap)

    public fun of(
      postgresFullVersion: String,
      postgresMajorVersion: String,
      postgresFeatures: PostgresEngineFeatures,
    ): PostgresEngineVersion =
        software.amazon.awscdk.services.rds.PostgresEngineVersion.of(postgresFullVersion,
        postgresMajorVersion,
        postgresFeatures.let(PostgresEngineFeatures.Companion::unwrap)).let(PostgresEngineVersion::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ee8c7d83cbe96c20fac33281ba2719b124d62487aa6178e50b7f21f67e3984a8")
    public fun of(
      postgresFullVersion: String,
      postgresMajorVersion: String,
      postgresFeatures: PostgresEngineFeatures.Builder.() -> Unit,
    ): PostgresEngineVersion = of(postgresFullVersion, postgresMajorVersion,
        PostgresEngineFeatures(postgresFeatures))

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.PostgresEngineVersion):
        PostgresEngineVersion = PostgresEngineVersion(cdkObject)

    internal fun unwrap(wrapped: PostgresEngineVersion):
        software.amazon.awscdk.services.rds.PostgresEngineVersion = wrapped.cdkObject as
        software.amazon.awscdk.services.rds.PostgresEngineVersion
  }
}
