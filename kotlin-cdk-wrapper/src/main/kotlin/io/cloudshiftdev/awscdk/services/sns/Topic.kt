@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A new SNS topic.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.kinesisfirehose.*;
 * DeliveryStream stream;
 * Topic topic = new Topic(this, "Topic");
 * Subscription.Builder.create(this, "Subscription")
 * .topic(topic)
 * .endpoint(stream.getDeliveryStreamArn())
 * .protocol(SubscriptionProtocol.FIREHOSE)
 * .subscriptionRoleArn("SAMPLE_ARN")
 * .build();
 * ```
 */
public open class Topic(
  cdkObject: software.amazon.awscdk.services.sns.Topic,
) : TopicBase(cdkObject) {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.sns.Topic(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TopicProps,
  ) :
      this(software.amazon.awscdk.services.sns.Topic(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(TopicProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: TopicProps.Builder.() -> Unit,
  ) : this(scope, id, TopicProps(props)
  )

  /**
   * Adds a delivery status logging configuration to the topic.
   *
   * @param config 
   */
  public open fun addLoggingConfig(config: LoggingConfig) {
    unwrap(this).addLoggingConfig(config.let(LoggingConfig.Companion::unwrap))
  }

  /**
   * Adds a delivery status logging configuration to the topic.
   *
   * @param config 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
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
   * A KMS Key, either managed by this CDK app, or imported.
   *
   * This property applies only to server-side encryption.
   */
  public override fun masterKey(): IKey? = unwrap(this).getMasterKey()?.let(IKey::wrap)

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
     * The display name must be maximum 100 characters long, including hyphens (-),
     * underscores (_), spaces, and tabs.
     *
     * Default: None
     *
     * @param displayName A developer-defined string that can be used to identify this SNS topic. 
     */
    public fun displayName(displayName: String)

    /**
     * Adds a statement to enforce encryption of data in transit when publishing to the topic.
     *
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.)
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
     * Specifies the throughput quota and deduplication behavior to apply for the FIFO topic.
     *
     * You can only set this property when `fifo` is `true`.
     *
     * Default: undefined - SNS default setting is FifoThroughputScope.TOPIC
     *
     * @param fifoThroughputScope Specifies the throughput quota and deduplication behavior to apply
     * for the FIFO topic. 
     */
    public fun fifoThroughputScope(fifoThroughputScope: FifoThroughputScope)

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * Default: None
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.)
     * @param loggingConfigs The list of delivery status logging configurations for the topic. 
     */
    public fun loggingConfigs(loggingConfigs: List<LoggingConfig>)

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * Default: None
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.)
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
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-verify-signature-of-message.html.)
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS. 
     */
    public fun signatureVersion(signatureVersion: String)

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

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * Default: TracingConfig.PASS_THROUGH
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-active-tracing.html)
     * @param tracingConfig Tracing mode of an Amazon SNS topic. 
     */
    public fun tracingConfig(tracingConfig: TracingConfig)
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
     * The display name must be maximum 100 characters long, including hyphens (-),
     * underscores (_), spaces, and tabs.
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
     * Default: false
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-security-best-practices.html#enforce-encryption-data-in-transit.)
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
     * Specifies the throughput quota and deduplication behavior to apply for the FIFO topic.
     *
     * You can only set this property when `fifo` is `true`.
     *
     * Default: undefined - SNS default setting is FifoThroughputScope.TOPIC
     *
     * @param fifoThroughputScope Specifies the throughput quota and deduplication behavior to apply
     * for the FIFO topic. 
     */
    override fun fifoThroughputScope(fifoThroughputScope: FifoThroughputScope) {
      cdkBuilder.fifoThroughputScope(fifoThroughputScope.let(FifoThroughputScope.Companion::unwrap))
    }

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * Default: None
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.)
     * @param loggingConfigs The list of delivery status logging configurations for the topic. 
     */
    override fun loggingConfigs(loggingConfigs: List<LoggingConfig>) {
      cdkBuilder.loggingConfigs(loggingConfigs.map(LoggingConfig.Companion::unwrap))
    }

    /**
     * The list of delivery status logging configurations for the topic.
     *
     * Default: None
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-topic-attributes.html.)
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
      cdkBuilder.masterKey(masterKey.let(IKey.Companion::unwrap))
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
     * The signature version corresponds to the hashing algorithm used while creating the signature
     * of the notifications, subscription confirmations, or unsubscribe confirmation messages sent by
     * Amazon SNS.
     *
     * Default: 1
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-verify-signature-of-message.html.)
     * @param signatureVersion The signature version corresponds to the hashing algorithm used while
     * creating the signature of the notifications, subscription confirmations, or unsubscribe
     * confirmation messages sent by Amazon SNS. 
     */
    override fun signatureVersion(signatureVersion: String) {
      cdkBuilder.signatureVersion(signatureVersion)
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

    /**
     * Tracing mode of an Amazon SNS topic.
     *
     * Default: TracingConfig.PASS_THROUGH
     *
     * [Documentation](https://docs.aws.amazon.com/sns/latest/dg/sns-active-tracing.html)
     * @param tracingConfig Tracing mode of an Amazon SNS topic. 
     */
    override fun tracingConfig(tracingConfig: TracingConfig) {
      cdkBuilder.tracingConfig(tracingConfig.let(TracingConfig.Companion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.sns.Topic = cdkBuilder.build()
  }

  public companion object {
    public val PROPERTY_INJECTION_ID: String =
        software.amazon.awscdk.services.sns.Topic.PROPERTY_INJECTION_ID

    public fun fromTopicArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      topicArn: String,
    ): ITopic =
        software.amazon.awscdk.services.sns.Topic.fromTopicArn(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, topicArn).let(ITopic::wrap)

    public fun fromTopicAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TopicAttributes,
    ): ITopic =
        software.amazon.awscdk.services.sns.Topic.fromTopicAttributes(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
        id, attrs.let(TopicAttributes.Companion::unwrap)).let(ITopic::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ccd4be93940ed2899f3dbe3eb0d040594d23421d53c58464b3e85aa9c615c625")
    public fun fromTopicAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: TopicAttributes.Builder.() -> Unit,
    ): ITopic = fromTopicAttributes(scope, id, TopicAttributes(attrs))

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
        wrapped.cdkObject as software.amazon.awscdk.services.sns.Topic
  }
}
