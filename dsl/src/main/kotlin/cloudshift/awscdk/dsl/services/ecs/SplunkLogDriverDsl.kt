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
import software.amazon.awscdk.services.ecs.Secret
import software.amazon.awscdk.services.ecs.SplunkLogDriver
import software.amazon.awscdk.services.ecs.SplunkLogFormat

/**
 * A log driver that sends log information to splunk Logs.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * Secret secret;
 * SplunkLogDriver splunkLogDriver = SplunkLogDriver.Builder.create()
 * .secretToken(secret)
 * .url("url")
 * // the properties below are optional
 * .caName("caName")
 * .caPath("caPath")
 * .env(List.of("env"))
 * .envRegex("envRegex")
 * .format(SplunkLogFormat.INLINE)
 * .gzip(false)
 * .gzipLevel(123)
 * .index("index")
 * .insecureSkipVerify("insecureSkipVerify")
 * .labels(List.of("labels"))
 * .source("source")
 * .sourceType("sourceType")
 * .tag("tag")
 * .verifyConnection(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class SplunkLogDriverDsl {
    private val cdkBuilder: SplunkLogDriver.Builder = SplunkLogDriver.Builder.create()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    /**
     * Name to use for validating server certificate.
     *
     * Default: - The hostname of the splunk-url
     *
     * @param caName Name to use for validating server certificate.
     */
    public fun caName(caName: String) {
        cdkBuilder.caName(caName)
    }

    /**
     * Path to root certificate.
     *
     * Default: - caPath not set.
     *
     * @param caPath Path to root certificate.
     */
    public fun caPath(caPath: String) {
        cdkBuilder.caPath(caPath)
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
     * Message format.
     *
     * Can be inline, json or raw.
     *
     * Default: - inline
     *
     * @param format Message format.
     */
    public fun format(format: SplunkLogFormat) {
        cdkBuilder.format(format)
    }

    /**
     * Enable/disable gzip compression to send events to Splunk Enterprise or Splunk Cloud instance.
     *
     * Default: - false
     *
     * @param gzip Enable/disable gzip compression to send events to Splunk Enterprise or Splunk
     *   Cloud instance.
     */
    public fun gzip(gzip: Boolean) {
        cdkBuilder.gzip(gzip)
    }

    /**
     * Set compression level for gzip.
     *
     * Valid values are -1 (default), 0 (no compression), 1 (best speed) ... 9 (best compression).
     *
     * Default: - -1 (Default Compression)
     *
     * @param gzipLevel Set compression level for gzip.
     */
    public fun gzipLevel(gzipLevel: Number) {
        cdkBuilder.gzipLevel(gzipLevel)
    }

    /**
     * Event index.
     *
     * Default: - index not set.
     *
     * @param index Event index.
     */
    public fun index(index: String) {
        cdkBuilder.index(index)
    }

    /**
     * Ignore server certificate validation.
     *
     * Default: - insecureSkipVerify not set.
     *
     * @param insecureSkipVerify Ignore server certificate validation.
     */
    public fun insecureSkipVerify(insecureSkipVerify: String) {
        cdkBuilder.insecureSkipVerify(insecureSkipVerify)
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
     * Splunk HTTP Event Collector token (Secret).
     *
     * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So
     * the secret value will not be resolved or viewable as plain text.
     *
     * @param secretToken Splunk HTTP Event Collector token (Secret).
     */
    public fun secretToken(secretToken: Secret) {
        cdkBuilder.secretToken(secretToken)
    }

    /**
     * Event source.
     *
     * Default: - source not set.
     *
     * @param source Event source.
     */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /**
     * Event source type.
     *
     * Default: - sourceType not set.
     *
     * @param sourceType Event source type.
     */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
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
     * Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk Cloud managed
     * cluster (including port and scheme used by HTTP Event Collector) in one of the following
     * formats: https://your_splunk_instance:8088 or
     * https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
     * https://http-inputs-XXXXXXXX.splunkcloud.com.
     *
     * @param url Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk
     *   Cloud managed cluster (including port and scheme used by HTTP Event Collector) in one of
     *   the following formats: https://your_splunk_instance:8088 or
     *   https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
     *   https://http-inputs-XXXXXXXX.splunkcloud.com.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /**
     * Verify on start, that docker can connect to Splunk server.
     *
     * Default: - true
     *
     * @param verifyConnection Verify on start, that docker can connect to Splunk server.
     */
    public fun verifyConnection(verifyConnection: Boolean) {
        cdkBuilder.verifyConnection(verifyConnection)
    }

    public fun build(): SplunkLogDriver {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
