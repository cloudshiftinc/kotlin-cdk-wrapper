package io.cloudshiftdev.awscdk.services.appconfig

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EnvironmentAttributes {
  public fun application(): IApplication

  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentId(): String

  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  public fun name(): String? = unwrap(this).getName()

  public interface Builder {
    public fun application(application: IApplication) {
    }

    public fun description(description: String) {
    }

    public fun environmentId(environmentId: String) {
    }

    public fun monitors(monitors: List<Monitor>) {
    }

    public fun name(name: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentAttributes.Builder
        = software.amazon.awscdk.services.appconfig.EnvironmentAttributes.builder()

    public override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    public override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentAttributes,
  ) : EnvironmentAttributes {
    public override fun application(): IApplication =
        unwrap(this).getApplication().let(IApplication::wrap)

    public override fun description(): String? = unwrap(this).getDescription()

    public override fun environmentId(): String = unwrap(this).getEnvironmentId()

    public override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap)
        ?: emptyList()

    public override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentAttributes):
        EnvironmentAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentAttributes):
        software.amazon.awscdk.services.appconfig.EnvironmentAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
