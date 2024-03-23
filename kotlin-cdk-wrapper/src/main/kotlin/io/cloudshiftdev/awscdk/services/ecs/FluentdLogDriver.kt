@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A log driver that sends log information to journald Logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * FluentdLogDriver fluentdLogDriver = FluentdLogDriver.Builder.create()
 * .address("address")
 * .asyncConnect(false)
 * .bufferLimit(123)
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .maxRetries(123)
 * .retryWait(Duration.minutes(30))
 * .subSecondPrecision(false)
 * .tag("tag")
 * .build();
 * ```
 */
public open class FluentdLogDriver(
  cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriver,
) : LogDriver(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ecs.FluentdLogDriver()
  )

  public constructor(props: FluentdLogDriverProps) :
      this(software.amazon.awscdk.services.ecs.FluentdLogDriver(props.let(FluentdLogDriverProps::unwrap))
  )

  public constructor(props: FluentdLogDriverProps.Builder.() -> Unit) :
      this(FluentdLogDriverProps(props)
  )

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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.FluentdLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * By default, the logging driver connects to localhost:24224.
     *
     * Supply the
     * address option to connect to a different address. tcp(default) and unix
     * sockets are supported.
     *
     * Default: - address not set.
     *
     * @param address By default, the logging driver connects to localhost:24224. 
     */
    public fun address(address: String)

    /**
     * Docker connects to Fluentd in the background.
     *
     * Messages are buffered until
     * the connection is established.
     *
     * Default: - false
     *
     * @param asyncConnect Docker connects to Fluentd in the background. 
     */
    public fun asyncConnect(asyncConnect: Boolean)

    /**
     * The amount of data to buffer before flushing to disk.
     *
     * Default: - The amount of RAM available to the container.
     *
     * @param bufferLimit The amount of data to buffer before flushing to disk. 
     */
    public fun bufferLimit(bufferLimit: Number)

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
     * The maximum number of retries.
     *
     * Default: - 4294967295 (2**32 - 1).
     *
     * @param maxRetries The maximum number of retries. 
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * How long to wait between retries.
     *
     * Default: - 1 second
     *
     * @param retryWait How long to wait between retries. 
     */
    public fun retryWait(retryWait: Duration)

    /**
     * Generates event logs in nanosecond resolution.
     *
     * Default: - false
     *
     * @param subSecondPrecision Generates event logs in nanosecond resolution. 
     */
    public fun subSecondPrecision(subSecondPrecision: Boolean)

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
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FluentdLogDriver.Builder =
        software.amazon.awscdk.services.ecs.FluentdLogDriver.Builder.create()

    /**
     * By default, the logging driver connects to localhost:24224.
     *
     * Supply the
     * address option to connect to a different address. tcp(default) and unix
     * sockets are supported.
     *
     * Default: - address not set.
     *
     * @param address By default, the logging driver connects to localhost:24224. 
     */
    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    /**
     * Docker connects to Fluentd in the background.
     *
     * Messages are buffered until
     * the connection is established.
     *
     * Default: - false
     *
     * @param asyncConnect Docker connects to Fluentd in the background. 
     */
    override fun asyncConnect(asyncConnect: Boolean) {
      cdkBuilder.asyncConnect(asyncConnect)
    }

    /**
     * The amount of data to buffer before flushing to disk.
     *
     * Default: - The amount of RAM available to the container.
     *
     * @param bufferLimit The amount of data to buffer before flushing to disk. 
     */
    override fun bufferLimit(bufferLimit: Number) {
      cdkBuilder.bufferLimit(bufferLimit)
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
     * The maximum number of retries.
     *
     * Default: - 4294967295 (2**32 - 1).
     *
     * @param maxRetries The maximum number of retries. 
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * How long to wait between retries.
     *
     * Default: - 1 second
     *
     * @param retryWait How long to wait between retries. 
     */
    override fun retryWait(retryWait: Duration) {
      cdkBuilder.retryWait(retryWait.let(Duration::unwrap))
    }

    /**
     * Generates event logs in nanosecond resolution.
     *
     * Default: - false
     *
     * @param subSecondPrecision Generates event logs in nanosecond resolution. 
     */
    override fun subSecondPrecision(subSecondPrecision: Boolean) {
      cdkBuilder.subSecondPrecision(subSecondPrecision)
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

    public fun build(): software.amazon.awscdk.services.ecs.FluentdLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FluentdLogDriver {
      val builderImpl = BuilderImpl()
      return FluentdLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriver):
        FluentdLogDriver = FluentdLogDriver(cdkObject)

    internal fun unwrap(wrapped: FluentdLogDriver):
        software.amazon.awscdk.services.ecs.FluentdLogDriver = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.FluentdLogDriver
  }
}
