@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for SQL Server Enterprise Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerEe`.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * ParameterGroup parameterGroup = ParameterGroup.Builder.create(this, "ParameterGroup")
 * .engine(DatabaseInstanceEngine.sqlServerEe(SqlServerEeInstanceEngineProps.builder()
 * .version(SqlServerEngineVersion.VER_11)
 * .build()))
 * .name("my-parameter-group")
 * .parameters(Map.of(
 * "locks", "100"))
 * .build();
 * DatabaseInstance.Builder.create(this, "Database")
 * .engine(DatabaseInstanceEngine.SQL_SERVER_EE)
 * .vpc(vpc)
 * .parameterGroup(parameterGroup)
 * .build();
 * ```
 */
public interface SqlServerEeInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): SqlServerEngineVersion

  /**
   * A builder for [SqlServerEeInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: SqlServerEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: SqlServerEngineVersion) {
      cdkBuilder.version(version.let(SqlServerEngineVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps,
  ) : CdkObject(cdkObject),
      SqlServerEeInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): SqlServerEngineVersion =
        unwrap(this).getVersion().let(SqlServerEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerEeInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps):
        SqlServerEeInstanceEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        SqlServerEeInstanceEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqlServerEeInstanceEngineProps):
        software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.SqlServerEeInstanceEngineProps
  }
}
