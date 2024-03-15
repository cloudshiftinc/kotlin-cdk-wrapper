@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface SqlServerSeInstanceEngineProps {
  public fun version(): SqlServerEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: SqlServerEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps.builder()

    override fun version(version: SqlServerEngineVersion) {
      cdkBuilder.version(version.let(SqlServerEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps,
  ) : CdkObject(cdkObject), SqlServerSeInstanceEngineProps {
    override fun version(): SqlServerEngineVersion =
        unwrap(this).getVersion().let(SqlServerEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerSeInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps):
        SqlServerSeInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqlServerSeInstanceEngineProps):
        software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.SqlServerSeInstanceEngineProps
  }
}
