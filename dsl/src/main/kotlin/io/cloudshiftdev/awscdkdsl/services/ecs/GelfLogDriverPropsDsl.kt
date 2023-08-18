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
import software.amazon.awscdk.services.ecs.GelfLogDriverProps

/**
 * Specifies the journald log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/gelf/)
 *
 * Example:
 * ```
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.gelf(GelfLogDriverProps.builder().address("my-gelf-address").build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class GelfLogDriverPropsDsl {
    private val cdkBuilder: GelfLogDriverProps.Builder = GelfLogDriverProps.builder()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    /**
     * @param address The address of the GELF server. tcp and udp are the only supported URI
     *   specifier and you must specify the port.
     */
    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    /**
     * @param compressionLevel UDP Only The level of compression when gzip or zlib is the
     *   gelf-compression-type. An integer in the range of -1 to 9 (BestCompression). Higher levels
     *   provide more compression at lower speed. Either -1 or 0 disables compression.
     */
    public fun compressionLevel(compressionLevel: Number) {
        cdkBuilder.compressionLevel(compressionLevel)
    }

    /**
     * @param compressionType UDP Only The type of compression the GELF driver uses to compress each
     *   log message. Allowed values are gzip, zlib and none.
     */
    public fun compressionType(compressionType: GelfCompressionType) {
        cdkBuilder.compressionType(compressionType)
    }

    /**
     * @param env The env option takes an array of keys. If there is collision between label and env
     *   keys, the value of the env takes precedence. Adds additional fields to the extra attributes
     *   of a logging message.
     */
    public fun env(vararg env: String) {
        _env.addAll(listOf(*env))
    }

    /**
     * @param env The env option takes an array of keys. If there is collision between label and env
     *   keys, the value of the env takes precedence. Adds additional fields to the extra attributes
     *   of a logging message.
     */
    public fun env(env: Collection<String>) {
        _env.addAll(env)
    }

    /**
     * @param envRegex The env-regex option is similar to and compatible with env. Its value is a
     *   regular expression to match logging-related environment variables. It is used for advanced
     *   log tag options.
     */
    public fun envRegex(envRegex: String) {
        cdkBuilder.envRegex(envRegex)
    }

    /**
     * @param labels The labels option takes an array of keys. If there is collision between label
     *   and env keys, the value of the env takes precedence. Adds additional fields to the extra
     *   attributes of a logging message.
     */
    public fun labels(vararg labels: String) {
        _labels.addAll(listOf(*labels))
    }

    /**
     * @param labels The labels option takes an array of keys. If there is collision between label
     *   and env keys, the value of the env takes precedence. Adds additional fields to the extra
     *   attributes of a logging message.
     */
    public fun labels(labels: Collection<String>) {
        _labels.addAll(labels)
    }

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     *   messages. Refer to the log tag option documentation for customizing the log tag format.
     */
    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    /**
     * @param tcpMaxReconnect TCP Only The maximum number of reconnection attempts when the
     *   connection drop. A positive integer.
     */
    public fun tcpMaxReconnect(tcpMaxReconnect: Number) {
        cdkBuilder.tcpMaxReconnect(tcpMaxReconnect)
    }

    /**
     * @param tcpReconnectDelay TCP Only The number of seconds to wait between reconnection
     *   attempts. A positive integer.
     */
    public fun tcpReconnectDelay(tcpReconnectDelay: Duration) {
        cdkBuilder.tcpReconnectDelay(tcpReconnectDelay)
    }

    public fun build(): GelfLogDriverProps {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
