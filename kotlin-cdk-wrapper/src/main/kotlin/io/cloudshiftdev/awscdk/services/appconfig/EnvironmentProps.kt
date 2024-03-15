@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface EnvironmentProps : EnvironmentOptions {
  public fun application(): IApplication

  @CdkDslMarker
  public interface Builder {
    public fun application(application: IApplication)

    public fun description(description: String)

    public fun environmentName(environmentName: String)

    public fun monitors(monitors: List<Monitor>)

    public fun monitors(vararg monitors: Monitor)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentProps.Builder =
        software.amazon.awscdk.services.appconfig.EnvironmentProps.builder()

    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

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

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentProps,
  ) : CdkObject(cdkObject), EnvironmentProps {
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentProps):
        EnvironmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentProps):
        software.amazon.awscdk.services.appconfig.EnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.EnvironmentProps
  }
}
