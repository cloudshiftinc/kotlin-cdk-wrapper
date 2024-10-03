@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies the fluentd log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/fluentd/)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * FluentdLogDriverProps fluentdLogDriverProps = FluentdLogDriverProps.builder()
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
public interface FluentdLogDriverProps : BaseLogDriverProps {
  /**
   * By default, the logging driver connects to localhost:24224.
   *
   * Supply the
   * address option to connect to a different address. tcp(default) and unix
   * sockets are supported.
   *
   * Default: - address not set.
   */
  public fun address(): String? = unwrap(this).getAddress()

  /**
   * Docker connects to Fluentd in the background.
   *
   * Messages are buffered until
   * the connection is established.
   *
   * Default: - false
   */
  public fun asyncConnect(): Boolean? = unwrap(this).getAsyncConnect()

  /**
   * The amount of data to buffer before flushing to disk.
   *
   * Default: - The amount of RAM available to the container.
   */
  public fun bufferLimit(): Number? = unwrap(this).getBufferLimit()

  /**
   * The maximum number of retries.
   *
   * Default: - 4294967295 (2**32 - 1).
   */
  public fun maxRetries(): Number? = unwrap(this).getMaxRetries()

  /**
   * How long to wait between retries.
   *
   * Default: - 1 second
   */
  public fun retryWait(): Duration? = unwrap(this).getRetryWait()?.let(Duration::wrap)

  /**
   * Generates event logs in nanosecond resolution.
   *
   * Default: - false
   */
  public fun subSecondPrecision(): Boolean? = unwrap(this).getSubSecondPrecision()

  /**
   * A builder for [FluentdLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param address By default, the logging driver connects to localhost:24224.
     * Supply the
     * address option to connect to a different address. tcp(default) and unix
     * sockets are supported.
     */
    public fun address(address: String)

    /**
     * @param asyncConnect Docker connects to Fluentd in the background.
     * Messages are buffered until
     * the connection is established.
     */
    public fun asyncConnect(asyncConnect: Boolean)

    /**
     * @param bufferLimit The amount of data to buffer before flushing to disk.
     */
    public fun bufferLimit(bufferLimit: Number)

    /**
     * @param env The env option takes an array of keys.
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     */
    public fun env(env: List<String>)

    /**
     * @param env The env option takes an array of keys.
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     */
    public fun env(vararg env: String)

    /**
     * @param envRegex The env-regex option is similar to and compatible with env.
     * Its value is a regular
     * expression to match logging-related environment variables. It is used for advanced
     * log tag options.
     */
    public fun envRegex(envRegex: String)

    /**
     * @param labels The labels option takes an array of keys.
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     */
    public fun labels(labels: List<String>)

    /**
     * @param labels The labels option takes an array of keys.
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     */
    public fun labels(vararg labels: String)

    /**
     * @param maxRetries The maximum number of retries.
     */
    public fun maxRetries(maxRetries: Number)

    /**
     * @param retryWait How long to wait between retries.
     */
    public fun retryWait(retryWait: Duration)

    /**
     * @param subSecondPrecision Generates event logs in nanosecond resolution.
     */
    public fun subSecondPrecision(subSecondPrecision: Boolean)

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FluentdLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.FluentdLogDriverProps.builder()

    /**
     * @param address By default, the logging driver connects to localhost:24224.
     * Supply the
     * address option to connect to a different address. tcp(default) and unix
     * sockets are supported.
     */
    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    /**
     * @param asyncConnect Docker connects to Fluentd in the background.
     * Messages are buffered until
     * the connection is established.
     */
    override fun asyncConnect(asyncConnect: Boolean) {
      cdkBuilder.asyncConnect(asyncConnect)
    }

    /**
     * @param bufferLimit The amount of data to buffer before flushing to disk.
     */
    override fun bufferLimit(bufferLimit: Number) {
      cdkBuilder.bufferLimit(bufferLimit)
    }

