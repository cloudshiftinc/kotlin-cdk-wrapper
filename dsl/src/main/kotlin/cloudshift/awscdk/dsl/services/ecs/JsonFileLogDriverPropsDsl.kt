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
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ecs.JsonFileLogDriverProps

/**
 * Specifies the json-file log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/json-file/)
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * JsonFileLogDriverProps jsonFileLogDriverProps = JsonFileLogDriverProps.builder()
 * .compress(false)
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .labels(List.of("labels"))
 * .maxFile(123)
 * .maxSize("maxSize")
 * .tag("tag")
 * .build();
 * ```
 */
@CdkDslMarker
public class JsonFileLogDriverPropsDsl {
    private val cdkBuilder: JsonFileLogDriverProps.Builder = JsonFileLogDriverProps.builder()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    /** @param compress Toggles compression for rotated logs. */
    public fun compress(compress: Boolean) {
        cdkBuilder.compress(compress)
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
     * @param maxFile The maximum number of log files that can be present. If rolling the logs
     *   creates excess files, the oldest file is removed. Only effective when max-size is also set.
     *   A positive integer.
     */
    public fun maxFile(maxFile: Number) {
        cdkBuilder.maxFile(maxFile)
    }

    /**
     * @param maxSize The maximum size of the log before it is rolled. A positive integer plus a
     *   modifier representing the unit of measure (k, m, or g).
     */
    public fun maxSize(maxSize: String) {
        cdkBuilder.maxSize(maxSize)
    }

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     *   messages. Refer to the log tag option documentation for customizing the log tag format.
     */
    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    public fun build(): JsonFileLogDriverProps {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
