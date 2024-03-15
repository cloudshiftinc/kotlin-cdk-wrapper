@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.ContainerImage
import io.cloudshiftdev.awscdk.services.ecs.LogDriver
import io.cloudshiftdev.awscdk.services.ecs.Secret
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.ecs.patterns.*;
 * ContainerImage containerImage;
 * LogDriver logDriver;
 * Secret secret;
 * ScheduledTaskImageProps scheduledTaskImageProps = ScheduledTaskImageProps.builder()
 * .image(containerImage)
 * // the properties below are optional
 * .command(List.of("command"))
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .logDriver(logDriver)
 * .secrets(Map.of(
 * "secretsKey", secret))
 * .build();
 * ```
 */
public interface ScheduledTaskImageProps {
  /**
   * The command that is passed to the container.
   *
   * If you provide a shell command as a single string, you have to quote command-line arguments.
   *
   * Default: - CMD value built into container image.
   */
  public fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

  /**
   * The environment variables to pass to the container.
   *
   * Default: none
   */
  public fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

  /**
   * The image used to start a container.
   *
   * Image or taskDefinition must be specified, but not both.
   *
   * Default: - none
   */
  public fun image(): ContainerImage

  /**
   * The log driver to use.
   *
   * Default: - AwsLogDriver if enableLogging is true
   */
  public fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

  /**
   * The secret to expose to the container as an environment variable.
   *
   * Default: - No secret environment variables.
   */
  public fun secrets(): Map<String, Secret> =
      unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * A builder for [ScheduledTaskImageProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(command: List<String>)

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    public fun command(vararg command: String)

    /**
     * @param environment The environment variables to pass to the container.
     */
    public fun environment(environment: Map<String, String>)

    /**
     * @param image The image used to start a container. 
     * Image or taskDefinition must be specified, but not both.
     */
    public fun image(image: ContainerImage)

    /**
     * @param logDriver The log driver to use.
     */
    public fun logDriver(logDriver: LogDriver)

    /**
     * @param secrets The secret to expose to the container as an environment variable.
     */
    public fun secrets(secrets: Map<String, Secret>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps.builder()

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(command: List<String>) {
      cdkBuilder.command(command)
    }

    /**
     * @param command The command that is passed to the container.
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     */
    override fun command(vararg command: String): Unit = command(command.toList())

    /**
     * @param environment The environment variables to pass to the container.
     */
    override fun environment(environment: Map<String, String>) {
      cdkBuilder.environment(environment)
    }

    /**
     * @param image The image used to start a container. 
     * Image or taskDefinition must be specified, but not both.
     */
    override fun image(image: ContainerImage) {
      cdkBuilder.image(image.let(ContainerImage::unwrap))
    }

    /**
     * @param logDriver The log driver to use.
     */
    override fun logDriver(logDriver: LogDriver) {
      cdkBuilder.logDriver(logDriver.let(LogDriver::unwrap))
    }

    /**
     * @param secrets The secret to expose to the container as an environment variable.
     */
    override fun secrets(secrets: Map<String, Secret>) {
      cdkBuilder.secrets(secrets.mapValues{Secret.unwrap(it.value)})
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps,
  ) : CdkObject(cdkObject), ScheduledTaskImageProps {
    /**
     * The command that is passed to the container.
     *
     * If you provide a shell command as a single string, you have to quote command-line arguments.
     *
     * Default: - CMD value built into container image.
     */
    override fun command(): List<String> = unwrap(this).getCommand() ?: emptyList()

    /**
     * The environment variables to pass to the container.
     *
     * Default: none
     */
    override fun environment(): Map<String, String> = unwrap(this).getEnvironment() ?: emptyMap()

    /**
     * The image used to start a container.
     *
     * Image or taskDefinition must be specified, but not both.
     *
     * Default: - none
     */
    override fun image(): ContainerImage = unwrap(this).getImage().let(ContainerImage::wrap)

    /**
     * The log driver to use.
     *
     * Default: - AwsLogDriver if enableLogging is true
     */
    override fun logDriver(): LogDriver? = unwrap(this).getLogDriver()?.let(LogDriver::wrap)

    /**
     * The secret to expose to the container as an environment variable.
     *
     * Default: - No secret environment variables.
     */
    override fun secrets(): Map<String, Secret> =
        unwrap(this).getSecrets()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledTaskImageProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps):
        ScheduledTaskImageProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledTaskImageProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.ScheduledTaskImageProps
  }
}
