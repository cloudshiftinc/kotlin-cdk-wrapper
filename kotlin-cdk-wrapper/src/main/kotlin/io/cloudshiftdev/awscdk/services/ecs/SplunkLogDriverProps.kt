@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Specifies the splunk log driver configuration options.
 *
 * [Source](https://docs.docker.com/config/containers/logging/splunk/)
 *
 * Example:
 *
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
public interface SplunkLogDriverProps : BaseLogDriverProps {
  /**
   * Name to use for validating server certificate.
   *
   * Default: - The hostname of the splunk-url
   */
  public fun caName(): String? = unwrap(this).getCaName()

  /**
   * Path to root certificate.
   *
   * Default: - caPath not set.
   */
  public fun caPath(): String? = unwrap(this).getCaPath()

  /**
   * Message format.
   *
   * Can be inline, json or raw.
   *
   * Default: - inline
   */
  public fun format(): SplunkLogFormat? = unwrap(this).getFormat()?.let(SplunkLogFormat::wrap)

  /**
   * Enable/disable gzip compression to send events to Splunk Enterprise or Splunk Cloud instance.
   *
   * Default: - false
   */
  public fun gzip(): Boolean? = unwrap(this).getGzip()

  /**
   * Set compression level for gzip.
   *
   * Valid values are -1 (default), 0 (no compression),
   * 1 (best speed) ... 9 (best compression).
   *
   * Default: - -1 (Default Compression)
   */
  public fun gzipLevel(): Number? = unwrap(this).getGzipLevel()

  /**
   * Event index.
   *
   * Default: - index not set.
   */
  public fun index(): String? = unwrap(this).getIndex()

  /**
   * Ignore server certificate validation.
   *
   * Default: - insecureSkipVerify not set.
   */
  public fun insecureSkipVerify(): String? = unwrap(this).getInsecureSkipVerify()

  /**
   * Splunk HTTP Event Collector token (Secret).
   *
   * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So the
   * secret value will not be
   * resolved or viewable as plain text.
   */
  public fun secretToken(): Secret

  /**
   * Event source.
   *
   * Default: - source not set.
   */
  public fun source(): String? = unwrap(this).getSource()

  /**
   * Event source type.
   *
   * Default: - sourceType not set.
   */
  public fun sourceType(): String? = unwrap(this).getSourceType()

  /**
   * Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk Cloud managed
   * cluster (including port and scheme used by HTTP Event Collector) in one of the following formats:
   * https://your_splunk_instance:8088 or https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
   * https://http-inputs-XXXXXXXX.splunkcloud.com.
   */
  public fun url(): String

  /**
   * Verify on start, that docker can connect to Splunk server.
   *
   * Default: - true
   */
  public fun verifyConnection(): Boolean? = unwrap(this).getVerifyConnection()

  /**
   * A builder for [SplunkLogDriverProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param caName Name to use for validating server certificate.
     */
    public fun caName(caName: String)

    /**
     * @param caPath Path to root certificate.
     */
    public fun caPath(caPath: String)

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
     * @param format Message format.
     * Can be inline, json or raw.
     */
    public fun format(format: SplunkLogFormat)

    /**
     * @param gzip Enable/disable gzip compression to send events to Splunk Enterprise or Splunk
     * Cloud instance.
     */
    public fun gzip(gzip: Boolean)

    /**
     * @param gzipLevel Set compression level for gzip.
     * Valid values are -1 (default), 0 (no compression),
     * 1 (best speed) ... 9 (best compression).
     */
    public fun gzipLevel(gzipLevel: Number)

    /**
     * @param index Event index.
     */
    public fun index(index: String)

    /**
     * @param insecureSkipVerify Ignore server certificate validation.
     */
    public fun insecureSkipVerify(insecureSkipVerify: String)

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
     * @param secretToken Splunk HTTP Event Collector token (Secret). 
     * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So
     * the secret value will not be
     * resolved or viewable as plain text.
     */
    public fun secretToken(secretToken: Secret)

    /**
     * @param source Event source.
     */
    public fun source(source: String)

    /**
     * @param sourceType Event source type.
     */
    public fun sourceType(sourceType: String)

    /**
     * @param tag By default, Docker uses the first 12 characters of the container ID to tag log
     * messages.
     * Refer to the log tag option documentation for customizing the
     * log tag format.
     */
    public fun tag(tag: String)

    /**
     * @param url Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk
     * Cloud managed cluster (including port and scheme used by HTTP Event Collector) in one of the
     * following formats: https://your_splunk_instance:8088 or
     * https://input-prd-p-XXXXXXX.cloud.splunk.com:8088 or
     * https://http-inputs-XXXXXXXX.splunkcloud.com. 
     */
    public fun url(url: String)

    /**
     * @param verifyConnection Verify on start, that docker can connect to Splunk server.
     */
    public fun verifyConnection(verifyConnection: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SplunkLogDriverProps.Builder =
        software.amazon.awscdk.services.ecs.SplunkLogDriverProps.builder()

    /**
     * @param caName Name to use for validating server certificate.
     */
    override fun caName(caName: String) {
      cdkBuilder.caName(caName)
    }

    /**
     * @param caPath Path to root certificate.
     */
    override fun caPath(caPath: String) {
      cdkBuilder.caPath(caPath)
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
     * @param format Message format.
     * Can be inline, json or raw.
     */
    override fun format(format: SplunkLogFormat) {
      cdkBuilder.format(format.let(SplunkLogFormat::unwrap))
    }

    /**
     * @param gzip Enable/disable gzip compression to send events to Splunk Enterprise or Splunk
     * Cloud instance.
     */
    override fun gzip(gzip: Boolean) {
      cdkBuilder.gzip(gzip)
    }

    /**
     * @param gzipLevel Set compression level for gzip.
     * Valid values are -1 (default), 0 (no compression),
     * 1 (best speed) ... 9 (best compression).
     */
    override fun gzipLevel(gzipLevel: Number) {
      cdkBuilder.gzipLevel(gzipLevel)
    }

    /**
     * @param index Event index.
     */
    override fun index(index: String) {
      cdkBuilder.index(index)
    }

    /**
     * @param insecureSkipVerify Ignore server certificate validation.
     */
    override fun insecureSkipVerify(insecureSkipVerify: String) {
      cdkBuilder.insecureSkipVerify(insecureSkipVerify)
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
     * @param secretToken Splunk HTTP Event Collector token (Secret). 
     * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So
     * the secret value will not be
     * resolved or viewable as plain text.
     */
    override fun secretToken(secretToken: Secret) {
      cdkBuilder.secretToken(secretToken.let(Secret::unwrap))
    }

    /**
     * @param source Event source.
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * @param sourceType Event source type.
     */
    override fun sourceType(sourceType: String) {
      cdkBuilder.sourceType(sourceType)
    }

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
     * @param verifyConnection Verify on start, that docker can connect to Splunk server.
     */
    override fun verifyConnection(verifyConnection: Boolean) {
      cdkBuilder.verifyConnection(verifyConnection)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SplunkLogDriverProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriverProps,
  ) : CdkObject(cdkObject), SplunkLogDriverProps {
    /**
     * Name to use for validating server certificate.
     *
     * Default: - The hostname of the splunk-url
     */
    override fun caName(): String? = unwrap(this).getCaName()

    /**
     * Path to root certificate.
     *
     * Default: - caPath not set.
     */
    override fun caPath(): String? = unwrap(this).getCaPath()

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
     * Message format.
     *
     * Can be inline, json or raw.
     *
     * Default: - inline
     */
    override fun format(): SplunkLogFormat? = unwrap(this).getFormat()?.let(SplunkLogFormat::wrap)

    /**
     * Enable/disable gzip compression to send events to Splunk Enterprise or Splunk Cloud instance.
     *
     * Default: - false
     */
    override fun gzip(): Boolean? = unwrap(this).getGzip()

    /**
     * Set compression level for gzip.
     *
     * Valid values are -1 (default), 0 (no compression),
     * 1 (best speed) ... 9 (best compression).
     *
     * Default: - -1 (Default Compression)
     */
    override fun gzipLevel(): Number? = unwrap(this).getGzipLevel()

    /**
     * Event index.
     *
     * Default: - index not set.
     */
    override fun index(): String? = unwrap(this).getIndex()

    /**
     * Ignore server certificate validation.
     *
     * Default: - insecureSkipVerify not set.
     */
    override fun insecureSkipVerify(): String? = unwrap(this).getInsecureSkipVerify()

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
     * Splunk HTTP Event Collector token (Secret).
     *
     * The splunk-token is added to the SecretOptions property of the Log Driver Configuration. So
     * the secret value will not be
     * resolved or viewable as plain text.
     */
    override fun secretToken(): Secret = unwrap(this).getSecretToken().let(Secret::wrap)

    /**
     * Event source.
     *
     * Default: - source not set.
     */
    override fun source(): String? = unwrap(this).getSource()

    /**
     * Event source type.
     *
     * Default: - sourceType not set.
     */
    override fun sourceType(): String? = unwrap(this).getSourceType()

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
     * Path to your Splunk Enterprise, self-service Splunk Cloud instance, or Splunk Cloud managed
     * cluster (including port and scheme used by HTTP Event Collector) in one of the following
     * formats: https://your_splunk_instance:8088 or https://input-prd-p-XXXXXXX.cloud.splunk.com:8088
     * or https://http-inputs-XXXXXXXX.splunkcloud.com.
     */
    override fun url(): String = unwrap(this).getUrl()

    /**
     * Verify on start, that docker can connect to Splunk server.
     *
     * Default: - true
     */
    override fun verifyConnection(): Boolean? = unwrap(this).getVerifyConnection()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SplunkLogDriverProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SplunkLogDriverProps):
        SplunkLogDriverProps = CdkObjectWrappers.wrap(cdkObject) as SplunkLogDriverProps

    internal fun unwrap(wrapped: SplunkLogDriverProps):
        software.amazon.awscdk.services.ecs.SplunkLogDriverProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ecs.SplunkLogDriverProps
  }
}
