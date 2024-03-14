package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface AuroraPostgresClusterEngineProps {
  /**
   * The version of the Aurora PostgreSQL cluster engine.
   */
  public fun version(): AuroraPostgresEngineVersion

  /**
   * A builder for [AuroraPostgresClusterEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The version of the Aurora PostgreSQL cluster engine. 
     */
    public fun version(version: AuroraPostgresEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.Builder =
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps.builder()

    /**
     * @param version The version of the Aurora PostgreSQL cluster engine. 
     */
    override fun version(version: AuroraPostgresEngineVersion) {
      cdkBuilder.version(version.let(AuroraPostgresEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps,
  ) : CdkObject(cdkObject), AuroraPostgresClusterEngineProps {
    /**
     * The version of the Aurora PostgreSQL cluster engine.
     */
    override fun version(): AuroraPostgresEngineVersion =
        unwrap(this).getVersion().let(AuroraPostgresEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraPostgresClusterEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps):
        AuroraPostgresClusterEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraPostgresClusterEngineProps):
        software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraPostgresClusterEngineProps
  }
}