    /**
     * @param env The env option takes an array of keys.
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     */
    override fun env(env: List<String>) {
      cdkBuilder.env(env)
    }

    /**
     * @param env The env option takes an array of keys.
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     */
    override fun env(vararg env: String): Unit = env(env.toList())

    /**
     * @param envRegex The env-regex option is similar to and compatible with env.
     * Its value is a regular
     * expression to match logging-related environment variables. It is used for advanced
     * log tag options.
     */
    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    /**
     * @param labels The labels option takes an array of keys.
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     */
    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
    }

    /**
     * @param labels The labels option takes an array of keys.
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     */
    override fun labels(vararg labels: String): Unit = labels(labels.toList())

    /**
     * @param maxRetries The maximum number of retries.
     */
    override fun maxRetries(maxRetries: Number) {
      cdkBuilder.maxRetries(maxRetries)
    }

    /**
     * @param retryWait How long to wait between retries.
     */
    override fun retryWait(retryWait: Duration) {
      cdkBuilder.retryWait(retryWait.let(Duration.Companion::unwrap))
    }

    /**
     * @param subSecondPrecision Generates event logs in nanosecond resolution.
     */
    override fun subSecondPrecision(subSecondPrecision: Boolean) {
      cdkBuilder.subSecondPrecision(subSecondPrecision)
    }

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    public fun build(): software.amazon.awscdk.services.ecs.FluentdLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriverProps,
  ) : CdkObject(cdkObject),
      FluentdLogDriverProps {
    /**
     * By default, the logging driver connects to localhost:24224.
     *
     * Supply the
     * address option to connect to a different address. tcp(default) and unix
     * sockets are supported.
     *
     * Default: - address not set.
     */
    override fun address(): String? = unwrap(this).getAddress()

    /**
     * Docker connects to Fluentd in the background.
     *
     * Messages are buffered until
     * the connection is established.
     *
     * Default: - false
     */
    override fun asyncConnect(): Boolean? = unwrap(this).getAsyncConnect()

    /**
     * The amount of data to buffer before flushing to disk.
     *
     * Default: - The amount of RAM available to the container.
     */
    override fun bufferLimit(): Number? = unwrap(this).getBufferLimit()

    /**
     * The env option takes an array of keys.
     *
     * If there is collision between
     * label and env keys, the value of the env takes precedence. Adds additional fields
     * to the extra attributes of a logging message.
     *
     * Default: - No env
     */
    override fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

    /**
     * The env-regex option is similar to and compatible with env.
     *
     * Its value is a regular
     * expression to match logging-related environment variables. It is used for advanced
     * log tag options.
     *
     * Default: - No envRegex
     */
    override fun envRegex(): String? = unwrap(this).getEnvRegex()

    /**
     * The labels option takes an array of keys.
     *
     * If there is collision
     * between label and env keys, the value of the env takes precedence. Adds additional
     * fields to the extra attributes of a logging message.
     *
     * Default: - No labels
     */
    override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    /**
     * The maximum number of retries.
     *
     * Default: - 4294967295 (2**32 - 1).
     */
    override fun maxRetries(): Number? = unwrap(this).getMaxRetries()

    /**
     * How long to wait between retries.
     *
     * Default: - 1 second
     */
    override fun retryWait(): Duration? = unwrap(this).getRetryWait()?.let(Duration::wrap)

    /**
     * Generates event logs in nanosecond resolution.
     *
     * Default: - false
     */
    override fun subSecondPrecision(): Boolean? = unwrap(this).getSubSecondPrecision()

    /**
     * By default, Docker uses the first 12 characters of the container ID to tag log messages.
     *
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     *
     * Default: - The first 12 characters of the container ID
     */
    override fun tag(): String? = unwrap(this).getTag()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FluentdLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FluentdLogDriverProps):
        FluentdLogDriverProps = CdkObjectWrappers.wrap(cdkObject) as? FluentdLogDriverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FluentdLogDriverProps):
        software.amazon.awscdk.services.ecs.FluentdLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.FluentdLogDriverProps
  }
}
