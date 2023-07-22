@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.FluentdLogDriver

@CdkDslMarker
public class FluentdLogDriverDsl {
  private val cdkBuilder: FluentdLogDriver.Builder = FluentdLogDriver.Builder.create()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

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
  public fun address(address: String) {
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
  public fun asyncConnect(asyncConnect: Boolean) {
    cdkBuilder.asyncConnect(asyncConnect)
  }

  /**
   * The amount of data to buffer before flushing to disk.
   *
   * Default: - The amount of RAM available to the container.
   *
   * @param bufferLimit The amount of data to buffer before flushing to disk. 
   */
  public fun bufferLimit(bufferLimit: Number) {
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
   * The maximum number of retries.
   *
   * Default: - 4294967295 (2**32 - 1).
   *
   * @param maxRetries The maximum number of retries. 
   */
  public fun maxRetries(maxRetries: Number) {
    cdkBuilder.maxRetries(maxRetries)
  }

  /**
   * How long to wait between retries.
   *
   * Default: - 1 second
   *
   * @param retryWait How long to wait between retries. 
   */
  public fun retryWait(retryWait: Duration) {
    cdkBuilder.retryWait(retryWait)
  }

  /**
   * Generates event logs in nanosecond resolution.
   *
   * Default: - false
   *
   * @param subSecondPrecision Generates event logs in nanosecond resolution. 
   */
  public fun subSecondPrecision(subSecondPrecision: Boolean) {
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
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun build(): FluentdLogDriver {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
