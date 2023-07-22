@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.FluentdLogDriverProps

@CdkDslMarker
public class FluentdLogDriverPropsDsl {
  private val cdkBuilder: FluentdLogDriverProps.Builder = FluentdLogDriverProps.builder()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

  /**
   * @param address By default, the logging driver connects to localhost:24224.
   * Supply the
   * address option to connect to a different address. tcp(default) and unix
   * sockets are supported.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
  }

  /**
   * @param asyncConnect Docker connects to Fluentd in the background.
   * Messages are buffered until
   * the connection is established.
   */
  public fun asyncConnect(asyncConnect: Boolean) {
    cdkBuilder.asyncConnect(asyncConnect)
  }

  /**
   * @param bufferLimit The amount of data to buffer before flushing to disk.
   */
  public fun bufferLimit(bufferLimit: Number) {
    cdkBuilder.bufferLimit(bufferLimit)
  }

  /**
   * @param env The env option takes an array of keys.
   * If there is collision between
   * label and env keys, the value of the env takes precedence. Adds additional fields
   * to the extra attributes of a logging message.
   */
  public fun env(vararg env: String) {
    _env.addAll(listOf(*env))
  }

  /**
   * @param env The env option takes an array of keys.
   * If there is collision between
   * label and env keys, the value of the env takes precedence. Adds additional fields
   * to the extra attributes of a logging message.
   */
  public fun env(env: Collection<String>) {
    _env.addAll(env)
  }

  /**
   * @param envRegex The env-regex option is similar to and compatible with env.
   * Its value is a regular
   * expression to match logging-related environment variables. It is used for advanced
   * log tag options.
   */
  public fun envRegex(envRegex: String) {
    cdkBuilder.envRegex(envRegex)
  }

  /**
   * @param labels The labels option takes an array of keys.
   * If there is collision
   * between label and env keys, the value of the env takes precedence. Adds additional
   * fields to the extra attributes of a logging message.
   */
  public fun labels(vararg labels: String) {
    _labels.addAll(listOf(*labels))
  }

  /**
   * @param labels The labels option takes an array of keys.
   * If there is collision
   * between label and env keys, the value of the env takes precedence. Adds additional
   * fields to the extra attributes of a logging message.
   */
  public fun labels(labels: Collection<String>) {
    _labels.addAll(labels)
  }

  /**
   * @param maxRetries The maximum number of retries.
   */
  public fun maxRetries(maxRetries: Number) {
    cdkBuilder.maxRetries(maxRetries)
  }

  /**
   * @param retryWait How long to wait between retries.
   */
  public fun retryWait(retryWait: Duration) {
    cdkBuilder.retryWait(retryWait)
  }

  /**
   * @param subSecondPrecision Generates event logs in nanosecond resolution.
   */
  public fun subSecondPrecision(subSecondPrecision: Boolean) {
    cdkBuilder.subSecondPrecision(subSecondPrecision)
  }

  /**
   * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
   * messages.
   * Refer to the log tag option documentation for customizing the
   * log tag format.
   */
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  public fun build(): FluentdLogDriverProps {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
