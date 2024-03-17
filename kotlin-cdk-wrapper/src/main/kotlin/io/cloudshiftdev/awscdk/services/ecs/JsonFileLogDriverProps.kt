@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies the json-file log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/json-file/)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * JsonFileLogDriverProps jsonFileLogDriverProps = JsonFileLogDriverProps.builder()
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
public interface JsonFileLogDriverProps : BaseLogDriverProps {
  /**
   * Toggles compression for rotated logs.
   *
   * Default: - false
   */
  public fun compress(): Boolean? = unwrap(this).getCompress()

  /**
   * The maximum number of log files that can be present.
   *
   * If rolling the logs creates
   * excess files, the oldest file is removed. Only effective when max-size is also set.
   * A positive integer.
   *
   * Default: - 1
   */
  public fun maxFile(): Number? = unwrap(this).getMaxFile()

  /**
   * The maximum size of the log before it is rolled.
   *
   * A positive integer plus a modifier
   * representing the unit of measure (k, m, or g).
   *
   * Default: - -1 (unlimited)
   */
  public fun maxSize(): String? = unwrap(this).getMaxSize()

  /**
   * A builder for [JsonFileLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param compress Toggles compression for rotated logs.
     */
    public fun compress(compress: Boolean)

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
     * @param maxFile The maximum number of log files that can be present.
     * If rolling the logs creates
     * excess files, the oldest file is removed. Only effective when max-size is also set.
     * A positive integer.
     */
    public fun maxFile(maxFile: Number)

    /**
     * @param maxSize The maximum size of the log before it is rolled.
     * A positive integer plus a modifier
     * representing the unit of measure (k, m, or g).
     */
    public fun maxSize(maxSize: String)

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.JsonFileLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.JsonFileLogDriverProps.builder()

    /**
     * @param compress Toggles compression for rotated logs.
     */
    override fun compress(compress: Boolean) {
      cdkBuilder.compress(compress)
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
     * @param maxFile The maximum number of log files that can be present.
     * If rolling the logs creates
     * excess files, the oldest file is removed. Only effective when max-size is also set.
     * A positive integer.
     */
    override fun maxFile(maxFile: Number) {
      cdkBuilder.maxFile(maxFile)
    }

    /**
     * @param maxSize The maximum size of the log before it is rolled.
     * A positive integer plus a modifier
     * representing the unit of measure (k, m, or g).
     */
    override fun maxSize(maxSize: String) {
      cdkBuilder.maxSize(maxSize)
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

    public fun build(): software.amazon.awscdk.services.ecs.JsonFileLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriverProps,
  ) : CdkObject(cdkObject), JsonFileLogDriverProps {
    /**
     * Toggles compression for rotated logs.
     *
     * Default: - false
     */
    override fun compress(): Boolean? = unwrap(this).getCompress()

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
     * The maximum number of log files that can be present.
     *
     * If rolling the logs creates
     * excess files, the oldest file is removed. Only effective when max-size is also set.
     * A positive integer.
     *
     * Default: - 1
     */
    override fun maxFile(): Number? = unwrap(this).getMaxFile()

    /**
     * The maximum size of the log before it is rolled.
     *
     * A positive integer plus a modifier
     * representing the unit of measure (k, m, or g).
     *
     * Default: - -1 (unlimited)
     */
    override fun maxSize(): String? = unwrap(this).getMaxSize()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): JsonFileLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.JsonFileLogDriverProps):
        JsonFileLogDriverProps = CdkObjectWrappers.wrap(cdkObject) as? JsonFileLogDriverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: JsonFileLogDriverProps):
        software.amazon.awscdk.services.ecs.JsonFileLogDriverProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.JsonFileLogDriverProps
  }
}
