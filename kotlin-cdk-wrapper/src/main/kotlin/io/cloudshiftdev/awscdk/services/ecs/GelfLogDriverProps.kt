@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies the journald log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/gelf/)
 *
 * Example:
 *
 * ```
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.gelf(GelfLogDriverProps.builder().address("my-gelf-address").build()))
 * .build());
 * ```
 */
public interface GelfLogDriverProps : BaseLogDriverProps {
  /**
   * The address of the GELF server.
   *
   * tcp and udp are the only supported URI
   * specifier and you must specify the port.
   */
  public fun address(): String

  /**
   * UDP Only The level of compression when gzip or zlib is the gelf-compression-type.
   *
   * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more
   * compression at lower speed. Either -1 or 0 disables compression.
   *
   * Default: - 1
   */
  public fun compressionLevel(): Number? = unwrap(this).getCompressionLevel()

  /**
   * UDP Only The type of compression the GELF driver uses to compress each log message.
   *
   * Allowed values are gzip, zlib and none.
   *
   * Default: - gzip
   */
  public fun compressionType(): GelfCompressionType? =
      unwrap(this).getCompressionType()?.let(GelfCompressionType::wrap)

  /**
   * TCP Only The maximum number of reconnection attempts when the connection drop.
   *
   * A positive integer.
   *
   * Default: - 3
   */
  public fun tcpMaxReconnect(): Number? = unwrap(this).getTcpMaxReconnect()

  /**
   * TCP Only The number of seconds to wait between reconnection attempts.
   *
   * A positive integer.
   *
   * Default: - 1
   */
  public fun tcpReconnectDelay(): Duration? =
      unwrap(this).getTcpReconnectDelay()?.let(Duration::wrap)

  /**
   * A builder for [GelfLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param address The address of the GELF server. 
     * tcp and udp are the only supported URI
     * specifier and you must specify the port.
     */
    public fun address(address: String)

    /**
     * @param compressionLevel UDP Only The level of compression when gzip or zlib is the
     * gelf-compression-type.
     * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more
     * compression at lower speed. Either -1 or 0 disables compression.
     */
    public fun compressionLevel(compressionLevel: Number)

    /**
     * @param compressionType UDP Only The type of compression the GELF driver uses to compress each
     * log message.
     * Allowed values are gzip, zlib and none.
     */
    public fun compressionType(compressionType: GelfCompressionType)

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
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    public fun tag(tag: String)

    /**
     * @param tcpMaxReconnect TCP Only The maximum number of reconnection attempts when the
     * connection drop.
     * A positive integer.
     */
    public fun tcpMaxReconnect(tcpMaxReconnect: Number)

    /**
     * @param tcpReconnectDelay TCP Only The number of seconds to wait between reconnection
     * attempts.
     * A positive integer.
     */
    public fun tcpReconnectDelay(tcpReconnectDelay: Duration)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.GelfLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.GelfLogDriverProps.builder()

    /**
     * @param address The address of the GELF server. 
     * tcp and udp are the only supported URI
     * specifier and you must specify the port.
     */
    override fun address(address: String) {
      cdkBuilder.address(address)
    }

    /**
     * @param compressionLevel UDP Only The level of compression when gzip or zlib is the
     * gelf-compression-type.
     * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more
     * compression at lower speed. Either -1 or 0 disables compression.
     */
    override fun compressionLevel(compressionLevel: Number) {
      cdkBuilder.compressionLevel(compressionLevel)
    }

    /**
     * @param compressionType UDP Only The type of compression the GELF driver uses to compress each
     * log message.
     * Allowed values are gzip, zlib and none.
     */
    override fun compressionType(compressionType: GelfCompressionType) {
      cdkBuilder.compressionType(compressionType.let(GelfCompressionType::unwrap))
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
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    /**
     * @param tcpMaxReconnect TCP Only The maximum number of reconnection attempts when the
     * connection drop.
     * A positive integer.
     */
    override fun tcpMaxReconnect(tcpMaxReconnect: Number) {
      cdkBuilder.tcpMaxReconnect(tcpMaxReconnect)
    }

    /**
     * @param tcpReconnectDelay TCP Only The number of seconds to wait between reconnection
     * attempts.
     * A positive integer.
     */
    override fun tcpReconnectDelay(tcpReconnectDelay: Duration) {
      cdkBuilder.tcpReconnectDelay(tcpReconnectDelay.let(Duration::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.GelfLogDriverProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriverProps,
  ) : CdkObject(cdkObject), GelfLogDriverProps {
    /**
     * The address of the GELF server.
     *
     * tcp and udp are the only supported URI
     * specifier and you must specify the port.
     */
    override fun address(): String = unwrap(this).getAddress()

    /**
     * UDP Only The level of compression when gzip or zlib is the gelf-compression-type.
     *
     * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more
     * compression at lower speed. Either -1 or 0 disables compression.
     *
     * Default: - 1
     */
    override fun compressionLevel(): Number? = unwrap(this).getCompressionLevel()

    /**
     * UDP Only The type of compression the GELF driver uses to compress each log message.
     *
     * Allowed values are gzip, zlib and none.
     *
     * Default: - gzip
     */
    override fun compressionType(): GelfCompressionType? =
        unwrap(this).getCompressionType()?.let(GelfCompressionType::wrap)

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
     * By default, Docker uses the first 12 characters of the container ID to tag log messages.
     *
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     *
     * Default: - The first 12 characters of the container ID
     */
    override fun tag(): String? = unwrap(this).getTag()

    /**
     * TCP Only The maximum number of reconnection attempts when the connection drop.
     *
     * A positive integer.
     *
     * Default: - 3
     */
    override fun tcpMaxReconnect(): Number? = unwrap(this).getTcpMaxReconnect()

    /**
     * TCP Only The number of seconds to wait between reconnection attempts.
     *
     * A positive integer.
     *
     * Default: - 1
     */
    override fun tcpReconnectDelay(): Duration? =
        unwrap(this).getTcpReconnectDelay()?.let(Duration::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GelfLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.GelfLogDriverProps):
        GelfLogDriverProps = CdkObjectWrappers.wrap(cdkObject) as? GelfLogDriverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GelfLogDriverProps):
        software.amazon.awscdk.services.ecs.GelfLogDriverProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.GelfLogDriverProps
  }
}
