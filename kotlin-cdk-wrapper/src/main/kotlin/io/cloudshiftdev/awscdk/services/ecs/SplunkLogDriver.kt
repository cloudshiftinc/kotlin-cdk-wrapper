@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.constructs.Construct
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * A log driver that sends log information to splunk Logs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
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
public open class SplunkLogDriver(
  cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriver,
) : LogDriver(cdkObject) {
  public constructor(props: SplunkLogDriverProps) :
      this(software.amazon.awscdk.services.ecs.SplunkLogDriver(props.let(SplunkLogDriverProps.Companion::unwrap))
  )

  public constructor(props: SplunkLogDriverProps.Builder.() -> Unit) :
      this(SplunkLogDriverProps(props)
  )

  /**
   * Called when the log driver is configured on a container.
   *
   * @param _scope 
   * @param _containerDefinition 
   */
  public override fun bind(scope: Construct, containerDefinition: ContainerDefinition):
      LogDriverConfig = unwrap(this).bind(scope.let(Construct.Companion::unwrap),
      containerDefinition.let(ContainerDefinition.Companion::unwrap)).let(LogDriverConfig::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.ecs.SplunkLogDriver].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name to use for validating server certificate.
     *
     * Default: - The hostname of the splunk-url
     *
     * @param caName Name to use for validating server certificate. 
     */
    public fun caName(caName: String)

    /**
     * Path to root certificate.
     *
     * Default: - caPath not set.
     *
     * @param caPath Path to root certificate. 
     */
    public fun caPath(caPath: String)

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
     * Message format.
     *
     * Can be inline, json or raw.
     *
     * Default: - inline
     *
     * @param format Message format. 
     */
    public fun format(format: SplunkLogFormat)

    /**
     * Enable/disable gzip compression to send events to Splunk Enterprise or Splunk Cloud instance.
     *
     * Default: - false
     *
     * @param gzip Enable/disable gzip compression to send events to Splunk Enterprise or Splunk
     * Cloud instance. 
     */
    public fun gzip(gzip: Boolean)

    /**
     * Set compression level for gzip.
     *
     * Valid values are -1 (default), 0 (no compression),
     * 1 (best speed) ... 9 (best compression).
     *
     * Default: - -1 (Default Compression)
     *
     * @param gzipLevel Set compression level for gzip. 
     */
    public fun gzipLevel(gzipLevel: Number)

    /**
     * Event index.
     *
     * Default: - index not set.
     *
     * @param index Event index. 
     */
    public fun index(index: String)

    /**
     * Ignore server certificate validation.
     *
     * Default: - insecureSkipVerify not set.
     *
     * @param insecureSkipVerify Ignore server certificate validation. 
     */
    public fun insecureSkipVerify(insecureSkipVerify: String)

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
     * Splunk HTTP Event Collector token (Secret).
     *
     * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So
     * the secret value will not be
     * resolved or viewable as plain text.
     *
     * @param secretToken Splunk HTTP Event Collector token (Secret). 
     */
    public fun secretToken(secretToken: Secret)

    /**
     * Event source.
     *
     * Default: - source not set.
     *
     * @param source Event source. 
     */
    public fun source(source: String)

    /**
     * Event source type.
     *
     * Default: - sourceType not set.
     *
     * @param sourceType Event source type. 
     */
    public fun sourceType(sourceType: String)

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
     * Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk Cloud managed
     * cluster (including port and scheme used by HTTP Event Collector) in one of the following
     * formats: https://your_splunk_instance:8088 or https://input-prd-p-XXXXXXX.cloud.splunk.com:8088
     * or https://http-inputs-XXXXXXXX.splunkcloud.com.
     *
     * @param url Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk
     * Cloud managed cluster (including port and scheme used by HTTP Event Collector) in one of the
     * following formats: https://your_splunk_instance:8088 or
     * https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
     * https://http-inputs-XXXXXXXX.splunkcloud.com. 
     */
    public fun url(url: String)

    /**
     * Verify on start, that docker can connect to Splunk server.
     *
     * Default: - true
     *
     * @param verifyConnection Verify on start, that docker can connect to Splunk server. 
     */
    public fun verifyConnection(verifyConnection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SplunkLogDriver.Builder =
        software.amazon.awscdk.services.ecs.SplunkLogDriver.Builder.create()

    /**
     * Name to use for validating server certificate.
     *
     * Default: - The hostname of the splunk-url
     *
     * @param caName Name to use for validating server certificate. 
     */
    override fun caName(caName: String) {
      cdkBuilder.caName(caName)
    }

    /**
     * Path to root certificate.
     *
     * Default: - caPath not set.
     *
     * @param caPath Path to root certificate. 
     */
    override fun caPath(caPath: String) {
      cdkBuilder.caPath(caPath)
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
     * Message format.
     *
     * Can be inline, json or raw.
     *
     * Default: - inline
     *
     * @param format Message format. 
     */
    override fun format(format: SplunkLogFormat) {
      cdkBuilder.format(format.let(SplunkLogFormat.Companion::unwrap))
    }

    /**
     * Enable/disable gzip compression to send events to Splunk Enterprise or Splunk Cloud instance.
     *
     * Default: - false
     *
     * @param gzip Enable/disable gzip compression to send events to Splunk Enterprise or Splunk
     * Cloud instance. 
     */
    override fun gzip(gzip: Boolean) {
      cdkBuilder.gzip(gzip)
    }

    /**
     * Set compression level for gzip.
     *
     * Valid values are -1 (default), 0 (no compression),
     * 1 (best speed) ... 9 (best compression).
     *
     * Default: - -1 (Default Compression)
     *
     * @param gzipLevel Set compression level for gzip. 
     */
    override fun gzipLevel(gzipLevel: Number) {
      cdkBuilder.gzipLevel(gzipLevel)
    }

    /**
     * Event index.
     *
     * Default: - index not set.
     *
     * @param index Event index. 
     */
    override fun index(index: String) {
      cdkBuilder.index(index)
    }

    /**
     * Ignore server certificate validation.
     *
     * Default: - insecureSkipVerify not set.
     *
     * @param insecureSkipVerify Ignore server certificate validation. 
     */
    override fun insecureSkipVerify(insecureSkipVerify: String) {
      cdkBuilder.insecureSkipVerify(insecureSkipVerify)
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
     * Splunk HTTP Event Collector token (Secret).
     *
     * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So
     * the secret value will not be
     * resolved or viewable as plain text.
     *
     * @param secretToken Splunk HTTP Event Collector token (Secret). 
     */
    override fun secretToken(secretToken: Secret) {
      cdkBuilder.secretToken(secretToken.let(Secret.Companion::unwrap))
    }

    /**
     * Event source.
     *
     * Default: - source not set.
     *
     * @param source Event source. 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * Event source type.
     *
     * Default: - sourceType not set.
     *
     * @param sourceType Event source type. 
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

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
     * Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk Cloud managed
     * cluster (including port and scheme used by HTTP Event Collector) in one of the following
     * formats: https://your_splunk_instance:8088 or https://input-prd-p-XXXXXXX.cloud.splunk.com:8088
     * or https://http-inputs-XXXXXXXX.splunkcloud.com.
     *
     * @param url Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk
     * Cloud managed cluster (including port and scheme used by HTTP Event Collector) in one of the
     * following formats: https://your_splunk_instance:8088 or
     * https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
     * https://http-inputs-XXXXXXXX.splunkcloud.com. 
     */
    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    /**
     * Verify on start, that docker can connect to Splunk server.
     *
     * Default: - true
     *
     * @param verifyConnection Verify on start, that docker can connect to Splunk server. 
     */
    override fun verifyConnection(verifyConnection: Boolean) {
      cdkBuilder.verifyConnection(verifyConnection)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SplunkLogDriver = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SplunkLogDriver {
      val builderImpl = BuilderImpl()
      return SplunkLogDriver(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriver):
        SplunkLogDriver = SplunkLogDriver(cdkObject)

    internal fun unwrap(wrapped: SplunkLogDriver):
        software.amazon.awscdk.services.ecs.SplunkLogDriver = wrapped.cdkObject as
        software.amazon.awscdk.services.ecs.SplunkLogDriver
  }
}
