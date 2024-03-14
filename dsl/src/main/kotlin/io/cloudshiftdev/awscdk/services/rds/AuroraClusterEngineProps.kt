package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AuroraClusterEngineProps {
  /**
   * The version of the Aurora cluster engine.
   */
  public fun version(): AuroraEngineVersion

  /**
   * A builder for [AuroraClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora cluster engine. 
     */
    public fun version(version: AuroraEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.AuroraClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora cluster engine. 
     */
    override fun version(version: AuroraEngineVersion) {
      cdkBuilder.version(version.let(AuroraEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraClusterEngineProps {
    /**
     * The version of the Aurora cluster engine.
     */
    override fun version(): AuroraEngineVersion =
        unwrap(this).getVersion().let(AuroraEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraClusterEngineProps):
        AuroraClusterEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraClusterEngineProps
  }
}
