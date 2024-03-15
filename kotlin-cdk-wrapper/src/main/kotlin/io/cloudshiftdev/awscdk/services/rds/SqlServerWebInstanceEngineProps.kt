@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface SqlServerWebInstanceEngineProps {
  public fun version(): SqlServerEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: SqlServerEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps.builder()

    override fun version(version: SqlServerEngineVersion) {
      cdkBuilder.version(version.let(SqlServerEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps,
  ) : CdkObject(cdkObject), SqlServerWebInstanceEngineProps {
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
        SqlServerWebInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqlServerWebInstanceEngineProps):
        software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.SqlServerWebInstanceEngineProps
  }
}
