@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface OracleSe2InstanceEngineProps {
  public fun version(): OracleEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: OracleEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.Builder
        = software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.builder()

    override fun version(version: OracleEngineVersion) {
      cdkBuilder.version(version.let(OracleEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps,
  ) : CdkObject(cdkObject), OracleSe2InstanceEngineProps {
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
