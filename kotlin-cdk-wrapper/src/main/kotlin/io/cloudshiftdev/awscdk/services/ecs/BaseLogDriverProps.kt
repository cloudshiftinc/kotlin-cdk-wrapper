@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * BaseLogDriverProps baseLogDriverProps = BaseLogDriverProps.builder()
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .tag("tag")
 * .build();
 * ```
 */
public interface BaseLogDriverProps {
  /**
   * The env option takes an array of keys.
   *
   * If there is collision between
   * label and env keys, the value of the env takes precedence. Adds additional fields
   * to the extra attributes of a logging message.
   *
   * Default: - No env
   */
  public fun env(): List<String> = unwrap(this).getEnv() ?: emptyList()

  /**
   * The env-regex option is similar to and compatible with env.
   *
   * Its value is a regular
   * expression to match logging-related environment variables. It is used for advanced
   * log tag options.
   *
   * Default: - No envRegex
   */
  public fun envRegex(): String? = unwrap(this).getEnvRegex()

  /**
   * The labels option takes an array of keys.
   *
   * If there is collision
   * between label and env keys, the value of the env takes precedence. Adds additional
   * fields to the extra attributes of a logging message.
   *
   * Default: - No labels
   */
  public fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

  /**
   * By default, Docker uses the first 12 characters of the container ID to tag log messages.
   *
   * Refer to the log tag option documentation for customizing the
   * log tag format.
   *
   * Default: - The first 12 characters of the container ID
   */
  public fun tag(): String? = unwrap(this).getTag()

  /**
   * A builder for [BaseLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
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
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.BaseLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.BaseLogDriverProps.builder()

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

    public fun build(): software.amazon.awscdk.services.ecs.BaseLogDriverProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.BaseLogDriverProps,
  ) : CdkObject(cdkObject), BaseLogDriverProps {
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
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): BaseLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.BaseLogDriverProps):
        BaseLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: BaseLogDriverProps):
        software.amazon.awscdk.services.ecs.BaseLogDriverProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.BaseLogDriverProps
  }
}
