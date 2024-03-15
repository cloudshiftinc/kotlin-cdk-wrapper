@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface AuroraMysqlClusterEngineProps {
  public fun version(): AuroraMysqlEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: AuroraMysqlEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.builder()

    override fun version(version: AuroraMysqlEngineVersion) {
      cdkBuilder.version(version.let(AuroraMysqlEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraMysqlClusterEngineProps {
    override fun version(): AuroraMysqlEngineVersion =
        unwrap(this).getVersion().let(AuroraMysqlEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraMysqlClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps):
        AuroraMysqlClusterEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraMysqlClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps
  }
}
