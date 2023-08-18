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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.GelfCompressionType
import software.amazon.awscdk.services.ecs.GelfLogDriver

/**
 * A log driver that sends log information to journald Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * import software.amazon.awscdk.services.ecs.*;
 * GelfLogDriver gelfLogDriver = GelfLogDriver.Builder.create()
 * .address("address")
 * // the properties below are optional
 * .compressionLevel(123)
 * .compressionType(GelfCompressionType.GZIP)
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .tag("tag")
 * .tcpMaxReconnect(123)
 * .tcpReconnectDelay(Duration.minutes(30))
 * .build();
 * ```
 */
@CdkDslMarker
public class GelfLogDriverDsl {
    private val cdkBuilder: GelfLogDriver.Builder = GelfLogDriver.Builder.create()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    /**
     * The address of the GELF server.
     *
     * tcp and udp are the only supported URI specifier and you must specify the port.
     *
     * @param address The address of the GELF server.
     */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /**
     * UDP Only The level of compression when gzip or zlib is the gelf-compression-type.
     *
     * An integer in the range of -1 to 9 (BestCompression). Higher levels provide more compression
     * at lower speed. Either -1 or 0 disables compression.
     *
     * Default: - 1
     *
     * @param compressionLevel UDP Only The level of compression when gzip or zlib is the
     *   gelf-compression-type.
     */
    public fun compressionLevel(compressionLevel: Number) {
        cdkBuilder.compressionLevel(compressionLevel)
    }

    /**
     * UDP Only The type of compression the GELF driver uses to compress each log message.
     *
     * Allowed values are gzip, zlib and none.
     *
     * Default: - gzip
     *
     * @param compressionType UDP Only The type of compression the GELF driver uses to compress each
     *   log message.
     */
    public fun compressionType(compressionType: GelfCompressionType) {
        cdkBuilder.compressionType(compressionType)
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
     * TCP Only The maximum number of reconnection attempts when the connection drop.
     *
     * A positive integer.
     *
     * Default: - 3
     *
     * @param tcpMaxReconnect TCP Only The maximum number of reconnection attempts when the
     *   connection drop.
     */
    public fun tcpMaxReconnect(tcpMaxReconnect: Number) {
        cdkBuilder.tcpMaxReconnect(tcpMaxReconnect)
    }

    /**
     * TCP Only The number of seconds to wait between reconnection attempts.
     *
     * A positive integer.
     *
     * Default: - 1
     *
     * @param tcpReconnectDelay TCP Only The number of seconds to wait between reconnection
     *   attempts.
     */
    public fun tcpReconnectDelay(tcpReconnectDelay: Duration) {
        cdkBuilder.tcpReconnectDelay(tcpReconnectDelay)
    }

    public fun build(): GelfLogDriver {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
