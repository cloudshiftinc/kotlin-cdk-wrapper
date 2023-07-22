@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.FireLensLogDriver
import software.amazon.awscdk.services.ecs.Secret

/**
 * FireLens enables you to use task definition parameters to route logs to an AWS service  or AWS
 * Partner Network (APN) destination for log storage and analytics.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
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
@CdkDslMarker
public class FireLensLogDriverDsl {
  private val cdkBuilder: FireLensLogDriver.Builder = FireLensLogDriver.Builder.create()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

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
  public fun env(vararg env: String) {
    _env.addAll(listOf(*env))
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
  public fun env(env: Collection<String>) {
    _env.addAll(env)
  }

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
  public fun envRegex(envRegex: String) {
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
  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
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
  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  /**
   * The configuration options to send to the log driver.
   *
   * Default: - the log driver options
   *
   * @param options The configuration options to send to the log driver. 
   */
  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  /**
   * The secrets to pass to the log configuration.
   *
   * Default: - No secret options provided.
   *
   * @param secretOptions The secrets to pass to the log configuration. 
   */
  public fun secretOptions(secretOptions: Map<String, Secret>) {
    cdkBuilder.secretOptions(secretOptions)
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
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun build(): FireLensLogDriver {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
