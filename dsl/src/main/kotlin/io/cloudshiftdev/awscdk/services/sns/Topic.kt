package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Topic internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.sns.Topic,
) : TopicBase(cdkObject) {
  /**
   * Adds a delivery status logging configuration to the topic.
   *
   * @param config 
   */
  public open fun addLoggingConfig(config: LoggingConfig) {
    unwrap(this).addLoggingConfig(config.let(LoggingConfig::unwrap))
  }

  /**
   * Adds a delivery status logging configuration to the topic.
   *
   * @param config 
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("165e84a8a122797ae1ba97f14afae7cea8bcfacab40e38ae261881b0d63731d2")
  public open fun addLoggingConfig(config: LoggingConfig.Builder.() -> Unit): Unit =
      addLoggingConfig(LoggingConfig(config))

  /**
   * Enables content-based deduplication for FIFO topics.
   */
  public override fun contentBasedDeduplication(): Boolean =
      unwrap(this).getContentBasedDeduplication()

  /**
   * Whether this topic is an Amazon SNS FIFO queue.
   *
   * If false, this is a standard topic.
   */
  public override fun fifo(): Boolean = unwrap(this).getFifo()

  /**
   * The ARN of the topic.
   */
  public override fun topicArn(): String = unwrap(this).getTopicArn()

  /**
   * The name of the topic.
   */
  public override fun topicName(): String = unwrap(this).getTopicName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sns.Topic].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * Default: None
     *
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
     */
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    /**
     * A developer-defined string that can be used to identify this SNS topic.
     *
     * Default: None
     *
     * @param displayName A developer-defined string that can be used to identify this SNS topic. 
     */
    public fun displayName(displayName: String)

    /**
     * Adds a statement to enforce encryption of data in transit when publishing to the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     *
     * Default: false
     *
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     * to the topic. 
     */
    public fun enforceSsl(enforceSsl: Boolean)

    /**
     * Set to true to create a FIFO topic.
     *
     * Default: None
     *
     * @param fifo Set to true to create a FIFO topic. 
     */
    public fun fifo(fifo: Boolean)

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
     *
     * Default: None
     *
     * @param loggingConfigs The list of delivery status logging configurations for the topic. 
     */
    public fun loggingConfigs(loggingConfigs: List<LoggingConfig>)

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
     *
     * Default: None
     *
     * @param loggingConfigs The list of delivery status logging configurations for the topic. 
     */
    public fun loggingConfigs(vararg loggingConfigs: LoggingConfig)

    /**
     * A KMS Key, either managed by this CDK app, or imported.
     *
     * Default: None
     *
     * @param masterKey A KMS Key, either managed by this CDK app, or imported. 
     */
    public fun masterKey(masterKey: IKey)

    /**
     * The number of days Amazon SNS retains messages.
     *
     * It can only be set for FIFO topics.
     *
     * Default: - do not archive messages
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/fifo-message-archiving-replay.html)
     * @param messageRetentionPeriodInDays The number of days Amazon SNS retains messages. 
     */
    public fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number)

    /**
     * A name for the topic.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the topic name. For more information,
     * see Name Type.
     *
     * Default: Generated name
     *
     * @param topicName A name for the topic. 
     */
    public fun topicName(topicName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.Topic.Builder =
        software.amazon.awscdk.services.sns.Topic.Builder.create(scope, id)

    /**
     * Enables content-based deduplication for FIFO topics.
     *
     * Default: None
     *
     * @param contentBasedDeduplication Enables content-based deduplication for FIFO topics. 
     */
    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    /**
     * A developer-defined string that can be used to identify this SNS topic.
     *
     * Default: None
     *
     * @param displayName A developer-defined string that can be used to identify this SNS topic. 
     */
    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    /**
     * Adds a statement to enforce encryption of data in transit when publishing to the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.
     *
     * Default: false
     *
     * @param enforceSsl Adds a statement to enforce encryption of data in transit when publishing
     * to the topic. 
     */
    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    /**
     * Set to true to create a FIFO topic.
     *
     * Default: None
     *
     * @param fifo Set to true to create a FIFO topic. 
     */
    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
     *
     * Default: None
     *
     * @param loggingConfigs The list of delivery status logging configurations for the topic. 
     */
    override fun loggingConfigs(loggingConfigs: List<LoggingConfig>) {
      cdkBuilder.loggingConfigs(loggingConfigs.map(LoggingConfig::unwrap))
    }

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * For more information, see
     * https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.
     *
     * Default: None
     *
     * @param loggingConfigs The list of delivery status logging configurations for the topic. 
     */
    override fun loggingConfigs(vararg loggingConfigs: LoggingConfig): Unit =
        loggingConfigs(loggingConfigs.toList())

    /**
     * A KMS Key, either managed by this CDK app, or imported.
     *
     * Default: None
     *
     * @param masterKey A KMS Key, either managed by this CDK app, or imported. 
     */
    override fun masterKey(masterKey: IKey) {
      cdkBuilder.masterKey(masterKey.let(IKey::unwrap))
    }

    /**
     * The number of days Amazon SNS retains messages.
     *
     * It can only be set for FIFO topics.
     *
     * Default: - do not archive messages
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/fifo-message-archiving-replay.html)
     * @param messageRetentionPeriodInDays The number of days Amazon SNS retains messages. 
     */
    override fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number) {
      cdkBuilder.messageRetentionPeriodInDays(messageRetentionPeriodInDays)
    }

    /**
     * A name for the topic.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique
     * physical ID and uses that ID for the topic name. For more information,
     * see Name Type.
     *
     * Default: Generated name
     *
     * @param topicName A name for the topic. 
     */
    override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    public fun build(): software.amazon.awscdk.services.sns.Topic = cdkBuilder.build()
  }

  public companion object {
    public fun fromTopicArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      topicArn: String,
    ): ITopic =
        software.amazon.awscdk.services.sns.Topic.fromTopicArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, topicArn).let(ITopic::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Topic {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Topic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.Topic): Topic =
        Topic(cdkObject)

    internal fun unwrap(wrapped: Topic): software.amazon.awscdk.services.sns.Topic =
        wrapped.cdkObject
  }
}
