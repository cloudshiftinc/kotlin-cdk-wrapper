@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.JsonFileLogDriver

@CdkDslMarker
public class JsonFileLogDriverDsl {
  private val cdkBuilder: JsonFileLogDriver.Builder = JsonFileLogDriver.Builder.create()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

  /**
   * Toggles compression for rotated logs.
   *
   * Default: - false
   *
   * @param compress Toggles compression for rotated logs. 
   */
  public fun compress(compress: Boolean) {
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
  public fun maxFile(maxFile: Number) {
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
  public fun maxSize(maxSize: String) {
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
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun build(): JsonFileLogDriver {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
