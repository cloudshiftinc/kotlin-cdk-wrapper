package io.cloudshiftdev.awscdk.services.sns

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
  private val cdkObject: software.amazon.awscdk.services.sns.Topic,
) : TopicBase(cdkObject) {
  public open fun addLoggingConfig(config: LoggingConfig) {
    unwrap(this).addLoggingConfig(config.let(LoggingConfig::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("165e84a8a122797ae1ba97f14afae7cea8bcfacab40e38ae261881b0d63731d2")
  public open fun addLoggingConfig(config: LoggingConfig.Builder.() -> Unit): Unit =
      addLoggingConfig(LoggingConfig(config))

  public override fun contentBasedDeduplication(): Boolean =
      unwrap(this).getContentBasedDeduplication()

  public override fun fifo(): Boolean = unwrap(this).getFifo()

  public override fun topicArn(): String = unwrap(this).getTopicArn()

  public override fun topicName(): String = unwrap(this).getTopicName()

  public interface Builder {
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    public fun displayName(displayName: String)

    public fun enforceSsl(enforceSsl: Boolean)

    public fun fifo(fifo: Boolean)

    public fun loggingConfigs(loggingConfigs: List<LoggingConfig>)

    public fun loggingConfigs(vararg loggingConfigs: LoggingConfig)

    public fun masterKey(masterKey: IKey)

    public fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number)

    public fun topicName(topicName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.Topic.Builder =
        software.amazon.awscdk.services.sns.Topic.Builder.create(scope, id)

    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun enforceSsl(enforceSsl: Boolean) {
      cdkBuilder.enforceSsl(enforceSsl)
    }

    override fun fifo(fifo: Boolean) {
      cdkBuilder.fifo(fifo)
    }

    override fun loggingConfigs(loggingConfigs: List<LoggingConfig>) {
      cdkBuilder.loggingConfigs(loggingConfigs.map(LoggingConfig::unwrap))
    }

    override fun loggingConfigs(vararg loggingConfigs: LoggingConfig): Unit =
        loggingConfigs(loggingConfigs.toList())

    override fun masterKey(masterKey: IKey) {
      cdkBuilder.masterKey(masterKey.let(IKey::unwrap))
    }

    override fun messageRetentionPeriodInDays(messageRetentionPeriodInDays: Number) {
      cdkBuilder.messageRetentionPeriodInDays(messageRetentionPeriodInDays)
    }

    override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    public fun build(): software.amazon.awscdk.services.sns.Topic = cdkBuilder.build()
  }

  public companion object {
    public open fun fromTopicArn(
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
