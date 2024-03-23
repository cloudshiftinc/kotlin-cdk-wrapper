@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Attributes of an existing AWS AppConfig environment to import it.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * Application application;
 * Monitor monitor;
 * EnvironmentAttributes environmentAttributes = EnvironmentAttributes.builder()
 * .application(application)
 * .environmentId("environmentId")
 * // the properties below are optional
 * .description("description")
 * .monitors(List.of(monitor))
 * .name("name")
 * .build();
 * ```
 */
public interface EnvironmentAttributes {
  /**
   * The application associated with the environment.
   */
  public fun application(): IApplication

  /**
   * The description of the environment.
   *
   * Default: - None.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The ID of the environment.
   */
  public fun environmentId(): String

  /**
   * The monitors for the environment.
   *
   * Default: - None.
   */
  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  /**
   * The name of the environment.
   *
   * Default: - None.
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [EnvironmentAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param application The application associated with the environment. 
     */
    public fun application(application: IApplication)

    /**
     * @param description The description of the environment.
     */
    public fun description(description: String)

    /**
     * @param environmentId The ID of the environment. 
     */
    public fun environmentId(environmentId: String)

    /**
     * @param monitors The monitors for the environment.
     */
    public fun monitors(monitors: List<Monitor>)

    /**
     * @param monitors The monitors for the environment.
     */
    public fun monitors(vararg monitors: Monitor)

    /**
     * @param name The name of the environment.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentAttributes.Builder
        = software.amazon.awscdk.services.appconfig.EnvironmentAttributes.builder()

    /**
     * @param application The application associated with the environment. 
     */
    override fun application(application: IApplication) {
      cdkBuilder.application(application.let(IApplication::unwrap))
    }

    /**
     * @param description The description of the environment.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param environmentId The ID of the environment. 
     */
    override fun environmentId(environmentId: String) {
      cdkBuilder.environmentId(environmentId)
    }

    /**
     * @param monitors The monitors for the environment.
     */
    override fun monitors(monitors: List<Monitor>) {
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    /**
     * @param monitors The monitors for the environment.
     */
    override fun monitors(vararg monitors: Monitor): Unit = monitors(monitors.toList())

    /**
     * @param name The name of the environment.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentAttributes,
  ) : CdkObject(cdkObject), EnvironmentAttributes {
    /**
     * The application associated with the environment.
     */
    override fun application(): IApplication = unwrap(this).getApplication().let(IApplication::wrap)

    /**
     * The description of the environment.
     *
     * Default: - None.
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The ID of the environment.
     */
    override fun environmentId(): String = unwrap(this).getEnvironmentId()

    /**
     * The monitors for the environment.
     *
     * Default: - None.
     */
    override fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
        emptyList()

    /**
     * The name of the environment.
     *
     * Default: - None.
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentAttributes):
        EnvironmentAttributes = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentAttributes ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentAttributes):
        software.amazon.awscdk.services.appconfig.EnvironmentAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.EnvironmentAttributes
  }
}
