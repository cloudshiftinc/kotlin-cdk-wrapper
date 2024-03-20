@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A log driver that sends log information to syslog Logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * SyslogLogDriver syslogLogDriver = SyslogLogDriver.Builder.create()
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
public open class SyslogLogDriver internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriver,
) : LogDriver(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.ecs.SyslogLogDriver()
  )

  public constructor(props: SyslogLogDriverProps) :
      this(software.amazon.awscdk.services.ecs.SyslogLogDriver(props.let(SyslogLogDriverProps::unwrap))
  )

  public constructor(props: SyslogLogDriverProps.Builder.() -> Unit) :
      this(SyslogLogDriverProps(props)
  )

  /**
   * Called when the log driver is configured on a container.
   *
   * @param _scope 
   * @param _containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct::unwrap),
      containerDefinition.let(ContainerDefinition::unwrap)).let(LogDriverConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.SyslogLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The address of an external syslog server.
     *
     * The URI specifier may be
     * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
     *
     * Default: - If the transport is tcp, udp, or tcp+tls, the default port is 514.
     *
     * @param address The address of an external syslog server. 
     */
    public fun address(address: String)

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
    public fun env(env: List<String>)

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
    public fun env(vararg env: String)

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
    public fun envRegex(envRegex: String)

    /**
     * The syslog facility to use.
     *
     * Can be the number or name for any valid
     * syslog facility. See the syslog documentation:
     * https://tools.ietf.org/html/rfc5424#section-6.2.1.
     *
     * Default: - facility not set
     *
     * @param facility The syslog facility to use. 
     */
    public fun facility(facility: String)

    /**
     * The syslog message format to use.
     *
     * If not specified the local UNIX syslog
     * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
     * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
     * for RFC-5424 compatible format with microsecond timestamp resolution.
     *
     * Default: - format not set
     *
     * @param format The syslog message format to use. 
     */
    public fun format(format: String)

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
    public fun labels(labels: List<String>)

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
    public fun labels(vararg labels: String)

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
    public fun tag(tag: String)

    /**
     * The absolute path to the trust certificates signed by the CA.
     *
     * Ignored
     * if the address protocol is not tcp+tls.
     *
     * Default: - tlsCaCert not set
     *
     * @param tlsCaCert The absolute path to the trust certificates signed by the CA. 
     */
    public fun tlsCaCert(tlsCaCert: String)

    /**
     * The absolute path to the TLS certificate file.
     *
     * Ignored if the address
     * protocol is not tcp+tls.
     *
     * Default: - tlsCert not set
     *
     * @param tlsCert The absolute path to the TLS certificate file. 
     */
    public fun tlsCert(tlsCert: String)

    /**
     * The absolute path to the TLS key file.
     *
     * Ignored if the address protocol
     * is not tcp+tls.
     *
     * Default: - tlsKey not set
     *
     * @param tlsKey The absolute path to the TLS key file. 
     */
    public fun tlsKey(tlsKey: String)

    /**
     * If set to true, TLS verification is skipped when connecting to the syslog daemon.
     *
     * Ignored if the address protocol is not tcp+tls.
     *
     * Default: - false
     *
     * @param tlsSkipVerify If set to true, TLS verification is skipped when connecting to the
     * syslog daemon. 
     */
    public fun tlsSkipVerify(tlsSkipVerify: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SyslogLogDriver.Builder =
        software.amazon.awscdk.services.ecs.SyslogLogDriver.Builder.create()

    /**
     * The address of an external syslog server.
     *
     * The URI specifier may be
     * [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
     *
     * Default: - If the transport is tcp, udp, or tcp+tls, the default port is 514.
     *
     * @param address The address of an external syslog server. 
     */
    override fun address(address: String) {
      cdkBuilder.address(address)
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
    override fun env(env: List<String>) {
      cdkBuilder.env(env)
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
    override fun env(vararg env: String): Unit = env(env.toList())

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
    override fun envRegex(envRegex: String) {
      cdkBuilder.envRegex(envRegex)
    }

    /**
     * The syslog facility to use.
     *
     * Can be the number or name for any valid
     * syslog facility. See the syslog documentation:
     * https://tools.ietf.org/html/rfc5424#section-6.2.1.
     *
     * Default: - facility not set
     *
     * @param facility The syslog facility to use. 
     */
    override fun facility(facility: String) {
      cdkBuilder.facility(facility)
    }

    /**
     * The syslog message format to use.
     *
     * If not specified the local UNIX syslog
     * format is used, without a specified hostname. Specify rfc3164 for the RFC-3164
     * compatible format, rfc5424 for RFC-5424 compatible format, or rfc5424micro
     * for RFC-5424 compatible format with microsecond timestamp resolution.
     *
     * Default: - format not set
     *
     * @param format The syslog message format to use. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
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
    override fun labels(labels: List<String>) {
      cdkBuilder.labels(labels)
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
    override fun labels(vararg labels: String): Unit = labels(labels.toList())

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
    override fun tag(tag: String) {
      cdkBuilder.tag(tag)
    }

    /**
     * The absolute path to the trust certificates signed by the CA.
     *
     * Ignored
     * if the address protocol is not tcp+tls.
     *
     * Default: - tlsCaCert not set
     *
     * @param tlsCaCert The absolute path to the trust certificates signed by the CA. 
     */
    override fun tlsCaCert(tlsCaCert: String) {
      cdkBuilder.tlsCaCert(tlsCaCert)
    }

    /**
     * The absolute path to the TLS certificate file.
     *
     * Ignored if the address
     * protocol is not tcp+tls.
     *
     * Default: - tlsCert not set
     *
     * @param tlsCert The absolute path to the TLS certificate file. 
     */
    override fun tlsCert(tlsCert: String) {
      cdkBuilder.tlsCert(tlsCert)
    }

    /**
     * The absolute path to the TLS key file.
     *
     * Ignored if the address protocol
     * is not tcp+tls.
     *
     * Default: - tlsKey not set
     *
     * @param tlsKey The absolute path to the TLS key file. 
     */
    override fun tlsKey(tlsKey: String) {
      cdkBuilder.tlsKey(tlsKey)
    }

    /**
     * If set to true, TLS verification is skipped when connecting to the syslog daemon.
     *
     * Ignored if the address protocol is not tcp+tls.
     *
     * Default: - false
     *
     * @param tlsSkipVerify If set to true, TLS verification is skipped when connecting to the
     * syslog daemon. 
     */
    override fun tlsSkipVerify(tlsSkipVerify: Boolean) {
      cdkBuilder.tlsSkipVerify(tlsSkipVerify)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SyslogLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SyslogLogDriver {
      val builderImpl = BuilderImpl()
      return SyslogLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SyslogLogDriver):
        SyslogLogDriver = SyslogLogDriver(cdkObject)

    internal fun unwrap(wrapped: SyslogLogDriver):
        software.amazon.awscdk.services.ecs.SyslogLogDriver = wrapped.cdkObject
  }
}
