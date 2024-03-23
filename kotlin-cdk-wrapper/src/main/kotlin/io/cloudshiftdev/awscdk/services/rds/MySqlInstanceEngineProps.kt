@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for MySQL instance engines.
 *
 * Used in `DatabaseInstanceEngine.mysql`.
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
public interface MySqlInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): MysqlEngineVersion

  /**
   * A builder for [MySqlInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: MysqlEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.MySqlInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.MySqlInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: MysqlEngineVersion) {
      cdkBuilder.version(version.let(MysqlEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.MySqlInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.MySqlInstanceEngineProps,
  ) : CdkObject(cdkObject), MySqlInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): MysqlEngineVersion =
        unwrap(this).getVersion().let(MysqlEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MySqlInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MySqlInstanceEngineProps):
        MySqlInstanceEngineProps = CdkObjectWrappers.wrap(cdkObject) as? MySqlInstanceEngineProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: MySqlInstanceEngineProps):
        software.amazon.awscdk.services.rds.MySqlInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.MySqlInstanceEngineProps
  }
}
