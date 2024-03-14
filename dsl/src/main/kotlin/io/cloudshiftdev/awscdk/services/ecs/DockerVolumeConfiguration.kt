package io.cloudshiftdev.awscdk.services.ecs

import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface DockerVolumeConfiguration {
  public fun autoprovision(): Boolean? = unwrap(this).getAutoprovision()

  public fun driver(): String

  public fun driverOpts(): Map<String, String> = unwrap(this).getDriverOpts() ?: emptyMap()

  public fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

  public fun scope(): Scope

  public interface Builder {
    public fun autoprovision(autoprovision: Boolean)

    public fun driver(driver: String)

    public fun driverOpts(driverOpts: Map<String, String>)

    public fun labels(labels: Map<String, String>)

    public fun scope(scope: Scope)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.Builder =
        software.amazon.awscdk.services.ecs.DockerVolumeConfiguration.builder()

    override fun autoprovision(autoprovision: Boolean) {
      cdkBuilder.autoprovision(autoprovision)
    }

    override fun driver(driver: String) {
      cdkBuilder.driver(driver)
    }

    override fun driverOpts(driverOpts: Map<String, String>) {
      cdkBuilder.driverOpts(driverOpts)
    }

    override fun labels(labels: Map<String, String>) {
      cdkBuilder.labels(labels)
    }

    override fun scope(scope: Scope) {
      cdkBuilder.scope(scope.let(Scope::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.DockerVolumeConfiguration =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration,
  ) : DockerVolumeConfiguration {
    override fun autoprovision(): Boolean? = unwrap(this).getAutoprovision()

    override fun driver(): String = unwrap(this).getDriver()

    override fun driverOpts(): Map<String, String> = unwrap(this).getDriverOpts() ?: emptyMap()

    override fun labels(): Map<String, String> = unwrap(this).getLabels() ?: emptyMap()

    override fun scope(): Scope = unwrap(this).getScope().let(Scope::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DockerVolumeConfiguration {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.DockerVolumeConfiguration):
        DockerVolumeConfiguration = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DockerVolumeConfiguration):
        software.amazon.awscdk.services.ecs.DockerVolumeConfiguration = (wrapped as
        Wrapper).cdkObject
  }
}
