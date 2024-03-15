@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * FireLens enables you to use task definition parameters to route logs to an AWS service  or AWS
 * Partner Network (APN) destination for log storage and analytics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * Secret secret;
 * FireLensLogDriver fireLensLogDriver = FireLensLogDriver.Builder.create()
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .options(Map.of(
 * "optionsKey", "options"))
 * .secretOptions(Map.of(
 * "secretOptionsKey", secret))
 * .tag("tag")
 * .build();
 * ```
 */
public open class FireLensLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.FireLensLogDriver,
) : LogDriver(cdkObject) {
  /**
   * Called when the log driver is configured on a container.
   *
   * @param _scope 
   * @param _containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.FireLensLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The env option takes an array of keys.
     *
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     *
     * Default: - No env
     *
     * @param env The env option takes an array of keys. 
     */
    public fun env(env: List<String>)

    /**
     * The env option takes an array of keys.
     *
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     *
     * Default: - No env
     *
     * @param env The env option takes an array of keys. 
     */
    public fun env(vararg env: String)

    /**
     * The env-regex option is similar to and compatible with env.
     *
     * Its value is a regular
     * expression to match logging-related environment variables. It is used for advanced
     * log tag options.
     *
     * Default: - No envRegex
     *
     * @param envRegex The env-regex option is similar to and compatible with env. 
     */
    public fun envRegex(envRegex: String)

    /**
     * The labels option takes an array of keys.
     *
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     *
     * Default: - No labels
     *
     * @param labels The labels option takes an array of keys. 
     */
    public fun labels(labels: List<String>)

    /**
     * The labels option takes an array of keys.
     *
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     *
     * Default: - No labels
     *
     * @param labels The labels option takes an array of keys. 
     */
    public fun labels(vararg labels: String)

    /**
     * The configuration options to send to the log driver.
     *
     * Default: - the log driver options
     *
     * @param options The configuration options to send to the log driver. 
     */
    public fun options(options: Map<String, String>)

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - No secret options provided.
     *
     * @param secretOptions The secrets to pass to the log configuration. 
     */
    public fun secretOptions(secretOptions: Map<String, Secret>)

    /**
     * By default, Docker uses the first 12 characters of the container ID to tag log messages.
     *
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     *
     * Default: - The first 12 characters of the container ID
     *
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages. 
     */
    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FireLensLogDriver.Builder =
        software.amazon.awscdk.services.ecs.FireLensLogDriver.Builder.create()

    /**
     * The env option takes an array of keys.
     *
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     *
     * Default: - No env
     *
     * @param env The env option takes an array of keys. 
     */
    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    /**
     * The env option takes an array of keys.
     *
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     *
     * Default: - No env
     *
     * @param env The env option takes an array of keys. 
     */
    override fun env(vararg env: String): Unit = env(env.toList())

    /**
     * The env-regex option is similar to and compatible with env.
     *
     * Its value is a regular
     * expression to match logging-related environment variables. It is used for advanced
     * log tag options.
     *
     * Default: - No envRegex
     *
     * @param envRegex The env-regex option is similar to and compatible with env. 
     */
    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    /**
     * The labels option takes an array of keys.
     *
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     *
     * Default: - No labels
     *
     * @param labels The labels option takes an array of keys. 
     */
    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * The labels option takes an array of keys.
     *
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     *
     * Default: - No labels
     *
     * @param labels The labels option takes an array of keys. 
     */
    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    /**
     * The configuration options to send to the log driver.
     *
     * Default: - the log driver options
     *
     * @param options The configuration options to send to the log driver. 
     */
    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - No secret options provided.
     *
     * @param secretOptions The secrets to pass to the log configuration. 
     */
    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
    }

    /**
     * By default, Docker uses the first 12 characters of the container ID to tag log messages.
     *
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     *
     * Default: - The first 12 characters of the container ID
     *
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages. 
     */
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FireLensLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FireLensLogDriver {
      val builderImpl = BuilderImpl()
      return FireLensLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FireLensLogDriver):
        FireLensLogDriver = FireLensLogDriver(cdkObject)

    internal fun unwrap(wrapped: FireLensLogDriver):
        software.amazon.awscdk.services.ecs.FireLensLogDriver = wrapped.cdkObject
  }
}
