@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies the syslog log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/syslog/)
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * SyslogLogDriverProps syslogLogDriverProps = SyslogLogDriverProps.builder()
 * .address("address")
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .facility("facility")
 * .format("format")
 * .labels(List.of("labels"))
 * .tag("tag")
 * .tlsCaCert("tlsCaCert")
 * .tlsCert("tlsCert")
 * .tlsKey("tlsKey")
 * .tlsSkipVerify(false)
 * .build();
 * ```
 */
public interface SyslogLogDriverProps : BaseLogDriverProps {
  /**
   * The address of an external syslog server.
   *
   * The URI specifier may be
   * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
   *
   * Default: - If the transport is tcp, udp, or tcp+tls, the default port is 514.
   */
  public fun address(): String? = unwrap(this).getAddress()

  /**
   * The syslog facility to use.
   *
   * Can be the number or name for any valid
   * syslog facility. See the syslog documentation:
   * https://tools.ietf.org/html/rfc5424#section-6.2.1.
   *
   * Default: - facility not set
   */
  public fun facility(): String? = unwrap(this).getFacility()

  /**
   * The syslog message format to use.
   *
   * If not specified the local UNIX syslog
   * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
   * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
   * for RFC-5424 compatible format with microsecond timestamp resolution.
   *
   * Default: - format not set
   */
  public fun format(): String? = unwrap(this).getFormat()

  /**
   * The absolute path to the trust certificates signed by the CA.
   *
   * Ignored
   * if the address protocol is not tcp+tls.
   *
   * Default: - tlsCaCert not set
   */
  public fun tlsCaCert(): String? = unwrap(this).getTlsCaCert()

  /**
   * The absolute path to the TLS certificate file.
   *
   * Ignored if the address
   * protocol is not tcp+tls.
   *
   * Default: - tlsCert not set
   */
  public fun tlsCert(): String? = unwrap(this).getTlsCert()

  /**
   * The absolute path to the TLS key file.
   *
   * Ignored if the address protocol
   * is not tcp+tls.
   *
   * Default: - tlsKey not set
   */
  public fun tlsKey(): String? = unwrap(this).getTlsKey()

  /**
   * If set to true, TLS verification is skipped when connecting to the syslog daemon.
   *
   * Ignored if the address protocol is not tcp+tls.
   *
   * Default: - false
   */
  public fun tlsSkipVerify(): Boolean? = unwrap(this).getTlsSkipVerify()

  /**
   * A builder for [SyslogLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param address The address of an external syslog server.
     * The URI specifier may be
     * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
     */
    public fun address(address: String)

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
     * @param facility The syslog facility to use.
     * Can be the number or name for any valid
     * syslog facility. See the syslog documentation:
     * https://tools.ietf.org/html/rfc5424#section-6.2.1.
     */
    public fun facility(facility: String)

    /**
     * @param format The syslog message format to use.
     * If not specified the local UNIX syslog
     * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
     * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
     * for RFC-5424 compatible format with microsecond timestamp resolution.
     */
    public fun format(format: String)

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
     * @param tlsCaCert The absolute path to the trust certificates signed by the CA.
     * Ignored
     * if the address protocol is not tcp+tls.
     */
    public fun tlsCaCert(tlsCaCert: String)

    /**
     * @param tlsCert The absolute path to the TLS certificate file.
     * Ignored if the address
     * protocol is not tcp+tls.
     */
    public fun tlsCert(tlsCert: String)

    /**
     * @param tlsKey The absolute path to the TLS key file.
     * Ignored if the address protocol
     * is not tcp+tls.
     */
    public fun tlsKey(tlsKey: String)

    /**
     * @param tlsSkipVerify If set to true, TLS verification is skipped when connecting to the
     * syslog daemon.
     * Ignored if the address protocol is not tcp+tls.
     */
    public fun tlsSkipVerify(tlsSkipVerify: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SyslogLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.SyslogLogDriverProps.builder()

    /**
     * @param address The address of an external syslog server.
     * The URI specifier may be
     * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
     */
    override fun address(address: String) {
      cdkBuilder.address(address)
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
     * @param facility The syslog facility to use.
     * Can be the number or name for any valid
     * syslog facility. See the syslog documentation:
     * https://tools.ietf.org/html/rfc5424#section-6.2.1.
     */
    override fun facility(facility: String) {
      cdkBuilder.facility(facility)
    }

    /**
     * @param format The syslog message format to use.
     * If not specified the local UNIX syslog
     * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
     * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
     * for RFC-5424 compatible format with microsecond timestamp resolution.
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
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
     * @param tlsCaCert The absolute path to the trust certificates signed by the CA.
     * Ignored
     * if the address protocol is not tcp+tls.
     */
    override fun tlsCaCert(tlsCaCert: String) {
      cdkBuilder.tlsCaCert(tlsCaCert)
    }

    /**
     * @param tlsCert The absolute path to the TLS certificate file.
     * Ignored if the address
     * protocol is not tcp+tls.
     */
    override fun tlsCert(tlsCert: String) {
      cdkBuilder.tlsCert(tlsCert)
    }

    /**
     * @param tlsKey The absolute path to the TLS key file.
     * Ignored if the address protocol
     * is not tcp+tls.
     */
    override fun tlsKey(tlsKey: String) {
      cdkBuilder.tlsKey(tlsKey)
    }

    /**
     * @param tlsSkipVerify If set to true, TLS verification is skipped when connecting to the
     * syslog daemon.
     * Ignored if the address protocol is not tcp+tls.
     */
    override fun tlsSkipVerify(tlsSkipVerify: Boolean) {
      cdkBuilder.tlsSkipVerify(tlsSkipVerify)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SyslogLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriverProps,
  ) : CdkObject(cdkObject), SyslogLogDriverProps {
    /**
     * The address of an external syslog server.
     *
     * The URI specifier may be
     * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
     *
     * Default: - If the transport is tcp, udp, or tcp+tls, the default port is 514.
     */
    override fun address(): String? = unwrap(this).getAddress()

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
     * The syslog facility to use.
     *
     * Can be the number or name for any valid
     * syslog facility. See the syslog documentation:
     * https://tools.ietf.org/html/rfc5424#section-6.2.1.
     *
     * Default: - facility not set
     */
    override fun facility(): String? = unwrap(this).getFacility()

    /**
     * The syslog message format to use.
     *
     * If not specified the local UNIX syslog
     * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
     * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
     * for RFC-5424 compatible format with microsecond timestamp resolution.
     *
     * Default: - format not set
     */
    override fun format(): String? = unwrap(this).getFormat()

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
     * The absolute path to the trust certificates signed by the CA.
     *
     * Ignored
     * if the address protocol is not tcp+tls.
     *
     * Default: - tlsCaCert not set
     */
    override fun tlsCaCert(): String? = unwrap(this).getTlsCaCert()

    /**
     * The absolute path to the TLS certificate file.
     *
     * Ignored if the address
     * protocol is not tcp+tls.
     *
     * Default: - tlsCert not set
     */
    override fun tlsCert(): String? = unwrap(this).getTlsCert()

    /**
     * The absolute path to the TLS key file.
     *
     * Ignored if the address protocol
     * is not tcp+tls.
     *
     * Default: - tlsKey not set
     */
    override fun tlsKey(): String? = unwrap(this).getTlsKey()

    /**
     * If set to true, TLS verification is skipped when connecting to the syslog daemon.
     *
     * Ignored if the address protocol is not tcp+tls.
     *
     * Default: - false
     */
    override fun tlsSkipVerify(): Boolean? = unwrap(this).getTlsSkipVerify()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SyslogLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriverProps):
        SyslogLogDriverProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SyslogLogDriverProps):
        software.amazon.awscdk.services.ecs.SyslogLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.SyslogLogDriverProps
  }
}
