@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.SyslogLogDriver

/**
 * A log driver that sends log information to syslog Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
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
@CdkDslMarker
public class SyslogLogDriverDsl {
    private val cdkBuilder: SyslogLogDriver.Builder = SyslogLogDriver.Builder.create()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    /**
     * The address of an external syslog server.
     *
     * The URI specifier may be [tcp|udp|tcp+tls]://host:port, unix://path, or unixgram://path.
     *
     * Default: - If the transport is tcp, udp, or tcp+tls, the default port is 514.
     *
     * @param address The address of an external syslog server.
     */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /**
     * The env option takes an array of keys.
     *
     * If there is collision between label and env keys, the value of the env takes precedence. Adds
     * additional fields to the extra attributes of a logging message.
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
     * If there is collision between label and env keys, the value of the env takes precedence. Adds
     * additional fields to the extra attributes of a logging message.
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
     * Its value is a regular expression to match logging-related environment variables. It is used
     * for advanced log tag options.
     *
     * Default: - No envRegex
     *
     * @param envRegex The env-regex option is similar to and compatible with env.
     */
    public fun envRegex(envRegex: String) {
        cdkBuilder.envRegex(envRegex)
    }

    /**
     * The syslog facility to use.
     *
     * Can be the number or name for any valid syslog facility. See the syslog documentation:
     * https://tools.ietf.org/html/rfc5424#section-6.2.1.
     *
     * Default: - facility not set
     *
     * @param facility The syslog facility to use.
     */
    public fun facility(facility: String) {
        cdkBuilder.facility(facility)
    }

    /**
     * The syslog message format to use.
     *
     * If not specified the local UNIX syslog format is used, without a specified hostname. Specify
     * rfc3164 for the RFC-3164 compatible format, rfc5424 for RFC-5424 compatible format, or
     * rfc5424micro for RFC-5424 compatible format with microsecond timestamp resolution.
     *
     * Default: - format not set
     *
     * @param format The syslog message format to use.
     */
    public fun format(format: String) {
        cdkBuilder.format(format)
    }

    /**
     * The labels option takes an array of keys.
     *
     * If there is collision between label and env keys, the value of the env takes precedence. Adds
     * additional fields to the extra attributes of a logging message.
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
     * If there is collision between label and env keys, the value of the env takes precedence. Adds
     * additional fields to the extra attributes of a logging message.
     *
     * Default: - No labels
     *
     * @param labels The labels option takes an array of keys.
     */
    public fun labels(labels: Collection<String>) {
        _labels.addAll(labels)
    }

    /**
     * By default, Docker uses the first 12 characters of the container ID to tag log messages.
     *
     * Refer to the log tag option documentation for customizing the log tag format.
     *
     * Default: - The first 12 characters of the container ID
     *
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     *   messages.
     */
    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    /**
     * The absolute path to the trust certificates signed by the CA.
     *
     * Ignored if the address protocol is not tcp+tls.
     *
     * Default: - tlsCaCert not set
     *
     * @param tlsCaCert The absolute path to the trust certificates signed by the CA.
     */
    public fun tlsCaCert(tlsCaCert: String) {
        cdkBuilder.tlsCaCert(tlsCaCert)
    }

    /**
     * The absolute path to the TLS certificate file.
     *
     * Ignored if the address protocol is not tcp+tls.
     *
     * Default: - tlsCert not set
     *
     * @param tlsCert The absolute path to the TLS certificate file.
     */
    public fun tlsCert(tlsCert: String) {
        cdkBuilder.tlsCert(tlsCert)
    }

    /**
     * The absolute path to the TLS key file.
     *
     * Ignored if the address protocol is not tcp+tls.
     *
     * Default: - tlsKey not set
     *
     * @param tlsKey The absolute path to the TLS key file.
     */
    public fun tlsKey(tlsKey: String) {
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
     *   syslog daemon.
     */
    public fun tlsSkipVerify(tlsSkipVerify: Boolean) {
        cdkBuilder.tlsSkipVerify(tlsSkipVerify)
    }

    public fun build(): SyslogLogDriver {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
