@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for a new SNS topic.
 *
 * Example:
 *
 * ```
 * Topic topic = Topic.Builder.create(this, "MyTopic")
 * .tracingConfig(TracingConfig.ACTIVE)
 * .build();
 * ```
 */
public interface TopicProps {
  /**
   * Enables content-based deduplication for FIFO topics.
   *
   * Default: None
   */
  public fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

  /**
   * A developer-defined string that can be used to identify this SNS topic.
   *
   * Default: None
   */
  public fun displayName(): String? = unwrap(this).getDisplayName()

  /**
   * Adds a statement to enforce encryption of data in transit when publishing to the topic.
   *
   * Default: false
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.)
   */
  public fun enforceSSL(): Boolean? = unwrap(this).getEnforceSSL()

  /**
   * Set to true to create a FIFO topic.
   *
   * Default: None
   */
  public fun fifo(): Boolean? = unwrap(this).getFifo()

  /**
   * The list of delivery status logging configurations for the topic.
   *
   * Default: None
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.)
   */
  public fun loggingConfigs(): List<LoggingConfig> =
      unwrap(this).getLoggingConfigs()?.map(LoggingConfig::wrap) ?: emptyList()

  /**
   * A KMS Key, either managed by this CDK app, or imported.
   *
   * Default: None
   */
  public fun masterKey(): IKey? = unwrap(this).getMasterKey()?.let(IKey::wrap)

  /**
   * The number of days Amazon SNS retains messages.
   *
   * It can only be set for FIFO topics.
   *
   * Default: - do not archive messages
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/fifo-message-archiving-replay.html)
   */
  public fun messageRetentionPeriodInDays(): Number? =
      unwrap(this).getMessageRetentionPeriodInDays()

  /**
   * The signature version corresponds to the hashing algorithm used while creating the signature of
   * the notifications, subscription confirmations, or unsubscribe confirmation messages sent by Amazon
   * SNS.
   *
   * Default: 1
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-verify-signature-of-message.html.)
   */
  public fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

  /**
   * A name for the topic.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique
   * physical ID and uses that ID for the topic name. For more information,
   * see Name Type.
   *
   * Default: Generated name
   */
  public fun topicName(): String? = unwrap(this).getTopicName()

  /**
   * Tracing mode of an Amazon SNS topic.
   *
   * Default: TracingConfig.PASS_THROUGH
   *
   * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-active-tracing.html)
   */
  public fun tracingConfig(): TracingConfig? =
      unwrap(this).getTracingConfig()?.let(TracingConfig::wrap)

  /**
   * A builder for [TopicProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics.
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * @param displayName A developer-defined string that can be used to identify this SNS topic.
     */
    public fun displayName(displayName: String)

    /**
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     * to the topic.
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * @param fifo Set to true to create a FIFO topic.
     */
    public fun fifo(fifo: Boolean)

    /**
     * @param loggingConfigs The list of delivery status logging configurations for the topic.
     */
    public fun loggingConfigs(loggingConfigs: List<LoggingConfig>)

    /**
     * @param loggingConfigs The list of delivery status logging configurations for the topic.
     */
    public fun loggingConfigs(vararg loggingConfigs: LoggingConfig)

    /**
     * @param masterKey A KMS Key, either managed by this CDK app, or imported.
     */
    public fun masterKey(masterKey: IKey)

