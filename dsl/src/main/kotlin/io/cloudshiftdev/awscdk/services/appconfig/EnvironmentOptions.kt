package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EnvironmentOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  public interface Builder {
    public fun description(description: String) {
    }

    public fun environmentName(environmentName: String) {
    }

    public fun monitors(monitors: List<Monitor>) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentOptions.Builder =
        software.amazon.awscdk.services.appconfig.EnvironmentOptions.builder()

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    public override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentOptions =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentOptions,
  ) : EnvironmentOptions {
    public override fun description(): String? = unwrap(this).getDescription()

    public override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    public override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap)
        ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentOptions):
        EnvironmentOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentOptions):
        software.amazon.awscdk.services.appconfig.EnvironmentOptions = (wrapped as
        Wrapper).cdkObject
  }
}
