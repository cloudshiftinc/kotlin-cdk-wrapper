@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

/**
 * Properties for Oracle Standard Edition 2 instance engines.
 *
 * Used in `DatabaseInstanceEngine.oracleSe2`.
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
public interface OracleSe2InstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): OracleEngineVersion

  /**
   * A builder for [OracleSe2InstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: OracleEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.Builder
        = software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: OracleEngineVersion) {
      cdkBuilder.version(version.let(OracleEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps,
  ) : CdkObject(cdkObject), OracleSe2InstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): OracleEngineVersion =
        unwrap(this).getVersion().let(OracleEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OracleSe2InstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps):
        OracleSe2InstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OracleSe2InstanceEngineProps):
        software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps
  }
}
