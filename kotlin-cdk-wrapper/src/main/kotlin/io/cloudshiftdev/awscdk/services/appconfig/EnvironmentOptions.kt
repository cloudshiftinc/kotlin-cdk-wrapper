@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Options for the Environment construct.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appconfig.*;
 * Monitor monitor;
 * EnvironmentOptions environmentOptions = EnvironmentOptions.builder()
 * .description("description")
 * .environmentName("environmentName")
 * .monitors(List.of(monitor))
 * .build();
 * ```
 */
public interface EnvironmentOptions {
  /**
   * The description of the environment.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The name of the environment.
   *
   * Default: - A name is generated.
   */
  public fun environmentName(): String? = unwrap(this).getEnvironmentName()

  /**
   * The monitors for the environment.
   *
   * Default: - No monitors.
   */
  public fun monitors(): List<Monitor> = unwrap(this).getMonitors()?.map(Monitor::wrap) ?:
      emptyList()

  /**
   * A builder for [EnvironmentOptions]
   */
  @CdkDslMarker
  public interface Builder {
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
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.EnvironmentOptions.Builder =
        software.amazon.awscdk.services.appconfig.EnvironmentOptions.builder()

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
      cdkBuilder.monitors(monitors.map(Monitor::unwrap))
    }

    /**
     * @param monitors The monitors for the environment.
     */
    override fun monitors(vararg monitors: Monitor): Unit = monitors(monitors.toList())

    public fun build(): software.amazon.awscdk.services.appconfig.EnvironmentOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentOptions,
  ) : CdkObject(cdkObject), EnvironmentOptions {
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
    public operator fun invoke(block: Builder.() -> Unit = {}): EnvironmentOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.EnvironmentOptions):
        EnvironmentOptions = CdkObjectWrappers.wrap(cdkObject) as? EnvironmentOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EnvironmentOptions):
        software.amazon.awscdk.services.appconfig.EnvironmentOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.EnvironmentOptions
  }
}
