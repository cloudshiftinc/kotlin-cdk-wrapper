@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface PostgresInstanceEngineProps {
  public fun version(): PostgresEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: PostgresEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.PostgresInstanceEngineProps.Builder
        = software.amazon.awscdk.services.rds.PostgresInstanceEngineProps.builder()

    override fun version(version: PostgresEngineVersion) {
      cdkBuilder.version(version.let(PostgresEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.PostgresInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.PostgresInstanceEngineProps,
  ) : CdkObject(cdkObject), PostgresInstanceEngineProps {
    override fun version(): PostgresEngineVersion =
        unwrap(this).getVersion().let(PostgresEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PostgresInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.PostgresInstanceEngineProps):
        PostgresInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PostgresInstanceEngineProps):
        software.amazon.awscdk.services.rds.PostgresInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.PostgresInstanceEngineProps
  }
}
