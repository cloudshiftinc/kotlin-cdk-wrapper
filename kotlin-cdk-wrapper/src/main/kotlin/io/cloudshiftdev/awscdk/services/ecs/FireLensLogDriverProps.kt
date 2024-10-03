@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

/**
 * Specifies the firelens log driver configuration options.
 *
 * Example:
 *
 * ```
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.firelens(FireLensLogDriverProps.builder()
 * .options(Map.of(
 * "Name", "firehose",
 * "region", "us-west-2",
 * "delivery_stream", "my-stream"))
 * .build()))
 * .build());
 * ```
 */
public interface FireLensLogDriverProps : BaseLogDriverProps {
  /**
   * The configuration options to send to the log driver.
   *
   * Default: - the log driver options
   */
  public fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

  /**
   * The secrets to pass to the log configuration.
   *
   * Default: - No secret options provided.
   */
  public fun secretOptions(): Map<String, Secret> =
      unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

  /**
   * A builder for [FireLensLogDriverProps]
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
     * @param options The configuration options to send to the log driver.
     */
    public fun options(options: Map<String, String>)

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    public fun secretOptions(secretOptions: Map<String, Secret>)

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    public fun tag(tag: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.FireLensLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.FireLensLogDriverProps.builder()

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
     * @param options The configuration options to send to the log driver.
     */
    override fun options(options: Map<String, String>) {
      cdkBuilder.options(options)
    }

    /**
     * @param secretOptions The secrets to pass to the log configuration.
     */
    override fun secretOptions(secretOptions: Map<String, Secret>) {
      cdkBuilder.secretOptions(secretOptions.mapValues{Secret.unwrap(it.value)})
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

    public fun build(): software.amazon.awscdk.services.ecs.FireLensLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.ecs.FireLensLogDriverProps,
  ) : CdkObject(cdkObject),
      FireLensLogDriverProps {
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
     * The configuration options to send to the log driver.
     *
     * Default: - the log driver options
     */
    override fun options(): Map<String, String> = unwrap(this).getOptions() ?: emptyMap()

    /**
     * The secrets to pass to the log configuration.
     *
     * Default: - No secret options provided.
     */
    override fun secretOptions(): Map<String, Secret> =
        unwrap(this).getSecretOptions()?.mapValues{Secret.wrap(it.value)} ?: emptyMap()

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
    public operator fun invoke(block: Builder.() -> Unit = {}): FireLensLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.FireLensLogDriverProps):
        FireLensLogDriverProps = CdkObjectWrappers.wrap(cdkObject) as? FireLensLogDriverProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: FireLensLogDriverProps):
        software.amazon.awscdk.services.ecs.FireLensLogDriverProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.FireLensLogDriverProps
  }
}
