@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sqs

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnQueueProps {
  public fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

  public fun deduplicationScope(): String? = unwrap(this).getDeduplicationScope()

  public fun delaySeconds(): Number? = unwrap(this).getDelaySeconds()

  public fun fifoQueue(): Any? = unwrap(this).getFifoQueue()

  public fun fifoThroughputLimit(): String? = unwrap(this).getFifoThroughputLimit()

  public fun kmsDataKeyReusePeriodSeconds(): Number? =
      unwrap(this).getKmsDataKeyReusePeriodSeconds()

  public fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

  public fun maximumMessageSize(): Number? = unwrap(this).getMaximumMessageSize()

  public fun messageRetentionPeriod(): Number? = unwrap(this).getMessageRetentionPeriod()

  public fun queueName(): String? = unwrap(this).getQueueName()

  public fun receiveMessageWaitTimeSeconds(): Number? =
      unwrap(this).getReceiveMessageWaitTimeSeconds()

  public fun redriveAllowPolicy(): Any? = unwrap(this).getRedriveAllowPolicy()

  public fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

  public fun sqsManagedSseEnabled(): Any? = unwrap(this).getSqsManagedSseEnabled()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun visibilityTimeout(): Number? = unwrap(this).getVisibilityTimeout()

  @CdkDslMarker
  public interface Builder {
    public fun contentBasedDeduplication(contentBasedDeduplication: Boolean)

    public fun contentBasedDeduplication(contentBasedDeduplication: IResolvable)

    public fun deduplicationScope(deduplicationScope: String)

    public fun delaySeconds(delaySeconds: Number)

    public fun fifoQueue(fifoQueue: Boolean)

    public fun fifoQueue(fifoQueue: IResolvable)

    public fun fifoThroughputLimit(fifoThroughputLimit: String)

    public fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number)

    public fun kmsMasterKeyId(kmsMasterKeyId: String)

    public fun maximumMessageSize(maximumMessageSize: Number)

    public fun messageRetentionPeriod(messageRetentionPeriod: Number)

    public fun queueName(queueName: String)

    public fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number)

    public fun redriveAllowPolicy(redriveAllowPolicy: Any)

    public fun redrivePolicy(redrivePolicy: Any)

    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean)

    public fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun visibilityTimeout(visibilityTimeout: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sqs.CfnQueueProps.Builder =
        software.amazon.awscdk.services.sqs.CfnQueueProps.builder()

    override fun contentBasedDeduplication(contentBasedDeduplication: Boolean) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication)
    }

    override fun contentBasedDeduplication(contentBasedDeduplication: IResolvable) {
      cdkBuilder.contentBasedDeduplication(contentBasedDeduplication.let(IResolvable::unwrap))
    }

    override fun deduplicationScope(deduplicationScope: String) {
      cdkBuilder.deduplicationScope(deduplicationScope)
    }

    override fun delaySeconds(delaySeconds: Number) {
      cdkBuilder.delaySeconds(delaySeconds)
    }

    override fun fifoQueue(fifoQueue: Boolean) {
      cdkBuilder.fifoQueue(fifoQueue)
    }

    override fun fifoQueue(fifoQueue: IResolvable) {
      cdkBuilder.fifoQueue(fifoQueue.let(IResolvable::unwrap))
    }

    override fun fifoThroughputLimit(fifoThroughputLimit: String) {
      cdkBuilder.fifoThroughputLimit(fifoThroughputLimit)
    }

    override fun kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds: Number) {
      cdkBuilder.kmsDataKeyReusePeriodSeconds(kmsDataKeyReusePeriodSeconds)
    }

    override fun kmsMasterKeyId(kmsMasterKeyId: String) {
      cdkBuilder.kmsMasterKeyId(kmsMasterKeyId)
    }

    override fun maximumMessageSize(maximumMessageSize: Number) {
      cdkBuilder.maximumMessageSize(maximumMessageSize)
    }

    override fun messageRetentionPeriod(messageRetentionPeriod: Number) {
      cdkBuilder.messageRetentionPeriod(messageRetentionPeriod)
    }

    override fun queueName(queueName: String) {
      cdkBuilder.queueName(queueName)
    }

    override fun receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds: Number) {
      cdkBuilder.receiveMessageWaitTimeSeconds(receiveMessageWaitTimeSeconds)
    }

    override fun redriveAllowPolicy(redriveAllowPolicy: Any) {
      cdkBuilder.redriveAllowPolicy(redriveAllowPolicy)
    }

    override fun redrivePolicy(redrivePolicy: Any) {
      cdkBuilder.redrivePolicy(redrivePolicy)
    }

    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: Boolean) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled)
    }

    override fun sqsManagedSseEnabled(sqsManagedSseEnabled: IResolvable) {
      cdkBuilder.sqsManagedSseEnabled(sqsManagedSseEnabled.let(IResolvable::unwrap))
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun visibilityTimeout(visibilityTimeout: Number) {
      cdkBuilder.visibilityTimeout(visibilityTimeout)
    }

    public fun build(): software.amazon.awscdk.services.sqs.CfnQueueProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sqs.CfnQueueProps,
  ) : CdkObject(cdkObject), CfnQueueProps {
    override fun contentBasedDeduplication(): Any? = unwrap(this).getContentBasedDeduplication()

    override fun deduplicationScope(): String? = unwrap(this).getDeduplicationScope()

    override fun delaySeconds(): Number? = unwrap(this).getDelaySeconds()

    override fun fifoQueue(): Any? = unwrap(this).getFifoQueue()

    override fun fifoThroughputLimit(): String? = unwrap(this).getFifoThroughputLimit()

    override fun kmsDataKeyReusePeriodSeconds(): Number? =
        unwrap(this).getKmsDataKeyReusePeriodSeconds()

    override fun kmsMasterKeyId(): String? = unwrap(this).getKmsMasterKeyId()

    override fun maximumMessageSize(): Number? = unwrap(this).getMaximumMessageSize()

    override fun messageRetentionPeriod(): Number? = unwrap(this).getMessageRetentionPeriod()

    override fun queueName(): String? = unwrap(this).getQueueName()

    override fun receiveMessageWaitTimeSeconds(): Number? =
        unwrap(this).getReceiveMessageWaitTimeSeconds()

    override fun redriveAllowPolicy(): Any? = unwrap(this).getRedriveAllowPolicy()

    override fun redrivePolicy(): Any? = unwrap(this).getRedrivePolicy()

    override fun sqsManagedSseEnabled(): Any? = unwrap(this).getSqsManagedSseEnabled()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun visibilityTimeout(): Number? = unwrap(this).getVisibilityTimeout()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnQueueProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sqs.CfnQueueProps): CfnQueueProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnQueueProps): software.amazon.awscdk.services.sqs.CfnQueueProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.sqs.CfnQueueProps
  }
}
