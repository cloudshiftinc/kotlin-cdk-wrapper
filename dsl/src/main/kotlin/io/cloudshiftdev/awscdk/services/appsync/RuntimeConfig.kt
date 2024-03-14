package io.cloudshiftdev.awscdk.services.appsync

import kotlin.String
import kotlin.Unit

public interface RuntimeConfig {
  public fun name(): String

  public fun runtimeVersion(): String

  public interface Builder {
    public fun name(name: String)

    public fun runtimeVersion(runtimeVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.RuntimeConfig.Builder =
        software.amazon.awscdk.services.appsync.RuntimeConfig.builder()

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun runtimeVersion(runtimeVersion: String) {
      cdkBuilder.runtimeVersion(runtimeVersion)
    }

    public fun build(): software.amazon.awscdk.services.appsync.RuntimeConfig = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appsync.RuntimeConfig,
  ) : RuntimeConfig {
    override fun name(): String = unwrap(this).getName()

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
