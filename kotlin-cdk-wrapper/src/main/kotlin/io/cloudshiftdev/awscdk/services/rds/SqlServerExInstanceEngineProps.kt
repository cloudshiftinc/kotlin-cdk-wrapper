@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit

/**
 * Properties for SQL Server Express Edition instance engines.
 *
 * Used in `DatabaseInstanceEngine.sqlServerEx`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * SqlServerEngineVersion sqlServerEngineVersion;
 * SqlServerExInstanceEngineProps sqlServerExInstanceEngineProps =
 * SqlServerExInstanceEngineProps.builder()
 * .version(sqlServerEngineVersion)
 * .build();
 * ```
 */
public interface SqlServerExInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): SqlServerEngineVersion

  /**
   * A builder for [SqlServerExInstanceEngineProps]
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
        software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: SqlServerEngineVersion) {
      cdkBuilder.version(version.let(SqlServerEngineVersion.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps,
  ) : CdkObject(cdkObject), SqlServerExInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): SqlServerEngineVersion =
        unwrap(this).getVersion().let(SqlServerEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerExInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps):
        SqlServerExInstanceEngineProps = CdkObjectWrappers.wrap(cdkObject) as?
        SqlServerExInstanceEngineProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqlServerExInstanceEngineProps):
        software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps
  }
}
