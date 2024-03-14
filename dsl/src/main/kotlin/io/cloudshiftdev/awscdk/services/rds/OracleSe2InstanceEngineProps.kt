package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface OracleSe2InstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): OracleEngineVersion

  /**
   * A builder for [OracleSe2InstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: OracleEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.Builder
        = software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: OracleEngineVersion) {
      cdkBuilder.version(version.let(OracleEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.OracleSe2InstanceEngineProps,
  ) : CdkObject(cdkObject), OracleSe2InstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
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
