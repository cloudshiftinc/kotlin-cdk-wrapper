package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface PostgresInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): PostgresEngineVersion

  /**
   * A builder for [PostgresInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: PostgresEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.PostgresInstanceEngineProps.Builder
        = software.amazon.awscdk.services.rds.PostgresInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: PostgresEngineVersion) {
      cdkBuilder.version(version.let(PostgresEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.PostgresInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.PostgresInstanceEngineProps,
  ) : CdkObject(cdkObject), PostgresInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
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
