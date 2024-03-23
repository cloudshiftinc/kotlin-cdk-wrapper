@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Creation properties of the Aurora MySQL database cluster engine.
 *
 * Used in `DatabaseClusterEngine.auroraMysql`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Database")
 * .engine(DatabaseClusterEngine.auroraMysql(AuroraMysqlClusterEngineProps.builder().version(AuroraMysqlEngineVersion.VER_3_01_0).build()))
 * .writer(ClusterInstance.provisioned("writer", ProvisionedClusterInstanceProps.builder()
 * .instanceType(InstanceType.of(InstanceClass.R6G, InstanceSize.XLARGE4))
 * .build()))
 * .serverlessV2MinCapacity(6.5)
 * .serverlessV2MaxCapacity(64)
 * .readers(List.of(ClusterInstance.serverlessV2("reader1",
 * ServerlessV2ClusterInstanceProps.builder().scaleWithWriter(true).build()),
 * ClusterInstance.serverlessV2("reader2")))
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface AuroraMysqlClusterEngineProps {
  /**
   * The version of the Aurora MySQL cluster engine.
   */
  public fun version(): AuroraMysqlEngineVersion

  /**
   * A builder for [AuroraMysqlClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora MySQL cluster engine. 
     */
    public fun version(version: AuroraMysqlEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora MySQL cluster engine. 
     */
    override fun version(version: AuroraMysqlEngineVersion) {
      cdkBuilder.version(version.let(AuroraMysqlEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraMysqlClusterEngineProps {
    /**
     * The version of the Aurora MySQL cluster engine.
     */
    override fun version(): AuroraMysqlEngineVersion =
        unwrap(this).getVersion().let(AuroraMysqlEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraMysqlClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps):
        AuroraMysqlClusterEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        AuroraMysqlClusterEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraMysqlClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps
  }
}
