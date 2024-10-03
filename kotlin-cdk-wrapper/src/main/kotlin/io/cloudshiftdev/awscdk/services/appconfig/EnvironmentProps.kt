@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for the Environment construct.
 *
 * Example:
 *
 * ```
 * Application app = new Application(this, "MyApp");
 * Environment env = Environment.Builder.create(this, "MyEnv")
 * .application(app)
 * .build();
 * HostedConfiguration.Builder.create(this, "MyFirstHostedConfig")
 * .application(app)
 * .deployTo(List.of(env))
 * .content(ConfigurationContent.fromInlineText("This is my first configuration content."))
 * .build();
 * HostedConfiguration.Builder.create(this, "MySecondHostedConfig")
 * .application(app)
 * .deployTo(List.of(env))
 * .content(ConfigurationContent.fromInlineText("This is my second configuration content."))
 * .build();
 * ```
 */
public interface EnvironmentProps : EnvironmentOptions {
  /**
   * The application to be associated with the environment.
   */
  public fun application(): IApplication

  /**
   * A builder for [EnvironmentProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The application to be associated with the environment. 
     */
    public fun application(application: IApplication)

    /**
     * @param description The description of the environment.
     */
    public fun description(description: String)

    /**
     * @param environmentName The name of the environment.
     */
    public fun environmentName(environmentName: String)

    /**
     * @param monitors The monitors for the environment.
     */
    public fun monitors(monitors: List<Monitor>)

    /**
     * @param monitors The monitors for the environment.
     */
    public fun monitors(vararg monitors: Monitor)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentProps.Builder =
        software.amazon.awscdk.services.appconfig.EnvironmentProps.builder()

    /**
     * @param application The application to be associated with the environment. 
     */
    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication.Companion::unwrap))
    }

    /**
     * @param description The description of the environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environmentName The name of the environment.
     */
    override fun environmentName(environmentName: String) {
      cdkBuilder.environmentName(environmentName)
    }

    /**
     * @param monitors The monitors for the environment.
     */
    override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor.Companion::unwrap))
    }

    /**
     * @param monitors The monitors for the environment.
     */
    override fun monitors(vararg monitors: Monitor): Unit = monitors(monitors.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentProps,
  ) : CdkObject(cdkObject),
      EnvironmentProps {
    /**
     * The application to be associated with the environment.
     */
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    /**
     * The description of the environment.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The name of the environment.
     *
     * Default: - A name is generated.
     */
    override fun environmentName(): String? = unwrap(this).getEnvironmentName()

    /**
     * The monitors for the environment.
     *
     * Default: - No monitors.
     */
    override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
        emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentProps):
        EnvironmentProps = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentProps):
        software.amazon.awscdk.services.appconfig.EnvironmentProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.EnvironmentProps
  }
}
