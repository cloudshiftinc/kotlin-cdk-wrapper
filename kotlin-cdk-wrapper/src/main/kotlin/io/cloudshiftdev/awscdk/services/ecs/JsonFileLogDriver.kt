@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A log driver that sends log information to json-file Logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * JsonFileLogDriver jsonFileLogDriver = JsonFileLogDriver.Builder.create()
 * .compress(false)
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .maxFile(123)
 * .maxSize("maxSize")
 * .tag("tag")
 * .build();
 * ```
 */
public open class JsonFileLogDriver(
  cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriver,
) : LogDriver(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ecs.JsonFileLogDriver()
  )

  public constructor(props: JsonFileLogDriverProps) :
      this(software.amazon.awscdk.services.ecs.JsonFileLogDriver(props.let(JsonFileLogDriverProps.Companion::unwrap))
  )

  public constructor(props: JsonFileLogDriverProps.Builder.() -> Unit) :
      this(JsonFileLogDriverProps(props)
  )

  /**
   * Called when the log driver is configured on a container.
   *
   * @param _scope 
   * @param _containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      containerDefinition.let(ContainerDefinition.Companion::unwrap)).let(LogDriverConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.JsonFileLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Toggles compression for rotated logs.
     *
     * Default: - false
     *
     * @param compress Toggles compression for rotated logs. 
     */
    public fun compress(compress: Boolean)

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
     * The maximum number of log files that can be present.
     *
     * If rolling the logs creates
     * excess files, the oldest file is removed. Only effective when max-size is also set.
     * A positive integer.
     *
     * Default: - 1
     *
     * @param maxFile The maximum number of log files that can be present. 
     */
    public fun maxFile(maxFile: Number)

    /**
     * The maximum size of the log before it is rolled.
     *
     * A positive integer plus a modifier
     * representing the unit of measure (k, m, or g).
     *
     * Default: - -1 (unlimited)
     *
     * @param maxSize The maximum size of the log before it is rolled. 
     */
    public fun maxSize(maxSize: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.JsonFileLogDriver.Builder =
        software.amazon.awscdk.services.ecs.JsonFileLogDriver.Builder.create()

    /**
     * Toggles compression for rotated logs.
     *
     * Default: - false
     *
     * @param compress Toggles compression for rotated logs. 
     */
    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
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
     * The maximum number of log files that can be present.
     *
     * If rolling the logs creates
     * excess files, the oldest file is removed. Only effective when max-size is also set.
     * A positive integer.
     *
     * Default: - 1
     *
     * @param maxFile The maximum number of log files that can be present. 
     */
    override fun maxFile(maxFile: Number) {
      cdkBuilder.maxFile(maxFile)
    }

    /**
     * The maximum size of the log before it is rolled.
     *
     * A positive integer plus a modifier
     * representing the unit of measure (k, m, or g).
     *
     * Default: - -1 (unlimited)
     *
     * @param maxSize The maximum size of the log before it is rolled. 
     */
    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
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

    public fun build(): software.amazon.awscdk.services.ecs.JsonFileLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonFileLogDriver {
      val builderImpl = BuilderImpl()
      return JsonFileLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriver):
        JsonFileLogDriver = JsonFileLogDriver(cdkObject)

    internal fun unwrap(wrapped: JsonFileLogDriver):
        software.amazon.awscdk.services.ecs.JsonFileLogDriver = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.JsonFileLogDriver
  }
}
