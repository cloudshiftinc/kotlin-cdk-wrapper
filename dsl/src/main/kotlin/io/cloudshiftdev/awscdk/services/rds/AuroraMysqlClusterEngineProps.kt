package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AuroraMysqlClusterEngineProps {
  /**
   * The version of the Aurora MySQL cluster engine.
   */
  public fun version(): AuroraMysqlEngineVersion

  /**
   * A builder for [AuroraMysqlClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora MySQL cluster engine. 
     */
    public fun version(version: AuroraMysqlEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora MySQL cluster engine. 
     */
    override fun version(version: AuroraMysqlEngineVersion) {
      cdkBuilder.version(version.let(AuroraMysqlEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraMysqlClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraMysqlClusterEngineProps {
    /**
     * The version of the Aurora MySQL cluster engine.
     */
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
