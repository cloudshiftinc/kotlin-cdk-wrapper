package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Unit

public interface SqlServerExInstanceEngineProps {
  /**
   * The exact version of the engine to use.
   */
  public fun version(): SqlServerEngineVersion

  /**
   * A builder for [SqlServerExInstanceEngineProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param version The exact version of the engine to use. 
     */
    public fun version(version: SqlServerEngineVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps.Builder =
        software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps.builder()

    /**
     * @param version The exact version of the engine to use. 
     */
    override fun version(version: SqlServerEngineVersion) {
      cdkBuilder.version(version.let(SqlServerEngineVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps,
  ) : CdkObject(cdkObject), SqlServerExInstanceEngineProps {
    /**
     * The exact version of the engine to use.
     */
    override fun version(): SqlServerEngineVersion =
        unwrap(this).getVersion().let(SqlServerEngineVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SqlServerExInstanceEngineProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps):
        SqlServerExInstanceEngineProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SqlServerExInstanceEngineProps):
        software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.SqlServerExInstanceEngineProps
  }
}
