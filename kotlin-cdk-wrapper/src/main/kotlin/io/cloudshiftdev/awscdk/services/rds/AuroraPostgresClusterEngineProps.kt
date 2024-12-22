@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Creation properties of the Aurora PostgreSQL database cluster engine.
 *
 * Used in `DatabaseClusterEngine.auroraPostgres`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraPostgres(AuroraPostgresClusterEngineProps.builder().version(AuroraPostgresEngineVersion.VER_15_2).build()))
 * .credentials(Credentials.fromUsername("adminuser",
 * CredentialsFromUsernameOptions.builder().password(SecretValue.unsafePlainText("7959866cacc02c2d243ecfe177464fe6")).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .publiclyAccessible(false)
 * .build()))
 * .readers(List.of(ClusterInstance.provisioned("reader")))
 * .storageType(DBClusterStorageType.AURORA_IOPT1)
 * .vpcSubnets(SubnetSelection.builder()
 * .subnetType(SubnetType.PRIVATE_WITH_EGRESS)
 * .build())
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface AuroraPostgresClusterEngineProps {
  /**
   * The version of the Aurora PostgreSQL cluster engine.
   */
  public fun version(): AuroraPostgresEngineVersion

  /**
   * A builder for [AuroraPostgresClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora PostgreSQL cluster engine. 
     */
    public fun version(version: AuroraPostgresEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora PostgreSQL cluster engine. 
     */
    override fun version(version: AuroraPostgresEngineVersion) {
      cdkBuilder.version(version.let(AuroraPostgresEngineVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps,
  ) : CdkObject(cdkObject),
      AuroraPostgresClusterEngineProps {
    /**
     * The version of the Aurora PostgreSQL cluster engine.
     */
    override fun version(): AuroraPostgresEngineVersion =
        unwrap(this).getVersion().let(AuroraPostgresEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraPostgresClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps):
        AuroraPostgresClusterEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        AuroraPostgresClusterEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraPostgresClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps
  }
}
