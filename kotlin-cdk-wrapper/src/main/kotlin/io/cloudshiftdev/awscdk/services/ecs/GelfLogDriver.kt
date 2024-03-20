@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
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
 * GelfLogDriver gelfLogDriver = GelfLogDriver.Builder.create()
 * .address("address")
 * // the properties below are optional
 * .compressionLevel(123)
 * .compressionType(GelfCompressionType.GZIP)
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .tag("tag")
 * .tcpMaxReconnect(123)
 * .tcpReconnectDelay(Duration.minutes(30))
 * .build();
 * ```
 */
public open class GelfLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriver,
) : LogDriver(cdkObject) {
  public constructor(props: GelfLogDriverProps) :
      this(software.amazon.awscdk.services.ecs.GelfLogDriver(props.let(GelfLogDriverProps::unwrap))
  )

  public constructor(props: GelfLogDriverProps.Builder.() -> Unit) : this(GelfLogDriverProps(props)
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
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.GelfLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The address of the GELF server.
     *
     * tcp and udp are the only supported URI
     * specifier and you must specify the port.
     *
     * @param address The address of the GELF server. 
     */
    public fun address(address: String)

    /**
     * UDP Only The level of compression when gzip or zlib is the gelf-compression-type.
     *
     * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more
     * compression at lower speed. Either -1 or 0 disables compression.
     *
     * Default: - 1
     *
     * @param compressionLevel UDP Only The level of compression when gzip or zlib is the
     * gelf-compression-type. 
     */
    public fun compressionLevel(compressionLevel: Number)

    /**
     * UDP Only The type of compression the GELF driver uses to compress each log message.
     *
     * Allowed values are gzip, zlib and none.
     *
     * Default: - gzip
     *
     * @param compressionType UDP Only The type of compression the GELF driver uses to compress each
     * log message. 
     */
    public fun compressionType(compressionType: GelfCompressionType)

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

    /**
     * TCP Only The maximum number of reconnection attempts when the connection drop.
     *
     * A positive integer.
     *
     * Default: - 3
     *
     * @param tcpMaxReconnect TCP Only The maximum number of reconnection attempts when the
     * connection drop. 
     */
    public fun tcpMaxReconnect(tcpMaxReconnect: Number)

    /**
     * TCP Only The number of seconds to wait between reconnection attempts.
     *
     * A positive integer.
     *
     * Default: - 1
     *
     * @param tcpReconnectDelay TCP Only The number of seconds to wait between reconnection
     * attempts. 
     */
    public fun tcpReconnectDelay(tcpReconnectDelay: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GelfLogDriver.Builder =
        software.amazon.awscdk.services.ecs.GelfLogDriver.Builder.create()

    /**
     * The address of the GELF server.
     *
     * tcp and udp are the only supported URI
     * specifier and you must specify the port.
     *
     * @param address The address of the GELF server. 
     */
    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    /**
     * UDP Only The level of compression when gzip or zlib is the gelf-compression-type.
     *
     * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more
     * compression at lower speed. Either -1 or 0 disables compression.
     *
     * Default: - 1
     *
     * @param compressionLevel UDP Only The level of compression when gzip or zlib is the
     * gelf-compression-type. 
     */
    override fun compressionLevel(compressionLevel: Number) {
      cdkBuilder.compressionLevel(compressionLevel)
    }

    /**
     * UDP Only The type of compression the GELF driver uses to compress each log message.
     *
     * Allowed values are gzip, zlib and none.
     *
     * Default: - gzip
     *
     * @param compressionType UDP Only The type of compression the GELF driver uses to compress each
     * log message. 
     */
    override fun compressionType(compressionType: GelfCompressionType) {
      cdkBuilder.compressionType(compressionType.let(GelfCompressionType::unwrap))
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

    /**
     * TCP Only The maximum number of reconnection attempts when the connection drop.
     *
     * A positive integer.
     *
     * Default: - 3
     *
     * @param tcpMaxReconnect TCP Only The maximum number of reconnection attempts when the
     * connection drop. 
     */
    override fun tcpMaxReconnect(tcpMaxReconnect: Number) {
      cdkBuilder.tcpMaxReconnect(tcpMaxReconnect)
    }

    /**
     * TCP Only The number of seconds to wait between reconnection attempts.
     *
     * A positive integer.
     *
     * Default: - 1
     *
     * @param tcpReconnectDelay TCP Only The number of seconds to wait between reconnection
     * attempts. 
     */
    override fun tcpReconnectDelay(tcpReconnectDelay: Duration) {
      cdkBuilder.tcpReconnectDelay(tcpReconnectDelay.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.GelfLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GelfLogDriver {
      val builderImpl = BuilderImpl()
      return GelfLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriver): GelfLogDriver =
        GelfLogDriver(cdkObject)

    internal fun unwrap(wrapped: GelfLogDriver): software.amazon.awscdk.services.ecs.GelfLogDriver =
        wrapped.cdkObject
  }
}
