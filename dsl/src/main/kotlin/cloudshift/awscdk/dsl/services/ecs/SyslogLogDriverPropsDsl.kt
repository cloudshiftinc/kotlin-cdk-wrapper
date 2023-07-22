@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.SyslogLogDriverProps

@CdkDslMarker
public class SyslogLogDriverPropsDsl {
  private val cdkBuilder: SyslogLogDriverProps.Builder = SyslogLogDriverProps.builder()

  private val _env: MutableList<String> = mutableListOf()

  private val _labels: MutableList<String> = mutableListOf()

  /**
   * @param address The address of an external syslog server.
   * The URI specifier may be
   * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
   */
  public fun address(address: String) {
    cdkBuilder.address(address)
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
   * @param facility The syslog facility to use.
   * Can be the number or name for any valid
   * syslog facility. See the syslog documentation:
   * https://tools.ietf.org/html/rfc5424#section-6.2.1.
   */
  public fun facility(facility: String) {
    cdkBuilder.facility(facility)
  }

  /**
   * @param format The syslog message format to use.
   * If not specified the local UNIX syslog
   * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
   * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
   * for RFC-5424 compatible format with microsecond timestamp resolution.
   */
  public fun format(format: String) {
    cdkBuilder.format(format)
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
   * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
   * messages.
   * Refer to the log tag option documentation for customizing the
   * log tag format.
   */
  public fun tag(tag: String) {
    cdkBuilder.tag(tag)
  }

  /**
   * @param tlsCaCert The absolute path to the trust certificates signed by the CA.
   * Ignored
   * if the address protocol is not tcp+tls.
   */
  public fun tlsCaCert(tlsCaCert: String) {
    cdkBuilder.tlsCaCert(tlsCaCert)
  }

  /**
   * @param tlsCert The absolute path to the TLS certificate file.
   * Ignored if the address
   * protocol is not tcp+tls.
   */
  public fun tlsCert(tlsCert: String) {
    cdkBuilder.tlsCert(tlsCert)
  }

  /**
   * @param tlsKey The absolute path to the TLS key file.
   * Ignored if the address protocol
   * is not tcp+tls.
   */
  public fun tlsKey(tlsKey: String) {
    cdkBuilder.tlsKey(tlsKey)
  }

  /**
   * @param tlsSkipVerify If set to true, TLS verification is skipped when connecting to the syslog
   * daemon.
   * Ignored if the address protocol is not tcp+tls.
   */
  public fun tlsSkipVerify(tlsSkipVerify: Boolean) {
    cdkBuilder.tlsSkipVerify(tlsSkipVerify)
  }

  public fun build(): SyslogLogDriverProps {
    if(_env.isNotEmpty()) cdkBuilder.env(_env)
    if(_labels.isNotEmpty()) cdkBuilder.labels(_labels)
    return cdkBuilder.build()
  }
}
