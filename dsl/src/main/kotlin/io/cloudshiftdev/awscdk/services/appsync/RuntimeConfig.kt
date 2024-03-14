package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface RuntimeConfig {
  /**
   * The name of the runtime.
   */
  public fun name(): String

  /**
   * The version string of the runtime.
   */
  public fun runtimeVersion(): String

  /**
   * A builder for [RuntimeConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param name The name of the runtime. 
     */
    public fun name(name: String)

    /**
     * @param runtimeVersion The version string of the runtime. 
     */
    public fun runtimeVersion(runtimeVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RuntimeConfig.Builder =
        software.amazon.awscdk.services.appsync.RuntimeConfig.builder()

    /**
     * @param name The name of the runtime. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param runtimeVersion The version string of the runtime. 
     */
    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): software.amazon.awscdk.services.appsync.RuntimeConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig,
  ) : RuntimeConfig {
    /**
     * The name of the runtime.
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The version string of the runtime.
     */
    override fun runtimeVersion(): String = unwrap(this).getRuntimeVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): RuntimeConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig):
        RuntimeConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: RuntimeConfig):
        software.amazon.awscdk.services.appsync.RuntimeConfig = (wrapped as Wrapper).cdkObject
  }
}
