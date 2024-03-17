@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for SQL Server Web Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerWeb`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * SqlServerEngineVersion sqlServerEngineVersion;
 * SqlServerWebInstanceEngineProps sqlServerWebInstanceEngineProps =
 * SqlServerWebInstanceEngineProps.builder()
 * .version(sqlServerEngineVersion)
 * .build();
 * ```
 */
public interface SqlServerWebInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): SqlServerEngineVersion

  /**
   * A builder for [SqlServerWebInstanceEngineProps]
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
        software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: SqlServerEngineVersion) {
      cdkBuilder.version(version.let(SqlServerEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps,
  ) : CdkObject(cdkObject), SqlServerWebInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): SqlServerEngineVersion =
        unwrap(this).getVersion().let(SqlServerEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerWebInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps):
        SqlServerWebInstanceEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        SqlServerWebInstanceEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqlServerWebInstanceEngineProps):
        software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps
  }
}