    /**
     * @param messageRetentionPeriodInDays The number of days Amazon SNS retains messages.
     * It can only be set for FIFO topics.
     */
    public fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number)

    /**
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS.
     */
    public fun signatureVersion(signatureVersion: String)

    /**
     * @param topicName A name for the topic.
     * If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the topic name. For more information,
     * see Name Type.
     */
    public fun topicName(topicName: String)

    /**
     * @param tracingConfig Tracing mode of an Amazon SNS topic.
     */
    public fun tracingConfig(tracingConfig: TracingConfig)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicProps.Builder =
        software.amazon.awscdk.services.sns.TopicProps.builder()

    /**
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics.
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * @param displayName A developer-defined string that can be used to identify this SNS topic.
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     * to the topic.
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * @param fifo Set to true to create a FIFO topic.
     */
    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    /**
     * @param loggingConfigs The list of delivery status logging configurations for the topic.
     */
    override fun loggingConfigs(loggingConfigs: List<LoggingConfig>) {
      cdkBuilder.loggingConfigs(loggingConfigs.map(LoggingConfig.Companion::unwrap))
    }

    /**
     * @param loggingConfigs The list of delivery status logging configurations for the topic.
     */
    override fun loggingConfigs(vararg loggingConfigs: LoggingConfig): Unit =
        loggingConfigs(loggingConfigs.toList())

    /**
     * @param masterKey A KMS Key, either managed by this CDK app, or imported.
     */
    override fun masterKey(masterKey: IKey) {
      cdkBuilder.masterKey(masterKey.let(IKey.Companion::unwrap))
    }

    /**
     * @param messageRetentionPeriodInDays The number of days Amazon SNS retains messages.
     * It can only be set for FIFO topics.
     */
    override fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number) {
      cdkBuilder.messageRetentionPeriodInDays(messageRetentionPeriodInDays)
    }

    /**
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS.
     */
    override fun signatureVersion(signatureVersion: String) {
      cdkBuilder.signatureVersion(signatureVersion)
    }

    /**
     * @param topicName A name for the topic.
     * If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the topic name. For more information,
     * see Name Type.
     */
    override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    /**
     * @param tracingConfig Tracing mode of an Amazon SNS topic.
     */
    override fun tracingConfig(tracingConfig: TracingConfig) {
      cdkBuilder.tracingConfig(tracingConfig.let(TracingConfig.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sns.TopicProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.sns.TopicProps,
  ) : CdkObject(cdkObject), TopicProps {
    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * Default: None
     */
    override fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

    /**
     * A developer-defined string that can be used to identify this SNS topic.
     *
     * Default: None
     */
    override fun displayName(): String? = unwrap(this).getDisplayName()

    /**
     * Adds a statement to enforce encryption of data in transit when publishing to the topic.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.)
     */
    override fun enforceSSL(): Boolean? = unwrap(this).getEnforceSSL()

    /**
     * Set to true to create a FIFO topic.
     *
     * Default: None
     */
    override fun fifo(): Boolean? = unwrap(this).getFifo()

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * Default: None
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.)
     */
    override fun loggingConfigs(): List<LoggingConfig> =
        unwrap(this).getLoggingConfigs()?.map(LoggingConfig::wrap) ?: emptyList()

    /**
     * A KMS Key, either managed by this CDK app, or imported.
     *
     * Default: None
     */
    override fun masterKey(): IKey? = unwrap(this).getMasterKey()?.let(IKey::wrap)

    /**
     * The number of days Amazon SNS retains messages.
     *
     * It can only be set for FIFO topics.
     *
     * Default: - do not archive messages
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/fifo-message-archiving-replay.html)
     */
    override fun messageRetentionPeriodInDays(): Number? =
        unwrap(this).getMessageRetentionPeriodInDays()

    /**
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-verify-signature-of-message.html.)
     */
    override fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

    /**
     * A name for the topic.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the topic name. For more information,
     * see Name Type.
     *
     * Default: Generated name
     */
    override fun topicName(): String? = unwrap(this).getTopicName()

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * Default: TracingConfig.PASS_THROUGH
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-active-tracing.html)
     */
    override fun tracingConfig(): TracingConfig? =
        unwrap(this).getTracingConfig()?.let(TracingConfig::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicProps): TopicProps =
        CdkObjectWrappers.wrap(cdkObject) as? TopicProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicProps): software.amazon.awscdk.services.sns.TopicProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.TopicProps
  }
}
