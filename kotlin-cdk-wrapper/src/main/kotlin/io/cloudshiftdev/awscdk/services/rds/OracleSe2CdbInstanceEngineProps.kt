@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Unit

public interface OracleSe2CdbInstanceEngineProps {
  public fun version(): OracleEngineVersion

  @CdkDslMarker
  public interface Builder {
    public fun version(version: OracleEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps.builder()

    override fun version(version: OracleEngineVersion) {
      cdkBuilder.version(version.let(OracleEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps,
  ) : CdkObject(cdkObject), OracleSe2CdbInstanceEngineProps {
    override fun version(): OracleEngineVersion =
        unwrap(this).getVersion().let(OracleEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): OracleSe2CdbInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps):
        OracleSe2CdbInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: OracleSe2CdbInstanceEngineProps):
        software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.OracleSe2CdbInstanceEngineProps
  }
}
