@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface MariaDbInstanceEngineProps {
  public fun version(): MariaDbEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: MariaDbEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps.builder()

    override fun version(version: MariaDbEngineVersion) {
      cdkBuilder.version(version.let(MariaDbEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps,
  ) : CdkObject(cdkObject), MariaDbInstanceEngineProps {
    override fun version(): MariaDbEngineVersion =
        unwrap(this).getVersion().let(MariaDbEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MariaDbInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps):
        MariaDbInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MariaDbInstanceEngineProps):
        software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.MariaDbInstanceEngineProps
  }
}
