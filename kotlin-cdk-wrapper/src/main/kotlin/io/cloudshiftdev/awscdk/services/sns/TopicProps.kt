@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface TopicProps {
  public fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

  public fun fifo(): Boolean? = unwrap(this).getFifo()

  public fun loggingConfigs(): List<LoggingConfig> =
      unwrap(this).getLoggingConfigs()?.map(LoggingConfig::wrap) ?: emptyList()

  public fun masterKey(): IKey? = unwrap(this).getMasterKey()?.let(IKey::wrap)

  public fun messageRetentionPeriodInDays(): Number? =
      unwrap(this).getMessageRetentionPeriodInDays()

  public fun topicName(): String? = unwrap(this).getTopicName()

  @CdkDslMarker
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

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.TopicProps.Builder =
        software.amazon.awscdk.services.sns.TopicProps.builder()

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

    public fun build(): software.amazon.awscdk.services.sns.TopicProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.TopicProps,
  ) : CdkObject(cdkObject), TopicProps {
    override fun contentBasedDeduplication(): Boolean? = unwrap(this).getContentBasedDeduplication()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun enforceSsl(): Boolean? = unwrap(this).getEnforceSSL()

    override fun fifo(): Boolean? = unwrap(this).getFifo()

    override fun loggingConfigs(): List<LoggingConfig> =
        unwrap(this).getLoggingConfigs()?.map(LoggingConfig::wrap) ?: emptyList()

    override fun masterKey(): IKey? = unwrap(this).getMasterKey()?.let(IKey::wrap)

    override fun messageRetentionPeriodInDays(): Number? =
        unwrap(this).getMessageRetentionPeriodInDays()

    override fun topicName(): String? = unwrap(this).getTopicName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): TopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.TopicProps): TopicProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: TopicProps): software.amazon.awscdk.services.sns.TopicProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.TopicProps
  }
}
