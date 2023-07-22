@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.FireLensLogDriverProps
import software.amazon.awscdk.services.ecs.Secret

@CdkDslMarker
public class FireLensLogDriverPropsDsl {
  private val cdkBuilder: FireLensLogDriverProps.Builder = FireLensLogDriverProps.builder()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

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
   * @param options The configuration options to send to the log driver.
   */
  public fun options(options: Map<String, String>) {
    cdkBuilder.options(options)
  }

  /**
   * @param secretOptions The secrets to pass to the log configuration.
   */
  public fun secretOptions(secretOptions: Map<String, Secret>) {
    cdkBuilder.secretOptions(secretOptions)
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

  public fun build(): FireLensLogDriverProps {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
