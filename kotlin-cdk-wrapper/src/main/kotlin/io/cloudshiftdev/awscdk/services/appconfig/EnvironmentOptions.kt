@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EnvironmentOptions {
  public fun description(): String? = unwrap(this).getDescription()

  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun environmentName(environmentName: String)

    public fun monitors(monitors: List<Monitor>)

    public fun monitors(vararg monitors: Monitor)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentOptions.Builder =
        software.amazon.awscdk.services.appconfig.EnvironmentOptions.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    override fun monitors(vararg monitors: Monitor): Unit = monitors(monitors.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentOptions,
  ) : CdkObject(cdkObject), EnvironmentOptions {
    override fun description(): String? = unwrap(this).getDescription()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentOptions):
        EnvironmentOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentOptions):
        software.amazon.awscdk.services.appconfig.EnvironmentOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.EnvironmentOptions
  }
}
