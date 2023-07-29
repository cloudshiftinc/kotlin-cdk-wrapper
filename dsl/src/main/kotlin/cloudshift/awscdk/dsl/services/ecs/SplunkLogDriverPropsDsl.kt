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
import software.amazon.awscdk.services.ecs.SplunkLogDriverProps
import software.amazon.awscdk.services.ecs.SplunkLogFormat

/**
 * Specifies the splunk log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/splunk/)
 *
 * Example:
 * ```
 * Secret secret;
 * // Create a Task Definition for the container to start
 * Ec2TaskDefinition taskDefinition = new Ec2TaskDefinition(this, "TaskDef");
 * taskDefinition.addContainer("TheContainer", ContainerDefinitionOptions.builder()
 * .image(ContainerImage.fromRegistry("example-image"))
 * .memoryLimitMiB(256)
 * .logging(LogDrivers.splunk(SplunkLogDriverProps.builder()
 * .secretToken(secret)
 * .url("my-splunk-url")
 * .build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class SplunkLogDriverPropsDsl {
    private val cdkBuilder: SplunkLogDriverProps.Builder = SplunkLogDriverProps.builder()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    /** @param caName Name to use for validating server certificate. */
    public fun caName(caName: String) {
        cdkBuilder.caName(caName)
    }

    /** @param caPath Path to root certificate. */
    public fun caPath(caPath: String) {
        cdkBuilder.caPath(caPath)
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

    /** @param format Message format. Can be inline, json or raw. */
    public fun format(format: SplunkLogFormat) {
        cdkBuilder.format(format)
    }

    /**
     * @param gzip Enable/disable gzip compression to send events to Splunk Enterprise or Splunk
     *   Cloud instance.
     */
    public fun gzip(gzip: Boolean) {
        cdkBuilder.gzip(gzip)
    }

    /**
     * @param gzipLevel Set compression level for gzip. Valid values are -1 (default), 0 (no
     *   compression), 1 (best speed) ... 9 (best compression).
     */
    public fun gzipLevel(gzipLevel: Number) {
        cdkBuilder.gzipLevel(gzipLevel)
    }

    /** @param index Event index. */
    public fun index(index: String) {
        cdkBuilder.index(index)
    }

    /** @param insecureSkipVerify Ignore server certificate validation. */
    public fun insecureSkipVerify(insecureSkipVerify: String) {
        cdkBuilder.insecureSkipVerify(insecureSkipVerify)
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
     * @param secretToken Splunk HTTP Event Collector token (Secret). The splunk-token is added to
     *   the SecretOptions property of the Log Driver Configuration. So the secret value will not be
     *   resolved or viewable as plain text.
     */
    public fun secretToken(secretToken: Secret) {
        cdkBuilder.secretToken(secretToken)
    }

    /** @param source Event source. */
    public fun source(source: String) {
        cdkBuilder.source(source)
    }

    /** @param sourceType Event source type. */
    public fun sourceType(sourceType: String) {
        cdkBuilder.sourceType(sourceType)
    }

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     *   messages. Refer to the log tag option documentation for customizing the log tag format.
     */
    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    /**
     * @param url Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk
     *   Cloud managed cluster (including port and scheme used by HTTP Event Collector) in one of
     *   the following formats: https://your_splunk_instance:8088 or
     *   https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
     *   https://http-inputs-XXXXXXXX.splunkcloud.com.
     */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /** @param verifyConnection Verify on start, that docker can connect to Splunk server. */
    public fun verifyConnection(verifyConnection: Boolean) {
        cdkBuilder.verifyConnection(verifyConnection)
    }

    public fun build(): SplunkLogDriverProps {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
