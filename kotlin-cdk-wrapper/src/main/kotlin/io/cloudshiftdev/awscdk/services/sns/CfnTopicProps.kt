@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sns

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnTopicProps {
  public fun archivePolicy(): Any? = unwrap(this).getArchivePolicy()

  public fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  public fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

  public fun deliveryStatusLogging(): Any? = unwrap(this).getDeliveryStatusLogging()

  public fun displayName(): String? = unwrap(this).getDisplayName()

  public fun fifoTopic(): Any? = unwrap(this).getFifoTopic()

  public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  public fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

  public fun subscription(): Any? = unwrap(this).getSubscription()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun topicName(): String? = unwrap(this).getTopicName()

  public fun tracingConfig(): String? = unwrap(this).getTracingConfig()

  @CdkDslMarker
  public interface Builder {
    public fun archivePolicy(archivePolicy: Any)

    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

    public fun dataProtectionPolicy(dataProtectionPolicy: Any)

    public fun deliveryStatusLogging(deliveryStatusLogging: IResolvable)

    public fun deliveryStatusLogging(deliveryStatusLogging: List<Any>)

    public fun deliveryStatusLogging(vararg deliveryStatusLogging: Any)

    public fun displayName(displayName: String)

    public fun fifoTopic(fifoTopic: Boolean)

    public fun fifoTopic(fifoTopic: IResolvable)

    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    public fun signatureVersion(signatureVersion: String)

    public fun subscription(subscription: IResolvable)

    public fun subscription(subscription: List<Any>)

    public fun subscription(vararg subscription: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun topicName(topicName: String)

    public fun tracingConfig(tracingConfig: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sns.CfnTopicProps.Builder =
        software.amazon.awscdk.services.sns.CfnTopicProps.builder()

    override fun archivePolicy(archivePolicy: Any) {
      cdkBuilder.archivePolicy(archivePolicy)
    }

    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable::unwrap))
    }

    override fun dataProtectionPolicy(dataProtectionPolicy: Any) {
      cdkBuilder.dataProtectionPolicy(dataProtectionPolicy)
    }

    override fun deliveryStatusLogging(deliveryStatusLogging: IResolvable) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging.let(IResolvable::unwrap))
    }

    override fun deliveryStatusLogging(deliveryStatusLogging: List<Any>) {
      cdkBuilder.deliveryStatusLogging(deliveryStatusLogging)
    }

    override fun deliveryStatusLogging(vararg deliveryStatusLogging: Any): Unit =
        deliveryStatusLogging(deliveryStatusLogging.toList())

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun fifoTopic(fifoTopic: Boolean) {
      cdkBuilder.fifoTopic(fifoTopic)
    }

    override fun fifoTopic(fifoTopic: IResolvable) {
      cdkBuilder.fifoTopic(fifoTopic.let(IResolvable::unwrap))
    }

    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    override fun signatureVersion(signatureVersion: String) {
      cdkBuilder.signatureVersion(signatureVersion)
    }

    override fun subscription(subscription: IResolvable) {
      cdkBuilder.subscription(subscription.let(IResolvable::unwrap))
    }

    override fun subscription(subscription: List<Any>) {
      cdkBuilder.subscription(subscription)
    }

    override fun subscription(vararg subscription: Any): Unit = subscription(subscription.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun topicName(topicName: String) {
      cdkBuilder.topicName(topicName)
    }

    override fun tracingConfig(tracingConfig: String) {
      cdkBuilder.tracingConfig(tracingConfig)
    }

    public fun build(): software.amazon.awscdk.services.sns.CfnTopicProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sns.CfnTopicProps,
  ) : CdkObject(cdkObject), CfnTopicProps {
    override fun archivePolicy(): Any? = unwrap(this).getArchivePolicy()

    override fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

    override fun dataProtectionPolicy(): Any? = unwrap(this).getDataProtectionPolicy()

    override fun deliveryStatusLogging(): Any? = unwrap(this).getDeliveryStatusLogging()

    override fun displayName(): String? = unwrap(this).getDisplayName()

    override fun fifoTopic(): Any? = unwrap(this).getFifoTopic()

    override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    override fun signatureVersion(): String? = unwrap(this).getSignatureVersion()

    override fun subscription(): Any? = unwrap(this).getSubscription()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun topicName(): String? = unwrap(this).getTopicName()

    override fun tracingConfig(): String? = unwrap(this).getTracingConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTopicProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sns.CfnTopicProps): CfnTopicProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTopicProps): software.amazon.awscdk.services.sns.CfnTopicProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sns.CfnTopicProps
  }
}
